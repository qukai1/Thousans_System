package com.King.serives;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.King.pojo.OrderThe;
import com.King.util.BaseConn;
import com.King.util.BaseDao;

/**
 * 详细信息订单表
 * @author Administrator
 *
 */
public class OrderTheServices extends BaseDao{
	/**
	 * MerchanttaID店铺ID
	 * 下单状态
	 * 查询订单信息（询下单状态的订单）
	 * @throws SQLException 
	 */
	public List<OrderThe> orderTheID(int MerchanttaID, int stat) throws SQLException {	
		String sql="select * from orderthe t JOIN orderstate s ON t.orderNumber=s.orderNumber and t.merchantsID=? and s.orderState=?";
		ResultSet rs=select(sql, MerchanttaID,stat);
		List<OrderThe> orderThes=new ArrayList<OrderThe>();
		while(rs.next()) {
			OrderThe o=new OrderThe();
			o.setOrderId(rs.getInt("orderID"));
			o.setMerchantsID(rs.getInt("merchantsID"));
			o.setUserID(rs.getInt("userID"));
			o.setAddress(rs.getString("address"));
			o.setName(rs.getString("name"));
			o.setOrderNumber(rs.getString("orderNumber"));
			o.setSaleDate(rs.getString("saleDate"));
			o.setShoppingNote(rs.getString("shoppingNote"));
			o.setShoppingPrice(rs.getDouble("shoppingPrice"));
			o.setxPhone(rs.getString("xPhone"));
			orderThes.add(o);
		}
		BaseConn.close(rs,BaseDao.stat, con);
		return orderThes;
	}
	/**
	 * 修改订单状态
	 * @param orderNumber
	 * @param stat
	 * @return
	 */
	public boolean OrderStateID(String orderNumber, int stat) {
		String sql="UPDATE `king`.`orderstate` SET `orderState`=? WHERE `orderNumber`=?";
		return updateInsertDelete(sql, stat,orderNumber);
	}
	/**
	 * 查询订单信息（用户）
	 */
	public List<OrderThe> orderTheUserID(int id,int page){
		int pages=(page-1)*4;
		String sql="select * from orderthe o JOIN orderstate s ON o.orderNumber=s.orderNumber and o.userID=? order by orderState,orderID desc LIMIT ?,4";
		ResultSet rs=select(sql, id,pages);
		List<OrderThe> orderThes=new ArrayList<OrderThe>();
		try {
			while(rs.next()) {
				OrderThe o=new OrderThe();
				o.setOrderId(rs.getInt("orderID"));
				o.setMerchantsID(rs.getInt("merchantsID"));
				o.setUserID(rs.getInt("userID"));
				o.setAddress(rs.getString("address"));
				o.setName(rs.getString("name"));
				o.setOrderNumber(rs.getString("orderNumber"));
				o.setSaleDate(rs.getString("saleDate"));
				o.setShoppingNote(rs.getString("shoppingNote"));
				o.setShoppingPrice(rs.getDouble("shoppingPrice"));
				o.setxPhone(rs.getString("xPhone"));
				o.setOrderState(rs.getString("orderState"));
				o.setOrderStateID(rs.getInt("orderStateID"));
				orderThes.add(o);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		BaseConn.close(rs,BaseDao.stat, con);
		return orderThes;
	}
	/**
	 * 查询订单信息（用户）
	 */
	public int orderTheCount(int id){
		String sql="select * from orderthe o JOIN orderstate s ON o.orderNumber=s.orderNumber and o.userID=? order by orderState,orderID desc";
		ResultSet rs=select(sql, id);
		List<OrderThe> orderThes=new ArrayList<OrderThe>();
		try {
			while(rs.next()) {
				OrderThe o=new OrderThe();
				o.setOrderId(rs.getInt("orderID"));
				o.setMerchantsID(rs.getInt("merchantsID"));
				o.setUserID(rs.getInt("userID"));
				o.setAddress(rs.getString("address"));
				o.setName(rs.getString("name"));
				o.setOrderNumber(rs.getString("orderNumber"));
				o.setSaleDate(rs.getString("saleDate"));
				o.setShoppingNote(rs.getString("shoppingNote"));
				o.setShoppingPrice(rs.getDouble("shoppingPrice"));
				o.setxPhone(rs.getString("xPhone"));
				o.setOrderState(rs.getString("orderState"));
				o.setOrderStateID(rs.getInt("orderStateID"));
				orderThes.add(o);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		BaseConn.close(rs,BaseDao.stat, con);
		return orderThes.size();
	}
	/**
	 * 新增订单
	 */
	public Boolean addOrderSerivce(OrderThe o) {
		String sql="INSERT INTO `king`.`orderthe` (`merchantsID`, `userID`, `address`, `name`, `orderNumber`, `saleDate`, `shoppingNote`, `shoppingPrice`, `xPhone`) VALUES (?,?,?,?,?,?,?,?,?)";
		return updateInsertDelete(sql, o.getMerchantsID(),o.getUserID(),o.getAddress(),o.getName(),o.getOrderNumber(),o.getSaleDate(),o.getShoppingNote(),o.getShoppingPrice(),o.getxPhone());
	}
	/**
	 * 通过编号查询
	 */
	public OrderThe orderTheNumber(String number) {
		String sql="select * from orderthe where orderNumber=?";
		ResultSet rs=select(sql, number);
		OrderThe o=new OrderThe();
		try {
			while(rs.next()) {
				o.setOrderId(rs.getInt("orderID"));;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		BaseConn.close(rs,BaseDao.stat, con);
		return o;
	}
}

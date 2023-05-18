package com.King.serives;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.King.pojo.OrderDateiled;
import com.King.util.BaseConn;
import com.King.util.BaseDao;

public class OrderDateiledServices extends BaseDao{
	public boolean addDateil(OrderDateiled d) {
		String sql="INSERT INTO `king`.`orderdateiled` (`foodPrice`, `orderCount`, `orderID`, `sFoodName`) VALUES (?,?,?,?)";
		return updateInsertDelete(sql, d.getFoodPrice(),d.getOrderCount(),d.getOrderID(),d.getsFoodName());
	}
	public List<OrderDateiled> showUser(int orderID){
		String sql="select * from orderdateiled where orderid=?";
		ResultSet rs=select(sql, orderID);
		List<OrderDateiled> lis=new ArrayList<OrderDateiled>();
		try {
			while(rs.next()) {
				OrderDateiled da=new OrderDateiled();
				da.setDateiledID(rs.getInt("dateiledID"));
				da.setFoodPrice(rs.getDouble("foodPrice"));
				da.setOrderCount(rs.getInt("orderCount"));
				da.setOrderID(rs.getInt("orderID"));
				da.setsFoodName(rs.getString("sFoodName"));
				lis.add(da);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		BaseConn.close(rs,BaseDao.stat, con);
		return lis;
	}
}

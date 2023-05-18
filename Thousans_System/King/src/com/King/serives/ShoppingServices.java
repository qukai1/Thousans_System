package com.King.serives;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.King.pojo.Shopping;
import com.King.util.BaseConn;
import com.King.util.BaseDao;

public class ShoppingServices extends BaseDao{
	/**
	 * ��������ﳵ
	 */
	public boolean addShoping(Shopping s) {
		String sql="INSERT INTO `king`.`shopping` (`foodID`, `merchantsID`, `userID`, `shoppingCount`, `shoppingPrice`) VALUES (?,?,?,?,?)";
		return updateInsertDelete(sql,s.getFoodID(),s.getMerchantsID(),s.getUserID(),s.getShoppingCount(),s.getShoppingPrice());
	}
	/**
	 *��ѯ�Ƿ����
	 */
	public Shopping selShoping(int foodID,int merchantsID,int userID) {
		String sql="select * from shopping where foodID=? and merchantsID=? and userID=?";
		ResultSet rs=select(sql, foodID,merchantsID,userID);
		Shopping s=new Shopping();
		try {
			while(rs.next()) {
				s.setShoppingID(rs.getInt("shoppingID"));
				s.setFoodID(rs.getInt("foodID"));
				s.setMerchantsID(rs.getInt("merchantsID"));
				s.setUserID(rs.getInt("userID"));
				s.setShoppingCount(rs.getInt("shoppingCount"));
				s.setShoppingPrice(rs.getDouble("shoppingPrice"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		BaseConn.close(rs, stat, con);
		return s;
	}
	/**
	 * �޸ĵ�ǰ����
	 */
	public boolean updShoping(Shopping p) {
		String sql="update shopping set shoppingPrice=shoppingPrice+?,shoppingCount=shoppingCount+1 where shoppingID=?";
		return updateInsertDelete(sql, p.getShoppingPrice(),p.getShoppingID());
	}
	/**
	 * ��չ��ﳵ
	 */
	public boolean delShoping(int userID,int merchantsID) {
		String sql="delete from shopping where userID=? and merchantsID=?";
		return updateInsertDelete(sql, userID,merchantsID);
	}
	/**
	 * ���չ��ﳵ�µ���Ϣ
	 */
	public List<Shopping> sleShoping(int userID,int merchantsID) {
		String sql="select * from shopping where merchantsID=? and userID=?";
		ResultSet rs=select(sql,merchantsID,userID);
		List<Shopping> list=new ArrayList<Shopping>();
		try {
			while(rs.next()) {
				Shopping s=new Shopping();
				s.setShoppingID(rs.getInt("shoppingID"));
				s.setFoodID(rs.getInt("foodID"));
				s.setMerchantsID(rs.getInt("merchantsID"));
				s.setUserID(rs.getInt("userID"));
				s.setShoppingCount(rs.getInt("shoppingCount"));
				s.setShoppingPrice(rs.getDouble("shoppingPrice"));
				list.add(s);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		BaseConn.close(rs, stat, con);
		return list;
	}
}

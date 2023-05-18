package com.King.serives;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.King.dao.FoodDao;
import com.King.pojo.Food;
import com.King.util.BaseConn;
import com.King.util.BaseDao;

public class FoodServices extends BaseDao implements FoodDao{
	@Override
	public boolean addFood(Food f) {
		String sql="INSERT INTO `king`.`food` (`foodIn`, `foodName`, `foodPrice`,"
				+ " `foodState`, `foodType`, `foodSculpture`, `merchantsID`) VALUES (?,?,?,?,?,?,?);";
		return updateInsertDelete(sql, f.getFoodId(),f.getFoodName(),f.getFoodPrice(),f.getFoodState(),f.getFoodType(),f.getFoodSculpture(),f.getMerchantsID());
	}
	@Override
	public List<Food> selFood(int userid,int page) {
		int pages=(page-1)*6;
		String sql="SELECT * from food WHERE merchantsID=? LIMIT ?,6";
		ResultSet rs=select(sql,userid,pages);
		List<Food> list=new ArrayList<Food>();
		try {
			while(rs.next()) {
				Food f=new Food();
				f.setFoodId(rs.getInt("foodID"));
				f.setMerchantsID(rs.getInt("merchantsID"));
				f.setFoodSculpture(rs.getString("foodSculpture"));
				f.setFoodName(rs.getString("foodName"));
				f.setFoodPrice(rs.getDouble("foodPrice"));
				list.add(f);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		BaseConn.close(rs, stat, con);
		return list;
	}
	@Override
	public boolean updFood(Food f) {
		String sql="UPDATE `food` SET `foodIn`=?,`foodName`=?,`foodPrice`=?,`foodState`=?,`foodType`=?,`foodSculpture`=? WHERE foodID=?";
		return updateInsertDelete(sql, f.getFoodIn(),f.getFoodName(),f.getFoodPrice(),f.getFoodState(),f.getFoodType(),f.getFoodSculpture(),f.getFoodId());
	}
	@Override
	public boolean delFoodId(int id) {
		String sql="DELETE from food where foodId=?";
		return updateInsertDelete(sql, id);
	}
	@Override
	public int countSize(int suerID) {
		String sql="SELECT count(1) from food WHERE merchantsID=?";
		ResultSet rs=select(sql,suerID);
		int count=0;
		try {
			while(rs.next()) {
				try {
					count=rs.getInt(1);
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		BaseConn.close(rs, stat, con);
		return count;
	}
	@Override
	public Food foodID(int foodId) {
		String sql="SELECT * from food WHERE foodID=?";
		ResultSet rs=select(sql,foodId);
		Food f=new Food();
		try {
			while(rs.next()) {
				f.setFoodId(rs.getInt("foodID"));
				f.setFoodIn(rs.getString("foodIn"));
				f.setFoodName(rs.getString("foodName"));
				f.setFoodPrice(rs.getDouble("foodPrice"));
				f.setFoodState(rs.getString("foodState"));
				f.setFoodType(rs.getString("foodType"));
				f.setFoodSculpture(rs.getString("foodSculpture"));
				f.setMerchantsID(rs.getInt("merchantsID"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		BaseConn.close(rs, stat, con);
		return f;
	}
	
}

package com.King.pojo;
/**
 * 购物车实体类
 * @author Administrator
 *  与Food(用户表)的foodID建立外键关系 当前表键foodID
 *  与Food(用户表)的UserID建立外键关系 当前表键merchantsID
 */
public class Shopping{
	private int shoppingID;//购物车ID
	private int foodID;//菜品ID
	private int merchantsID;//商家ID
	private int userID;//用户ID
	private int shoppingCount;//购物数量
	private double shoppingPrice;//购物车订单总额
	public int getShoppingID() {
		return shoppingID;
	}
	public void setShoppingID(int shoppingID) {
		this.shoppingID = shoppingID;
	}
	public int getFoodID() {
		return foodID;
	}
	public void setFoodID(int foodID) {
		this.foodID = foodID;
	}
	public int getMerchantsID() {
		return merchantsID;
	}
	public void setMerchantsID(int merchantsID) {
		this.merchantsID = merchantsID;
	}
	public int getShoppingCount() {
		return shoppingCount;
	}
	public void setShoppingCount(int shoppingCount) {
		this.shoppingCount = shoppingCount;
	}
	public double getShoppingPrice() {
		return shoppingPrice;
	}
	public void setShoppingPrice(double shoppingPrice) {
		this.shoppingPrice = shoppingPrice;
	}
	public int getUserID() {
		return userID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
	}
	public Shopping() {
		super();
	}
	public Shopping(int shoppingID, int foodID, int merchantsID, int userID, int shoppingCount, double shoppingPrice) {
		super();
		this.shoppingID = shoppingID;
		this.foodID = foodID;
		this.merchantsID = merchantsID;
		this.userID = userID;
		this.shoppingCount = shoppingCount;
		this.shoppingPrice = shoppingPrice;
	}
	@Override
	public String toString() {
		return "Shopping [shoppingID=" + shoppingID + ", foodID=" + foodID + ", merchantsID=" + merchantsID
				+ ", shoppingCount=" + shoppingCount + ", shoppingPrice=" + shoppingPrice + "]";
	}
}

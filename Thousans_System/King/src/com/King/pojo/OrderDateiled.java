package com.King.pojo;
/**
 * 详细信息订单表
 * @author Administrator
 * 当前表的orderID字段(订单ID) 与OrderdThe（订单表）的orderID订单ID建立外键关系 
 */ 
public class OrderDateiled {
	/**
	 * 详细订单ID
	 */
	private int dateiledID;
	/**
	 * 菜品价格
	 */
	private double foodPrice;
	/**
	 * 数量
	 */
	private int orderCount;
	/**
	 * 订单ID
	 */
	private int orderID;
	/**
	 * 菜品名称
	 */
	private String sFoodName;
	public int getDateiledID() {
		return dateiledID;
	}
	public void setDateiledID(int dateiledID) {
		this.dateiledID = dateiledID;
	}
	public double getFoodPrice() {
		return foodPrice;
	}
	public void setFoodPrice(double foodPrice) {
		this.foodPrice = foodPrice;
	}
	public int getOrderCount() {
		return orderCount;
	}
	public void setOrderCount(int orderCount) {
		this.orderCount = orderCount;
	}
	public int getOrderID() {
		return orderID;
	}
	public void setOrderID(int orderID) {
		this.orderID = orderID;
	}
	public String getsFoodName() {
		return sFoodName;
	}
	public void setsFoodName(String sFoodName) {
		this.sFoodName = sFoodName;
	}
	@Override
	public String toString() {
		return "OrderDateiled [dateiledID=" + dateiledID + ", foodPrice=" + foodPrice + ", orderCount=" + orderCount
				+ ", orderID=" + orderID + ", sFoodName=" + sFoodName + "]";
	}
	public OrderDateiled(int dateiledID, double foodPrice, int orderCount, int orderID, String sFoodName) {
		super();
		this.dateiledID = dateiledID;
		this.foodPrice = foodPrice;
		this.orderCount = orderCount;
		this.orderID = orderID;
		this.sFoodName = sFoodName;
	}
	public OrderDateiled() {
		super();
	}
}

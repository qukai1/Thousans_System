package com.King.pojo;
/**
 * 详细信息订单表
 * @author Administrator
 * 与User(用户表)的UserID建立外键关系 当前表键merchantsID
 * 与User(用户表)的UserID建立外键关系 当前表键userID
 */
public class OrderThe extends OrderState{
	private int orderId;//订单ID
	private int merchantsID;//商家ID
	private int userID;//用户ID
	private String address;//下单地址
	private String name;//用户名字
	private String orderNumber;//订单编号
	private String saleDate;//下单日期
	private String shoppingNote;//用户备注
	private double shoppingPrice;//购物车订单总金额
	private String xPhone;//用户手机
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public int getMerchantsID() {
		return merchantsID;
	}
	public void setMerchantsID(int merchantsID) {
		this.merchantsID = merchantsID;
	}
	public int getUserID() {
		return userID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getOrderNumber() {
		return orderNumber;
	}
	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}
	public String getSaleDate() {
		return saleDate;
	}
	public void setSaleDate(String saleDate) {
		this.saleDate = saleDate;
	}
	public String getShoppingNote() {
		return shoppingNote;
	}
	public void setShoppingNote(String shoppingNote) {
		this.shoppingNote = shoppingNote;
	}
	public double getShoppingPrice() {
		return shoppingPrice;
	}
	public void setShoppingPrice(double shoppingPrice) {
		this.shoppingPrice = shoppingPrice;
	}
	public String getxPhone() {
		return xPhone;
	}
	public void setxPhone(String xPhone) {
		this.xPhone = xPhone;
	}
	
	public OrderThe(int orderId, int merchantsID, int userID, String address, String name, String orderNumber,
		String saleDate, String shoppingNote, double shoppingPrice, String xPhone) {
		super();
		this.orderId = orderId;
		this.merchantsID = merchantsID;
		this.userID = userID;
		this.address = address;
		this.name = name;
		this.orderNumber = orderNumber;
		this.saleDate = saleDate;
		this.shoppingNote = shoppingNote;
		this.shoppingPrice = shoppingPrice;
		this.xPhone = xPhone;
	}
	public OrderThe() {
		super();
	}
	@Override
	public String toString() {
		return "OrderThe [orderId=" + orderId + ", merchantsID=" + merchantsID + ", userID=" + userID + ", address="
				+ address + ", name=" + name + ", orderNumber=" + orderNumber + ", saleDate=" + saleDate
				+ ", shoppingNote=" + shoppingNote + ", shoppingPrice=" + shoppingPrice + ", xPhone=" + xPhone + "]";
	}	
	
}

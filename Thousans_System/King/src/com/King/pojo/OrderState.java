package com.King.pojo;
/**
 * 订单状态表
 * @author Administrator
 * orderNumber
 * orderState
 * 当前表的orderNumber字段(订单编号) 与OrderdThe（订单表）的orderNumber（订单编号）建立外键关系 
 */
public class OrderState {
	private int orderStateID;//状态ID
	private  String orderNumber;//订单编号
	private  String orderState;//订单状态
	public int getOrderStateID() {
		return orderStateID;
	}
	public void setOrderStateID(int orderStateID) {
		this.orderStateID = orderStateID;
	}
	public String getOrderNumber() {
		return orderNumber;
	}
	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}
	public String getOrderState() {
		return orderState;
	}
	public void setOrderState(String orderState) {
		this.orderState = orderState;
	}
	public OrderState(int orderStateID, String orderNumber, String orderState) {
		super();
		this.orderStateID = orderStateID;
		this.orderNumber = orderNumber;
		this.orderState = orderState;
	}
	public OrderState() {
		super();
	}
	
}

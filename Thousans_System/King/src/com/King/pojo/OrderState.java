package com.King.pojo;
/**
 * ����״̬��
 * @author Administrator
 * orderNumber
 * orderState
 * ��ǰ���orderNumber�ֶ�(�������) ��OrderdThe����������orderNumber��������ţ����������ϵ 
 */
public class OrderState {
	private int orderStateID;//״̬ID
	private  String orderNumber;//�������
	private  String orderState;//����״̬
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

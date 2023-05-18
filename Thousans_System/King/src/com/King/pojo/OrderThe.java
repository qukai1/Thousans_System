package com.King.pojo;
/**
 * ��ϸ��Ϣ������
 * @author Administrator
 * ��User(�û���)��UserID���������ϵ ��ǰ���merchantsID
 * ��User(�û���)��UserID���������ϵ ��ǰ���userID
 */
public class OrderThe extends OrderState{
	private int orderId;//����ID
	private int merchantsID;//�̼�ID
	private int userID;//�û�ID
	private String address;//�µ���ַ
	private String name;//�û�����
	private String orderNumber;//�������
	private String saleDate;//�µ�����
	private String shoppingNote;//�û���ע
	private double shoppingPrice;//���ﳵ�����ܽ��
	private String xPhone;//�û��ֻ�
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

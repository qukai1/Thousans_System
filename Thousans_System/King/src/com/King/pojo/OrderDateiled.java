package com.King.pojo;
/**
 * ��ϸ��Ϣ������
 * @author Administrator
 * ��ǰ���orderID�ֶ�(����ID) ��OrderdThe����������orderID����ID���������ϵ 
 */ 
public class OrderDateiled {
	/**
	 * ��ϸ����ID
	 */
	private int dateiledID;
	/**
	 * ��Ʒ�۸�
	 */
	private double foodPrice;
	/**
	 * ����
	 */
	private int orderCount;
	/**
	 * ����ID
	 */
	private int orderID;
	/**
	 * ��Ʒ����
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

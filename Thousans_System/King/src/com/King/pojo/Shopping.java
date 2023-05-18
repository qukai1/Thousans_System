package com.King.pojo;
/**
 * ���ﳵʵ����
 * @author Administrator
 *  ��Food(�û���)��foodID���������ϵ ��ǰ���foodID
 *  ��Food(�û���)��UserID���������ϵ ��ǰ���merchantsID
 */
public class Shopping{
	private int shoppingID;//���ﳵID
	private int foodID;//��ƷID
	private int merchantsID;//�̼�ID
	private int userID;//�û�ID
	private int shoppingCount;//��������
	private double shoppingPrice;//���ﳵ�����ܶ�
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

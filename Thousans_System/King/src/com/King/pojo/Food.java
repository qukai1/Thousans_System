package com.King.pojo;
/**
 * ��Ʒ��Ϣ��
 * @author Administrator
 *��User(�û���)�е�UserID���������ϵ
 */
public class Food{
	private int foodId;//��Ʒ����
	private String foodIn;//��Ʒ����
	private String foodName;//��Ʒ����
	private double foodPrice;//��Ʒ�۸�
	private String foodState;//��Ʒ״̬
	private String foodType;//��Ʒ����
	private String foodSculpture;//��ƷͼƬ
	private int merchantsID;//�̼�ID;
	public int getFoodId() {
		return foodId;
	}
	public void setFoodId(int foodId) {
		this.foodId = foodId;
	}
	public String getFoodIn() {
		return foodIn;
	}
	public void setFoodIn(String foodIn) {
		this.foodIn = foodIn;
	}
	public String getFoodName() {
		return foodName;
	}
	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}
	public double getFoodPrice() {
		return foodPrice;
	}
	public void setFoodPrice(double foodPrice) {
		this.foodPrice = foodPrice;
	}
	public String getFoodState() {
		return foodState;
	}
	public void setFoodState(String foodState) {
		this.foodState = foodState;
	}
	public String getFoodType() {
		return foodType;
	}
	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}
	public String getFoodSculpture() {
		return foodSculpture;
	}
	public void setFoodSculpture(String foodSculpture) {
		this.foodSculpture = foodSculpture;
	}
	public int getMerchantsID() {
		return merchantsID;
	}
	public void setMerchantsID(int merchantsID) {
		this.merchantsID = merchantsID;
	}
	public Food(int foodId, String foodIn, String foodName, double foodPrice, String foodState, String foodType,
			String foodSculpture, int merchantsID) {
		super();
		this.foodId = foodId;
		this.foodIn = foodIn;
		this.foodName = foodName;
		this.foodPrice = foodPrice;
		this.foodState = foodState;
		this.foodType = foodType;
		this.foodSculpture = foodSculpture;
		this.merchantsID = merchantsID;
	}
	public Food() {
		super();
	}
	@Override
	public String toString() {
		return "Food [foodId=" + foodId + ", foodIn=" + foodIn + ", foodName=" + foodName + ", foodPrice=" + foodPrice
				+ ", foodState=" + foodState + ", foodType=" + foodType + ", foodSculpture=" + foodSculpture
				+ ", merchantsID=" + merchantsID + "]";
	}
	
}

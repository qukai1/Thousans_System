package com.King.dao;

import java.util.List;

import com.King.pojo.Food;

/**
 * ��Ʒ��Ϣ��
 * @author Administrator
 *
 */
public interface FoodDao {
	/**
	 * ������Ʒ��Ϣ
	 */
	public boolean addFood(Food f);
	/**
	 * ��ѯ���в�Ʒ��Ϣ
	 */
	public List<Food> selFood(int userID,int page);
	/**
	 * ����ҳ��
	 */
	public int countSize(int suerID);
	/**
	 * �޸Ĳ�Ʒ��Ϣ
	 */
	public boolean updFood(Food f);
	/**
	 * ɾ��
	 */
	public boolean delFoodId(int id);
	/**
	 * ͨ���˵�ID��ѯ
	 */
	public Food foodID(int foodId);
}

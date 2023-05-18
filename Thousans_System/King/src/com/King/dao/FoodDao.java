package com.King.dao;

import java.util.List;

import com.King.pojo.Food;

/**
 * 菜品信息表
 * @author Administrator
 *
 */
public interface FoodDao {
	/**
	 * 新增菜品信息
	 */
	public boolean addFood(Food f);
	/**
	 * 查询所有菜品信息
	 */
	public List<Food> selFood(int userID,int page);
	/**
	 * 返回页码
	 */
	public int countSize(int suerID);
	/**
	 * 修改菜品信息
	 */
	public boolean updFood(Food f);
	/**
	 * 删除
	 */
	public boolean delFoodId(int id);
	/**
	 * 通过菜单ID查询
	 */
	public Food foodID(int foodId);
}

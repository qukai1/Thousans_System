package com.King.dao;
/**
 * 详细信息订单表
 * @author Administrator
 */

import java.sql.SQLException;
import java.util.List;

import com.King.pojo.OrderThe;

public interface OrderTheDao{
	/**
	 * MerchanttaID店铺ID
	 * 下单状态
	 * 查询订单信息（询下单状态的订单）
	 * @throws SQLException 
	 */
	public List<OrderThe> orderTheID(int MerchanttaID,int stat) throws SQLException;
	/**
	 * 修改订单
	 */
	public boolean OrderStateID(String orderNumber,int stat);
	/**
	 * 查询下单状态用户
	 */
	public List<OrderThe> orderTheUserID(int UserID) throws SQLException;

}

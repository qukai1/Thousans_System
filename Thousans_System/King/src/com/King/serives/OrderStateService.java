package com.King.serives;

import com.King.util.BaseDao;

public class OrderStateService extends BaseDao{
	/**
	 * ����״̬
	 */
	public boolean orderStateNumber(String number) {
		String sql="INSERT INTO `king`.`orderstate` (`orderNumber`, `orderState`) VALUES (?,1)";
		return updateInsertDelete(sql, number);
	}
}

package com.King.dao;
/**
 * ��ϸ��Ϣ������
 * @author Administrator
 */

import java.sql.SQLException;
import java.util.List;

import com.King.pojo.OrderThe;

public interface OrderTheDao{
	/**
	 * MerchanttaID����ID
	 * �µ�״̬
	 * ��ѯ������Ϣ��ѯ�µ�״̬�Ķ�����
	 * @throws SQLException 
	 */
	public List<OrderThe> orderTheID(int MerchanttaID,int stat) throws SQLException;
	/**
	 * �޸Ķ���
	 */
	public boolean OrderStateID(String orderNumber,int stat);
	/**
	 * ��ѯ�µ�״̬�û�
	 */
	public List<OrderThe> orderTheUserID(int UserID) throws SQLException;

}

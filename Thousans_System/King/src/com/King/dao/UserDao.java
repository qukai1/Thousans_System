package com.King.dao;

import java.sql.SQLException;
import com.King.pojo.User;
/**
 *�����û���
 * @author Administrator
 *
 */
public interface UserDao {
	/**
	 * �����û���Ϣ
	 */
	public boolean addUser(User user);
	/**
	 * ͨ���˺Ų�ѯ��Ϣ
	 * @throws SQLException 
	 */
 	public User idUser(String account) throws SQLException;
	/**
	 * ͨ���˺������ѯ
	 * @throws SQLException 
	 * @throws NullPointerException 
	 * @throws Exception 
	 */
	public User loginUser(String account,String password) throws NullPointerException, SQLException, Exception;
	/**
	 * �������룬�޸�����
	 */
	public boolean changePassword(String mailbox,String password);
	/**
	 *ͨ��ԭ�����޸�����
	 */
	public Boolean mimaUser(String pass,String newPass,int userId);
	/**
	 * ͨ����Ų�ѯ��Ϣ
	 * @throws SQLException 
	 */
	public User idUser(int id) throws SQLException;
	/**
	 * ͨ��id�޲��û���Ϣ
	 */
	public Boolean updUser(User user);
}

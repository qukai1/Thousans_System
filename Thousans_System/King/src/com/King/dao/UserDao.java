package com.King.dao;

import java.sql.SQLException;
import com.King.pojo.User;
/**
 *个人用户表
 * @author Administrator
 *
 */
public interface UserDao {
	/**
	 * 新增用户信息
	 */
	public boolean addUser(User user);
	/**
	 * 通过账号查询信息
	 * @throws SQLException 
	 */
 	public User idUser(String account) throws SQLException;
	/**
	 * 通过账号密码查询
	 * @throws SQLException 
	 * @throws NullPointerException 
	 * @throws Exception 
	 */
	public User loginUser(String account,String password) throws NullPointerException, SQLException, Exception;
	/**
	 * 忘记密码，修改密码
	 */
	public boolean changePassword(String mailbox,String password);
	/**
	 *通过原密码修改密码
	 */
	public Boolean mimaUser(String pass,String newPass,int userId);
	/**
	 * 通过编号查询信息
	 * @throws SQLException 
	 */
	public User idUser(int id) throws SQLException;
	/**
	 * 通过id修补用户信息
	 */
	public Boolean updUser(User user);
}

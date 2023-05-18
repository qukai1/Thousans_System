package com.King.serives;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.King.dao.UserDao;
import com.King.pojo.User;
import com.King.util.BaseDao;
import com.King.util.BaseConn;
public class UserServices extends BaseDao implements UserDao{
	/**
	 * �����û���Ϣ
	 */
	public boolean addUser(User u) {
		String sql="INSERT INTO `king`.`user` (`type`, `mailbox`, `account`, `password`) VALUES (?,?,?,?)";
		return updateInsertDelete(sql,u.getType(),u.getMailbox(),u.getAccount(),u.getPassword());
	}
	/**
	 * ͨ���û����ֲ�ѯ�û�
	 * @throws SQLException 
	 */
	public User idUser(String account) throws SQLException {
       String sql="select * from user where account=?";
		ResultSet re=select(sql, account);
		User u=new User();
			while(re.next()) {
				u.setId(re.getInt(1));
				u.setSculpture(re.getString(2));
				u.setMailbox(re.getString(3));
				u.setAccount(re.getString(4));
				u.setAddres(re.getString(5));
				u.setUserPhone(re.getString(6));
				u.setUserName(re.getString(7));
				u.setPassword(re.getString(8));
				u.setType(re.getString(9));
				u.setMerchantsType(re.getString(10));
			}
		BaseConn.close(re, stat, con);
		return u;
	}
	/*
	 *ͨ���˺������ѯ
	 */
	public User loginUser(String account, String password) throws Exception{
		String sql="select * from user where account=? and password=?";
		ResultSet re=select(sql, account,password);
		User u=new User();
			while(re.next()) {
				u.setId(re.getInt("id"));
				u.setSculpture(re.getString("sculpture"));
				u.setMailbox(re.getString("mailbox"));
				u.setAccount(re.getString("account"));
				u.setAddres(re.getString("userAddres"));
				u.setUserPhone(re.getString("userPhone"));
				u.setUserName(re.getString("userName"));
				u.setPassword(re.getString("password"));
				u.setType(re.getString("type"));
				u.setMerchantsType(re.getString("merchantsType"));
			}
		BaseConn.close(rs,stat,con);
		return u;
	}
	/**
	 * ͨ�������޸�����
	 */
	public boolean changePassword(String mailbox, String password) {
		String sql="update `king`.`user` set `password`=? where `mailbox`=?";
		return updateInsertDelete(sql,password,mailbox);
	}
	/**
	 * ͨ��ԭ�����޸�����
	 */
	public Boolean mimaUser(String pass, String newPass,int userId) {
		String sql="UPDATE `king`.`user` SET `password`=? WHERE (`id`=?) and `password`=?";
		return updateInsertDelete(sql,newPass,userId,pass);
	}
	/**
	 * ͨ��id��ѯ�û���Ϣ
	 * @throws SQLException 
	 */
	public User idUser(int id) throws SQLException {
		String sql="select * from user where id=?";
		ResultSet re=select(sql,id);
		User u=new User();
			while(re.next()) {
				u.setId(re.getInt(1));
				u.setSculpture(re.getString(2));
				u.setMailbox(re.getString(3));
				u.setAccount(re.getString(4));
				u.setAddres(re.getString(5));
				u.setUserPhone(re.getString(6));
				u.setUserName(re.getString(7));
				u.setPassword(re.getString(8));
				u.setType(re.getString(9));
				u.setMerchantsType(re.getString(10));
			}
		BaseConn.close(rs,stat,con);
		return u;
	}
	/**
	 * ͨ��id�޸��û���Ϣ
	 */
	public Boolean updUser(User u) {
		String sql="UPDATE `king`.`user` SET `sculpture`=?,`userAddres`=?,`userName`=?,`merchantsType`=?,userPhone=? WHERE `id`=?";
		return updateInsertDelete(sql, u.getSculpture(),u.getAddres(),u.getUserName(),u.getMerchantsType(),u.getUserPhone(),u.getId());
	}
	//��ѯ�̼ҵ�����Ϣ
	public List<User> shopUser(String type,int page){
		int pages=(page-1)*6;
		 String sql="select * from user where type='�̼�' and `user`.sculpture is not null";
			ResultSet re;
			if(type!=null&&!type.isEmpty()&&!type.equals("ȫ��")) {
				sql+=" and merchantsType=? LIMIT ?,6";
				re=select(sql, type,pages);
			}else {
				sql+=" LIMIT ?,6";
				re=select(sql,pages);
			}
			List<User> list=new ArrayList<User>();
				try {
					while(re.next()) {
						User u=new User();
						u.setId(re.getInt("id"));
						u.setSculpture(re.getString("sculpture"));
						u.setMailbox(re.getString("mailbox"));
						u.setAccount(re.getString("account"));
						u.setAddres(re.getString("userAddres"));
						u.setUserPhone(re.getString("userPhone"));
						u.setUserName(re.getString("userName"));
						u.setPassword(re.getString("password"));
						u.setType(re.getString("type"));
						u.setMerchantsType(re.getString("merchantsType"));
						list.add(u);
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}
			BaseConn.close(re, stat, con);
			return list;		
	}
	//��ѯ�̼ҵ�����Ϣ
		public List<User> shopUser(String type){
			 String sql="select * from user where type='�̼�'and `user`.sculpture is not null";
				ResultSet re;
				if(type!=null&&!type.isEmpty()&&!type.equals("ȫ��")) {
					sql+=" and merchantsType=?";
					re=select(sql,type);
				}else {
					re=select(sql);
				}
				List<User> list=new ArrayList<User>();
					try {
						while(re.next()) {
							User u=new User();
							u.setId(re.getInt("id"));
							u.setSculpture(re.getString("sculpture"));
							u.setMailbox(re.getString("mailbox"));
							u.setAccount(re.getString("account"));
							u.setAddres(re.getString("userAddres"));
							u.setUserPhone(re.getString("userPhone"));
							u.setUserName(re.getString("userName"));
							u.setPassword(re.getString("password"));
							u.setType(re.getString("type"));
							u.setMerchantsType(re.getString("merchantsType"));
							list.add(u);
						}
					} catch (SQLException e) {
						e.printStackTrace();
					}
				BaseConn.close(re, stat, con);
				return list;		
		}
		//ͨ����������ģ����ѯ
		public List<User> shopUserName(String type,int page){
			int pages=(page-1)*6;
			 String sql="select * from user where type='�̼�' and `user`.sculpture is not null";
				ResultSet re;
				if(type!=null&&!type.isEmpty()) {
					sql+=" and username like '%"+type+"%' LIMIT ?,6";
					re=select(sql,pages);
				}else {
					sql+=" LIMIT ?,6";
					re=select(sql,pages);
				}
				List<User> list=new ArrayList<User>();
					try {
						while(re.next()) {
							User u=new User();
							u.setId(re.getInt("id"));
							u.setSculpture(re.getString("sculpture"));
							u.setMailbox(re.getString("mailbox"));
							u.setAccount(re.getString("account"));
							u.setAddres(re.getString("userAddres"));
							u.setUserPhone(re.getString("userPhone"));
							u.setUserName(re.getString("userName"));
							u.setPassword(re.getString("password"));
							u.setType(re.getString("type"));
							u.setMerchantsType(re.getString("merchantsType"));
							list.add(u);
						}
					} catch (SQLException e) {
						e.printStackTrace();
					}
				BaseConn.close(re, stat, con);
				return list;		
		}
		//��ѯ�̼ҵ�����Ϣ
				public List<User> shopUserName(String type){
					 String sql="select * from user where type='�̼�'and `user`.sculpture is not null";
						ResultSet re;
						if(type!=null&&!type.isEmpty()) {
							sql+=" and username like '%"+type+"%'";
						}
							re=select(sql);
						List<User> list=new ArrayList<User>();
							try {
								while(re.next()) {
									User u=new User();
									u.setId(re.getInt("id"));
									u.setSculpture(re.getString("sculpture"));
									u.setMailbox(re.getString("mailbox"));
									u.setAccount(re.getString("account"));
									u.setAddres(re.getString("userAddres"));
									u.setUserPhone(re.getString("userPhone"));
									u.setUserName(re.getString("userName"));
									u.setPassword(re.getString("password"));
									u.setType(re.getString("type"));
									u.setMerchantsType(re.getString("merchantsType"));
									list.add(u);
								}
							} catch (SQLException e) {
								e.printStackTrace();
							}
						BaseConn.close(re, stat, con);
						return list;		
				}
}
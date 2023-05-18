package com.King.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 * ִ�в���
 * @author Administrator
 *
 */
public class BaseDao{
	public static PreparedStatement stat=null;//sqlԤ����
	public static Connection con=null;
	public static ResultSet rs=null;
	//������ɾ�����޸�
	protected static boolean updateInsertDelete(String sql ,Object...objects) {
		//׼����������
		con=BaseConn.getConnection();
		//Ԥ����
		try {
			stat=con.prepareStatement(sql);
			for (int i = 0; i < objects.length; i++) {
				stat.setObject(i+1, objects[i]);
			}
			int count=stat.executeUpdate();
			return count>0;
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			BaseConn.close(rs, stat, con);
		}
		return false;
	}
	//һ�������Ĳ�ѯ����
	protected static ResultSet select(String sql,Object...objects) {
		//׼�����ݿ�����
		con=BaseConn.getConnection();
		try {
			//Ԥӳ��
			stat=con.prepareStatement(sql);
			 if(objects!=null) {
				 for (int i = 0; i < objects.length; i++) {
					stat.setObject(i+1, objects[i]);
				}
			 }
			 rs=stat.executeQuery();//ִ�в�ѯ
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rs;
	}
}

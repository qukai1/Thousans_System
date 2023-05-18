package com.King.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 * ���ݿ�����
 * @author Administrator
 *
 */
public class BaseConn {
	//������
	private static final String DriverName="com.mysql.jdbc.Driver";
	//���ݿ�����
	private static final String url="jdbc:mysql://localhost:3306/King?useSSL=false&useUnicode=true&characterEncoding=utf-8";
	//���ݿ��û�
	private static final String name="root";
	//����
	private static final String password="181121";
	//��������
	static {
		try {
			Class.forName(DriverName);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	//�������ݿ����ӷ���
	public static Connection getConnection() {
		try {
			return DriverManager.getConnection(url, name, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	//�ر�����
	public static void close(ResultSet rs,PreparedStatement stat,Connection con){
		try {
			if(rs!=null) {
				rs.close();
			}
			if(stat!=null) {
				stat.close();
			}
			if(con!=null) {
				con.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}

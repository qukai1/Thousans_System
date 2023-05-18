package com.King.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 * 数据库连接
 * @author Administrator
 *
 */
public class BaseConn {
	//类驱动
	private static final String DriverName="com.mysql.jdbc.Driver";
	//数据库连接
	private static final String url="jdbc:mysql://localhost:3306/King?useSSL=false&useUnicode=true&characterEncoding=utf-8";
	//数据库用户
	private static final String name="root";
	//密码
	private static final String password="181121";
	//加载驱动
	static {
		try {
			Class.forName(DriverName);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	//连接数据库连接方法
	public static Connection getConnection() {
		try {
			return DriverManager.getConnection(url, name, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	//关闭连接
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

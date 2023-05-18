package com.King.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 * 执行操作
 * @author Administrator
 *
 */
public class BaseDao{
	public static PreparedStatement stat=null;//sql预处理
	public static Connection con=null;
	public static ResultSet rs=null;
	//新增，删除，修改
	protected static boolean updateInsertDelete(String sql ,Object...objects) {
		//准备数控连接
		con=BaseConn.getConnection();
		//预处理
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
	//一个公共的查询方法
	protected static ResultSet select(String sql,Object...objects) {
		//准备数据库连接
		con=BaseConn.getConnection();
		try {
			//预映射
			stat=con.prepareStatement(sql);
			 if(objects!=null) {
				 for (int i = 0; i < objects.length; i++) {
					stat.setObject(i+1, objects[i]);
				}
			 }
			 rs=stat.executeQuery();//执行查询
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rs;
	}
}

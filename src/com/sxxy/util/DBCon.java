package com.sxxy.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * 鏁版嵁搴撹繛鎺ュ璞�
 * 
 * @author 鍒樺皯鏋�
 * 
 */
public class DBCon {

	/**
	 * 鑾峰彇鏁版嵁搴撹繛鎺�
	 * 
	 * @return
	 */
	public static Connection getConnection() {

		try {
			String url = "jdbc:mysql://127.0.0.1:3306/crm000?user=root&password=root";
			// 鍔犺浇椹卞姩
			Class.forName("com.mysql.jdbc.Driver");
			// 鑾峰彇杩炴帴
			Connection con = DriverManager.getConnection(url);
			
			return con;
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}
	
	/**
	 * 鍏抽棴杩炴帴
	 * @param con
	 */
	public static void  closeCon(Connection con){
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 鍏抽棴瀹炰緥
	 * @param pre
	 */
	public static void  closePre(PreparedStatement pre){
		try {
			pre.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 鍏抽棴缁撴灉闆�
	 * @param res
	 */
	public static void  closeRes(ResultSet res){
		try {
			res.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

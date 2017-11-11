package com.iii.tests.common;

/**

 * @version $Id: JDBCConnection.java 253123 2015-12-10 22:18:48Z sergeii $ $Rev: 232046 $ $Date: 2014-04-25 12:32:28 -0700 (Fri, 25 Apr 2014) $

 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class JDBCConnection {
	
	private String conURL;
	private String uname;
	private String pwd;
	private String dURL;
	private Connection con = null;
	ResultSet rs;
	
	
	public void Dataset(String connectionURL, String driverURL, String username, String password){
		this.conURL=connectionURL;
		this.dURL=driverURL;
		this.uname=username;
		this.pwd=password;
	}

	public ResultSet SelectRecords (String selectQuery){
		try {
			Connection conn = getDatabaseConnection();
			Statement stmt = conn.createStatement();
			rs = stmt.executeQuery(selectQuery);
			conn.close();
		} catch (Exception e) {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }
		return rs;
	}
	
	
	private Connection getDatabaseConnection(){

		try {
			Class.forName(dURL);	

		} catch(java.lang.ClassNotFoundException e) {
			System.err.print("ClassNotFoundException: ");
			System.err.println(e.getMessage());
		}

		try {
		   this.con = DriverManager.getConnection(conURL, uname, pwd);
		} catch(SQLException ex) {
			System.err.println("SQLException: " + ex.getMessage());
		}

		return con;
	}

}

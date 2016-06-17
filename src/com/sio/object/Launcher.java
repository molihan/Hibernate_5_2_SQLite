package com.sio.object;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Launcher {

	public static void main(String[] args) throws Exception {
		System.out.println("hello");
		
		Class.forName("org.sqlite.JDBC");
		Connection conn = DriverManager.getConnection("jdbc:sqlite:test.db");
		Statement stmt = conn.createStatement();
		stmt.executeUpdate("create table tag(id varchar(10), mac varchar(10), ip varchar(10), dbm varchar(10), batt varchar(10))");
		
		
	}

}

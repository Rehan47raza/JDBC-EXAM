package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class dbTransaction 
{
	private Connection connection;


	private String url;
	private String user;
	private String password;
	private String tableName;
	private String tableName1;
	private String tableName2;
	public dbTransaction(String url, String user, String password,
			String tableName, String tableName1, String tableName2) {
		super();
		this.url = url;
		this.user = user;
		this.password = password;
		this.tableName = tableName;
		this.tableName1 = tableName1;
		this.tableName2 = tableName2;
	}
	public void closeConnection()
	{
		try
		{
		if(connection != null && connection.isClosed() == false)
		connection.close();
		connection = null;
		}
		catch(SQLException e)
		{
		e.printStackTrace();
		}
	}
	public Connection getConnection() {
		
		
		try {
		closeConnection();
		Class.forName("oracle.jdbc.driver.OracleDriver");
		connection = DriverManager.getConnection(url,user,password);
		} catch (SQLException e) {
		
		e.printStackTrace();
		} catch (ClassNotFoundException e) {
		
		e.printStackTrace();
		}
		return connection;
		}
		
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getTableName() {
		return tableName;
	}
	public void setTableName(String tableName) {
		this.tableName = tableName;
	}
	public String getTableName1() {
		return tableName1;
	}
	public void setTableName1(String tableName1) {
		this.tableName1 = tableName1;
	}
	public String getTableName2() {
		return tableName2;
	}
	public void setTableName2(String tableName2) {
		this.tableName2 = tableName2;
	}



	}


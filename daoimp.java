package com.dao;

public class daoimp implements dao{

	public void contactService() {
		// TODO Auto-generated method stub
		 Class.forName(“com.mysql.jdbc.driver”);
		 Connection connection = DriverManager.getConnection();
		    try {
		        PreparedStatement ps = connection.prepareStatement("INSERT INTO user VALUES (NULL, ?, ?, ?)");
		       
		
	}

	public void contactServiceUpdate() {
		// TODO Auto-generated method stub
		
	}

	public void contactServiceDelete() {
		// TODO Auto-generated method stub
		
	}

}

package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateEx {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		
//		(1)Loading the drivers
		
		Class.forName("oracle.jdbc.driver.OracleDriver");

//		(2)creating the connection
		
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","hello","hello");
									
//		(3)Create the statement
		
		Statement stmt = conn.createStatement();
		
//		(4)Execute the statement    DDL-excute();
		
		stmt.execute("create table product(pid number,pname varchar2(10),pprice number,ptype varchar(10))");
		
//		(5)Close the connections.
		
		conn.close();
		
		
		System.out.println("The table is created successfully....");
	}

}

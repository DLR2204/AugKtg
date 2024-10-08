package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DMLEx {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
//		(1)Loading the drivers
		
		Class.forName("oracle.jdbc.driver.OracleDriver");

//		(2)creating the connection
									
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","hello","hello");
//		(3)Create the statement

		Statement stmt = conn.createStatement();
		
//		(4)Execute the statement   DML ---->executeUpdate()
		
//		stmt.executeUpdate("insert into product values(1,'apple',2323,'mobile')");
		
		stmt.addBatch("insert into product values(2,'orange',2323,'laptop')");
		stmt.addBatch("insert into product values(3,'pear',2323,'wires')");
		stmt.addBatch("insert into product values(4,'kiwi',2323,'battery')");
		stmt.addBatch("insert into product values(5,'pineapple',2323,'earbuds')");
		stmt.addBatch("insert into product values(6,'banana',2323,'chargers')");
		stmt.addBatch("insert into product values(7,'dates',2323,'toys')");
		stmt.addBatch("insert into product values(8,'guva',2323,'books')");
		
		stmt.executeBatch();
		
		
//		(5)Close the connections.
		
		conn.close();
		
		System.out.println("Data is injected into the table successfully.......");
	}

}

package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DRLEx {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
//		(1)Loading the drivers
		
		Class.forName("oracle.jdbc.driver.OracleDriver");

//		(2)creating the connection
		
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","hello","hello");
									
//		(3)Create the statement
		
		Statement stmt = conn.createStatement();
		
//		(4)Execute the statement  DRL------>executeQuery()
		
		
		ResultSet result = stmt.executeQuery("select * from product");
		
//		(5)Close the connections.
		
		
		System.out.println("ProId | ProName |ProPrice |ProType");
		
		while(result.next()) {
			
	System.out.println(result.getInt("pid")+"  "+result.getString("pname")+"  "
	              +result.getInt("pprice")+"  "+result.getString("ptype"));		
			
		}
		
		conn.close();
	}

}

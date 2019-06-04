package core.coresub;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class MSACCESSConnection {

	public static void main(String[] args) throws SQLException  {
		
		Connection connection =null;
		Statement statement =null;
		ResultSet resultset =null;
		
		//Load the driver 
		
		try {
			Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
			
		} catch (ClassNotFoundException e) {
			System.out.println("Problem in loading JDBC driver");			
			e.printStackTrace();
		}
		
		//create conncetion with database
		
		try {
			
		String database = "C:/Users/pravir.karna/Desktop/CoreJava-Naveen/Test.accdb";
		String dbURL = "jdbc:ucanaccess://"+database;
		
		connection = DriverManager.getConnection(dbURL);
		statement = connection.createStatement();
		
		resultset = statement.executeQuery("SELECT Dept FROM Employee");
		//INSERT INTO Employee (ID,Name,Dept,Salary)
        
	
		
		    while(resultset.next()) {
			System.out.println( resultset.getInt("ID") + "\t" +
			                    resultset.getString("Name" ) + "\t\t" +
			                    resultset.getString("Dept" ) + "\t" +
			                    resultset.getInt("Salary") );    		
		    		
		    		
	  }
		}
		
		catch (SQLException sql) {
			sql.printStackTrace();
		}
		
		finally {
			//closing database
			resultset.close();
			statement.close();
			connection.close();
		}
		
			
		

	}

}

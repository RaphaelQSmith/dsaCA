package cct.dsa.ca1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Database {

	private String fName;
	private String lName;
	private String doa;
	private String passport;
	private String priority;
	private String ID;

	public void findCust(String fullname) {
		{
			try{
				// Load the database driver
				Class.forName("com.mysql.jdbc.Driver").newInstance() ;
				
				String dbServer = "jdbc:mysql://localhost:3306/queue";
				String user = "root";
				String password = "Tricolor31!";
				String query = "SELECT * FROM gnib";

				// Get a connection to the database
				Connection conn = DriverManager.getConnection(dbServer, user, password);

				// Get a statement from the connection
				Statement stmt = conn.createStatement() ;

				// Execute the query
				ResultSet rs = stmt.executeQuery(query) ;
				
				// Loop through the result set
				while(rs.next()) {
					//Populate variables with customer details from database
					ID = rs.getString("idcustomer");
					fName =rs.getString("fullname");
					lName = rs.getString("type");
					passport = rs.getString("loyaltypoints");
					priority = rs.getString("balance");
				}
				
				rs.close() ;
				stmt.close() ;
				conn.close() ;
			}
			catch( SQLException se ){
				System.out.println( "SQL Exception:" ) ;

				// Loop through the SQL Exceptions
				while( se != null ){
					System.out.println( "State  : " + se.getSQLState()  ) ;
					System.out.println( "Message: " + se.getMessage()   ) ;
					System.out.println( "Error  : " + se.getErrorCode() ) ;

					se = se.getNextException() ;
				}
			}
			catch( Exception e ){
				System.out.println( e ) ;
			}
		}
		
	}
	
}

/* File: DataSource.java
 * Author: Jaddua Jones    040898457    
 * There is code in this lab adapted from Stanley Pieda's example.
 */
package dataaccesslayer;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Properties;

public class DataSource {
	private Connection connection = null;
	
	public DataSource(){}
/*
 * Only use one connection for this application, prevent memory leaks.
 */
	public Connection createConnection(){
            // added use of Properties and try-with-resources - kriger
            Properties props = new Properties();

		try (InputStream in = Files.newInputStream(Paths.get("src/database.properties"));) {
			props.load(in);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}// catch()

	    String url = props.getProperty("jdbc.url");
	    String username = props.getProperty("jdbc.username");
	    String password = props.getProperty("jdbc.password");
		
            
            try {
			if(connection != null){
				System.out.println("Cannot create new connection, one exists already");
			}
			else{
				connection = DriverManager.getConnection(url, username, password);
                        }
        } // end try
        catch (SQLException sqlException) {
            sqlException.printStackTrace();
        } // end catch                            
		
		return connection;
	}
}
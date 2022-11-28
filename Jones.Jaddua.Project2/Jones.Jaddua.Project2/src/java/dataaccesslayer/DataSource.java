/* File: DataSource.java
 * Author: Jaddua Jones    040898457    
 */
package dataaccesslayer;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DataSource {

    private Connection conn = null;

    public DataSource() {
    }

    public Connection createConnection() {

        Properties prop = new Properties();

        try ( InputStream in = Files.newInputStream(Paths.get("src/database.properties"));) {
            prop.load(in);
        } catch (IOException e) {

            e.printStackTrace();
        }

        String url = prop.getProperty("jdbc.url");
        String uname = prop.getProperty("jdbc.username");
        String pword = prop.getProperty("jdbc.password");

        try {
            if (conn != null) {
                System.out.println("Connection creation failed as a connection already exists.");
            } else {
                conn = DriverManager.getConnection(url, uname, pword);
            }
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }

        return conn;
    }
}

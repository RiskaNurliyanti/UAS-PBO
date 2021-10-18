package puskesmas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Config {
    private static Connection MySQLConfig;
    
    public static Connection configDB() throws SQLException{
        try{
            String url = "jdbc:mysql://localhost:3306/puskesmas";
            String user = "root";
            String password = "";
            
            DriverManager.registerDriver(new com.mysql.jdbc.Driver()); 
            MySQLConfig = DriverManager.getConnection(url, user, password);
            
        }catch (SQLException e){
            System.out.println("Gagal Akses ke Database");
        }
        return MySQLConfig;
    }
}

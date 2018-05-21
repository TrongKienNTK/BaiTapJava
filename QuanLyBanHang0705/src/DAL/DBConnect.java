package DAL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DBConnect {
    static String conStrMSSQL = "jdbc:sqlserver://DESKTOP-3F7QG8Q; databaseName = QLBanHang; user = sa; password = 123456 "; 
    static Connection conn = null;
    
    public static Connection KetNoi(){
	try{
            conn = DriverManager.getConnection(conStrMSSQL);
            return conn;
        } catch(SQLException ex){
            return null;
        }
    }
}

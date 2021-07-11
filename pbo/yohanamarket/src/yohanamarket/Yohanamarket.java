package yohanamarket;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
 
public class Yohanamarket {
    public static Connection con;
    public static Statement stm;
    public static void main(String args[]){
        try {
            String url ="jdbc:mysql://localhost/yohanamarket";
            String user="root";
            String pass="";
            Class.forName("com.mysql.jdbc.Driver");
            con =(Connection) DriverManager.getConnection(url,user,pass);
            stm = con.createStatement();
            System.out.println("database berhasil;");
        } catch (Exception e) {
            System.err.println("database gagal" +e.getMessage());
        }
    }
    
}
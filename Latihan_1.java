
package Test_Koneksi;

import com.mysql.jdbc.Driver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Latihan_1 {
public static void main(String[] args) {
}
    static final String db_url="jdbc:mysql://localhost:3306/db_unidha3";
    public static Connection db_unidha2() throws SQLException , ClassNotFoundException{
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Proses Deteksi Driver Berhasil");
            DriverManager.getConnection(db_url,"root","");
            System.out.println("Koneksi Database Berhasil");
        }catch (final SQLException ex) {
            System.out.println("Koneksi Database Gagal");
        }
        return Test_Konek;
        }
    
    }

    
    
    


 

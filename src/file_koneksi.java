
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Mufidatun
 */
public class file_koneksi {
    private static Connection koneksi;
    public static Connection GetConnection() throws SQLException {
        if (koneksi == null) {
            Driver driver = new Driver();
            koneksi  =  (Connection) 
            DriverManager.getConnection("jdbc:mysql://localhost:3306/db_keretaku?zeroDateTimeBehavior=convertToNull", "root", "");
        }
    return koneksi;
    }
}

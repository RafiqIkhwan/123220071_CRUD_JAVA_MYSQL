/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package koneksi;

/**
 *
 * @author HP
 */

import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.*;

public class KoneksiBuku {

    static Connection con;

    public static Connection Bukakoneksi() {
        if (con == null) {
            MysqlDataSource data = new MysqlDataSource();
            data.setDatabaseName("perpustakaan");
            data.setUser("root");
            data.setPassword("");
            try {
                con = data.getConnection();
                System.out.println("Koneksi berhasil");
            } catch (SQLException ex) {
                System.out.println("Koneksi gagal");
            }
        }
         return con;
    }
}

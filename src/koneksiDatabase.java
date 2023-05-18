/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
import java.sql.*;
import javax.swing.JOptionPane;
public class koneksiDatabase {
    Connection cn;
    public static Connection BukaKoneksi() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/NAMA_DATABSE", "root", "");
            return cn;
        } catch (Exception e) {
        JOptionPane.showMessageDialog(null,e );           
        return null;
        }
    }
}

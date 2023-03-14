/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author edwar
 */
public class Conexion {
    public static Connection getConexion() {
        String url = "jdbc:sqlserver://localhost:1433;" 
                + "database = escuela;" 
                + "user = ;" 
                + "password = ;" + "loginTimeout = 40";
        try {
            return DriverManager.getConnection(url);
        }catch(SQLException e) {
            System.out.println(e.toString());
            return null;
        }
    }
}

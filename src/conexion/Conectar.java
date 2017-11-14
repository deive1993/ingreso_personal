/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class Conectar {
        private static Connection conn;
    private static final String driver = "com.mysql.jdbc.Driver";
    private static final String user = "root";
    private static final String password = "teamo110593gnd";
    private static final String url = "jdbc:mysql://localhost:3307/tienda";

    public Conectar() {
        conn = null;
         try {
            //cargar nuestro drive
            Class.forName(driver);
            conn=DriverManager.getConnection(url,user,password);
            if (conn != null){
               JOptionPane.showMessageDialog(null, "conectado");
                System.out.println("conexion establecida");
            }
            
           
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("error de conexion"+e);
        }

    }
    
   public Connection getcConnection(){
           return conn;  
         }

    public void desconectar() {
      
      conn = null;
       if (conn == null ){
           System.out.println("conexion terminada");
       }
    }
}

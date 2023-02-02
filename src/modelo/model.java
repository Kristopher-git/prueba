/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class model {
    
   String BD = "jdbc:mysql://localhost:3306/Kristopher";
   String driver = "com.mysql.jdbc.Driver";
   String usuario = "root";
   String pass = "";
   Connection conn=null;
   
    public Connection conectarme() {
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(BD, usuario, pass);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "no se conecto correctamente" +e);
        }
        
        return conn;
    }
    
    public void cerrar(){
        try {
            conn.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudo cerrar la conexion" +e);
        }
    }
           
}

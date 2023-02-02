/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.maestros.regiones_geograficas;

import java.sql.Connection;
import java.sql.ResultSet;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Alert;
import javax.swing.JOptionPane;
import modelo.model;

/**
 *
 * @author User
 */
public class paisesmodel {
    
    private String codigoPais;
    private String nombrePais;
    
    
    model con = new model();
    Connection conexion = con.conectarme();
    ObservableList<paisesmodel> obs;

    public paisesmodel() {
    }

    public paisesmodel(String codigoPais, String nombrePais) {
        this.codigoPais = codigoPais;
        this.nombrePais = nombrePais;
    }

    public String getCodigoPais() {
        return codigoPais;
    }

    public void setCodigoPais(String codigoPais) {
        this.codigoPais = codigoPais;
    }

    public String getNombrePais() {
        return nombrePais;
    }

    public void setNombrePais(String nombrePais) {
        this.nombrePais = nombrePais;
    }
    
    
    
    public ObservableList<paisesmodel> getPaises(){
        obs = FXCollections.observableArrayList();
        
        try {
            
            java.sql.Statement st = conexion.createStatement();           
            String sql = "SELECT * FROM paises ORDER BY nombre_pais ASC";
            
            ResultSet rs = st.executeQuery(sql);
            
            while (rs.next()){    
                String nomb = rs.getString("nombre_pais");
                String code = rs.getString("codigo_pais");
                
                paisesmodel dep = new paisesmodel(code, nomb);
                obs.add(dep);
                
            }
            
            st.close();
            rs.close();
            con.cerrar();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No pudieron mostrar los paises"+e, "Mensaje", JOptionPane.ERROR_MESSAGE);

        }
        return obs;
    }
    
    public void insertarPais(){
        try {
            
            java.sql.Statement st = conexion.createStatement();
            
            String sql = "INSERT INTO paises(codigo_pais,nombre_pais) "
                + "values("
                + "'"+this.getCodigoPais()+"',"
                + "'"+this.getNombrePais()+"'"
                + ")";
            st.execute(sql);
            st.close();
            con.cerrar();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se guardo el pais"+e, "Mensaje", JOptionPane.ERROR_MESSAGE);
        }
        
    }
    
    public int existePaises(String codigo, String pais){
        try {
            
            java.sql.Statement st = conexion.createStatement();
            
            String sql1 = "SELECT count(codigo_pais) FROM paises WHERE codigo_pais= '"+this.getCodigoPais()+"' OR nombre_pais='"+this.getNombrePais()+"'";
            
            ResultSet rs = st.executeQuery(sql1);
            
            if(rs.next()){
                return rs.getInt(1);
            }
            
            st.close();
            con.cerrar();
            return 1;
            
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se guardo el pais"+e, "Mensaje", JOptionPane.ERROR_MESSAGE);
            return 1;
        }
        
    }
    
    public void modificarPais(){
        try {
            
            java.sql.Statement st = conexion.createStatement();
            
            String sql = "UPDATE paises SET nombre_pais='"+this.getNombrePais()+"' WHERE codigo_pais='"+this.getCodigoPais()+"'";
            
            st.execute(sql);
            st.close();
            con.cerrar();
            
            
        } catch (Exception e) {
            Alert alerta = new Alert(Alert.AlertType.INFORMATION);
            alerta.setHeaderText(null);
            alerta.setTitle("Error");
            alerta.setContentText("Estas intentando grabar un dato duplicado...! " +this.getNombrePais());
            alerta.showAndWait();
        }
    }
    
    public void eliminarPais(){
        try {
            
            java.sql.Statement st = conexion.createStatement();
            
            String sql = "DELETE FROM paises WHERE codigo_pais='"+this.getCodigoPais()+"'";
            
            st.execute(sql);
            st.close();
            con.cerrar();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se guardo el pais"+e, "Mensaje", JOptionPane.ERROR_MESSAGE);
        }
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.maestros.centro_costos;

import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import modelo.model;

/**
 *
 * @author User
 */
public class subCentroModel {
    
    private String codigo;
    private String nombre;
    private int presupuesto;
    private String id_centro_costo;
    private boolean inactivo;
    
    public subCentroModel() {
    }

    public subCentroModel(String codigo, String nombre, int Subpresupuesto, String id_centro_costo, boolean inactivo) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.presupuesto = Subpresupuesto;
        this.id_centro_costo = id_centro_costo;
        this.inactivo= inactivo;
    }

    public subCentroModel(String nombre) {
        this.nombre = nombre;
    }

    public boolean isInactivo() {
        return inactivo;
    }

    public void setInactivo(boolean inactivo) {
        this.inactivo = inactivo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(int presupuesto) {
        this.presupuesto = presupuesto;
    }

    public String getId_centro_costo() {
        return id_centro_costo;
    }

    public void setId_centro_costo(String id_centro_costo) {
        this.id_centro_costo = id_centro_costo;
    }
    
    model con = new model();
    Connection conexion = con.conectarme();
    
    
    public void insertarSubCentro(){
        try {
            int estado = 0;
            if(this.isInactivo()==true){
                estado = 1;
            }
            java.sql.Statement st = conexion.createStatement();
            
            String sql = "INSERT INTO subcentro_costo (codigo,nombre,presupuesto,id_centro_costo,inactivo) "
                + "values("
                + "'"+this.getCodigo()+"',"
                + "'"+this.getNombre()+"',"
                + "'"+this.getPresupuesto()+"',"
                + "'"+this.getId_centro_costo()+"',"
                + "'"+estado+"'"
                + ")";
            st.execute(sql);
            st.close();
            conexion.close();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se guardo el sub-centro de costo"+e, "Mensaje", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void getSubCentro(String codigo){
                
        try {
            
            java.sql.Statement st = conexion.createStatement();
            String sql = "SELECT * FROM subcentro_costo WHERE codigo='"+codigo+"'";
            ResultSet rs = st.executeQuery(sql);
            if(rs.next()){
                String name = rs.getString("nombre");                         
                setNombre(name);
            }
            st.close();
            conexion.close();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No pudo encontrar sub centro"+e, "Mensaje", JOptionPane.ERROR_MESSAGE);
        }    
    }
    
    
}

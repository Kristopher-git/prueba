/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.maestros.PlanCuentas;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Objects;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javax.swing.JOptionPane;
import modelo.FuncionesVarias;
import modelo.model;

/**
 *
 * @author User
 */
public class modelPlanMaestro {
    private String codigo;
    private String nombre;

    model con = new model();
    Connection conexion = con.conectarme();
    FuncionesVarias funciones = new FuncionesVarias();
    private ObservableList<modelPlanMaestro> obs;
 
    public modelPlanMaestro(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public modelPlanMaestro() {
    }
    
    
    
    //GETTER & SETTER
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

    //EQUALS
    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final modelPlanMaestro other = (modelPlanMaestro) obj;
        if (!Objects.equals(this.codigo, other.codigo)) {
            return false;
        }
        return Objects.equals(this.nombre, other.nombre);
    }

    //TO STRING
    @Override
    public String toString() {
        return nombre;
    }
    
    public ObservableList<modelPlanMaestro> getPlanesUnicos(){
        obs = FXCollections.observableArrayList();
        
        try {
            
            java.sql.Statement st = conexion.createStatement();

            String sql = "SELECT * FROM plan_maestro";
            ResultSet rs = st.executeQuery(sql);
            
            
            while (rs.next()) {                
                String codigo =  rs.getString("codigo");
                String nombre =  rs.getString("nombre");
                
                modelPlanMaestro punico =  new modelPlanMaestro(codigo, nombre);
                
                obs.add(punico);
                
            }
            
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No pudieron mostrar los planes de cuenta: " + e, "Mensaje", JOptionPane.ERROR_MESSAGE);

        }

        return obs;
    }
    
    public modelPlanMaestro getPlanUnicosDefault(){

        PreparedStatement ps = null;
        ResultSet rs = null;
        
        modelPlanMaestro planDefecto = null;
        
        try {
            ps = conexion.prepareStatement("SELECT * FROM plan_maestro WHERE codigo = (SELECT codigo_plan_unico FROM cuntas_maestro);");
            rs = ps.executeQuery();
            while (rs.next()) {
                String codigo =  rs.getString("codigo");
                String nombre =  rs.getString("nombre");
                planDefecto =  new modelPlanMaestro(codigo, nombre);
            }
        } catch (Exception e) {
            System.out.println("error:"+e.getMessage());
        }
        return planDefecto;
    }
}

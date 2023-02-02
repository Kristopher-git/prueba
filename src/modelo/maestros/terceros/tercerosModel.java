/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.maestros.terceros;

import java.sql.Connection;
import java.sql.ResultSet;
import javafx.collections.ObservableList;
import javax.swing.JOptionPane;
import modelo.FuncionesVarias;
import modelo.model;

/**
 *
 * @author User
 */
public class tercerosModel {
    private int nit;
    private String TipoNit;
    private String PrimerNombre;
    private String SegundoNombre;
    private String PrimerApellido;
    private String SegundoApellido;
    private ObservableList<tercerosModel> obs;
    FuncionesVarias funciones = new FuncionesVarias();

    public tercerosModel() {
    }

    public tercerosModel(int nit, String TipoNit, String PrimerNombre, String SegundoNombre, String PrimerApellido, String SegundoApellido) {
        this.nit = nit;
        this.TipoNit = TipoNit;
        this.PrimerNombre = PrimerNombre;
        this.SegundoNombre = SegundoNombre;
        this.PrimerApellido = PrimerApellido;
        this.SegundoApellido = SegundoApellido;
    }
    
    public int getNit() {
        return nit;
    }

    public void setNit(int nit) {
        this.nit = nit;
    }

    public String getTipoNit() {
        return TipoNit;
    }

    public void setTipoNit(String TipoNit) {
        this.TipoNit = TipoNit;
    }

    public String getPrimerNombre() {
        return PrimerNombre;
    }

    public void setPrimerNombre(String PrimerNombre) {
        this.PrimerNombre = PrimerNombre;
    }

    public String getSegundoNombre() {
        return SegundoNombre;
    }

    public void setSegundoNombre(String SegundoNombre) {
        this.SegundoNombre = SegundoNombre;
    }

    public String getPrimerApellido() {
        return PrimerApellido;
    }

    public void setPrimerApellido(String PrimerApellido) {
        this.PrimerApellido = PrimerApellido;
    }

    public String getSegundoApellido() {
        return SegundoApellido;
    }

    public void setSegundoApellido(String SegundoApellido) {
        this.SegundoApellido = SegundoApellido;
    }
    
    model con = new model();
    Connection conexion = con.conectarme();
    
    public void insertarTerceros(){
        try {
            
            java.sql.Statement st = conexion.createStatement();
            
            String sql = "INSERT INTO terceros (nit,tipodoc,primernombre,segundonombre,primerapellido,segundoapellido) "
                + "values("
                + "'"+this.getNit()+"',"
                + "'"+this.getTipoNit()+"',"
                + "'"+this.getPrimerNombre()+"',"
                + "'"+this.getSegundoNombre()+"',"
                + "'"+this.getPrimerApellido()+"',"
                + "'"+this.getSegundoApellido()+"'"
                + ")";
            st.execute(sql);
            st.close();
            conexion.close();
            
        } catch (Exception e) {
            funciones.alerta(null, "Error", "El nit que esta intentando ingresar ya se encuentra registrado...");
        }
        
    }
    
    public int existeTercero(int nit){
        try {
            
            java.sql.Statement st = conexion.createStatement();
            
            String sql1 = "SELECT count(nit) FROM terceros WHERE nit= '"+this.getNit()+"'";
            
            ResultSet rs = st.executeQuery(sql1);
            
            if(rs.next()){
                return rs.getInt(1);
            }
            
            st.close();
            conexion.close();
            return 1;
            
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudo ejecutar la existencia"+e, "Mensaje", JOptionPane.ERROR_MESSAGE);
            return 1;
        }
        
    }
    
}

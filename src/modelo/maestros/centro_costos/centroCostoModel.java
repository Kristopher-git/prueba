/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.maestros.centro_costos;

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
public class centroCostoModel {
    
    private String codigo;
    private String nombre;
    private String region;
    private ObservableList<centroCostoModel> obs;
    public ObservableList<centroCostoModel> obs2;
    
    private String codigoSub;
    private String nombreSub;
    private int presupuestoSub;
    private String id_centro_costoSub;
    private boolean inactivoSub;

    public centroCostoModel(String codigoSub, String nombreSub, int presupuestoSub, boolean inactivoSub) {
        this.codigoSub = codigoSub;
        this.nombreSub = nombreSub;
        this.presupuestoSub = presupuestoSub;
        this.inactivoSub = inactivoSub;
    }
    
    
    
    public centroCostoModel(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigoSub() {
        return codigoSub;
    }

    public void setCodigoSub(String codigoSub) {
        this.codigoSub = codigoSub;
    }

    public String getNombreSub() {
        return nombreSub;
    }

    public void setNombreSub(String nombreSub) {
        this.nombreSub = nombreSub;
    }

    public int getPresupuestoSub() {
        return presupuestoSub;
    }

    public void setPresupuestoSub(int presupuestoSub) {
        this.presupuestoSub = presupuestoSub;
    }

    public String getId_centro_costoSub() {
        return id_centro_costoSub;
    }

    public void setId_centro_costoSub(String id_centro_costoSub) {
        this.id_centro_costoSub = id_centro_costoSub;
    }

    public boolean isInactivoSub() {
        return inactivoSub;
    }

    public void setInactivoSub(boolean inactivoSub) {
        this.inactivoSub = inactivoSub;
    }
    
    
    public centroCostoModel() {
    }

    public centroCostoModel(String codigo, String nombre, String region) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.region = region;
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

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }
    
    model con = new model();
    Connection conexion = con.conectarme();
    
    
    public void inertarCentroCosto(){
        try {
            
            java.sql.Statement st = conexion.createStatement();
            
            String sql = "INSERT INTO centro_costo (codigo,nombre_centro,estado,id_zona) "
                + "values("
                + "'"+this.getCodigo()+"',"
                + "'"+this.getNombre()+"',"
                + "'ACTIVO',"
                + "'"+this.getRegion()+"'"
                + ")";
            st.execute(sql);
            st.close();
            conexion.close();
            
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se guardo el centro de costo"+e, "Mensaje", JOptionPane.ERROR_MESSAGE);
        }
        
    }
    
    public void getOneCentro(String codigo){
                
        try {
            
            java.sql.Statement st = conexion.createStatement();
            String sql = "SELECT * FROM centro_costo WHERE codigo='"+codigo+"'";
            ResultSet rs = st.executeQuery(sql);
            if(rs.next()){
                String name = rs.getString("nombre_centro");                         
                setNombre(name);
            }
            st.close();
            conexion.close();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No pudo encontrar centro"+e, "Mensaje", JOptionPane.ERROR_MESSAGE);
        }    
    }
    
    public ObservableList<centroCostoModel> getSubCentrosCosto(){
        obs = FXCollections.observableArrayList();
        
        try {
            
            java.sql.Statement st = conexion.createStatement();
            
            String sql = "SELECT * FROM subcentro_costo WHERE id_centro_costo='"+this.getCodigo()+"' ORDER BY codigo ASC";
            
            ResultSet rs = st.executeQuery(sql);
            
            while (rs.next()){
                
                String codig = rs.getString("codigo");
                String name = rs.getString("nombre");
                int presupuesto = rs.getInt("presupuesto");
                boolean inactivo = rs.getBoolean("inactivo");
                
                centroCostoModel dep = new centroCostoModel(codig, name, presupuesto, inactivo);
                
                obs.add(dep);
                
            }
            
            
            st.close();
            con.cerrar();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No pudieron mostrar los subcentros"+e, "Mensaje", JOptionPane.ERROR_MESSAGE);

        }
        
        return obs;
    }
    
    public ObservableList<centroCostoModel> getCentroCostos(){
        obs = FXCollections.observableArrayList();
        
        try {
            
            java.sql.Statement st = conexion.createStatement();
            
            String sql2 = "SELECT codigo, nombre_centro, id_zona FROM centro_costo WHERE estado='ACTIVO' ORDER BY nombre_centro ASC";
            
            ResultSet rs1 = st.executeQuery(sql2);

            while (rs1.next()){
                String codigo = rs1.getString("codigo");
                String nombre_centro = rs1.getString("nombre_centro");
                String zona = rs1.getString("id_zona");
                
                centroCostoModel dep = new centroCostoModel(codigo, nombre_centro, zona);
                
                obs.add(dep);
            }
            
            st.close();
            conexion.close();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No pudieron mostrar los departamentos"+e, "Mensaje", JOptionPane.ERROR_MESSAGE);

        }
        
        return obs;
    }
    public int existeCentroCosto(String nombre, String codigo){
        try {
            
            java.sql.Statement st = conexion.createStatement();
            
            String sql1 = "SELECT count(id_centro_costo) FROM centro_costo WHERE nombre_centro= '"+this.getNombre()+"' OR codigo='"+this.getCodigo()+"'";
            
            ResultSet rs = st.executeQuery(sql1);
            
            if(rs.next()){
                return rs.getInt(1);
            }
            
            st.close();
            conexion.close();
            return 1;
            
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ya existe un centro de costo cn ese nombre"+e, "Mensaje", JOptionPane.ERROR_MESSAGE);
            return 1;
        }
        
    }
    public void modificarCentroCosto(){
        try {
            
            java.sql.Statement st = conexion.createStatement();
            
            String sql = "UPDATE centro_costo SET nombre_centro='"+this.getNombre()+"' WHERE codigo='"+this.getCodigo()+"'";
            
            st.execute(sql);
            st.close();
            conexion.close();
            
            
        } catch (Exception e) {
            Alert alerta = new Alert(Alert.AlertType.INFORMATION);
            alerta.setHeaderText(null);
            alerta.setTitle("Error");
            alerta.setContentText("Estas intentando grabar un dato duplicado...! " +this.getNombre());
            alerta.showAndWait();
        }
    }
    
    public void eliminarSubcentro(String codigo){
        try {
            
            java.sql.Statement st = conexion.createStatement();
            
            String sql = "DELETE FROM subcentro_costo WHERE codigo='"+codigo+"'";
            
            st.execute(sql);
            st.close();
            conexion.close();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se elimino el subcentro"+e, "Mensaje", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void eliminarCentro(String codigo){
        try {
            
            java.sql.Statement st = conexion.createStatement();
            
            String sql = "UPDATE centro_costo set estado='DESACTIVO' WHERE codigo='"+codigo+"'";
            
            st.execute(sql);
            st.close();
            conexion.close();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se elimino el centro"+e, "Mensaje", JOptionPane.ERROR_MESSAGE);
        }
    }
}

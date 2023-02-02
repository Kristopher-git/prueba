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
public class zonasmodel {
    
    private String codigo;
    private String nombre;
    private String idCosto;
    private String idSubCentro;
    private int idVendedor;
    private ObservableList<zonasmodel> obs;
    

    public zonasmodel() {
    }
    

    public zonasmodel(String codigo, String nombre, String idCosto, String idSubCentro, int idVendedor) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.idCosto = idCosto;
        this.idSubCentro = idSubCentro;
        this.idVendedor = idVendedor;
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

    public String getIdCosto() {
        return idCosto;
    }

    public void setIdCosto(String idCosto) {
        this.idCosto = idCosto;
    }

    public String getIdSubCentro() {
        return idSubCentro;
    }

    public void setIdSubCentro(String idSubCentro) {
        this.idSubCentro = idSubCentro;
    }

    public int getIdVendedor() {
        return idVendedor;
    }

    public void setIdVendedor(int idVendedor) {
        this.idVendedor = idVendedor;
    }
    
    model con = new model();
    Connection conexion = con.conectarme();
    
    
    public ObservableList<zonasmodel> getOneZone(String codigo){
        
        obs = FXCollections.observableArrayList();
        
        try {
            
            java.sql.Statement st = conexion.createStatement();
            
            String sql = "SELECT * FROM zona WHERE codigo='"+codigo+"' and estado='ACTIVO' ORDER BY nombre ASC";
            
            ResultSet rs = st.executeQuery(sql);
            
            while (rs.next()){
                
                String code = rs.getString("codigo");
                String name = rs.getString("nombre");
                String costo = rs.getString("id_centro_costo");
                String subcentro = rs.getString("id_subcentro_costo");
                int vendedor = rs.getInt("id_vendedor");
                
                zonasmodel zona = new zonasmodel(code, name, costo, subcentro, vendedor);
                setNombre(name);
                
                obs.add(zona);
                
            }
            
            st.close();
            con.cerrar();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No pudieron mostrar los zona"+e, "Mensaje", JOptionPane.ERROR_MESSAGE);

        }
        
        return obs;
        
    }
    
    
    public ObservableList<zonasmodel> getZonas(){
        
        obs = FXCollections.observableArrayList();
        
        try {
            
            java.sql.Statement st = conexion.createStatement();
            
            String sql = "SELECT * FROM zona WHERE estado='ACTIVO' ORDER BY nombre ASC";
            
            ResultSet rs = st.executeQuery(sql);
            
            while (rs.next()){
                
                String code = rs.getString("codigo");
                String name = rs.getString("nombre");
                String costo = rs.getString("id_centro_costo");
                String subcentro = rs.getString("id_subcentro_costo");
                int vendedor = rs.getInt("id_vendedor");
                
                zonasmodel zona = new zonasmodel(code, name, costo, subcentro, vendedor);
                
                obs.add(zona);
                
            }
            
            st.close();
            con.cerrar();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No pudieron mostrar los zona"+e, "Mensaje", JOptionPane.ERROR_MESSAGE);

        }
        
        return obs;
    }
    
    public void inertarZona(){
        try {
            
            java.sql.Statement st = conexion.createStatement();
            
            String sql = "INSERT INTO zona (codigo,nombre,id_centro_costo,id_subcentro_costo,estado,id_vendedor) "
                + "values("
                + "'"+this.getCodigo()+"',"
                + "'"+this.getNombre()+"',"
                + "'"+this.getIdCosto()+"',"
                + "'"+this.getIdSubCentro()+"',"
                + "'ACTIVO',"
                + "'"+this.getIdVendedor()+"'"
                + ")";
            st.execute(sql);
            st.close();
            con.cerrar();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se guardo la zona correctamente"+e, "Mensaje", JOptionPane.ERROR_MESSAGE);
        }
        
    }
    
    public void eliminarZona(String codigo){
        try {
            
            java.sql.Statement st = conexion.createStatement();
            
            String sql = "UPDATE zona set estado='DESACTIVO' WHERE codigo='"+codigo+"'";
            
            st.execute(sql);
            st.close();
            con.cerrar();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se elimino la zona"+e, "Mensaje", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void modificarZona(){
        try {
            
            java.sql.Statement st = conexion.createStatement();
            
            String sql = "UPDATE zona SET nombre='"+this.getNombre()+"', id_centro_costo='"+this.getIdCosto()+"', id_subcentro_costo='"+this.getIdSubCentro()+"', id_vendedor='"+this.getIdVendedor()+"' WHERE codigo='"+this.getCodigo()+"'";
            
            st.execute(sql);
            st.close();
            con.cerrar();
            
            
        } catch (Exception e) {
            Alert alerta = new Alert(Alert.AlertType.INFORMATION);
            alerta.setHeaderText(null);
            alerta.setTitle("Error");
            alerta.setContentText("Estas intentando grabar un dato duplicado...! " +this.getNombre());
            alerta.showAndWait();
        }
    }
    public int existeZona(String nombre, String codigo){
        try {
            
            java.sql.Statement st = conexion.createStatement();
            
            String sql1 = "SELECT count(id_zona) FROM zona WHERE nombre= '"+this.getNombre()+"' OR codigo='"+this.getCodigo()+"'";
            
            ResultSet rs = st.executeQuery(sql1);
            
            if(rs.next()){
                return rs.getInt(1);
            }
            
            st.close();
            con.cerrar();
            return 1;
            
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ya existe una zona con ese nombre"+e, "Mensaje", JOptionPane.ERROR_MESSAGE);
            return 1;
        }
        
    }
    
}

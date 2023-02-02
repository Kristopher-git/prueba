/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.maestros.regiones_geograficas;


import java.io.File;
import java.sql.ResultSet;
import java.sql.Connection;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Alert;
import javax.swing.JOptionPane;
import modelo.model;


/**
 *
 * @author User
 */
public class departamentosmodel {
    
    private String codigo;
    private String nombre;
    private String ubicacionpais;
    private String nombrePais;

    model con = new model();
    Connection conexion = con.conectarme();
    ObservableList<departamentosmodel> obs;
    
    public departamentosmodel(){
        
    }
    
    public departamentosmodel(String codigo, String nombre, String ubicacionPais) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.ubicacionpais = ubicacionPais;

    }
    
    public String getUbicacionpais() {
        return ubicacionpais;
    }

    public void setUbicacionpais(String ubicacionpais) {
        this.ubicacionpais = ubicacionpais;
    }

    public String getNombrePais() {
        return nombrePais;
    }

    public void setNombrePais(String nombrePais) {
        this.nombrePais = nombrePais;
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

    
    public void insertarDepartamento(){
        try {
            
            java.sql.Statement st = conexion.createStatement();
            
            String sql = "INSERT INTO departamento(codigo,nombre,codigo_pais) "
                + "values("
                + "'"+this.getCodigo()+"',"
                + "'"+this.getNombre()+"',"
                + "'"+this.getUbicacionpais()+"'"
                + ")";
            st.execute(sql);
            st.close();
            con.cerrar();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se guardo el departamento"+e, "Mensaje", JOptionPane.ERROR_MESSAGE);
        }
        
    }
    
    public int existeDepartamento(String usuario, String codigo){
        try {
            
            java.sql.Statement st = conexion.createStatement();
            
            String sql1 = "SELECT count(id_departamento) FROM departamento WHERE codigo= '"+this.getCodigo()+"' OR nombre='"+this.getNombre()+"'";
            
            ResultSet rs = st.executeQuery(sql1);
            
            if(rs.next()){
                return rs.getInt(1);
            }
            
            st.close();
            con.cerrar();
            return 1;
            
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se guardo el departamento"+e, "Mensaje", JOptionPane.ERROR_MESSAGE);
            return 1;
        }
        
    }
    
    public void modificarDepartamento(){
        try {
            
            java.sql.Statement st = conexion.createStatement();
            
            String sql = "UPDATE departamento SET nombre='"+this.getNombre()+"', codigo_pais='"+this.getUbicacionpais()+"' WHERE codigo='"+this.getCodigo()+"'";
            
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
    
    public void eliminarDepartamento(){
        try {
            
            java.sql.Statement st = conexion.createStatement();
            
            String sql = "DELETE FROM departamento WHERE codigo='"+this.getCodigo()+"'";
            
            st.execute(sql);
            st.close();
            con.cerrar();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se guardo el departamento"+e, "Mensaje", JOptionPane.ERROR_MESSAGE);
        }
    }
    public void  getExcel(File file){
            /*
            try {
                getDepartamentos();
                BufferedWriter writer = new BufferedWriter(new FileWriter(file));
                
                for (departamentosmodel dep : obs){

                    String text = dep.getCodigo() + ",";
                    text += dep.getNombre();
                    text += "\n";
                    
                    writer.write(text);
                }            

                writer.flush();
                writer.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "No"+e, "Mensaje", JOptionPane.ERROR_MESSAGE);
            }
            */        
    }
    
    public ObservableList<departamentosmodel> getDepartamentos(){
        obs = FXCollections.observableArrayList();
        
        try {
            
            java.sql.Statement st = conexion.createStatement();
            
            String sql = "SELECT dep.nombre, dep.codigo, dep.codigo_pais, p.nombre_pais FROM departamento as dep inner join paises as p on dep.codigo_pais=p.codigo_pais ORDER BY nombre ASC;";
            
            ResultSet rs = st.executeQuery(sql);
            
            while (rs.next()){
                
                String nomb = rs.getString("nombre");
                String code = rs.getString("codigo");
                String ubicacion = rs.getString("nombre_pais");

                
                departamentosmodel dep = new departamentosmodel(code, nomb, ubicacion);
                
                obs.add(dep);
                
            }
            
            st.close();
            rs.close();
            con.cerrar();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No pudieron mostrar los departamentos"+e, "Mensaje", JOptionPane.ERROR_MESSAGE);

        }
        return obs;
    }
    
}

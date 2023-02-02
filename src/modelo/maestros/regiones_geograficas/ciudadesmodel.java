package modelo.maestros.regiones_geograficas;


import java.sql.Connection;
import java.sql.ResultSet;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Alert;
import javax.swing.JOptionPane;
import modelo.model;


public class ciudadesmodel {
    
    private String codigo;
    private String nombre;
    private String codigoDep;
    private String codigoZona;
    private String departament;
    
    model con = new model();
    Connection conexion = con.conectarme();
    ObservableList<ciudadesmodel> obs;
    public ciudadesmodel(){
        
    }

    public ciudadesmodel(String codigo, String nombre, String codigoDep, String codigoZona) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.codigoDep = codigoDep;
        this.codigoZona = codigoZona;
    }

    public ciudadesmodel(String codigo, String nombre, String departament) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.departament = departament;
    }

    
    public ciudadesmodel(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
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

    public String getCodigoDep() {
        return codigoDep;
    }

    public void setCodigoDep(String codigoDep) {
        this.codigoDep = codigoDep;
    }

    public String getCodigoZona() {
        return codigoZona;
    }

    public void setCodigoZona(String codigoZona) {
        this.codigoZona = codigoZona;
    }

    public String getDepartamento() {
        return departament;
    }

    public void setDepartamento(String departamento) {
        this.departament = departamento;
    }
    
    
    public ObservableList<ciudadesmodel> getCiudades(){

        obs = FXCollections.observableArrayList();
        
        try {
            
            java.sql.Statement st = conexion.createStatement();
            
            String sql = "SELECT c.ciudad, c.codigo, d.nombre, c.id_departamento FROM ciudad as c inner join departamento as d on c.id_departamento=d.codigo ORDER BY nombre ASC;";
            
            ResultSet rs = st.executeQuery(sql);
            
            while (rs.next()){
                
                String codigo = rs.getString("codigo");
                String nombre = rs.getString("ciudad");
                String departamento = rs.getString("nombre");
                ciudadesmodel ciudades = new ciudadesmodel(codigo, nombre, departamento);
                
                
                obs.add(ciudades);
                
            }
            
            st.close();
            rs.close();
            con.cerrar();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No pudieron mostrar las ciudades"+e, "Mensaje", JOptionPane.ERROR_MESSAGE);

        }
        
        return obs;
    }
    
    public void insertarCiudad(){
        try {
            
            java.sql.Statement st = conexion.createStatement();
            
            String sql = "INSERT INTO ciudad (codigo,ciudad,id_departamento) "
                + "values("
                + "'"+this.getCodigo()+"',"
                + "'"+this.getNombre()+"',"
                + "'"+this.getDepartamento()+"'"
                + ")";
            st.execute(sql);
            st.close();
            con.cerrar();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se guardo la ciudad"+e, "Mensaje", JOptionPane.ERROR_MESSAGE);
        }
        
    }
    
    public int existeCiudad(String nombre, String codigo){
        try {
            
            java.sql.Statement st = conexion.createStatement();
            
            String sql1 = "SELECT count(id_ciudad) FROM ciudad WHERE codigo= '"+this.getCodigo()+"' OR ciudad='"+this.getNombre()+"'";
            
            ResultSet rs = st.executeQuery(sql1);
            
            if(rs.next()){
                return rs.getInt(1);
            }
            
            st.close();
            con.cerrar();
            return 1;
            
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudo ejecutar la existencia"+e, "Mensaje", JOptionPane.ERROR_MESSAGE);
            return 1;
        }
        
    }
    
    public int existeNombreCiudad(String nombre){
        try {
            
            java.sql.Statement st = conexion.createStatement();
            
            String sql1 = "SELECT count(id_ciudad) FROM ciudad WHERE ciudad='"+this.getNombre()+"'";
            
            ResultSet rs = st.executeQuery(sql1);
            
            if(rs.next()){
                return rs.getInt(1);
            }
            
            st.close();
            con.cerrar();
            return 1;
            
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudo ejecutar la existencia"+e, "Mensaje", JOptionPane.ERROR_MESSAGE);
            return 1;
        }
        
    }
    public void modificarCiudad(){
        try {
            
            java.sql.Statement st = conexion.createStatement();
            
            String sql = "UPDATE ciudad SET ciudad='"+this.getNombre()+"', id_departamento='"+this.getDepartamento()+"' WHERE codigo='"+this.getCodigo()+"'";
            
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
    
    public void eliminarCiudad(){
        try {
            
            java.sql.Statement st = conexion.createStatement();
            String sql = "DELETE FROM ciudad WHERE codigo='"+this.getCodigo()+"'";
            
            st.execute(sql);
            st.close();
            con.cerrar();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No elimino correctamente la ciudad"+e, "Mensaje", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void modificarRelacionZonayCiudad(){
        try {
            
            java.sql.Statement st = conexion.createStatement();
            
            String sql = "UPDATE ciudad SET id_zona='"+this.getCodigoZona()+"' WHERE codigo='"+this.getCodigo()+"'";
            
            st.execute(sql);
            st.close();
            con.cerrar();
            
            
        } catch (Exception e) {
            Alert alerta = new Alert(Alert.AlertType.INFORMATION);
            alerta.setHeaderText(null);
            alerta.setTitle("Error");
            alerta.setContentText("Estas intentando grabar un dato duplicado...! " +this.getCodigoZona());
            alerta.showAndWait();
        }
    }
    
   
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.maestros.tipos_documentos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javax.swing.JOptionPane;
import modelo.FuncionesVarias;
import modelo.model;

/**
 *
 * @author User
 */
public class modelo_tipos_documentos {

    model con = new model();
    Connection conexion = con.conectarme();
    FuncionesVarias funciones = new FuncionesVarias();
    private ObservableList<modelo_tipos_documentos> obs;
    
    private String codigo;
    private String nombre;
    private ImageView imagen;
    private String codigo_cantidad;
    private String clasedoc;

    public String getClasedoc() {
        return clasedoc;
    }

    public void setClasedoc(String clasedoc) {
        this.clasedoc = clasedoc;
    }

    public String getCodigo_cantidad() {
        return codigo_cantidad;
    }

    public void setCodigo_cantidad(String codigo_cantidad) {
        this.codigo_cantidad = codigo_cantidad;
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

    public ImageView getImagen() {
        return imagen;
    }

    public void setImagen(ImageView imagen) {
        this.imagen = imagen;
    }

    public modelo_tipos_documentos() {
    }

    public modelo_tipos_documentos(String codigo, String nombre, String clasedocs) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.clasedoc = clasedocs;
    }

    public modelo_tipos_documentos(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }
    
    

    public ObservableList<modelo_tipos_documentos> get_tipo_documentos() {

        obs = FXCollections.observableArrayList();

        try {
            java.sql.Statement st = conexion.createStatement();
            String sql = "SELECT codigo,nombre,clasedoc FROM tipodocs order by codigo";
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                String codigo = rs.getString("codigo");
                String nombre = rs.getString("nombre");
                String clasedocs = rs.getString("clasedoc");
                //Image img = new Image(getClass().getResourceAsStream("../../../img/botones/documentos.png"));
                //mageView image = new ImageView(img);
                modelo_tipos_documentos plancuentas = new modelo_tipos_documentos(codigo, nombre, clasedocs);

                obs.add(plancuentas);
            }
            
            st.close();
            conexion.close();
            con.cerrar();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No pudieron mostrar los tipos de documentos: " + e, "Mensaje", JOptionPane.ERROR_MESSAGE);
        }
        return obs;
    }
    
    public void get_un_documento(String codigo){
                
        try {
            
            java.sql.Statement st = conexion.createStatement();
            String sql = "SELECT * FROM tipodocs WHERE codigo='"+codigo+"'";
            ResultSet rs = st.executeQuery(sql);
            if(rs.next()){
                String cantidad = rs.getString("codigo_cantidad");                         
                setCodigo_cantidad(cantidad);
            }
            st.close();
            conexion.close();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No pudo encontrar centro"+e, "Mensaje", JOptionPane.ERROR_MESSAGE);
        }    
    }
}

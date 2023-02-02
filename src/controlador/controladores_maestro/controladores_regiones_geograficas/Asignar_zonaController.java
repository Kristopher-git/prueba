/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controlador.controladores_maestro.controladores_regiones_geograficas;

import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import modelo.FuncionesVarias;
import modelo.maestros.regiones_geograficas.ciudadesmodel;
import modelo.maestros.regiones_geograficas.zonasmodel;

/**
 * FXML Controller class
 *
 * @author User
 */
public class Asignar_zonaController implements Initializable {

    @FXML
    private TableView<zonasmodel> tablaZonas;
    @FXML
    private TableColumn<zonasmodel, String> colCodigo;
    @FXML
    private TableColumn<zonasmodel, String> colNombre;
    
    public String codeCiudad;
    
    /**
     * Initializes the controller class.
     */
    
    private ObservableList<zonasmodel> items;
    public Label label;
    @FXML
    private Label label1;
    public Label NombreCiudad;
    
    
    FuncionesVarias funciones = new FuncionesVarias();
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        

        label.setVisible(false);
        NombreCiudad.setVisible(false);
        crearTabla();
        
    }    

    
    private void crearTabla(){
        this.colCodigo.setCellValueFactory(new PropertyValueFactory("codigo"));
        this.colNombre.setCellValueFactory(new PropertyValueFactory("nombre"));

        zonasmodel zonas = new zonasmodel();       
        items = zonas.getZonas();
        this.tablaZonas.setItems(items);
    }
    
    @FXML
    private void ClickBajarEnTabla(ActionEvent event) {
        
        int index = tablaZonas.getSelectionModel().getSelectedIndex();
        
        tablaZonas.getItems().add(index+1, tablaZonas.getItems().remove(index));
        
        tablaZonas.getSelectionModel().isSelected(index+1);
    }

    @FXML
    private void ClickSubirEnTabla(ActionEvent event) {
        
        int index = tablaZonas.getSelectionModel().getSelectedIndex();
        
        tablaZonas.getItems().add(index-1, tablaZonas.getItems().remove(index));
        
        tablaZonas.getSelectionModel().isSelected(index-1);
      
    }

    @FXML
    private void MouseClickTableZona(MouseEvent event) {
        
    }

    @FXML
    private void clickAceptarRelacionZonayCiudad(ActionEvent event) {
        InsertarZonaACiudad();
    }
    
    @FXML
    private void ClickSelectAceptarRelacionZonaCiudad(ActionEvent event) {
        InsertarZonaACiudad();
    }
    
    private void InsertarZonaACiudad(){
        try {
            String codigoZona = tablaZonas.getSelectionModel().getSelectedItem().getCodigo();
            String nombreZona = tablaZonas.getSelectionModel().getSelectedItem().getNombre();
            String nombreCiudad = NombreCiudad.getText();
            ciudadesmodel ciudades = new ciudadesmodel();

            System.out.println(codeCiudad);
            Alert alert = new Alert (Alert.AlertType.CONFIRMATION);
            alert.setHeaderText(null);
            alert.setTitle("Confirmación");
            alert.setContentText("Esta seguro de asignar la Zona: "+nombreZona+ " nombre a todos los terceros de la ciudad: "+nombreCiudad);
            Optional<ButtonType> action = alert.showAndWait();

            if(action.get() == ButtonType.OK){
                ciudades.setCodigo(codeCiudad);
                ciudades.setCodigoZona(codigoZona);
                ciudades.modificarRelacionZonayCiudad();
            
                funciones.alerta(null, "Correct", "Zona asignada con exito");
            
            }
        } catch (Exception e) {
            funciones.alerta(null, "Error", "Seleccione una zona en la tabla");
        }
    }
    
    
    
}

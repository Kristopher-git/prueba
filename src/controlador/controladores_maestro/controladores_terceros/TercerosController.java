/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controlador.controladores_maestro.controladores_terceros;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import modelo.AbrirVentanas;
import modelo.FuncionesVarias;
import modelo.maestros.terceros.tercerosModel;

/**
 * FXML Controller class
 *
 * @author User
 */
public class TercerosController implements Initializable {

    FuncionesVarias Funciones = new FuncionesVarias();
    AbrirVentanas abrir = new AbrirVentanas();

    @FXML
    private ComboBox<String> comboTipoNit;
    @FXML
    private TextField NumeroNit;
    @FXML
    private TextField PrimerNombre;
    @FXML
    private TextField PrimerApellido;
    @FXML
    private TextField SegundoNombre;
    @FXML
    private TextField SegundoApellido;
    @FXML
    private Button btnExcel;
    @FXML
    private Button btnEliminar;
    @FXML
    private Button btnDeshacer;
    @FXML
    private Button btnModifica;
    @FXML
    private Button btnGrabar;
    @FXML
    private Button btnNuevo;
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ComboTipoNit();
        // TODO
    }    

    private void NuevoModificar(){
        
        btnNuevo.setVisible(false);
        btnModifica.setVisible(false);
        btnEliminar.setVisible(false);
        btnExcel.setVisible(false);
     
    }
    
    private void Deshacer(){
        
        btnNuevo.setVisible(true);
        btnModifica.setVisible(true);
        btnEliminar.setVisible(true);
        btnExcel.setVisible(true);
        
    }
    
    private void limpiar(){
        
        NumeroNit.setText("");
        PrimerNombre.setText("");
        SegundoNombre.setText("");
        PrimerApellido.setText("");
        SegundoApellido.setText("");
        
    }
    
    private void ComboTipoNit(){
        
        ObservableList<String> TiposDeNit = FXCollections.observableArrayList();
        TiposDeNit.addAll("Nit", "Cédula Ciudadania", "Cedula de extranjeria", "Terjeta de identidad", "Tutor o representante", "Nuip");
        
        comboTipoNit.setItems(TiposDeNit);
        
    }
    
    private void agregarNuevoRegistro(){
        String tipoNit = comboTipoNit.getSelectionModel().getSelectedItem();
        String primerNombre = PrimerNombre.getText();
        String segundoNombre = SegundoNombre.getText();
        String primerApellido = PrimerApellido.getText();
        String segundoApellido = SegundoApellido.getText();
        
        
        int camposVacios = CamposVacios(NumeroNit.getText(), primerNombre, primerApellido, segundoApellido);
        tercerosModel ter = new tercerosModel();
        
        if(camposVacios==0){
            
            int verificarNIT = comboTipoNit.getSelectionModel().getSelectedIndex();
            int Nit = Integer.parseInt(NumeroNit.getText());
            if(verificarNIT !=-1){
                if(ter.existeTercero(Nit)==0){
                    tercerosModel terceros = new tercerosModel(Nit, tipoNit, primerNombre, segundoNombre, primerApellido, segundoApellido);
                    terceros.insertarTerceros();
                    Funciones.alerta(null, "Error", "Tercero Guardado Con Exito " +Nit);
                    limpiar();
                }else{
                    Funciones.alerta(null, "Error", "Ya Existe un tercero con este nit: " +Nit);
                } 
            }else{
                 Funciones.alerta(null, "Error", "Hay campos vacios que son requeridos... \n Por favor verificar...");
            }
        }else{
            Funciones.alerta(null, "Error", "Hay campos vacios que son requeridos... \n Por favor verificar...");
        }
     
    }
    
    private int CamposVacios(String nit, String primernom, String primerapell, String segundoapell){
        
        if (nit.equals("") || primernom.equals("") || primerapell.equals("") || segundoapell.equals("")){
            return 1;    
        }else{
            return 0;
        }
 
    }
    
    
    @FXML
    private void ClickAbrirCiudad(ActionEvent event) {
        
        abrir.AbrirCiudades(null,"si");
    }

    @FXML
    private void ClickAbrirZona(ActionEvent event) {
        
        abrir.AbrirZona();
        
    }

    @FXML
    private void ClickAbrirPais(ActionEvent event) {
    }

    @FXML
    private void ClickAbrirVendedor(ActionEvent event) {
    }

    @FXML
    private void ClickAbrirGrupo(ActionEvent event) {

    }

    @FXML
    private void ClickExcel(ActionEvent event) {
    }

    @FXML
    private void ClickEliminar(ActionEvent event) {
    }

    @FXML
    private void ClickDeshacer(ActionEvent event) {
        
        Deshacer();
    
    }

    @FXML
    private void ClickModificar(ActionEvent event) {
    }

    @FXML
    private void ClickGrabar(ActionEvent event) {
       
        agregarNuevoRegistro();
         
    }

    @FXML
    private void ClickNuevo(ActionEvent event) {
        
        NuevoModificar();
    
    }
    
}

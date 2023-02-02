/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controlador.documentos.fact_puntVenta_PDV;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;

/**
 * FXML Controller class
 *
 * @author User
 */
public class Sic_punto_ventaController implements Initializable {

    @FXML
    public Button btnAutoriza1;
    @FXML
    public Button btnAutoriza;
    @FXML
    public Button btnReimprime;
    @FXML
    public Label lbl_primero;
    @FXML
    public Label lbl_segundo;
    @FXML
    public Label lbl_tercero;
    @FXML
    public TextField txt_primero;
    @FXML
    public TextField txt_segundo;
    @FXML
    public TextField txt_tercero;
    @FXML
    public ComboBox<?> cmb_primero;
    @FXML
    public ComboBox<?> cmb_segundo;
    @FXML
    public ComboBox<?> cmb_tercero;
    @FXML
    public Label lbl_modos;
    @FXML
    public Label lbl_pagof6;
    @FXML
    public Label lbl_billete;
    @FXML
    public TextField txt_billete;
    @FXML
    public CheckBox check_imprimir_en_carta;
    @FXML
    public Pane paneInfoSuperior;
    @FXML
    public Label labelConsecutivoTipoDoc;
    @FXML
    public Label labelTipoDoc;
    @FXML
    public Button btnImprime;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}

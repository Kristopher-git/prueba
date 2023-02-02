/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controlador.documentos.otros_area_ventas;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollBar;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author User
 */
public class Cotizacion_a_clienteController implements Initializable {

    @FXML
    private TableView<?> table;
    @FXML
    private TableView<?> table1;
    @FXML
    public Button btnSalir;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO

    }    

    @FXML
    private void click_salir(ActionEvent event) {
        Stage myStage = (Stage) btnSalir.getScene().getWindow();
        myStage.close();
    }
    
}

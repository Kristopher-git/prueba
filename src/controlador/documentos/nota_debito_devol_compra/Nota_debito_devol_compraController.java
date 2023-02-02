/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controlador.documentos.nota_debito_devol_compra;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Tab;

/**
 * FXML Controller class
 *
 * @author User
 */
public class Nota_debito_devol_compraController implements Initializable {

    @FXML
    private Tab tab_distribuir_costo;
    @FXML
    private Tab tab_formas_pago;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        tab_distribuir_costo.setDisable(true);
        tab_formas_pago.setDisable(true);
    }    
    
}

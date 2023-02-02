/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controlador.informes.contables_financieros;

import controlador.PrincipalController;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author User
 */
public class Auxiliar_especialController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    private void AbrirAxiliarCuentas(){
        //auxiliar_de_cuentas
        try {
            FXMLLoader auxiliar_de_cuentas = new FXMLLoader(getClass().getResource("/vista/informes/contables_financieros/auxiliar_de_cuentas.fxml"));

            Parent root = auxiliar_de_cuentas.load();

            Auxiliar_de_cuentasController controlador = auxiliar_de_cuentas.getController();

            String titulo = "Auxuliar de cuentas";

            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.initModality(Modality.WINDOW_MODAL);
            stage.setTitle(titulo);
            scene.setOnKeyPressed(event -> {
                if (event.getCode().toString().equals("ESCAPE")) {
                    stage.close();
                }
            });

            stage.setScene(scene);
            stage.show();

        } catch (IOException ex) {
            Logger.getLogger(PrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    @FXML
    private void click_aceptar(ActionEvent event) {
        AbrirAxiliarCuentas();
    }
    
}

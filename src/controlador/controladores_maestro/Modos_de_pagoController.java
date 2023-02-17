/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controlador.controladores_maestro;

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
public class Modos_de_pagoController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    private void AbrirBuscarPlanCuentas() {
        try {
            FXMLLoader buscarcuenta = new FXMLLoader(getClass().getResource("/vista/vistas_maestros/buscar_cuenta.fxml"));

            Parent root = buscarcuenta.load();

            Buscar_cuentaController controlador = buscarcuenta.getController();

            String titulo = "Buscar plan de cuenta";

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
    private void btn_buscar_cuentas(ActionEvent event) {
        AbrirBuscarPlanCuentas();
    }
    
}

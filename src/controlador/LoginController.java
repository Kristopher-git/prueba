/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controlador;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author SENA
 */
public class LoginController implements Initializable {

    @FXML
    private ComboBox<String> cmbSelectUser;
    private Button CloseLogin;
    @FXML
    private Button BtnCloseLogin;
    @FXML
    private Button iniciar;
    
    
    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    
    
    private void presionar(ActionEvent event) {
        JOptionPane.showMessageDialog(null, "Hola Mundo");
    }

    @FXML
    private void BtnCloseLogin(ActionEvent event) {
        Stage stage = (Stage) BtnCloseLogin.getScene().getWindow();
        stage.close();
    }

    @FXML
    private void iniciar(ActionEvent event) {
        JOptionPane.showMessageDialog(null, "Bienvenido");
    }

    
   
}

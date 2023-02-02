/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controlador.controladores_maestro;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;

/**
 * FXML Controller class
 *
 * @author User
 */
public class CuentasController implements Initializable {

    @FXML
    private Button idProduccion;
    @FXML
    private Button idInventario;
    @FXML
    private Button idAjustDep;
    @FXML
    private Button idCierre;
    @FXML
    private Button idCooperativo;
    @FXML
    private Button idFacturacion;
    @FXML
    private Button idRecibos;
    @FXML
    private Button idCompras;
    @FXML
    private Button idCompEgre;
    @FXML
    private Label labelTitle;
    @FXML
    private Pane paneInventarios;
    @FXML
    private Pane paneProduccion;
    @FXML
    private Pane paneAjust;
    @FXML
    private Pane paneCierre;
    @FXML
    private Pane paneCooperativo;
    @FXML
    private Pane paneFacturacion;
    @FXML
    private Pane paneRecibos;
    @FXML
    private Pane paneCompras;
    @FXML
    private Pane paneComprasEgreso;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    private void headleClicks(ActionEvent event){
        if(event.getSource() == idProduccion){
            labelTitle.setText("Producción");
            paneProduccion.toFront();
        }
        else
        if(event.getSource() == idInventario){
            labelTitle.setText("Inventarios");
            paneInventarios.toFront();
        }
        else
        if(event.getSource() == idAjustDep){
            labelTitle.setText("Ajustes por inflación y depreciaciones");
            paneAjust.toFront();
        }
        else
        if(event.getSource() == idCierre){
            labelTitle.setText("Cierre Anual");
            paneCierre.toFront();
        }
        else
        if(event.getSource() == idCooperativo){
            labelTitle.setText("Aporte cooperativa");
            paneCooperativo.toFront();
        }
        else
        if(event.getSource() == idFacturacion){
            labelTitle.setText("Facturación");
            paneFacturacion.toFront();
        }
        else
        if(event.getSource() == idRecibos){
            labelTitle.setText("Recibos de caja");
            paneRecibos.toFront();
        }
        else
        if(event.getSource() == idCompras){
            labelTitle.setText("Compras");
            paneCompras.toFront();
        }
        else
        if(event.getSource() == idCompEgre){
            labelTitle.setText("Comprobantes de egreso");
            paneComprasEgreso.toFront();
        }
    }

    @FXML
    private void click_produc(ActionEvent event) {
        headleClicks(event);
    }

    @FXML
    private void click_inventario(ActionEvent event) {
        headleClicks(event);
    }

    @FXML
    private void click_AjsDep(ActionEvent event) {
        headleClicks(event);
    }

    @FXML
    private void click_cierre(ActionEvent event) {
        headleClicks(event);
    }

    @FXML
    private void click_Cooperativo(ActionEvent event) {
        headleClicks(event);
    }

    @FXML
    private void click_facturacion(ActionEvent event) {
        headleClicks(event);
    }

    @FXML
    private void click_recibos(ActionEvent event) {
        headleClicks(event);
    }

    @FXML
    private void click_compras(ActionEvent event) {
        headleClicks(event);
    }

    @FXML
    private void click_CompEgre(ActionEvent event) {
        headleClicks(event);
    }
    
}

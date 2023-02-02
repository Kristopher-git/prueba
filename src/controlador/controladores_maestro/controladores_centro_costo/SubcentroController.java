/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controlador.controladores_maestro.controladores_centro_costo;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import modelo.FuncionesVarias;
import modelo.maestros.centro_costos.subCentroModel;

/**
 * FXML Controller class
 *
 * @author User
 */
public class SubcentroController implements Initializable {

    @FXML
    public TextField txtCodigoCentro;
    @FXML
    private TextField txtNombreSub;
    @FXML
    private TextField txtPresupuestoSub;
    @FXML
    private TextField txtCodigoSubCentro;
    @FXML
    private CheckBox Checkinactivo;
    
    FuncionesVarias funciones = new FuncionesVarias();

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void keyTypedCodigo(KeyEvent event) {
        funciones.TipoTextoNumerico(txtCodigoSubCentro);
    }

    @FXML
    private void txtFieldKeyTyped(KeyEvent event) {
        funciones.TipoTextoMayuscula(txtNombreSub);
    }

    @FXML
    private void keyTypedPresupuesto(KeyEvent event) {
        funciones.TipoTextoNumerico(txtPresupuestoSub);
    }

    private void limpiar(){
        txtCodigoSubCentro.setText("");
        txtNombreSub.setText("");
        txtPresupuestoSub.setText("");
        Checkinactivo.setSelected(false);
    }
    @FXML
    private void btnGrabar(ActionEvent event) {
        
        if(!txtCodigoSubCentro.getText().isEmpty() && !txtNombreSub.getText().isEmpty() && !txtPresupuestoSub.getText().isEmpty()){
            boolean iniciativo = Checkinactivo.isSelected();
            int presupuesto = Integer.parseInt(txtPresupuestoSub.getText());
            subCentroModel modelo = new subCentroModel(txtCodigoSubCentro.getText(), txtNombreSub.getText(), presupuesto, txtCodigoCentro.getText(), iniciativo);
            modelo.insertarSubCentro();
            
            
            limpiar();
            
            
        }else{
            funciones.alerta(null, "Error", "No puede grabar un registro con datos vacios...");
        }
    }
    
}

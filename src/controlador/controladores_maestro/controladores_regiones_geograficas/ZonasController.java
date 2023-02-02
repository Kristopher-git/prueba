/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controlador.controladores_maestro.controladores_regiones_geograficas;

import controlador.controladores_maestro.controladores_centro_costo.Centro_costosController;
import java.io.IOException;
import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.stage.Modality;
import javafx.stage.Stage;
import modelo.AbrirVentanas;
import modelo.FuncionesVarias;
import modelo.maestros.centro_costos.centroCostoModel;
import modelo.maestros.centro_costos.subCentroModel;
import modelo.maestros.regiones_geograficas.zonasmodel;

/**
 * FXML Controller class
 *
 * @author User
 */
public class ZonasController implements Initializable {

    @FXML
    private Button btnNuevo;
    @FXML
    private Button btnModifica;
    @FXML
    private Button btnElimina;
    @FXML
    private Button btnExcel;
    @FXML
    private Button btnGrabar;
    @FXML
    private Button btnDeshace;
    @FXML
    public TextField txtCodigo;
    @FXML
    public TextField txtNombre;
    @FXML
    public TableView<zonasmodel> tableZonas;
    @FXML
    private TableColumn<zonasmodel, String> colNombre;
    @FXML
    private TableColumn<zonasmodel, String> colCodigo;

    /**
     * Initializes the controller class.
     */
    private ObservableList<zonasmodel> items;

    FuncionesVarias funciones = new FuncionesVarias();
    AbrirVentanas abrir = new AbrirVentanas();

    public String textboton;
    @FXML
    private ComboBox<?> comboVendedor;
    @FXML
    public TextField txtCosto;
    @FXML
    public TextField txtSubCentro;
    @FXML
    private TextField txtVendedor;
    @FXML
    private Button btnAbrirCostos;
    public String codeCostos;
    public String codeSCostos;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        btnDeshace.setVisible(false);
        btnGrabar.setVisible(false);
        btnAbrirCostos.setVisible(false);
        crearTabla();
    }

    private void crearTabla() {
        this.colCodigo.setCellValueFactory(new PropertyValueFactory("codigo"));
        this.colNombre.setCellValueFactory(new PropertyValueFactory("nombre"));

        zonasmodel zonas = new zonasmodel();
        items = zonas.getZonas();
        this.tableZonas.setItems(items);
    }

    public void ActualizarTabla() {
        zonasmodel zone = new zonasmodel();
        ObservableList<zonasmodel> itemss = zone.getZonas();
        this.tableZonas.setItems(itemss);
    }

    private void limpiar() {
        txtCodigo.setText("");
        txtNombre.setText("");
        txtCosto.setText("");
        txtSubCentro.setText("");
    }

    public void btnMostrar() {

        btnElimina.setVisible(false);
        btnExcel.setVisible(false);
        btnModifica.setVisible(false);
        btnNuevo.setVisible(false);
        btnDeshace.setVisible(true);
        btnGrabar.setVisible(true);
        txtCodigo.setEditable(true);
        txtNombre.setEditable(true);
        btnAbrirCostos.setVisible(true);

    }

    private void btnOcultar() {

        btnElimina.setVisible(true);
        btnExcel.setVisible(true);
        btnModifica.setVisible(true);
        btnNuevo.setVisible(true);
        btnDeshace.setVisible(false);
        btnGrabar.setVisible(false);
        txtCodigo.setEditable(false);
        txtNombre.setEditable(false);

    }

    @FXML
    private void click_deshace(ActionEvent event) {

        btnOcultar();
        limpiar();
        ActualizarTabla();
        btnAbrirCostos.setVisible(false);

    }

    @FXML
    private void click_nuevo(ActionEvent event) {

        btnMostrar();
        limpiar();
        textboton = "nuevo";
        ObservableList<zonasmodel> vacio = null;
        tableZonas.setItems(vacio);

    }

    @FXML
    private void click_modifica(ActionEvent event) {

        if (txtCodigo.getText().isEmpty() || txtNombre.getText().isEmpty()) {
            funciones.alerta(null, "Error", "Seleccione dato a modificar");
        } else {
            btnMostrar();
            textboton = "modifica";
        }

    }

    @FXML
    private void click_grabar(ActionEvent event) {

        if (!txtCodigo.getText().isEmpty() && !txtNombre.getText().isEmpty()) {
            String codeSCosto = codeSCostos;
            zonasmodel zona = new zonasmodel(txtCodigo.getText(), txtNombre.getText(), codeCostos, codeSCosto, 124123);
            if (textboton.equals("nuevo")) {
                if (zona.existeZona(txtNombre.getText(), txtCodigo.getText()) == 0) {
                    zona.inertarZona();
                    ActualizarTabla();
                    funciones.alerta(null, "Verify", "Registado exitosamente");
                } else {
                    funciones.alerta(null, "Error", "Estas intentando grabar un dato duplicado...!\n Revise que el dato que identifica el registro no lo este repitiendo \n Por ultimo intente optimizar archivos...!");
                }
            } else {
                zona.modificarZona();
                ActualizarTabla();
                funciones.alerta(null, "Verify", "Registro actualizado con éxtio");
            }
            
        } else {
            funciones.alerta(null, "Error", "No puedes ingresar un registro datos vacios... \n Verificar Código y Nombre...");
        }
    }

    // CODE TYPE AND SIZE TO TEXT "CODIGO" ON FXML
    @FXML
    private void keyTypedCodigo(KeyEvent event) {

        funciones.TipoTextoHexaNumericoDeTres(txtCodigo);

    }

    // CODE TYPE TO UPPERCASE TO TEXT "NOMBRE" ON FXML
    @FXML
    private void keyTypedNombre(KeyEvent event) {

        funciones.TipoTextoMayuscula(txtNombre);

    }

    @FXML
    private void clicked_table(MouseEvent event) {

        int index = -1;
        index = tableZonas.getSelectionModel().getSelectedIndex();
        if (index <= -1) {
            return;
        }
        txtCodigo.setText(colCodigo.getCellData(index));
        txtNombre.setText(colNombre.getCellData(index));

        zonasmodel zona = new zonasmodel();

        String idCentro = tableZonas.getSelectionModel().getSelectedItem().getIdCosto();
        String idSubCentro = tableZonas.getSelectionModel().getSelectedItem().getIdSubCentro();
        int idVendedor = zona.getIdVendedor();

        subCentroModel modelsubcentro = new subCentroModel();
        centroCostoModel modelcentro = new centroCostoModel();
        modelcentro.getOneCentro(idCentro);
        modelsubcentro.getSubCentro(idSubCentro);

        txtCosto.setText(modelcentro.getNombre());
        txtSubCentro.setText(modelsubcentro.getNombre());

    }

    @FXML
    private void click_borrar(ActionEvent event) {
        if (!txtCodigo.getText().isEmpty() && !txtNombre.getText().isEmpty()) {

            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setHeaderText(null);
            alert.setTitle("Confirmación");
            alert.setContentText("¿Estas seguro de eliminar este registro?");
            Optional<ButtonType> action = alert.showAndWait();
            if (action.get() == ButtonType.OK) {
                zonasmodel zona = new zonasmodel();

                zona.eliminarZona(txtCodigo.getText());

                ActualizarTabla();
                limpiar();
            } else {

            }

        } else {
            funciones.alerta(null, "Error", "No puedes ingresar un registro datos vacios... \n Verificar Código y Nombre...");
        }

    }

    @FXML
    private void click_costos(ActionEvent event) {
        String codigoZona = txtCodigo.getText();
        String nombreZona = txtNombre.getText();

        try {
            FXMLLoader centros = new FXMLLoader(getClass().getResource("/vista/vistas_maestros/centro_costos/centro_costos.fxml"));

            Parent root = centros.load();

            Centro_costosController controlador = centros.getController();

            if (textboton.equals("nuevo")) {
                controlador.estado = "CallZona";
            } else {
                controlador.estado = "CallZonaEdit";
            }
            controlador.btnPasar.setVisible(true);
            controlador.codeZona = codigoZona;
            controlador.nombreZona = nombreZona;
            String titulo = "Centros de Costos";

            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.initModality(Modality.WINDOW_MODAL);
            stage.setTitle(titulo);
            stage.setScene(scene);
            stage.show();

            Stage myStage = (Stage) this.btnAbrirCostos.getScene().getWindow();
            myStage.close();

        } catch (IOException ex) {
            Logger.getLogger(ZonasController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}

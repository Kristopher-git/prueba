/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controlador.controladores_maestro.controladores_regiones_geograficas;

import controlador.PrincipalController;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.SQLException;
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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javax.swing.JOptionPane;
import modelo.AbrirVentanas;
import modelo.FuncionesVarias;
import modelo.maestros.regiones_geograficas.ciudadesmodel;
import modelo.model;

/**
 * FXML Controller class
 *
 * @author User
 */
public class CiudadesController implements Initializable {

    @FXML
    public TextField txtCodigo;
    @FXML
    public TextField txtNombre;
    @FXML
    private Button btnGrabar;
    @FXML
    private Button btnDeshace;
    @FXML
    public Button btnNuevo;
    @FXML
    private Button btnModifica;
    @FXML
    private Button btnElimina;
    @FXML
    private Button btnExcel;
    @FXML
    private Button btnSalir;
    @FXML
    private Button btnZona;
    @FXML
    private Button btnAbrirCiudad;

    public String txtboton;
    @FXML
    public TableView<ciudadesmodel> tableciudades;
    @FXML
    private TableColumn<ciudadesmodel, String> columnNombre;
    @FXML
    private TableColumn<ciudadesmodel, String> columnCodigo;
    @FXML
    public TextField txtdep;
    @FXML
    private TableColumn<ciudadesmodel, String> columnDepart;

    private ObservableList<ciudadesmodel> items;

    AbrirVentanas abrir = new AbrirVentanas();
    FuncionesVarias funciones = new FuncionesVarias();
    model con = new model();
    Connection conexion = con.conectarme();
    public String ocults;
    public String codeDepartamento;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        txtCodigo.setEditable(false);
        txtNombre.setEditable(false);
        txtdep.setEditable(false);
        columnDepart.setVisible(false);
        btnAbrirCiudad.setVisible(false);

        crearTabla();
        // TODO
    }

    private void crearTabla() {
        this.columnCodigo.setCellValueFactory(new PropertyValueFactory("codigo"));
        this.columnNombre.setCellValueFactory(new PropertyValueFactory("nombre"));
        this.columnDepart.setCellValueFactory(new PropertyValueFactory("departamento"));

        ciudadesmodel ciudadd = new ciudadesmodel();
        items = ciudadd.getCiudades();
        this.tableciudades.setItems(items);
    }

    public void ocultBotones() {
        btnDeshace.setVisible(true);
        btnGrabar.setVisible(true);
        btnModifica.setVisible(false);
        btnNuevo.setVisible(false);
        btnElimina.setVisible(false);
        btnExcel.setVisible(false);
        txtNombre.setEditable(true);
        btnAbrirCiudad.setVisible(true);
    }

    private void mostrarBtn() {
        btnDeshace.setVisible(false);
        btnGrabar.setVisible(false);
        btnModifica.setVisible(true);
        btnNuevo.setVisible(true);
        btnElimina.setVisible(true);
        btnExcel.setVisible(true);
        txtCodigo.setEditable(false);
        txtNombre.setEditable(false);
        btnAbrirCiudad.setVisible(false);
    }

    private void limpiar() {
        txtCodigo.setText("");
        txtNombre.setText("");
        txtdep.setText("");
    }

    private void actualizarTabla() {

        ciudadesmodel ci = new ciudadesmodel();
        ObservableList<ciudadesmodel> itemss = ci.getCiudades();
        this.tableciudades.setItems(itemss);
        con.cerrar();

    }

    @FXML
    private void click_zona(ActionEvent event) {
        if (!txtCodigo.getText().isEmpty() && !txtNombre.getText().isEmpty()) {
            try {
                FXMLLoader AsignZona = new FXMLLoader(getClass().getResource("/vista/vistas_maestros/regiones_geograficas/asignar_Zona.fxml"));

                Parent root = AsignZona.load();

                Asignar_zonaController controlador = AsignZona.getController();

                String codigo = tableciudades.getSelectionModel().getSelectedItem().getCodigo();
                String nombreCiudad = tableciudades.getSelectionModel().getSelectedItem().getNombre();
                controlador.NombreCiudad.setText(nombreCiudad);

                controlador.codeCiudad = codigo;

                String titulo = "Asignar zona";
                funciones.generarPestallas(root, titulo, "si");

            } catch (IOException ex) {
                Logger.getLogger(PrincipalController.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            funciones.alerta(null, "Error", "No puedes asignar una zona sin antes escoger la ciudad...");
        }
    }

    // CODE TO CHANGE TYPE CODE TEXTFIELD
    @FXML
    private void keyTypedCodigo(KeyEvent event) {

        funciones.TipoTextoNumericoDeTresCaracteres(txtCodigo);

    }

    // CODE TO CHANGE TO UPPERCASE
    @FXML
    private void txtFieldKeyTyped(KeyEvent event) {

        funciones.TipoTextoMayuscula(txtNombre);
    }

    @FXML
    private void click_nuevo(ActionEvent event) {
        ocultBotones();
        txtCodigo.setEditable(true);
        txtboton = "nuevo";
        limpiar();

        this.tableciudades.setItems(null);

    }

    @FXML
    private void click_modifica(ActionEvent event) {
        ocultBotones();
        txtboton = "modificar";
        txtdep.setVisible(true);

    }

    @FXML
    private void click_deshace(ActionEvent event) {
        mostrarBtn();
        limpiar();
        actualizarTabla();

    }

    @FXML
    private void click_grabar(ActionEvent event) {

        if (txtboton.equals("nuevo")) {
            if (!txtNombre.getText().isEmpty() && !txtCodigo.getText().isEmpty()) {
                String a = String.valueOf(txtCodigo.getText());
                String b = String.valueOf(codeDepartamento);
                String code = b + a;

                ciudadesmodel ciudades = new ciudadesmodel(code, txtNombre.getText(), codeDepartamento);

                if (ciudades.existeCiudad(txtNombre.getText(), code) == 0) {
                    ciudades.insertarCiudad();
                } else {
                    funciones.alerta(null, "Error", "Estas intentando grabar un dato duplicado...!\n Revise que el dato que identifica el registro no lo este repitiendo \n Por ultimo intente optimizar archivos...!");
                }
            } else {
                funciones.alerta(null, "Error", "No puedes grabar un registro con datos vacios...");
            }
        } else if (txtboton.equals("modificar")) {
            if (!txtNombre.getText().isEmpty()) {
                ciudadesmodel ciudades = new ciudadesmodel(txtCodigo.getText(), txtNombre.getText(), codeDepartamento);
                if (ciudades.existeNombreCiudad(txtNombre.getText()) == 0) {
                    ciudades.modificarCiudad();
                } else {
                    funciones.alerta(null, "Error", "No puedes grabar un registro con datos duplicados");
                }
            } else {
                funciones.alerta(null, "Error", "No puedes grabar un registro con datos vacios...");
            }
        }

        actualizarTabla();
        mostrarBtn();
        limpiar();

    }

    @FXML
    private void clicked_table(MouseEvent event) {
        int index = -1;
        index = tableciudades.getSelectionModel().getSelectedIndex();
        if (index <= -1) {
            return;
        }
        txtCodigo.setText(columnCodigo.getCellData(index));
        txtNombre.setText(columnNombre.getCellData(index));
        txtdep.setText(columnDepart.getCellData(index));

        String codigo = tableciudades.getSelectionModel().getSelectedItem().getCodigo();
        String code = codigo.substring(2);

        txtCodigo.setText(code);

    }

    @FXML
    private void click_eliminar(ActionEvent event) {
        if (!txtCodigo.getText().isEmpty()) {
            if (!txtNombre.getText().isEmpty()) {
                String codigo = tableciudades.getSelectionModel().getSelectedItem().getCodigo();
                Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
                alert.setHeaderText(null);
                alert.setTitle("Confirmación");
                alert.setContentText("¿Estas seguro de eliminar este registro?");
                Optional<ButtonType> action = alert.showAndWait();
                if (action.get() == ButtonType.OK) {
                    ciudadesmodel ciudad = new ciudadesmodel(codigo, txtNombre.getText());
                    ciudad.eliminarCiudad();

                    actualizarTabla();
                    limpiar();
                } else {

                }

            } else {
                funciones.alerta(null, "Error", "Por favor escoja el registro de la tabla a eliminar");
            }
        } else {
            funciones.alerta(null, "Error", "Por favor escoja el registro de la tabla a eliminar");
        }
    }

    @FXML
    private void click_depar(ActionEvent event) {

        String data;
        String codigoCiudad = txtCodigo.getText();
        String nombreCiudad = txtNombre.getText();

        try {
            FXMLLoader departamentos = new FXMLLoader(getClass().getResource("/vista/vistas_maestros/regiones_geograficas/departamentos.fxml"));

            Parent root = departamentos.load();

            DepartamentosController controlador = departamentos.getController();

            if (txtboton.equals("nuevo")) {
                controlador.estado = "CallDep";
            } else {
                controlador.estado = "CallDepEdit";
            }

            controlador.nombreCiudad = nombreCiudad;
            controlador.codigoCiudad = codigoCiudad;
            String titulo = "Departamentos";

            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.initModality(Modality.WINDOW_MODAL);
            stage.setTitle(titulo);
            stage.setScene(scene);
            stage.show();

            Stage myStage = (Stage) this.btnAbrirCiudad.getScene().getWindow();
            myStage.close();

        } catch (IOException ex) {
            Logger.getLogger(DepartamentosController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}

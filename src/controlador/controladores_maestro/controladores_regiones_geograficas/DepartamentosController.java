/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controlador.controladores_maestro.controladores_regiones_geograficas;

import controlador.PrincipalController;
import java.io.File;
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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.stage.DirectoryChooser;
import javafx.stage.Modality;
import javafx.stage.Stage;
import modelo.AbrirVentanas;
import modelo.FuncionesVarias;
import modelo.maestros.regiones_geograficas.departamentosmodel;

/**
 * FXML Controller class
 *
 * @author User
 */
public class DepartamentosController implements Initializable {

    @FXML
    public TextField txtcodigo;
    @FXML
    public TextField txtnombre;
    @FXML
    private Button btngrabar;
    @FXML
    private Button btn_deshacer;
    @FXML
    private Button btnnuevo;
    @FXML
    private Button btnmodifica;
    @FXML
    private Button btnelimina;
    @FXML
    private Button btnexcel;
    @FXML
    private Button btnsalir;
    @FXML
    public TableView<departamentosmodel> tblDepartamentos;
    @FXML
    private TableColumn<departamentosmodel, String> colCodigo;
    @FXML
    private TableColumn<departamentosmodel, String> colNombre;
    @FXML
    private TableColumn<departamentosmodel, String> colPais;
    @FXML
    public TextField txtPais;
    @FXML
    private Button btnAbrirPaises;
    private ObservableList<departamentosmodel> items;

    public String textboton;
    public String estado;
    public String codePais;

    public String nombreCiudad;
    public String codigoCiudad;
    FuncionesVarias funciones = new FuncionesVarias();
    AbrirVentanas abrir = new AbrirVentanas();

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {

        txtcodigo.setEditable(false);
        txtnombre.setEditable(false);
        txtPais.setEditable(false);
        btn_deshacer.setVisible(false);
        btngrabar.setVisible(false);
        btnAbrirPaises.setVisible(false);
        colPais.setVisible(false);
        crearTabla();

    }

    private void crearTabla() {
        this.colCodigo.setCellValueFactory(new PropertyValueFactory("codigo"));
        this.colNombre.setCellValueFactory(new PropertyValueFactory("nombre"));
        this.colPais.setCellValueFactory(new PropertyValueFactory("ubicacionpais"));

        departamentosmodel departamentos = new departamentosmodel();
        items = departamentos.getDepartamentos();
        this.tblDepartamentos.setItems(items);

    }

    public void limpiar() {
        txtcodigo.setText("");
        txtnombre.setText("");
        txtPais.setText("");
    }

    private void mostrarBtn() {
        txtcodigo.setEditable(false);
        txtnombre.setEditable(false);
        btn_deshacer.setVisible(false);
        btngrabar.setVisible(false);
        btnelimina.setVisible(true);
        btnexcel.setVisible(true);
        btnmodifica.setVisible(true);
        btnnuevo.setVisible(true);
        btnAbrirPaises.setVisible(false);
    }

    public void ocultarBtn() {

        txtcodigo.setEditable(true);
        txtnombre.setEditable(true);
        btn_deshacer.setVisible(true);
        btngrabar.setVisible(true);
        btnelimina.setVisible(false);
        btnexcel.setVisible(false);
        btnmodifica.setVisible(false);
        btnnuevo.setVisible(false);
        btnAbrirPaises.setVisible(true);

    }

    private void actualizarTabla() {

        departamentosmodel dep = new departamentosmodel();
        ObservableList<departamentosmodel> itemss = dep.getDepartamentos();
        this.tblDepartamentos.setItems(itemss);
    }

    @FXML
    private void click_nuevo(ActionEvent event) {
        textboton = "nuevo";
        ocultarBtn();

        limpiar();
        this.tblDepartamentos.setItems(null);

    }

    @FXML
    private void click_grabar(ActionEvent event) {

        if (!txtcodigo.getText().isEmpty() && !txtPais.getText().isEmpty()) {
            if (!txtnombre.getText().isEmpty()) {
                String codigo = txtcodigo.getText();
                departamentosmodel depart = new departamentosmodel(codigo, txtnombre.getText(), codePais);
                String nombre = txtnombre.getText();
                if (textboton.equals("nuevo")) {
                    if (depart.existeDepartamento(nombre, codigo) == 0) {
                        depart.insertarDepartamento();
                    } else {
                        funciones.alerta(null, "Error", "Estas intentando grabar un dato duplicado...!\n Revise que el dato que identifica el registro no lo este repitiendo \n Por ultimo intente optimizar archivos...!");
                    }
                } else if (textboton.equals("modificar")) {
                    depart.modificarDepartamento();
                }

            } else {
                funciones.alerta(null, "Error", "Por favor ingresar Nombre del departamento");
            }
        } else {
            funciones.alerta(null, "Error", "Por favor ingresar Código o el Pais del departamento");
        }
        actualizarTabla();
        mostrarBtn();
        limpiar();
    }

    @FXML
    private void click_deshacer(ActionEvent event) {
        mostrarBtn();
        limpiar();
        actualizarTabla();

    }

    @FXML
    private void txtFieldKeyTyped(KeyEvent event) {

        funciones.TipoTextoMayuscula(txtnombre);

    }

    @FXML
    private void keyListener(KeyEvent event) {

    }

    @FXML
    private void keyTypedCodigo(KeyEvent event) {

        funciones.TipoTextoNumericoDeDosCaracteres(txtcodigo);

    }

    @FXML
    private void keyPressedCodigo(KeyEvent event) {

    }

    @FXML
    private void clicked_table(MouseEvent event) {
        int index = -1;
        index = tblDepartamentos.getSelectionModel().getSelectedIndex();
        if (index <= -1) {
            return;
        }
        try {
            if (event.getClickCount() == 2) {
                if (estado.equals("CallDep") || estado.equals("CallDepEdit")) {
                    String ciudad = colNombre.getCellData(index);
                    String codigoDep = colCodigo.getCellData(index);
                    try {
                        FXMLLoader ciudades = new FXMLLoader(getClass().getResource("/vista/vistas_maestros/regiones_geograficas/ciudades.fxml"));

                        Parent root = ciudades.load();

                        CiudadesController controlador = ciudades.getController();

                        controlador.txtdep.setText(ciudad);
                        controlador.codeDepartamento = codigoDep;
                        if (estado.equals("CallDep")) {
                            controlador.txtboton = "nuevo";
                            controlador.txtCodigo.setEditable(true);
                            controlador.tableciudades.setItems(null);
                        } else {
                            controlador.txtboton = "modificar";
                            controlador.txtCodigo.setEditable(false);
                        }
                        controlador.txtCodigo.setText(codigoCiudad);
                        controlador.txtNombre.setText(nombreCiudad);
                        controlador.ocultBotones();
                        String titulo = "Ciudades";

                        Scene scene = new Scene(root);
                        Stage stage = new Stage();
                        stage.initModality(Modality.WINDOW_MODAL);
                        stage.setTitle(titulo);
                        stage.setScene(scene);
                        stage.show();

                        Stage myStage = (Stage) this.tblDepartamentos.getScene().getWindow();
                        myStage.close();

                    } catch (IOException ex) {
                        Logger.getLogger(PrincipalController.class.getName()).log(Level.SEVERE, null, ex);
                    }

                }
                estado = "";
            } else if (estado.isEmpty()) {
                System.out.println("estoy vacio");
            }
        } catch (Exception e) {
            System.out.println("error" + e);
        }

        txtcodigo.setText(colCodigo.getCellData(index));
        txtnombre.setText(colNombre.getCellData(index));
        txtPais.setText(colPais.getCellData(index));
    }

    @FXML
    private void btn_modificar(ActionEvent event) {

        textboton = "modificar";
        ocultarBtn();

    }

    @FXML
    private void click_eliminar(ActionEvent event) {

        if (!txtcodigo.getText().isEmpty()) {
            if (!txtnombre.getText().isEmpty()) {
                String codigo = txtcodigo.getText();
                Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
                alert.setHeaderText(null);
                alert.setTitle("Confirmación");
                alert.setContentText("¿Estas seguro de eliminar este registro?");
                Optional<ButtonType> action = alert.showAndWait();
                if (action.get() == ButtonType.OK) {
                    departamentosmodel depart = new departamentosmodel(codigo, txtnombre.getText(), codePais);
                    depart.eliminarDepartamento();

                    limpiar();
                    actualizarTabla();

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
    private void click_excel(ActionEvent event) {
        ventana();

    }

    public void ventana() {
        Stage stage = new Stage();
        stage.setTitle("File Chooser");

        final DirectoryChooser select = new DirectoryChooser();

        File file = select.showDialog(stage);

        File file2 = new File(file + "\\departamentos.xls");

        departamentosmodel dep = new departamentosmodel();

        dep.getExcel(file2);
    }

    @FXML
    private void click_paises(ActionEvent event) {
        String data;
        String codigoDep = txtcodigo.getText();
        String nombreDep = txtnombre.getText();

        try {
            FXMLLoader paises = new FXMLLoader(getClass().getResource("/vista/vistas_maestros/regiones_geograficas/paises.fxml"));

            Parent root = paises.load();

            PaisesController controlador = paises.getController();

            if (textboton.equals("nuevo")) {
                controlador.estado = "CallPais";
            } else {
                controlador.estado = "CallPaisEdit";
            }

            controlador.codeDep = codigoDep;
            controlador.nombreDep = nombreDep;
            String titulo = "Paises";

            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.initModality(Modality.WINDOW_MODAL);
            stage.setTitle(titulo);
            stage.setScene(scene);
            stage.show();

            Stage myStage = (Stage) this.btnAbrirPaises.getScene().getWindow();
            myStage.close();

        } catch (IOException ex) {
            Logger.getLogger(DepartamentosController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}

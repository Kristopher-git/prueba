/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controlador.controladores_maestro.controladores_regiones_geograficas;

import controlador.PrincipalController;
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
import javafx.stage.Modality;
import javafx.stage.Stage;
import modelo.FuncionesVarias;
import modelo.maestros.regiones_geograficas.paisesmodel;

/**
 * FXML Controller class
 *
 * @author User
 */
public class PaisesController implements Initializable {

    @FXML
    private TextField txtcodigo;
    @FXML
    private TextField txtnombre;
    @FXML
    private TableView<paisesmodel> tablePaises;
    @FXML
    private TableColumn<paisesmodel, String> colCodigo;
    @FXML
    private TableColumn<paisesmodel, String> colNombre;
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

    public String estado;
    public String nombreDep;
    public String codeDep;
    private ObservableList<paisesmodel> items;
    private String textboton;
    FuncionesVarias funciones = new FuncionesVarias();

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        txtcodigo.setEditable(false);
        txtnombre.setEditable(false);
        btn_deshacer.setVisible(false);
        btngrabar.setVisible(false);

        crearTabla();

    }

    private void crearTabla() {
        this.colCodigo.setCellValueFactory(new PropertyValueFactory("codigoPais"));
        this.colNombre.setCellValueFactory(new PropertyValueFactory("nombrePais"));

        paisesmodel paises = new paisesmodel();
        items = paises.getPaises();
        this.tablePaises.setItems(items);
    }

    public void limpiar() {
        txtcodigo.setText("");
        txtnombre.setText("");
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
    }

    private void actualizarTabla() {
        paisesmodel dep = new paisesmodel();
        ObservableList<paisesmodel> itemss = dep.getPaises();
        this.tablePaises.setItems(itemss);
    }

    @FXML
    private void click_deshacer(ActionEvent event) {
        mostrarBtn();
        limpiar();
        actualizarTabla();
    }

    @FXML
    private void click_nuevo(ActionEvent event) {

        textboton = "nuevo";
        txtcodigo.setEditable(true);
        txtnombre.setEditable(true);
        btn_deshacer.setVisible(true);
        btngrabar.setVisible(true);
        btnelimina.setVisible(false);
        btnexcel.setVisible(false);
        btnmodifica.setVisible(false);
        btnnuevo.setVisible(false);

        limpiar();
        this.tablePaises.setItems(null);

    }

    @FXML
    private void keyPressedCodigo(KeyEvent event) {
    }

    @FXML
    private void keyTypedCodigo(KeyEvent event) {

        funciones.TipoTextoDosCaracteres(txtcodigo);

    }

    @FXML
    private void keyListener(KeyEvent event) {
    }

    @FXML
    private void txtFieldKeyTyped(KeyEvent event) {

    }

    @FXML
    private void clicked_table(MouseEvent event) {
        int index = -1;
        index = tablePaises.getSelectionModel().getSelectedIndex();
        if (index <= -1) {
            return;
        }
        if (event.getClickCount() == 2) {
            if (estado.equals("CallPais") || estado.equals("CallPaisEdit")) {
                String departamento = colNombre.getCellData(index);
                String codigodep = colCodigo.getCellData(index);
                try {
                    FXMLLoader departamentos = new FXMLLoader(getClass().getResource("/vista/vistas_maestros/regiones_geograficas/departamentos.fxml"));

                    Parent root = departamentos.load();

                    DepartamentosController controlador = departamentos.getController();

                    controlador.txtPais.setText(departamento);
                    controlador.codePais = codigodep;
                    if (estado.equals("CallPais")) {
                        controlador.textboton = "nuevo";
                        controlador.tblDepartamentos.setItems(null);
                    } else {
                        controlador.textboton = "modificar";

                    }
                    controlador.txtcodigo.setText(codeDep);
                    controlador.txtnombre.setText(nombreDep);
                    controlador.ocultarBtn();
                    String titulo = "Departamentos";

                    Scene scene = new Scene(root);
                    Stage stage = new Stage();
                    stage.initModality(Modality.WINDOW_MODAL);
                    stage.setTitle(titulo);
                    stage.setScene(scene);
                    stage.show();

                    Stage myStage = (Stage) this.tablePaises.getScene().getWindow();
                    myStage.close();

                } catch (IOException ex) {
                    Logger.getLogger(PrincipalController.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
            estado = "";
        }
        txtcodigo.setText(colCodigo.getCellData(index));
        txtnombre.setText(colNombre.getCellData(index));
    }

    @FXML
    private void click_grabar(ActionEvent event) {
        if (!txtcodigo.getText().isEmpty()) {
            if (!txtnombre.getText().isEmpty()) {
                String codigo = txtcodigo.getText();
                paisesmodel paises = new paisesmodel(codigo, txtnombre.getText());
                String nombre = txtnombre.getText();
                if (textboton.equals("nuevo")) {
                    if (paises.existePaises(nombre, codigo) == 0) {
                        paises.insertarPais();
                    } else {
                        funciones.alerta(null, "Error", "Estas intentando grabar un dato duplicado...!\n Revise que el dato que identifica el registro no lo este repitiendo \n Por ultimo intente optimizar archivos...!");
                    }
                } else if (textboton.equals("modificar")) {
                    paises.modificarPais();
                }

            } else {
                funciones.alerta(null, "Error", "Por favor ingresar Nombre del pais");
            }
        } else {
            funciones.alerta(null, "Error", "Por favor ingresar Código del pais");
        }
        actualizarTabla();
        mostrarBtn();
    }

    @FXML
    private void btn_modificar(ActionEvent event) {
        textboton = "modificar";
        txtcodigo.setEditable(false);
        txtnombre.setEditable(true);
        btn_deshacer.setVisible(true);
        btngrabar.setVisible(true);
        btnelimina.setVisible(false);
        btnexcel.setVisible(false);
        btnmodifica.setVisible(false);
        btnnuevo.setVisible(false);
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
                    paisesmodel paises = new paisesmodel(codigo, txtnombre.getText());
                    paises.eliminarPais();

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
    }

}

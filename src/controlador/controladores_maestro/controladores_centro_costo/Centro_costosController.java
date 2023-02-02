/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controlador.controladores_maestro.controladores_centro_costo;

import controlador.PrincipalController;
import controlador.controladores_maestro.Plan_de_cuentasController;
import controlador.controladores_maestro.controladores_regiones_geograficas.CiudadesController;
import controlador.controladores_maestro.controladores_regiones_geograficas.ZonasController;
import java.io.IOException;
import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;
import java.util.function.UnaryOperator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
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
import javafx.scene.control.TextFormatter;
import javafx.scene.control.cell.CheckBoxTableCell;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.util.StringConverter;
import javafx.util.converter.IntegerStringConverter;
import modelo.AbrirVentanas;
import modelo.FuncionesVarias;
import modelo.maestros.centro_costos.centroCostoModel;
import modelo.maestros.regiones_geograficas.zonasmodel;

/**
 * FXML Controller class
 *
 * @author User
 */
public class Centro_costosController implements Initializable {

    @FXML
    private TextField txtCodigo;
    @FXML
    private TextField txtNombre;
    @FXML
    private ComboBox<zonasmodel> comboRegion;
    @FXML
    private TableView<centroCostoModel> tableCentros;
    @FXML
    public TableView<centroCostoModel> tableSubcentros;
    @FXML
    private Button btnAgregarSub;
    @FXML
    private Button btnBorrarSub;
    @FXML
    private Button btnGrabar;
    @FXML
    private Button btnDeshacer;
    @FXML
    private Button btnNuevo;
    @FXML
    private Button btnModificar;
    @FXML
    private Button btnElimina;
    @FXML
    private Button btnExcel;
    @FXML
    private TableColumn<centroCostoModel, String> columnCodigo;
    @FXML
    private TableColumn<centroCostoModel, String> columnNombre;
    @FXML
    private TableColumn<centroCostoModel, String> columnZona;
    @FXML
    private TextField textRegion;
    @FXML
    private TableColumn<centroCostoModel, String> colCodSC;
    @FXML
    private TableColumn<centroCostoModel, String> colNombreSC;
    @FXML
    private TableColumn<centroCostoModel, Integer> colPresupuestoSC;
    @FXML
    private TableColumn<centroCostoModel, Boolean> colSubInactivo;
    @FXML
    public Button btnPasar;

    public String codeZona;
    public String nombreZona;
    private String btnText;
    public String estado;

    // Variables de asignacion de planes de cuentas
    public String codigoPlanes;
    public String NombrePlanes;
    public boolean ManejaTerceros;
    public boolean ManejaCentroCosto;
    public boolean ManejaCuentaInventarios;
    public boolean ManejaCxC;
    public boolean SeDeprecia;
    public boolean EsCuentaImpuesto;
    public boolean ManejaPresupuesto;
    public boolean EsUnaCuentaCorriente;
    public boolean NoGeneraIntereses;
    
    
    private ObservableList<centroCostoModel> items;

    AbrirVentanas abrir = new AbrirVentanas();
    FuncionesVarias funciones = new FuncionesVarias();
    @FXML
    public Button btnPasarPlanes;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        btnAgregarSub.setVisible(false);
        btnBorrarSub.setVisible(false);
        btnGrabar.setVisible(false);
        btnDeshacer.setVisible(false);
        comboRegion.setVisible(false);
        btnPasar.setVisible(false);
        btnPasarPlanes.setVisible(false);
        crearTabla();

        initZonasCombo();

    }

    public void initZonasCombo() {
        zonasmodel zonas = new zonasmodel();
        ObservableList<zonasmodel> obsZona = zonas.getZonas();

        this.comboRegion.setConverter(new StringConverter<zonasmodel>() {
            @Override
            public String toString(zonasmodel object) {
                return object.getNombre();
            }

            @Override
            public zonasmodel fromString(String string) {
                return null;
            }
        });
        this.comboRegion.setItems(FXCollections.observableArrayList(obsZona));
    }

    private void crearTabla() {
        this.columnCodigo.setCellValueFactory(new PropertyValueFactory("codigo"));
        this.columnNombre.setCellValueFactory(new PropertyValueFactory("nombre"));
        this.columnZona.setCellValueFactory(new PropertyValueFactory("region"));

        centroCostoModel dep = new centroCostoModel();
        items = dep.getCentroCostos();
        this.tableCentros.setItems(items);
    }

    private void btnOpen() {
        btnNuevo.setVisible(false);
        btnModificar.setVisible(false);
        btnElimina.setVisible(false);
        btnExcel.setVisible(false);
        btnAgregarSub.setVisible(false);
        btnBorrarSub.setVisible(false);
        btnGrabar.setVisible(true);
        btnDeshacer.setVisible(true);
        textRegion.setVisible(false);
        comboRegion.setVisible(true);
    }

    private void btnClose() {
        btnNuevo.setVisible(true);
        btnModificar.setVisible(true);
        btnElimina.setVisible(true);
        btnExcel.setVisible(true);
        btnAgregarSub.setVisible(false);
        btnBorrarSub.setVisible(false);
        btnGrabar.setVisible(false);
        btnDeshacer.setVisible(false);
        comboRegion.setVisible(false);
        textRegion.setVisible(true);
    }

    private void limpiar() {
        txtCodigo.setText("");
        txtNombre.setText("");
        textRegion.setText("");
    }

    private void actualizarTabla() {
        centroCostoModel dep = new centroCostoModel();
        ObservableList<centroCostoModel> tem = dep.getCentroCostos();
        this.tableCentros.setItems(tem);
    }

    @FXML
    private void click_reclasificacion(ActionEvent event) {

        abrir.AbrirReclasificacion();

    }

    @FXML
    private void keyTypedCodigo(KeyEvent event) {

        funciones.TipoTextoHexaNumericoDeTres(txtCodigo);

    }

    @FXML
    private void txtFieldKeyTyped(KeyEvent event) {
        funciones.TipoTextoMayuscula(txtNombre);
    }

    @FXML
    private void click_deshace(ActionEvent event) {
        btnClose();
        limpiar();
        actualizarTabla();
    }

    @FXML
    private void click_nuevo(ActionEvent event) {
        btnOpen();
        btnText = "nuevo";
        limpiar();

        centroCostoModel sub = new centroCostoModel("null");
        ObservableList<centroCostoModel> subcentro = sub.getSubCentrosCosto();
        this.tableSubcentros.setItems(subcentro);
        this.tableCentros.setItems(subcentro);
    }

    @FXML
    private void click_modifica(ActionEvent event) {
        if (!txtCodigo.getText().isEmpty() && !txtNombre.getText().isEmpty()) {
            btnOpen();
            btnAgregarSub.setVisible(true);
            btnBorrarSub.setVisible(true);
            btnText = "modificar";
            txtCodigo.setEditable(false);
            tableSubcentros.setEditable(true);
            colCodSC.setCellFactory(TextFieldTableCell.forTableColumn());
            colNombreSC.setCellFactory(TextFieldTableCell.forTableColumn());
            colPresupuestoSC.setCellFactory(TextFieldTableCell.forTableColumn(new IntegerStringConverter()));
            colNombreSC.setCellFactory(TextFieldTableCell.forTableColumn());
        } else {
            funciones.alerta(null, "Error", "Seleccione dato a modificar");
        }
    }

    @FXML
    private void click_grabar(ActionEvent event) {
        if (!txtCodigo.getText().isEmpty() && !txtNombre.getText().isEmpty()) {
            String item = "";

            int index = comboRegion.getSelectionModel().getSelectedIndex();
            if (index == -1) {
                item = "";
            } else {
                item = comboRegion.getSelectionModel().getSelectedItem().getCodigo();
            }

            centroCostoModel modelo = new centroCostoModel(txtCodigo.getText(), txtNombre.getText(), item);
            if (btnText.equals("nuevo")) {
                if (modelo.existeCentroCosto(txtNombre.getText(), txtCodigo.getText()) == 0) {
                    modelo.inertarCentroCosto();
                } else {
                    funciones.alerta(null, "Error", "Estas intentando grabar un dato duplicado...!\n Revise que el dato que identifica el registro no lo este repitiendo \n Por ultimo intente optimizar archivos...!");
                }
            } else {
                modelo.modificarCentroCosto();
                actualizarTabla();
            }
            actualizarTabla();
            limpiar();

        } else {
            funciones.alerta(null, "Error", "Campos vacios por favor ingresar Código o Nombre");
        }
    }

    public void setupTableVieColumn() {
        colSubInactivo.setCellFactory(column -> new CheckBoxTableCell<>());
        colSubInactivo.setCellValueFactory(cellData -> {
            centroCostoModel cellValue = cellData.getValue();
            cellValue.getSubCentrosCosto();
            return null;
        });
    }

    @FXML
    private void clicked_table(MouseEvent event) {
        int index = -1;
        index = tableCentros.getSelectionModel().getSelectedIndex();
        if (index <= -1) {
            return;
        }
        txtCodigo.setText(columnCodigo.getCellData(index));
        txtNombre.setText(columnNombre.getCellData(index));

        String region = tableCentros.getSelectionModel().getSelectedItem().getRegion();

        zonasmodel zonas = new zonasmodel();
        zonas.getOneZone(region);
        String NombreZona = zonas.getNombre();
        textRegion.setText(NombreZona);

        setupTableVieColumn();
        String str = txtCodigo.getText();
        centroCostoModel dep = new centroCostoModel(str);

        this.colCodSC.setCellValueFactory(new PropertyValueFactory("codigoSub"));
        this.colNombreSC.setCellValueFactory(new PropertyValueFactory("nombreSub"));
        this.colPresupuestoSC.setCellValueFactory(new PropertyValueFactory("presupuestoSub"));
        this.colSubInactivo.setCellValueFactory(new PropertyValueFactory("inactivoSub"));

        ObservableList<centroCostoModel> items1 = dep.getSubCentrosCosto();
        this.tableSubcentros.setItems(items1);
    }

    public static String palabraEliminar(String oracion, String palabra) {
        if (oracion.contains(palabra)) {
            return oracion.replaceAll(palabra, "");
        }
        return oracion;
    }

    @FXML
    private void click_agregar(ActionEvent event) {
        abrir.AbrirSubCentroCosto(txtCodigo);
    }

    @FXML
    private void clicked_table2(MouseEvent event) {

    }

    @FXML
    private void click_listado(ActionEvent event) {
    }

    @FXML
    private void click_borrarSub(ActionEvent event) {
        int index = -1;
        index = tableSubcentros.getSelectionModel().getSelectedIndex();
        if (index <= -1) {
            return;
        }

        String cod = colCodSC.getCellData(index);

        centroCostoModel md = new centroCostoModel();

        md.eliminarSubcentro(cod);

        centroCostoModel ms = new centroCostoModel(txtCodigo.getText());
        ObservableList<centroCostoModel> items1 = ms.getSubCentrosCosto();
        this.tableSubcentros.setItems(items1);

    }

    @FXML
    private void click_eliminar(ActionEvent event) {
        if (!txtCodigo.getText().isEmpty() && !txtNombre.getText().isEmpty()) {
            centroCostoModel md = new centroCostoModel();
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setHeaderText(null);
            alert.setTitle("Confirmación");
            alert.setContentText("¿Estas seguro de eliminar este registro?..\n Al eliminar el centro de costo, \n se desactivaran automaticamnte los subCentros relacionados a este");
            Optional<ButtonType> action = alert.showAndWait();
            if (action.get() == ButtonType.OK) {

                md.eliminarCentro(txtCodigo.getText());
                actualizarTabla();
                limpiar();
            }

        } else {
            funciones.alerta(null, "Error", "Campos vacios por favor ingresar Código o Nombre");
        }
    }

    @FXML
    private void click_pasar(ActionEvent event) {
        String NombreCentro = "";
        String NombreSubCentro = "";
        String codigoCentro = "";
        String codigoSCentro = "";
        try {
            int index = -1;
            index = tableCentros.getSelectionModel().getSelectedIndex();
            if (index <= -1) {
                return;
            }
            NombreCentro = columnNombre.getCellData(index);
            codigoCentro = columnCodigo.getCellData(index);
            index = tableSubcentros.getSelectionModel().getSelectedIndex();
            if (index <= -1) {
                NombreSubCentro = "";
            } else {
                NombreSubCentro = colNombreSC.getCellData(index);
                codigoSCentro = colCodSC.getCellData(index);
            }

            try {
                FXMLLoader zonas = new FXMLLoader(getClass().getResource("/vista/vistas_maestros/regiones_geograficas/zonas.fxml"));

                Parent root = zonas.load();

                ZonasController controlador = zonas.getController();

                controlador.txtCosto.setText(NombreCentro);
                controlador.txtSubCentro.setText(NombreSubCentro);
                controlador.codeCostos = codigoCentro;
                controlador.codeSCostos = codigoSCentro;

                if (estado.equals("CallZona")) {
                    controlador.textboton = "nuevo";
                    controlador.tableZonas.setItems(null);
                } else {
                    controlador.textboton = "modificar";
                }
                controlador.txtCodigo.setText(codeZona);
                controlador.txtNombre.setText(nombreZona);
                controlador.btnMostrar();
                String titulo = "Zonas";

                Scene scene = new Scene(root);
                Stage stage = new Stage();
                stage.initModality(Modality.WINDOW_MODAL);
                stage.setTitle(titulo);
                stage.setScene(scene);
                stage.show();

                Stage myStage = (Stage) this.btnPasar.getScene().getWindow();
                myStage.close();

            } catch (IOException ex) {
                Logger.getLogger(Centro_costosController.class.getName()).log(Level.SEVERE, null, ex);
            }

        } catch (Exception e) {
            System.out.println("error" + e);
        }

    }

    @FXML
    private void click_pasar_planes(ActionEvent event) {
        String NombreCentro = "";
        String NombreSubCentro = "";
        String codigoCentro = "";
        String codigoSCentro = "";
        try {
            int index = -1;
            index = tableCentros.getSelectionModel().getSelectedIndex();
            if (index <= -1) {
                return;
            }
            NombreCentro = columnNombre.getCellData(index);
            codigoCentro = columnCodigo.getCellData(index);
            index = tableSubcentros.getSelectionModel().getSelectedIndex();
            if (index <= -1) {
                NombreSubCentro = "";
            } else {
                NombreSubCentro = colNombreSC.getCellData(index);
                codigoSCentro = colCodSC.getCellData(index);
            }

            try {
                FXMLLoader PlanCuentas = new FXMLLoader(getClass().getResource("/vista/vistas_maestros/plan_de_cuentas.fxml"));

                Parent root = PlanCuentas.load();

                Plan_de_cuentasController controlador = PlanCuentas.getController();

                controlador.txtCCosto.setText(NombreCentro);
                controlador.txtSCosto.setText(NombreSubCentro);
                controlador.codeCostos = codigoCentro;
                controlador.codeSCostos = codigoSCentro;

                String codigo = codigoPlanes;
                String[] items = new String[6];
                TextField[] fields = {controlador.num1, controlador.num2, controlador.num3, controlador.num4, controlador.num5, controlador.num6};

                int i = 1, fin = 2;

                while (i <= 6 && !codigo.isEmpty()) {
                    int longitudCod = codigo.length();

                    if (i > 3) {
                        fin = 3;
                    }

                    if (fin > longitudCod) {
                        fin = longitudCod;
                    }

                    String item = codigo.substring(0, fin);
                    items[i - 1] = item;
                    codigo = codigo.substring(fin);

                    i++;
                }

                // MOSTRAR TEXTO EN LOS CAMPO FIELD
                for (int j = 0; j < 6; j++) {
                    if (items[j] == null) {
                        fields[j].setText("");
                    } else {
                        fields[j].setText(items[j]);
                    }
                }

                controlador.NombrePlanCuentas.setText(NombrePlanes);
                controlador.check_terceros.setSelected(ManejaTerceros);
                controlador.check_centro_costo.setSelected(ManejaCentroCosto);
                controlador.check_cuenta_inventario.setSelected(ManejaCuentaInventarios);
                controlador.manejacxc.setSelected(ManejaCxC);
                controlador.se_deprecia.setSelected(SeDeprecia);
                controlador.cuenta_impuesto.setSelected(EsCuentaImpuesto);
                controlador.maneja_presupuesto.setSelected(ManejaPresupuesto);
                controlador.cuenta_corriente.setSelected(EsUnaCuentaCorriente);
                controlador.check_no_genera_interes.setScaleShape(NoGeneraIntereses);
                
                controlador.validar_caracterisiticas();
                String titulo = "Plan de cuentas";

                Scene scene = new Scene(root);
                Stage stage = new Stage();
                stage.initModality(Modality.WINDOW_MODAL);
                stage.setTitle(titulo);
                stage.setScene(scene);
                stage.show();

                Stage myStage = (Stage) this.btnPasar.getScene().getWindow();
                myStage.close();

            } catch (IOException ex) {
                Logger.getLogger(Centro_costosController.class.getName()).log(Level.SEVERE, null, ex);
            }

        } catch (Exception e) {
            System.out.println("error" + e);
        }

    }

    public void closeWindows() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/vista/vistas_maestros/plan_de_cuentas.fxml"));
            Parent root = loader.load();
            Plan_de_cuentasController controlador = loader.getController();

            Scene scene = new Scene(root);
            Stage stage = new Stage();
            
            
            String codigo = codigoPlanes;
            String[] items = new String[6];
            TextField[] fields = {controlador.num1, controlador.num2, controlador.num3, controlador.num4, controlador.num5, controlador.num6};

            int i = 1, fin = 2;

            while (i <= 6 && !codigo.isEmpty()) {
                int longitudCod = codigo.length();

                if (i > 3) {
                    fin = 3;
                }

                if (fin > longitudCod) {
                    fin = longitudCod;
                }

                String item = codigo.substring(0, fin);
                items[i - 1] = item;
                codigo = codigo.substring(fin);

                i++;
            }

            // MOSTRAR TEXTO EN LOS CAMPO FIELD
            for (int j = 0; j < 6; j++) {
                if (items[j] == null) {
                    fields[j].setText("");
                } else {
                    fields[j].setText(items[j]);
                }
            }

            controlador.NombrePlanCuentas.setText(NombrePlanes);

            stage.setScene(scene);
            stage.show();
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}

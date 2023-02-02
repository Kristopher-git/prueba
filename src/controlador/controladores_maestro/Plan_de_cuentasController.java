/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controlador.controladores_maestro;

import controlador.controladores_maestro.controladores_centro_costo.Centro_costosController;
import controlador.controladores_maestro.controladores_regiones_geograficas.DepartamentosController;
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
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.TextFormatter;
import javafx.scene.control.TextFormatter.Change;
import javafx.scene.control.cell.PropertyValueFactory;
import static javafx.scene.input.KeyCode.BACK_SPACE;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.util.StringConverter;
import modelo.AbrirVentanas;
import modelo.FuncionesVarias;
import modelo.maestros.PlanCuentas.planCuentasModel;
import modelo.maestros.centro_costos.centroCostoModel;

/**
 * FXML Controller class
 *
 * @author User
 */
public class Plan_de_cuentasController implements Initializable {

    @FXML
    private Button depreciacion;
    @FXML
    private Button impuest;
    @FXML
    private Button presupuesto;

    AbrirVentanas abrir = new AbrirVentanas();
    FuncionesVarias funciones = new FuncionesVarias();
    public String codeCostos;
    public String codeSCostos;

    private ObservableList<planCuentasModel> items;
    private ObservableList<planCuentasModel> filtroPlanes;

    @FXML
    public TextField NombrePlanCuentas;
    @FXML
    private ComboBox<String> comboNaturaleza;
    @FXML
    private TableView<planCuentasModel> tablaPlanCuentas;
    @FXML
    private TableColumn<planCuentasModel, String> ColCuenta;
    @FXML
    private TableColumn<planCuentasModel, String> ColNombre;
    @FXML
    private Button btnAbrirCosto;
    @FXML
    public TextField txtCCosto;
    @FXML
    public TextField txtSCosto;
    @FXML
    public TextField num1;
    @FXML
    public TextField num2;
    @FXML
    public TextField num3;
    @FXML
    public TextField num4;
    @FXML
    public TextField num5;
    @FXML
    public TextField num6;
    @FXML
    private Button btnEliminar;
    @FXML
    public CheckBox check_terceros;
    @FXML
    public CheckBox check_centro_costo;
    @FXML
    public CheckBox check_cuenta_inventario;
    @FXML
    public CheckBox se_deprecia;
    @FXML
    public CheckBox cuenta_impuesto;
    @FXML
    public CheckBox manejacxc;
    @FXML
    public CheckBox maneja_presupuesto;
    @FXML
    public CheckBox cuenta_corriente;
    @FXML
    public CheckBox check_no_genera_interes;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {

        validarTextos();
        ObservableList<String> lista = FXCollections.observableArrayList();
        lista.addAll("Crédito", "Débito");
        comboNaturaleza.setItems(lista);

        this.ColCuenta.setCellValueFactory(new PropertyValueFactory("CodigoPlanCuentas"));
        this.ColNombre.setCellValueFactory(new PropertyValueFactory("NombrePlanCuentas"));

        planCuentasModel model = new planCuentasModel();
        items = model.getPlanCuentas();
        this.tablaPlanCuentas.setItems(items);
        habilitar_caracteristicas(true);
        habilitar_caracteres_primeros(true);
        filtroPlanes = FXCollections.observableArrayList();

    }

    private void limpiar() {

        num1.setText("");
        num2.setText("");
        num3.setText("");
        num4.setText("");
        num5.setText("");
        num6.setText("");
        NombrePlanCuentas.setText("");
        txtCCosto.setText("");
        txtSCosto.setText("");
        check_terceros.setSelected(false);
        check_centro_costo.setSelected(false);
        check_cuenta_inventario.setSelected(false);
        manejacxc.setSelected(false);
        se_deprecia.setSelected(false);
        cuenta_impuesto.setSelected(false);
        maneja_presupuesto.setSelected(false);
        cuenta_corriente.setSelected(false);
        check_no_genera_interes.setSelected(false);

    }

    public void ActualizarTabla() {

        planCuentasModel model = new planCuentasModel();
        ObservableList<planCuentasModel> itemss = model.getPlanCuentas();
        this.tablaPlanCuentas.setItems(itemss);

    }

    @FXML
    private void select(ActionEvent event) {
    }

    @FXML
    private void click_depre(ActionEvent event) {

        abrir.AbrirDepreciaPlanCuentas();

    }

    @FXML
    private void click_imp(ActionEvent event) {

        abrir.AbrirImprimirPlanCuentas();

    }

    @FXML
    private void click_presup(ActionEvent event) {

        abrir.AbrirPresupuestoPlanCuentas();

    }

    @FXML
    private void click_planes(ActionEvent event) {

        abrir.AbrirPlanesPlanCuentas();

    }

    @FXML
    private void click_cuentas(ActionEvent event) {

        abrir.AbrirCuentasPlanCuentas();

    }

    @FXML
    private void click_reclasificacion(ActionEvent event) {

        abrir.AbrirReclasificacionPlanCuentas();

    }

    @FXML
    private void click_listado(ActionEvent event) {

        abrir.AbrirListadoPlanCuentas();

    }

    @FXML
    private void click_buscar(ActionEvent event) {

        abrir.AbrirBuscarPlanCuentas();

    }

    @FXML
    private void ClickGrabar(ActionEvent event) {

        String codigo = num1.getText() + "" + num2.getText() + "" + num3.getText() + "" + num4.getText() + "" + num5.getText() + "" + num6.getText();
        String NombrePlan = NombrePlanCuentas.getText();

        if (!NombrePlan.isEmpty() && !codigo.isEmpty()) {
            if (validar_campos_vacios_dentro_del_codigo()) {
                if (validar_limite_campos_codigo()) {
                    boolean maneja_tercero = check_terceros.isSelected();
                    boolean centro_costo = check_centro_costo.isSelected();
                    boolean cuenta_inventarios = check_cuenta_inventario.isSelected();
                    boolean cxc_cxp = manejacxc.isSelected();
                    boolean deprecia = se_deprecia.isSelected();
                    boolean impuesto = cuenta_impuesto.isSelected();
                    boolean presupuesto = maneja_presupuesto.isSelected();
                    boolean cuentaCorriente = cuenta_corriente.isSelected();
                    boolean no_genera_interes = check_no_genera_interes.isSelected();
                    String naturalize = comboNaturaleza.getSelectionModel().getSelectedItem();
                    System.out.println(naturalize);
                    planCuentasModel planNuevo = new planCuentasModel(codigo, NombrePlan, naturalize, codeCostos, codeSCostos, maneja_tercero, centro_costo, cuenta_inventarios, cxc_cxp, deprecia, impuesto, presupuesto, cuentaCorriente, no_genera_interes);
                    if (!planNuevo.existePlanCuenta()) {
                        String codigoSucesor = obtener_codigo_sucesor();
                        if (new planCuentasModel(codigoSucesor).existePlanCuenta()) {
                            if (planNuevo.insertarPlanCuentas()) {
                                funciones.alerta(null, "Correct", "Plan de cuenta registrado con exito");
                            }
                        } else {
                            funciones.alerta(null, "Error", "El numero de digitos de la cuenta es erroneo");
                        }
                    } else {
                        if (planNuevo.actualizarPlan()) {
                            funciones.alerta(null, "Correct", "Se ha realzido una modificación a un plan de cuentas existente");
                        }
                    }
                    ActualizarTabla();
                } else {
                    funciones.alerta(null, "Error", "El numero de digitos de la cuenta es erroneo");
                }
            } else {
                funciones.alerta(null, "Error", "No puede haber espacios vacios dentro de tu nuevo codigo");
            }
        } else {
            funciones.alerta(null, "Error", "Los campos estan vacios");
        }
    }

    private int CamposVacios(String codigoPlan, String nombrePlan) {

        if (codigoPlan.equals("") || nombrePlan.equals("")) {
            return 1;
        } else {
            return 0;
        }

    }

    @FXML
    private void click_abrirCosto(ActionEvent event) {
        String codigo = num1.getText() + "" + num2.getText() + "" + num3.getText() + "" + num4.getText() + "" + num5.getText() + "" + num6.getText();
        codigo = codigo.replace(" ", " ");
        String nombrePlanes = NombrePlanCuentas.getText();

        try {
            FXMLLoader cuentas = new FXMLLoader(getClass().getResource("/vista/vistas_maestros/centro_costos/centro_costos.fxml"));

            Parent root = cuentas.load();

            Centro_costosController controlador = cuentas.getController();

            controlador.estado = "CallPlanes";

            controlador.NombrePlanes = nombrePlanes;
            controlador.codigoPlanes = codigo;
            controlador.ManejaTerceros = check_terceros.isSelected();
            controlador.ManejaCentroCosto = check_centro_costo.isSelected();
            controlador.ManejaCuentaInventarios = check_cuenta_inventario.isSelected();
            controlador.ManejaCxC = manejacxc.isSelected();
            controlador.SeDeprecia = se_deprecia.isSelected();
            controlador.EsCuentaImpuesto = cuenta_impuesto.isSelected();
            controlador.ManejaPresupuesto = maneja_presupuesto.isSelected();
            controlador.EsUnaCuentaCorriente = cuenta_corriente.isSelected();
            controlador.NoGeneraIntereses = check_no_genera_interes.isSelected();
            controlador.btnPasarPlanes.setVisible(true);
            String titulo = "Centros de costos";

            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.initModality(Modality.WINDOW_MODAL);
            stage.setTitle(titulo);
            stage.setScene(scene);
            stage.show();

            stage.setOnCloseRequest(e -> controlador.closeWindows());

            Stage myStage = (Stage) this.btnAbrirCosto.getScene().getWindow();
            myStage.close();

        } catch (IOException ex) {
            Logger.getLogger(DepartamentosController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void validarTextos() {
        limitTextField(num1, 2, num2);
        limitTextField(num2, 2, num3);
        limitTextField(num3, 2, num4);
        limitTextField(num4, 3, num5);
        limitTextField(num5, 3, num6);
        limitTextField(num6, 3, NombrePlanCuentas);

        keyCodeTextField(NombrePlanCuentas, num6);
        keyCodeTextField(num6, num5);
        keyCodeTextField(num5, num4);
        keyCodeTextField(num4, num3);
        keyCodeTextField(num3, num2);
        keyCodeTextField(num2, num1);


    }

    public void limitTextField(TextField textField, int limit, TextField passtextField) {
        UnaryOperator<Change> textLimitFilter = change -> {
            if (change.isContentChange()) {
                int newLength = change.getControlNewText().length();
                if (newLength > limit) {
                    String trimmedText = change.getControlNewText().substring(0, limit);
                    change.setText(trimmedText);
                    int oldLength = change.getControlText().length();
                    change.setRange(0, oldLength);
                } else if (newLength == limit) {
                    passtextField.requestFocus();
                }
            }
            return change;
        };
        textField.setTextFormatter(new TextFormatter(textLimitFilter));

    }

    @FXML
    private void click_eliminar(ActionEvent event) {

        planCuentasModel p = tablaPlanCuentas.getSelectionModel().getSelectedItem();

        if (p != null) {
            String codigo = p.getCodigoPlanCuentas();
            planCuentasModel P = new planCuentasModel(codigo);

            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            Optional<ButtonType> action = alert.showAndWait();
            alert.setHeaderText(null);
            alert.setTitle("Confirmación");
            alert.setContentText("¿Estas seguro de confirmar la acción?");

            // Si hemos pulsado en aceptar
            if (action.get() == ButtonType.OK) {
                if (p.eliminarPlan() == 1) {
                    funciones.alerta(null, "Informacion", "Plan de cuenta eliminado con exito");
                    limpiar();
                }
            }

            ActualizarTabla();

        } else {
            funciones.alerta(null, "Error", "Debe Seleccionar un registro para eliminar");
        }

    }

    @FXML
    private void click_table(MouseEvent event) {
        planCuentasModel p = tablaPlanCuentas.getSelectionModel().getSelectedItem();
        String codigo = p.getCodigoPlanCuentas().toString();
        if (p != null) {

            String nombre = p.getNombrePlanCuentas();
            String[] items = new String[6];
            TextField[] fields = {num1, num2, num3, num4, num5, num6};

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

            NombrePlanCuentas.setText(nombre);
            validar_caracterisiticas();
            planCuentasModel planBuscar = new planCuentasModel(tablaPlanCuentas.getSelectionModel().getSelectedItem().getCodigoPlanCuentas());
            planCuentasModel resultado_filtro = planBuscar.filtro_plan_cuenta();
            if (resultado_filtro != null) {
                check_terceros.setSelected(resultado_filtro.isManeja_tercero());
                check_centro_costo.setSelected(resultado_filtro.isManeja_ccosto());
                check_cuenta_inventario.setSelected(resultado_filtro.isManeja_cuenta_inventario());
                manejacxc.setSelected(resultado_filtro.isManeja_cxc());
                se_deprecia.setSelected(resultado_filtro.isSe_deprecia());
                cuenta_impuesto.setSelected(resultado_filtro.isEs_cuenta_impuesto());
                maneja_presupuesto.setSelected(resultado_filtro.isManeja_presupuesto());
                cuenta_corriente.setSelected(resultado_filtro.isEs_cuenta_corriente());
                check_no_genera_interes.setSelected(resultado_filtro.isNo_genera_interes());
                txtCCosto.setText(resultado_filtro.getCodigoCCosto());
                txtSCosto.setText(resultado_filtro.getCodigoSCCosto());

            }

        }
    }

    @FXML
    private void filtrarTabla(KeyEvent event) {
    }

    private void filtar_tabla(String codigo) {

        planCuentasModel planBuscar = new planCuentasModel(codigo);
        planCuentasModel resultado_filtro = planBuscar.filtro_plan_cuenta();
        if (resultado_filtro != null) {
            NombrePlanCuentas.setText(resultado_filtro.getNombrePlanCuentas());
            check_terceros.setSelected(resultado_filtro.isManeja_tercero());
            check_centro_costo.setSelected(resultado_filtro.isManeja_ccosto());
            check_cuenta_inventario.setSelected(resultado_filtro.isManeja_cuenta_inventario());
            manejacxc.setSelected(resultado_filtro.isManeja_cxc());
            se_deprecia.setSelected(resultado_filtro.isSe_deprecia());
            cuenta_impuesto.setSelected(resultado_filtro.isEs_cuenta_impuesto());
            maneja_presupuesto.setSelected(resultado_filtro.isManeja_presupuesto());
            cuenta_corriente.setSelected(resultado_filtro.isEs_cuenta_corriente());
            check_no_genera_interes.setSelected(resultado_filtro.isNo_genera_interes());
            txtCCosto.setText(resultado_filtro.getCodigoCCosto());
            txtSCosto.setText(resultado_filtro.getCodigoSCCosto());

            tablaPlanCuentas.getSelectionModel().select(resultado_filtro);

        }

    }

    private void keyCodeTextField(TextField textFieldNow, TextField textFieldBefore) {
        textFieldNow.addEventFilter(KeyEvent.KEY_PRESSED, new EventHandler<KeyEvent>() {
            public void handle(KeyEvent keyEvent) {
                if (keyEvent.getCode() == BACK_SPACE) {
                    if (textFieldNow.getText().isEmpty()) {
                        textFieldBefore.requestFocus();
                        if(textFieldBefore.getId().equals("num1")){
                            limpiar();
                        }
                    }
                }

            }
        });
    }

    private boolean validar_campos_vacios_dentro_del_codigo() {
        TextField[] txtcodigo = {num1, num2, num3, num4, num5, num6};
        boolean validacion = true;

        int posUltimo = 0;

        //Se busca el ultimo valor rellenado
        for (int i = 0; i < txtcodigo.length; i++) {
            String valor = txtcodigo[i].getText();
            if (!valor.isEmpty()) {
                posUltimo = i;
            }
        }

        //Revisamos los valores de atras hacia el comienzo
        for (int i = posUltimo - 1; i >= 0; i--) {
            String valor = txtcodigo[i].getText();
            if (valor.isEmpty()) {
                validacion = false;
            }
        }

        return validacion;

    }

    private short numero_campos_del_codigo_rellenados(String[] campos) {
        short npartesCodigo = 0;

        for (String campo : campos) {
            if (!campo.isEmpty()) {
                npartesCodigo++;
            }
        }

        return npartesCodigo;
    }

    private boolean validar_limite_campos_codigo() {
        short validados = 0;

        String[] campos = {num1.getText(), num2.getText(), num3.getText(),
            num4.getText(), num5.getText(), num6.getText()};

        int numcIngresados = numero_campos_del_codigo_rellenados(campos);

        for (int i = 0; i < campos.length; i++) {
            String c = campos[i];
            if (i < 3) {
                if (!c.isEmpty() && i == 0) {
                    validados++;
                } else if (!c.isEmpty() && c.length() == 2) {
                    validados++;
                }
            } else {
                if (!c.isEmpty() && c.length() == 3) {
                    validados++;
                }
            }
        }
        return validados == numcIngresados;
    }

    private String obtener_codigo_sucesor() {
        TextField[] txtcodigo = {num1, num2, num3, num4, num5, num6};
        String codigoSucesor = "";
        int posUltimo = 0;

        //Se busca el ultimo valor rellenado
        for (int i = 0; i < txtcodigo.length; i++) {
            String valor = txtcodigo[i].getText();
            if (!valor.isEmpty()) {
                posUltimo = i + 1;
            }
        }

        for (int i = 0; i < posUltimo - 1; i++) {
            codigoSucesor = codigoSucesor + txtcodigo[i].getText();
        }

        if (posUltimo == 1) {
            codigoSucesor = null;
        }

        return "" + codigoSucesor;

    }

    public void validar_caracterisiticas() {
        TextField[] txtcodigo = {num1, num2, num3, num4, num5, num6};

        int posH = 2;
        int pos = 0;

        if (!txtcodigo[pos].getText().isEmpty()) {
            boolean valido = true;
            for (int i = pos - 1; i >= 0; i--) {
                if (txtcodigo[i].getText().isEmpty()) {
                    valido = false;
                    break;
                }
            }
            if (valido) {
                habilitar_caracteres_primeros(false);
            } else {
                habilitar_caracteres_primeros(true);
            }
        } else {
            habilitar_caracteres_primeros(true);
        }
        if (!txtcodigo[posH].getText().isEmpty()) {
            boolean valido = true;
            for (int i = posH - 1; i >= 0; i--) {
                if (txtcodigo[i].getText().isEmpty()) {
                    valido = false;
                    break;
                }
            }
            if (valido) {
                habilitar_caracteristicas(false);
            } else {
                habilitar_caracteristicas(true);
            }
        } else {
            habilitar_caracteristicas(true);
        }

    }

    private void habilitar_caracteres_primeros(boolean estado) {
        CheckBox[] chks1 = {check_terceros, check_centro_costo, check_no_genera_interes};
        Button[] btns1 = {btnAbrirCosto};

        for (CheckBox chk1 : chks1) {
            chk1.setDisable(estado);
        }
        for (Button btn1 : btns1) {
            btn1.setDisable(estado);
        }
    }

    private void habilitar_caracteristicas(boolean estado) {
        CheckBox[] chks = {manejacxc, check_cuenta_inventario, maneja_presupuesto, se_deprecia, cuenta_impuesto, maneja_presupuesto, cuenta_corriente};
        Button[] btns = {depreciacion, impuest, presupuesto};

        for (CheckBox chk : chks) {
            chk.setDisable(estado);
        }
        for (Button btn : btns) {
            btn.setDisable(estado);
        }
    }

    @FXML
    private void filtrocodigo(KeyEvent event) {
        String codigo = num1.getText() + "" + num2.getText() + "" + num3.getText() + "" + num4.getText() + "" + num5.getText() + "" + num6.getText();
        filtar_tabla(codigo);
        validar_caracterisiticas();
    }

    @FXML
    private void tipoTexto(KeyEvent event) {

    }

    @FXML
    private void txtMayuscula(KeyEvent event) {
        funciones.TipoTextoMayuscula(NombrePlanCuentas);
    }
}

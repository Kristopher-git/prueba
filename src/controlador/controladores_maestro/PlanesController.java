/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controlador.controladores_maestro;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import modelo.FuncionesVarias;
import modelo.maestros.PlanCuentas.modelPlanMaestro;
import modelo.maestros.PlanCuentas.planCuentasModel;

/**
 * FXML Controller class
 *
 * @author User
 */
public class PlanesController implements Initializable {

    @FXML
    private TableView<planCuentasModel> table;
    @FXML
    private TableColumn<planCuentasModel, String> colCuenta;
    @FXML
    private TableColumn<planCuentasModel, String> colNombre;

    /**
     * Initializes the controller class.
     */
    FuncionesVarias funciones = new FuncionesVarias();
    private ObservableList<planCuentasModel> items;
    private ObservableList<planCuentasModel> filtroPlanes;
    private ObservableList<planCuentasModel> planesAll;
    @FXML
    private TextField txtNombre;
    @FXML
    private ComboBox<modelPlanMaestro> comboMaestros;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO

        this.colCuenta.setCellValueFactory(new PropertyValueFactory("CodigoPlanCuentas"));
        this.colNombre.setCellValueFactory(new PropertyValueFactory("NombrePlanCuentas"));

        filtroPlanes = FXCollections.observableArrayList();

        cargarinformaciontabla();
        initComboBox();
    }

    private void initComboBox() {
        modelPlanMaestro pUnico = new modelPlanMaestro();
        ObservableList<modelPlanMaestro> obs = pUnico.getPlanesUnicos();
        this.comboMaestros.setItems(obs);
        this.comboMaestros.getSelectionModel().select(pUnico.getPlanUnicosDefault());
    }

    private void cargarinformaciontabla() {
        planCuentasModel p = new planCuentasModel();
        items = p.getPlanCuentas();
        planesAll = p.showPlanesAll();
        this.table.setItems(items);
    }

    @FXML
    private void click_table(MouseEvent event) {
    }

    @FXML
    private void filtrarTabla(KeyEvent event) {
        modelPlanMaestro punico = comboMaestros.getSelectionModel().getSelectedItem();
        String nombre = txtNombre.getText();

        try {
            if (nombre.isEmpty()) {
                filto_combo();
            } else {
                filtroPlanes.clear();
                for (planCuentasModel item : planesAll) {
                    if (punico.getCodigo() == "0") {
                        if (item.getNombrePlanCuentas().toUpperCase().contains(nombre.toUpperCase())) {
                            filtroPlanes.add(item);
                        }
                    } else {
                        if (item.getCodigoMaestro().contains(punico.getCodigo()) && item.getNombrePlanCuentas().toUpperCase().contains(nombre.toUpperCase())) {
                            filtroPlanes.add(item);
                        }
                    }
                }

                table.setItems(filtroPlanes);

            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @FXML
    private void clickMaestros(ActionEvent event) {
        filto_combo();
        txtNombre.setText(null);
    }

    private void filto_combo() {
        modelPlanMaestro punico = comboMaestros.getSelectionModel().getSelectedItem();
        this.filtroPlanes.clear();

        if (punico != null) {
            String codigo = punico.getCodigo();
            System.out.println(codigo);
            if (codigo == "0") {
                cargarinformaciontabla();
                this.table.setItems(planesAll);
            } else {
                for (planCuentasModel plane : planesAll) {
                    if (plane.getCodigoMaestro().contains(codigo)) {
                        filtroPlanes.add(plane);
                    }
                }
                table.setItems(filtroPlanes);
            }

        }
    }

    @FXML
    private void txtMayuscula(KeyEvent event) {
        funciones.TipoTextoMayuscula(txtNombre);
    }

}

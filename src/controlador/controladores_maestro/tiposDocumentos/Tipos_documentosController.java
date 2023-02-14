/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controlador.controladores_maestro.tiposDocumentos;

import controlador.PrincipalController;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Modality;
import javafx.stage.Stage;
import modelo.maestros.tipos_documentos.modelo_tipos_documentos;

/**
 * FXML Controller class
 *
 * @author User
 */
public class Tipos_documentosController implements Initializable {

    /**
     * Initializes the controller class.
     */
    public String estado;
    @FXML
    private TableView<modelo_tipos_documentos> table;
    @FXML
    private TableColumn<modelo_tipos_documentos, String> colCodigo;
    @FXML
    private TableColumn<modelo_tipos_documentos, String> colNombre;

    private ObservableList<modelo_tipos_documentos> items;
    @FXML
    private TableColumn<modelo_tipos_documentos, ImageView> colImage;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        //this.colImage.setCellValueFactory(new PropertyValueFactory("imagen"));
        this.colCodigo.setCellValueFactory(new PropertyValueFactory("codigo"));
        this.colNombre.setCellValueFactory(new PropertyValueFactory("nombre"));

        cargarinformaciontabla();
    }

    private void cargarinformaciontabla() {
        modelo_tipos_documentos p = new modelo_tipos_documentos();
        items = p.get_tipo_documentos();
        this.table.setItems(items);
    }

    @FXML
    private void clicked_table(MouseEvent event) {
        try {
            if (event.getClickCount() == 2) {
                String codigo = table.getSelectionModel().getSelectedItem().getCodigo();
                String nombre = table.getSelectionModel().getSelectedItem().getNombre();
                String clasedoc = table.getSelectionModel().getSelectedItem().getClasedoc();
                modelo_tipos_documentos model = new modelo_tipos_documentos();
                model.get_un_documento(codigo);
                
                try {
                    FXMLLoader documentos = new FXMLLoader(getClass().getResource("/vista/vistas_maestros/tipos_documentos/tiposinterfaz.fxml"));

                    Parent root = documentos.load();

                    TiposinterfazController controlador = documentos.getController();

                    modelo_tipos_documentos m = new modelo_tipos_documentos();
                    m.get_un_clase(clasedoc);
                    // controlador.txtdep.setText(ciudad);
                    // controlador.codeDepartamento = codigoDep;
                    controlador.txtCodigo.setText(codigo);
                    controlador.txtNombre.setText(nombre);
                    controlador.txtNumero.setText(model.getCodigo_cantidad());
                    controlador.txtClase.setText(m.getNombre_Clase());
                    controlador.claseDocs = clasedoc;
                    
                    
                    // PRINCIPAL
                    boolean list_precios_new = false;
                    boolean utilizar_siempre_bodega_new = false;
                    boolean no_Cambiar_lasbodegas_new = false;
                    boolean puede_facturar_servicios_new = false;
                    boolean desactivar_desc_general_fv_new = false;
                    boolean preguntar_consecutivo_new = false;
                    boolean precios_PDV_new = false;
                    boolean mostrar_interfaz_efectivo_new = false;
                    boolean modo_pago_fijo_new = false;
                    boolean no_cambiar_lgeneral_new = false;
                    String turno_new = "";
                    
                    int list_precios = model.getList_prec_prede();
                    int utilizar_siempre_bodega = model.getUt_siem_bodeg_pred();
                    int no_cambiar_lasbodegas = model.getNo_camb_bodegas();
                    int puede_facturar_servicios = model.getPuede_facturar_serv();
                    int desactivar_desc_general_fv = model.getDesactivar_desc_general_fv();
                    int preguntar_consecutivo = model.getPreg_consecutivo();
                    int precios_PDV = model.getPrecios_pdv();
                    int mostrar_interfaz_efectivo = model.getMostrar_interfaz_efectivo();
                    int modo_pago_fijo = model.getModo_pago_fijo();
                    int no_cambiar_lgeneral = model.getNo_cambiar_lgeneral();
                    String turno = model.getTurno();
                    
                    
                    if(!turno.equals("0")){
                        turno_new = turno;
                    }
                    if(list_precios == 1){
                        list_precios_new = true;
                    }
                    if (utilizar_siempre_bodega == 1){
                        utilizar_siempre_bodega_new = true;
                    }
                    if(no_cambiar_lasbodegas == 1){
                        no_Cambiar_lasbodegas_new = true;
                    }
                    if(puede_facturar_servicios == 1){
                        puede_facturar_servicios_new = true;
                    }
                    if(desactivar_desc_general_fv == 1){
                        desactivar_desc_general_fv_new = true;
                    }
                    if(preguntar_consecutivo == 1){
                        preguntar_consecutivo_new = true;
                    }
                    if(precios_PDV == 1){
                        precios_PDV_new = true;
                    }
                    if(mostrar_interfaz_efectivo == 1){
                        mostrar_interfaz_efectivo_new = true;
                    }
                    if(modo_pago_fijo == 1){
                        modo_pago_fijo_new = true;
                    }
                    if(no_cambiar_lgeneral == 1){
                        no_cambiar_lgeneral_new = true;
                    }
                    controlador.principal_check_lista_precios.setSelected(list_precios_new);
                    controlador.principal_check_utilizar_siempre_bodega.setSelected(utilizar_siempre_bodega_new);
                    controlador.principal_check_no_cambiar_bodegas.setSelected(no_Cambiar_lasbodegas_new);
                    controlador.principal_check_puede_facturar_servicios.setSelected(puede_facturar_servicios_new);
                    controlador.principal_check_desactivar_desc_general.setSelected(desactivar_desc_general_fv_new);
                    controlador.principal_check_pregunta_consecutivo.setSelected(preguntar_consecutivo_new);
                    controlador.principal_check_preciosPDV.setSelected(precios_PDV_new);
                    controlador.principal_check_mostrar_interfaz_efectivo.setSelected(mostrar_interfaz_efectivo_new);
                    controlador.principal_check_modo_pago_fijo.setSelected(modo_pago_fijo_new);
                    controlador.principal_no_cambiar_lgeneral.setSelected(no_cambiar_lgeneral_new);
                    controlador.principal_txt_turno.setText(turno_new);
                    
                    if(clasedoc.equals("CC") || clasedoc.equals("CO")){
                        controlador.claseCC_CO();
                    }else if(clasedoc.equals("CT")){
                        controlador.claseCT();
                    }else if(clasedoc.equals("DC")){
                        controlador.claseDC();
                    }else if(clasedoc.equals("DP")){
                        controlador.claseDP();
                    }else if(clasedoc.equals("DV")){
                        controlador.claseDV();
                    }else if(clasedoc.equals("EG")){
                        controlador.classEG();
                    }else if(clasedoc.equals("FC")){
                        controlador.claseFC();
                    }else if(clasedoc.equals("FP")){
                        controlador.claseFP();
                    }else if(clasedoc.equals("FV")){
                        controlador.claseFV();
                    }else if(clasedoc.equals("ND")){
                        controlador.claseND();
                    }else if(clasedoc.equals("NI")){
                        controlador.claseNI();
                    }else if(clasedoc.equals("NT")){
                        controlador.claseNT();
                    }else if(clasedoc.equals("OC")){
                        controlador.claseOC();
                    }else if(clasedoc.equals("OS") || clasedoc.equals("PC")){
                        controlador.claseOS_PC();
                    }else if(clasedoc.equals("PE")){
                        controlador.clasePE();
                    }else if(clasedoc.equals("PP")){
                        controlador.clasePP();
                    }
                    
                    String titulo = "Tipos Documentos";

                    Scene scene = new Scene(root);
                    Stage stage = new Stage();
                    stage.initModality(Modality.WINDOW_MODAL);
                    stage.setTitle(titulo);
                    stage.setScene(scene);
                    stage.show();

                    Stage myStage = (Stage) this.table.getScene().getWindow();
                    myStage.close();

                } catch (IOException ex) {
                    Logger.getLogger(PrincipalController.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
            estado = "";
        } catch (Exception e) {
            System.out.println("error" + e);
        }
    }
}

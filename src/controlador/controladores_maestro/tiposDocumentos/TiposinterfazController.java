/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controlador.controladores_maestro.tiposDocumentos;

import java.io.IOException;
import java.net.URL;
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
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.util.StringConverter;
import modelo.maestros.tipos_documentos.modelo_tipos_documentos;

/**
 * FXML Controller class
 *
 * @author User
 */
public class TiposinterfazController implements Initializable {

    @FXML
    public TextField txtCodigo;
    @FXML
    public TextField txtNombre;
    @FXML
    public TextField txtNumero;
    @FXML
    private ComboBox<modelo_tipos_documentos> comboClase;
    @FXML
    public TextField txtClase;
    @FXML
    private Button idBotonDocs;

    public String claseDocs;

    // DATOS DE INTERFAZ PRINCIPAL
    @FXML
    public Label principal_label_ccosto;
    @FXML
    public Label principal_label_scosto;
    @FXML
    public ComboBox<?> principal_combo_ccosto;
    @FXML
    public ComboBox<?> principal_combo_scosto;
    @FXML
    public CheckBox principal_check_pregunta_consecutivo;
    @FXML
    public Label principal_label_bodega;
    @FXML
    public ComboBox<?> principal_combo_bodega;
    @FXML
    public Label principal_label_modo_pago;
    @FXML
    public ComboBox<?> principal_cmb_modo_pago;
    @FXML
    public CheckBox principal_check_preciosPDV;
    @FXML
    public CheckBox principal_no_cambiar_lgeneral;
    @FXML
    public CheckBox principal_check_lista_precios;
    @FXML
    public CheckBox principal_check_utilizar_siempre_bodega;
    @FXML
    public Label principal_label_lista_precios;
    @FXML
    public ComboBox<?> principal_combo_listaDePrecios;
    @FXML
    public CheckBox principal_check_modo_pago_fijo;
    @FXML
    public CheckBox principal_check_mostrar_interfaz_efectivo;
    @FXML
    public CheckBox principal_check_puede_facturar_servicios;
    @FXML
    public Label principal_lbl_turno;
    @FXML
    public TextField principal_txt_turno;
    @FXML
    public CheckBox principal_check_no_cambiar_bodegas;
    @FXML
    public CheckBox principal_check_desactivar_desc_general;
    @FXML
    public Label principal_label_bodega2;
    @FXML
    public ComboBox<?> principal_cmb_bodega2;
    @FXML
    public Label principal_label_nota_translado;
    @FXML
    public ComboBox<?> principal_cmb_nota_translado;

    // Variables de Imp 1
    @FXML
    public CheckBox imp1_check_formato_personalizado;
    @FXML
    public Button imp1_btn_modificar_formato;
    @FXML
    public Button imp1_btn_formato_original;
    @FXML
    public Button imp1_btn_formato;
    @FXML
    public Label imp1_label_maximo_items_permitido;
    @FXML
    public CheckBox imp1_check_permitir_sobrepasar;
    @FXML
    public Label imp1_label_impresion_preimpresa;
    @FXML
    public TextField items1_txt_maximo_items_permitidos;
    
    // Variables de Imp 2
    @FXML
    public CheckBox imp2_check_nombre_documento;
    @FXML
    public CheckBox imp2_check_si_es_copia;
    @FXML
    public CheckBox imp2_check_segmento_productos;
    @FXML
    public CheckBox imp2_check_desc_factura;
    @FXML
    public TextField imp2_txt_encabezado1;
    @FXML
    public TextField imp2_txt_encabezado2;
    @FXML
    public TextField imp2_txt_encabezado3;
    @FXML
    public TextField imp2_txt_encabezado4;
    @FXML
    public TextField imp2_txt_encabezado5;
    @FXML
    public TextField imp2_txt_pie_pagina1;
    @FXML
    public TextField imp2_txt_pie_pagina2;
    @FXML
    public TextField imp2_txt_pie_pagina3;
    @FXML
    public TextField imp2_txt_pie_pagina4;
    @FXML
    public TextField imp2_txt_pie_pagina5;
    @FXML
    
    // VARIABLES DE LA PANTALLA IMP 3
    public TextArea imp3_txtarea_leyenda_pie_pagina;
    
    // ITEMS SUPERIORES
    @FXML
    public Tab tab_principal;
    @FXML
    public Tab tab_imp1;
    @FXML
    public Tab tab_imp2;
    @FXML
    public Tab tab_imp3;
    @FXML
    public Tab tab_fiscal;
    @FXML
    public Tab tab_pdv;
    @FXML
    public Tab tab_prom;
    @FXML
    public Tab tab_ctas;
    @FXML
    public Tab tab_referencia;
    @FXML
    public Tab tab_inventario;
    @FXML
    public Tab tab_seguimiento;
    @FXML
    public Tab tab_otros;
    
    // VENTANA DE FISCAL
    @FXML
    public Label fiscal_label_no;
    @FXML
    public TextField fiscal_txt_no;
    @FXML
    public Label fiscal_label_fecha;
    @FXML
    public DatePicker fiscal_date_fecha;
    @FXML
    public Label fiscal_label_vigencia_meses;
    @FXML
    public TextField fiscal_txt_vigencia_meses;
    @FXML
    public Label fiscal_label_prefijo;
    @FXML
    public TextField fiscal_txt_prefijo;
    @FXML
    public Label fiscal_label_desde;
    @FXML
    public TextField fiscal_txt_desde;
    @FXML
    public Label fiscal_label_hasta;
    @FXML
    public TextField fiscal_txt_hasta;
    @FXML
    public Label fiscal_label_ne_inicio;
    @FXML
    public TextField fiscal_txt_ne_inicio;
    @FXML
    public CheckBox fiscal_check_genera_iva_consumo;
    @FXML
    public CheckBox fiscal_check_no_calcula_iva;
    @FXML
    public Label fiscal_label_retencion_aplicar;
    @FXML
    public ComboBox<?> fiscal_cmb_retencion_aplicar;
    @FXML
    public CheckBox fiscal_check_factura_electronica_lote;
    @FXML
    public CheckBox fiscal_check_genera_fac_electronica_nomina;
    @FXML
    public CheckBox fiscal_check_iva_asumido;
    @FXML
    public CheckBox fiscal_check_calcular_cree;
    @FXML
    public Label fiscal_label_cree_p;
    @FXML
    public ComboBox<?> fiscal_cmb_cree_p;
    @FXML
    public Label fiscal_label_cree_s;
    @FXML
    public ComboBox<?> fiscal_cmb_cree_s;
    @FXML
    public CheckBox fiscal_check_factura_electronica_contingencia;
    
    // VENTANA DE PDV
    @FXML
    public CheckBox pdv_check_abrir_cajon_billetes;
    @FXML
    public CheckBox pdv_check_utilizar_impresion_pdv;
    
    // VENTANA DE PROM
    @FXML
    public Label prom_label_mostrar_evento;
    @FXML
    public Label prom_label_llegue_sgnt_num;
    @FXML
    public TextField prom_txt_evento;
    @FXML
    public Label prom_label_detalle_evento;
    @FXML
    public TextArea prom_txtarea_detalle_evento;

    // VENTANA DE CTAS
    @FXML
    public Label ctas_label_contrapartida;
    @FXML
    public TextField ctas_txt_contrapartida;
    @FXML
    public Button ctas_btn_buscar;
    
    // VENTANA DE REFERENCIAS
    @FXML
    public TextField refer_txt_ref1;
    @FXML
    public Label refer_label_ref1;
    @FXML
    public Label refer_label_ref2;
    @FXML
    public Label refer_label_ref3;
    @FXML
    public Label refer_label_ref4;
    @FXML
    public CheckBox refer_check_ref1;
    @FXML
    public CheckBox refer_check_ref2;
    @FXML
    public CheckBox refer_check_ref3;
    @FXML
    public CheckBox refer_check_ref4;
    @FXML
    public TextField refer_txt_ref2;
    @FXML
    public TextField refer_txt_ref3;
    @FXML
    public TextField refer_txt_ref4;
    // VENTANA INVENTARIO
    @FXML
    public Label inven_label_uso_nota_inventario;
    @FXML
    public CheckBox inven_check_maneja_inventarios_periodico;
    @FXML
    public CheckBox inven_check_registrar_modificacion_costo_productos;
    @FXML
    public ComboBox<?> inven_cmb_uso_nota_inventario;
    @FXML
    public CheckBox inven_check_permite_facturar_negativo;
    //  VENTANA SEGUIMIENTO
    @FXML
    public TextField seg_txt_usuarios;
    @FXML
    public Label seg_label_usuario;
    @FXML
    public Label seg_label_info_usuario;
    @FXML
    public TextField seg_txt_pc;
    @FXML
    public Label seg_label_pc;
    @FXML
    public Label seg_label_info_pc;
    // VENTANA DE OTROS
    @FXML
    public CheckBox otros_check_excluir_consolidacion_empresas;
    @FXML
    public CheckBox otros_check_tratamiento_translados_sucursales;
    @FXML
    public CheckBox otros_check_aplica_efecto_nulo;
    @FXML
    public CheckBox otros_check_doc_origen_externo;
    @FXML
    public Button otros_btn_proceso;
    @FXML
    public Label otros_label_grupo;
    @FXML
    public ComboBox<?> otros_cmb_grupo;
    @FXML
    public Button otros_btn_buscar_grupo;
    @FXML
    public CheckBox otro_check_exist_consig_fc;
    @FXML
    public Label otros_label_documento_alterno;
    @FXML
    public ComboBox<?> otros_cmb_documento_alterno;
    @FXML
    public TextField otros_txt_valor1_buscar;
    @FXML
    public TextField otros_txt_valor2_buscar;
    @FXML
    public Button otros_btn_buscar;
    @FXML
    public CheckBox otro_check_no_cambiar_ccost;
    @FXML
    public CheckBox otros_check_no_tener_cuenta_formula_mts2;
    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        comboClase.setVisible(false);
        initComboBox();
    }

    private void initComboBox() {
        modelo_tipos_documentos documents = new modelo_tipos_documentos();
        ObservableList<modelo_tipos_documentos> obs = documents.get_tipo_documentos();
        this.comboClase.setItems(obs);
        this.comboClase.setConverter(new StringConverter<modelo_tipos_documentos>() {
            @Override
            public String toString(modelo_tipos_documentos object) {
                return object.getNombre();
            }

            @Override
            public modelo_tipos_documentos fromString(String string) {
                return null;
            }
        });
    }

    @FXML
    private void click_docs(ActionEvent event) {
        try {
            FXMLLoader documentos = new FXMLLoader(getClass().getResource("/vista/vistas_maestros/tipos_documentos/tipos_documentos.fxml"));

            Parent root = documentos.load();

            Tipos_documentosController controlador = documentos.getController();

            String titulo = "Tipos Documentos";

            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.initModality(Modality.WINDOW_MODAL);
            stage.setTitle(titulo);
            stage.setScene(scene);
            stage.show();

            Stage myStage = (Stage) this.idBotonDocs.getScene().getWindow();
            myStage.close();

        } catch (IOException ex) {
            Logger.getLogger(TiposinterfazController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // CODIGO DE MOSTRAR DEPENDIENDO DE LA CLASE DE DOCUMENTOS
    public void claseCC_CO() {
        // PANTALLA DE ITEMS1
        imp1_label_impresion_preimpresa.setVisible(false);
        imp1_check_permitir_sobrepasar.setVisible(false);
        imp1_label_maximo_items_permitido.setVisible(false);
        items1_txt_maximo_items_permitidos.setVisible(false);

        // PANTALLA PRINCIPAL
        principal_check_desactivar_desc_general.setVisible(false);
        principal_no_cambiar_lgeneral.setVisible(false);
        principal_check_modo_pago_fijo.setVisible(false);
        principal_check_mostrar_interfaz_efectivo.setVisible(false);
        principal_check_preciosPDV.setVisible(false);
        principal_check_puede_facturar_servicios.setVisible(false);
        principal_check_no_cambiar_bodegas.setVisible(false);
        principal_check_utilizar_siempre_bodega.setVisible(false);
        principal_check_lista_precios.setVisible(false);
        principal_combo_listaDePrecios.setVisible(false);
        principal_label_lista_precios.setVisible(false);
        principal_combo_bodega.setVisible(false);
        principal_label_bodega.setVisible(false);
        principal_cmb_modo_pago.setVisible(false);
        principal_label_modo_pago.setVisible(false);
        principal_cmb_bodega2.setVisible(false);
        principal_label_bodega2.setVisible(false);
        principal_label_nota_translado.setVisible(false);
        principal_cmb_nota_translado.setVisible(false);
        principal_txt_turno.setVisible(false);
        principal_lbl_turno.setVisible(false);
        
        // PANTALLA ITEM2
        imp2_check_desc_factura.setVisible(false);
        
        // PANTALLAS SUPERIORES
        tab_fiscal.setDisable(true);
        tab_prom.setDisable(true);
        tab_inventario.setDisable(true);
        
        // PANTALLAS DE OTROS
        otro_check_exist_consig_fc.setVisible(false);
        otros_check_no_tener_cuenta_formula_mts2.setVisible(false);
        otro_check_no_cambiar_ccost.setVisible(false);
        otros_cmb_documento_alterno.setVisible(false);
        otros_label_documento_alterno.setVisible(false);
        otros_btn_buscar.setVisible(false);
        otros_txt_valor2_buscar.setVisible(false);
        otros_txt_valor1_buscar.setVisible(false);
        
    }
    public void claseCT(){
        // PANTALLA PRINCIPAL
        principal_check_desactivar_desc_general.setVisible(false);
        principal_check_modo_pago_fijo.setVisible(false);
        principal_check_mostrar_interfaz_efectivo.setVisible(false);
        principal_check_puede_facturar_servicios.setVisible(false);
        principal_check_no_cambiar_bodegas.setVisible(false);
        principal_cmb_bodega2.setVisible(false);
        principal_label_bodega2.setVisible(false);
        principal_label_nota_translado.setVisible(false);
        principal_cmb_nota_translado.setVisible(false);
        principal_txt_turno.setVisible(false);
        principal_lbl_turno.setVisible(false);
        
        // PANTALLA ITEM2
        imp2_check_desc_factura.setVisible(false);
        
        // PANTALLAS SUPERIORES
        tab_fiscal.setDisable(true);
        tab_prom.setDisable(true);
        tab_inventario.setDisable(true);
        
        // PANTALLAS DE OTROS
        otro_check_exist_consig_fc.setVisible(false);
        otros_check_no_tener_cuenta_formula_mts2.setVisible(false);
        otro_check_no_cambiar_ccost.setVisible(false);
        otros_cmb_documento_alterno.setVisible(false);
        otros_label_documento_alterno.setVisible(false);
        otros_btn_buscar.setVisible(false);
        otros_txt_valor2_buscar.setVisible(false);
        otros_txt_valor1_buscar.setVisible(false);
        
    }
    
    public void claseDC(){
        // PANTALLA PRINCIPAL
        principal_check_lista_precios.setVisible(false);
        principal_check_preciosPDV.setVisible(false);
        principal_check_no_cambiar_bodegas.setVisible(false);
        principal_check_puede_facturar_servicios.setVisible(false);
        principal_check_mostrar_interfaz_efectivo.setVisible(false);
        principal_check_modo_pago_fijo.setVisible(false);
        principal_check_desactivar_desc_general.setVisible(false);
        principal_no_cambiar_lgeneral.setVisible(false);
        principal_label_bodega2.setVisible(false);
        principal_cmb_bodega2.setVisible(false);
        principal_txt_turno.setVisible(false);
        principal_lbl_turno.setVisible(false);
        principal_cmb_nota_translado.setVisible(false);
        principal_label_nota_translado.setVisible(false);
        principal_combo_listaDePrecios.setVisible(false);
        principal_label_lista_precios.setVisible(false);
        
        // PANTALLA DE ITEMS1
        imp1_label_impresion_preimpresa.setVisible(false);
        imp1_check_permitir_sobrepasar.setVisible(false);
        imp1_label_maximo_items_permitido.setVisible(false);
        items1_txt_maximo_items_permitidos.setVisible(false);
        
        // PANTALLA ITEM2
        imp2_check_desc_factura.setVisible(false);
        
        // PANTALLA FISCAL
        fiscal_check_genera_iva_consumo.setVisible(false);
        fiscal_check_genera_fac_electronica_nomina.setVisible(false);
        fiscal_check_factura_electronica_lote.setVisible(false);
        fiscal_check_iva_asumido.setVisible(false);
        fiscal_check_factura_electronica_contingencia.setVisible(false);
        fiscal_check_calcular_cree.setVisible(false);
        fiscal_label_cree_p.setVisible(false);
        fiscal_cmb_cree_p.setVisible(false);
        fiscal_label_cree_s.setVisible(false);
        fiscal_cmb_cree_s.setVisible(false);
        
        // PANTALLAS SUPERIORES
        tab_prom.setDisable(true);
        
       // PANTALLA INVENTARIO
        inven_check_permite_facturar_negativo.setVisible(false);
        
        // PANTALLAS DE OTROS
        otro_check_exist_consig_fc.setVisible(false);
        otros_check_no_tener_cuenta_formula_mts2.setVisible(false);
        otro_check_no_cambiar_ccost.setVisible(false);
        otros_cmb_documento_alterno.setVisible(false);
        otros_label_documento_alterno.setVisible(false);
        otros_btn_buscar.setVisible(false);
        otros_txt_valor2_buscar.setVisible(false);
        otros_txt_valor1_buscar.setVisible(false);        
        
    }
    
    public void claseDP(){
        // PANTALLA PRINCIPAL
        principal_check_preciosPDV.setVisible(false);
        principal_check_no_cambiar_bodegas.setVisible(false);
        principal_check_mostrar_interfaz_efectivo.setVisible(false);
        principal_check_puede_facturar_servicios.setVisible(false);
        principal_check_modo_pago_fijo.setVisible(false);
        principal_check_desactivar_desc_general.setVisible(false);
        principal_no_cambiar_lgeneral.setVisible(false);
        principal_txt_turno.setVisible(false);
        principal_lbl_turno.setVisible(false);
        principal_cmb_bodega2.setVisible(false);
        principal_label_bodega2.setVisible(false);
        principal_cmb_nota_translado.setVisible(false);
        principal_label_nota_translado.setVisible(false);
        
        // PANTALLA DE ITEMS1
        imp1_label_impresion_preimpresa.setVisible(false);
        imp1_check_permitir_sobrepasar.setVisible(false);
        imp1_label_maximo_items_permitido.setVisible(false);
        items1_txt_maximo_items_permitidos.setVisible(false);
        
        // PANTALLA ITEM2
        imp2_check_desc_factura.setVisible(false);
        
        // PANTALLA FISCAL
        fiscal_check_genera_iva_consumo.setVisible(false);
        fiscal_check_genera_fac_electronica_nomina.setVisible(false);
        fiscal_check_iva_asumido.setVisible(false);
        fiscal_check_factura_electronica_contingencia.setVisible(false);
        fiscal_check_calcular_cree.setVisible(false);
        fiscal_label_cree_p.setVisible(false);
        fiscal_cmb_cree_p.setVisible(false);
        fiscal_label_cree_s.setVisible(false);
        fiscal_cmb_cree_s.setVisible(false);
        
        // PANTALLAS SUPERIORES
        tab_prom.setDisable(true);

        // PANTALLA INVENTARIO
        inven_check_permite_facturar_negativo.setVisible(false);
        
        // PANTALLAS DE OTROS
        otro_check_exist_consig_fc.setVisible(false);
        otros_check_no_tener_cuenta_formula_mts2.setVisible(false);
        otro_check_no_cambiar_ccost.setVisible(false);
        otros_cmb_documento_alterno.setVisible(false);
        otros_label_documento_alterno.setVisible(false);
        otros_btn_buscar.setVisible(false);
        otros_txt_valor2_buscar.setVisible(false);
        otros_txt_valor1_buscar.setVisible(false); 
        
    }
    
    public void claseDV(){
        // PANTALLA PRINCIPAL
        principal_check_no_cambiar_bodegas.setVisible(false);
        principal_check_mostrar_interfaz_efectivo.setVisible(false);
        principal_check_puede_facturar_servicios.setVisible(false);
        principal_check_desactivar_desc_general.setVisible(false);
        principal_no_cambiar_lgeneral.setVisible(false);
        principal_txt_turno.setVisible(false);
        principal_lbl_turno.setVisible(false);
        principal_cmb_bodega2.setVisible(false);
        principal_label_bodega2.setVisible(false);
        principal_cmb_nota_translado.setVisible(false);
        principal_label_nota_translado.setVisible(false);
        
        // PANTALLA DE ITEMS1
        imp1_label_impresion_preimpresa.setVisible(false);
        imp1_check_permitir_sobrepasar.setVisible(false);
        imp1_label_maximo_items_permitido.setVisible(false);
        items1_txt_maximo_items_permitidos.setVisible(false);
        
        // PANTALLA ITEM2
        imp2_check_desc_factura.setVisible(false);
        
        // PANTALLA FISCAL
        fiscal_check_genera_iva_consumo.setVisible(false);
        fiscal_check_iva_asumido.setVisible(false);
        fiscal_check_factura_electronica_contingencia.setVisible(false);
        fiscal_check_calcular_cree.setVisible(false);
        fiscal_label_cree_p.setVisible(false);
        fiscal_cmb_cree_p.setVisible(false);
        fiscal_label_cree_s.setVisible(false);
        fiscal_cmb_cree_s.setVisible(false);
        
        // PANTALLAS SUPERIORES
        tab_prom.setDisable(true);
        
        // PANTALLA INVENTARIO
        inven_check_permite_facturar_negativo.setVisible(false);
        
        // PANTALLAS DE OTROS
        otro_check_exist_consig_fc.setVisible(false);
        otros_check_no_tener_cuenta_formula_mts2.setVisible(false);
        otro_check_no_cambiar_ccost.setVisible(false);
        otros_cmb_documento_alterno.setVisible(false);
        otros_label_documento_alterno.setVisible(false);
        otros_btn_buscar.setVisible(false);
        otros_txt_valor2_buscar.setVisible(false);
        otros_txt_valor1_buscar.setVisible(false); 
        
    }
    
    public void classEG(){
        // PANTALLA PRINCIPAL
        principal_label_bodega.setVisible(false);
        principal_combo_bodega.setVisible(false);
        principal_combo_listaDePrecios.setVisible(false);
        principal_label_lista_precios.setVisible(false);
        principal_check_lista_precios.setVisible(false);
        principal_check_utilizar_siempre_bodega.setVisible(false);
        principal_check_no_cambiar_bodegas.setVisible(false);
        principal_check_puede_facturar_servicios.setVisible(false);
        principal_check_desactivar_desc_general.setVisible(false);
        principal_check_preciosPDV.setVisible(false);
        principal_check_modo_pago_fijo.setVisible(false);
        principal_no_cambiar_lgeneral.setVisible(false);
        principal_txt_turno.setVisible(false);
        principal_lbl_turno.setVisible(false);
        principal_cmb_bodega2.setVisible(false);
        principal_label_bodega2.setVisible(false);
        principal_cmb_nota_translado.setVisible(false);
        principal_label_nota_translado.setVisible(false);
        
        // PANTALLA DE ITEMS1
        imp1_label_impresion_preimpresa.setVisible(false);
        imp1_check_permitir_sobrepasar.setVisible(false);
        imp1_label_maximo_items_permitido.setVisible(false);
        items1_txt_maximo_items_permitidos.setVisible(false);
        
        // PANTALLA ITEM2
        imp2_check_desc_factura.setVisible(false);

        // PANTALLAS SUPERIORES
        tab_fiscal.setDisable(true);
        tab_prom.setDisable(true);
        tab_inventario.setDisable(true);
        
        // PANTALLAS DE OTROS
        otro_check_exist_consig_fc.setVisible(false);
        otros_check_no_tener_cuenta_formula_mts2.setVisible(false);
        otro_check_no_cambiar_ccost.setVisible(false);
        otros_cmb_documento_alterno.setVisible(false);
        otros_label_documento_alterno.setVisible(false);
        otros_btn_buscar.setVisible(false);
        otros_txt_valor2_buscar.setVisible(false);
        otros_txt_valor1_buscar.setVisible(false); 
    }
    
    public void claseFC(){
        // PANTALLA PRINCIPAL
        principal_combo_listaDePrecios.setVisible(false);
        principal_label_lista_precios.setVisible(false);
        principal_check_lista_precios.setVisible(false);
        principal_check_no_cambiar_bodegas.setVisible(false);
        principal_check_puede_facturar_servicios.setVisible(false);
        principal_check_desactivar_desc_general.setVisible(false);
        principal_check_mostrar_interfaz_efectivo.setVisible(false);
        principal_check_modo_pago_fijo.setVisible(false);
        principal_no_cambiar_lgeneral.setVisible(false);    
        principal_txt_turno.setVisible(false);
        principal_lbl_turno.setVisible(false);
        principal_cmb_bodega2.setVisible(false);
        principal_label_bodega2.setVisible(false);
        principal_cmb_nota_translado.setVisible(false);
        principal_label_nota_translado.setVisible(false);
        
        // PANTALLA DE ITEMS1
        imp1_label_impresion_preimpresa.setVisible(false);
        imp1_check_permitir_sobrepasar.setVisible(false);
        imp1_label_maximo_items_permitido.setVisible(false);
        items1_txt_maximo_items_permitidos.setVisible(false);
        
        // PANTALLA ITEM2
        imp2_check_desc_factura.setVisible(false);
        
        // PANTALLA FISCAL
        fiscal_check_genera_iva_consumo.setVisible(false);
        fiscal_check_genera_fac_electronica_nomina.setVisible(false);
        fiscal_check_factura_electronica_lote.setVisible(false);
        fiscal_check_genera_fac_electronica_nomina.setVisible(false);
        fiscal_check_factura_electronica_contingencia.setVisible(false);
        fiscal_check_calcular_cree.setVisible(false);
        fiscal_label_cree_p.setVisible(false);
        fiscal_cmb_cree_p.setVisible(false);
        fiscal_label_cree_s.setVisible(false);
        fiscal_cmb_cree_s.setVisible(false);
        
        // PANTALLAS SUPERIORES
        tab_prom.setDisable(true);
        
        // PANTALLA INVENTARIO
        inven_check_permite_facturar_negativo.setVisible(false);
        
        // PANTALLAS DE OTROS
        otros_check_no_tener_cuenta_formula_mts2.setVisible(false);
        otro_check_no_cambiar_ccost.setVisible(false);
        otros_cmb_documento_alterno.setVisible(false);
        otros_label_documento_alterno.setVisible(false);
        otros_btn_buscar.setVisible(false);
        otros_txt_valor2_buscar.setVisible(false);
        otros_txt_valor1_buscar.setVisible(false); 
    }
    
    public void claseFP(){
        CheckBox[] checks = {
            principal_check_no_cambiar_bodegas,principal_check_desactivar_desc_general,
            principal_check_preciosPDV,principal_check_mostrar_interfaz_efectivo,
            principal_check_modo_pago_fijo,fiscal_check_genera_iva_consumo,
            fiscal_check_genera_fac_electronica_nomina,fiscal_check_factura_electronica_lote,
            fiscal_check_iva_asumido,fiscal_check_factura_electronica_contingencia,
            otro_check_exist_consig_fc,otros_check_no_tener_cuenta_formula_mts2,
            otro_check_no_cambiar_ccost
        };
        ComboBox[] cmbs = {
            principal_cmb_bodega2,principal_cmb_nota_translado
        };
        Label[] lbs = {
            principal_label_bodega2,principal_label_nota_translado
        };
        TextField[] txts= {};
        Button[] btns = {};
        
        
        itemsFalse(checks,cmbs,lbs,txts,btns);
    }
    
    public void claseFV(){
        CheckBox[] checks = {
            principal_check_mostrar_interfaz_efectivo,principal_check_modo_pago_fijo,
            fiscal_check_genera_iva_consumo,fiscal_check_iva_asumido,inven_check_permite_facturar_negativo,
            otro_check_exist_consig_fc,
        };
        ComboBox[] cmbs = {
            otros_cmb_documento_alterno
        };
        Label[] lbs = {
            principal_lbl_turno,otros_label_documento_alterno
        };
        TextField[] txts= {
            principal_txt_turno,otros_txt_valor1_buscar,
            otros_txt_valor2_buscar
        };
        Button[] btns = {
            otros_btn_buscar
        };
        
        
        itemsFalse(checks,cmbs,lbs,txts,btns);
    }
    
     public void claseND(){
        CheckBox[] checks = {
            principal_check_lista_precios,principal_check_utilizar_siempre_bodega,
            principal_check_no_cambiar_bodegas,principal_check_puede_facturar_servicios,
            principal_check_desactivar_desc_general,principal_check_preciosPDV,
            principal_check_mostrar_interfaz_efectivo,principal_check_modo_pago_fijo,
            principal_no_cambiar_lgeneral,imp1_check_permitir_sobrepasar,
            imp2_check_desc_factura,fiscal_check_genera_iva_consumo,fiscal_check_factura_electronica_lote,
            fiscal_check_iva_asumido,fiscal_check_factura_electronica_contingencia,
            otro_check_exist_consig_fc,otros_check_no_tener_cuenta_formula_mts2,
            otro_check_no_cambiar_ccost,fiscal_check_calcular_cree
            
        };
        ComboBox[] cmbs = {
            principal_combo_bodega,principal_combo_listaDePrecios,principal_cmb_bodega2,
            principal_cmb_nota_translado,fiscal_cmb_cree_s,fiscal_cmb_cree_p,
            otros_cmb_documento_alterno
            
        };
        Label[] lbs = {
            principal_label_bodega,principal_label_lista_precios,principal_label_bodega2,
            principal_label_nota_translado,principal_lbl_turno,imp1_label_maximo_items_permitido,
            imp1_label_impresion_preimpresa,fiscal_label_cree_s,fiscal_label_cree_p,otros_label_documento_alterno
        };
        TextField[] txts= {
            principal_txt_turno,items1_txt_maximo_items_permitidos,otros_txt_valor1_buscar,
            otros_txt_valor2_buscar
        };
        Button[] btns = {
            otros_btn_buscar
        };
        
        tab_prom.setDisable(true);
        tab_inventario.setDisable(true);
        
        itemsFalse(checks,cmbs,lbs,txts,btns);
    } 
     
    public void claseNI(){
 
        CheckBox[] checks = {
            principal_check_lista_precios,
            principal_check_no_cambiar_bodegas,principal_check_puede_facturar_servicios,
            principal_check_desactivar_desc_general,principal_check_preciosPDV,
            principal_check_mostrar_interfaz_efectivo,principal_check_modo_pago_fijo,
            principal_no_cambiar_lgeneral,imp1_check_permitir_sobrepasar,
            imp2_check_desc_factura,fiscal_check_genera_iva_consumo,fiscal_check_factura_electronica_lote,
            fiscal_check_iva_asumido,fiscal_check_factura_electronica_contingencia,
            otro_check_exist_consig_fc,otro_check_no_cambiar_ccost,
            fiscal_check_calcular_cree,inven_check_permite_facturar_negativo
            
        };
        ComboBox[] cmbs = {
            principal_combo_listaDePrecios,principal_cmb_bodega2,
            principal_cmb_nota_translado,fiscal_cmb_cree_s,fiscal_cmb_cree_p,
            otros_cmb_documento_alterno, principal_cmb_modo_pago
            
        };
        Label[] lbs = {
            principal_label_lista_precios,principal_label_bodega2,
            principal_label_nota_translado,principal_lbl_turno,imp1_label_maximo_items_permitido,
            imp1_label_impresion_preimpresa,fiscal_label_cree_s,fiscal_label_cree_p,otros_label_documento_alterno,
            principal_label_modo_pago
        };
        TextField[] txts= {
            principal_txt_turno,items1_txt_maximo_items_permitidos,otros_txt_valor1_buscar,
            otros_txt_valor2_buscar
        };
        Button[] btns = {
            otros_btn_buscar
        };
        
        tab_prom.setDisable(true);
        tab_fiscal.setDisable(true);
        
        itemsFalse(checks,cmbs,lbs,txts,btns);
    }
    
    public void claseNT(){
        
        CheckBox[] checks = {
            principal_check_lista_precios,
            principal_check_no_cambiar_bodegas,principal_check_puede_facturar_servicios,
            principal_check_desactivar_desc_general,principal_check_preciosPDV,
            principal_check_mostrar_interfaz_efectivo,principal_check_modo_pago_fijo,
            principal_no_cambiar_lgeneral,imp1_check_permitir_sobrepasar,
            imp2_check_desc_factura,fiscal_check_genera_iva_consumo,fiscal_check_factura_electronica_lote,
            fiscal_check_iva_asumido,fiscal_check_factura_electronica_contingencia,
            otro_check_exist_consig_fc,otro_check_no_cambiar_ccost,
            fiscal_check_calcular_cree,inven_check_permite_facturar_negativo,principal_check_utilizar_siempre_bodega
            
        };
        ComboBox[] cmbs = {
            principal_combo_listaDePrecios,principal_cmb_bodega2,
            principal_cmb_nota_translado,fiscal_cmb_cree_s,fiscal_cmb_cree_p,
            otros_cmb_documento_alterno, principal_cmb_modo_pago,
            principal_combo_bodega
        };
        Label[] lbs = {
            principal_label_lista_precios,principal_label_bodega2,
            principal_label_nota_translado,principal_lbl_turno,imp1_label_maximo_items_permitido,
            imp1_label_impresion_preimpresa,fiscal_label_cree_s,fiscal_label_cree_p,otros_label_documento_alterno,
            principal_label_modo_pago, principal_label_bodega
        };
        TextField[] txts= {
            principal_txt_turno,items1_txt_maximo_items_permitidos,otros_txt_valor1_buscar,
            otros_txt_valor2_buscar
        };
        Button[] btns = {
            otros_btn_buscar
        };
        
        tab_prom.setDisable(true);
        tab_fiscal.setDisable(true);
        tab_inventario.setDisable(true);
        
        itemsFalse(checks,cmbs,lbs,txts,btns);
    }
    
    public void claseOC(){
        CheckBox[] checks = {
            principal_check_lista_precios,
            principal_check_no_cambiar_bodegas,principal_check_puede_facturar_servicios,
            principal_check_desactivar_desc_general,
            principal_check_mostrar_interfaz_efectivo,principal_check_modo_pago_fijo,
            principal_no_cambiar_lgeneral,imp1_check_permitir_sobrepasar,
            imp2_check_desc_factura,fiscal_check_genera_iva_consumo,fiscal_check_factura_electronica_lote,
            fiscal_check_iva_asumido,fiscal_check_factura_electronica_contingencia,
            otro_check_exist_consig_fc,otro_check_no_cambiar_ccost,otros_check_no_tener_cuenta_formula_mts2,
            fiscal_check_calcular_cree,inven_check_permite_facturar_negativo,principal_check_utilizar_siempre_bodega 
        };
        ComboBox[] cmbs = {
            principal_combo_listaDePrecios,principal_cmb_bodega2,
            principal_cmb_nota_translado,fiscal_cmb_cree_s,fiscal_cmb_cree_p,
            otros_cmb_documento_alterno,
            principal_combo_bodega
        };
        Label[] lbs = {
            principal_label_lista_precios,principal_label_bodega2,
            principal_label_nota_translado,principal_lbl_turno,imp1_label_maximo_items_permitido,
            imp1_label_impresion_preimpresa,fiscal_label_cree_s,fiscal_label_cree_p,otros_label_documento_alterno,
            principal_label_bodega
        };
        TextField[] txts= {
            principal_txt_turno,items1_txt_maximo_items_permitidos,otros_txt_valor1_buscar,
            otros_txt_valor2_buscar
        };
        Button[] btns = {
            otros_btn_buscar
        };
        tab_prom.setDisable(true);
        tab_fiscal.setDisable(true);
        tab_inventario.setDisable(true);
        itemsFalse(checks,cmbs,lbs,txts,btns);
    }
    
    public void claseOS_PC(){
        CheckBox[] checks = {
            principal_check_lista_precios,
            principal_check_no_cambiar_bodegas,principal_check_puede_facturar_servicios,
            principal_check_desactivar_desc_general,principal_check_preciosPDV,
            principal_check_mostrar_interfaz_efectivo,principal_check_modo_pago_fijo,
            principal_no_cambiar_lgeneral,imp1_check_permitir_sobrepasar,
            imp2_check_desc_factura,fiscal_check_genera_iva_consumo,fiscal_check_factura_electronica_lote,
            fiscal_check_iva_asumido,fiscal_check_factura_electronica_contingencia,
            otro_check_exist_consig_fc,otro_check_no_cambiar_ccost,otros_check_no_tener_cuenta_formula_mts2,
            fiscal_check_calcular_cree,inven_check_permite_facturar_negativo,principal_check_utilizar_siempre_bodega 
        };
        ComboBox[] cmbs = {
            principal_combo_listaDePrecios,principal_cmb_bodega2,
            principal_cmb_nota_translado,fiscal_cmb_cree_s,fiscal_cmb_cree_p,
            otros_cmb_documento_alterno,principal_cmb_modo_pago,
            principal_combo_bodega
        };
        Label[] lbs = {
            principal_label_lista_precios,principal_label_bodega2,
            principal_label_nota_translado,principal_lbl_turno,imp1_label_maximo_items_permitido,
            imp1_label_impresion_preimpresa,fiscal_label_cree_s,fiscal_label_cree_p,otros_label_documento_alterno,
            principal_label_bodega, principal_label_modo_pago
        };
        TextField[] txts= {
            principal_txt_turno,items1_txt_maximo_items_permitidos,otros_txt_valor1_buscar,
            otros_txt_valor2_buscar
        };
        Button[] btns = {
            otros_btn_buscar
        };
        tab_prom.setDisable(true);
        tab_fiscal.setDisable(true);
        tab_inventario.setDisable(true);
        itemsFalse(checks,cmbs,lbs,txts,btns);
    }
    
    public void clasePE(){
        CheckBox[] checks = {
            principal_check_lista_precios,
            principal_check_no_cambiar_bodegas,principal_check_puede_facturar_servicios,
            principal_check_desactivar_desc_general,
            principal_check_mostrar_interfaz_efectivo,principal_check_modo_pago_fijo,
            imp1_check_permitir_sobrepasar,
            imp2_check_desc_factura,fiscal_check_genera_iva_consumo,fiscal_check_factura_electronica_lote,
            fiscal_check_iva_asumido,fiscal_check_factura_electronica_contingencia,
            otro_check_exist_consig_fc,otro_check_no_cambiar_ccost,otros_check_no_tener_cuenta_formula_mts2,
            fiscal_check_calcular_cree,inven_check_permite_facturar_negativo 
        };
        ComboBox[] cmbs = {
            principal_combo_listaDePrecios,principal_cmb_bodega2,
            principal_cmb_nota_translado,fiscal_cmb_cree_s,fiscal_cmb_cree_p,
            otros_cmb_documento_alterno
        };
        Label[] lbs = {
            principal_label_lista_precios,principal_label_bodega2,
            principal_label_nota_translado,principal_lbl_turno,imp1_label_maximo_items_permitido,
            imp1_label_impresion_preimpresa,fiscal_label_cree_s,fiscal_label_cree_p,otros_label_documento_alterno,
        };
        TextField[] txts= {
            principal_txt_turno,items1_txt_maximo_items_permitidos,otros_txt_valor1_buscar,
            otros_txt_valor2_buscar
        };
        Button[] btns = {
            otros_btn_buscar
        };
        tab_prom.setDisable(true);
        tab_fiscal.setDisable(true);
        tab_inventario.setDisable(true);
        itemsFalse(checks,cmbs,lbs,txts,btns);
    }
    
    public void clasePP(){
        CheckBox[] checks = {
            principal_check_no_cambiar_bodegas,principal_check_puede_facturar_servicios,
            principal_check_desactivar_desc_general,
            principal_check_mostrar_interfaz_efectivo,principal_check_modo_pago_fijo,
            imp1_check_permitir_sobrepasar,principal_no_cambiar_lgeneral,
            imp2_check_desc_factura,fiscal_check_genera_iva_consumo,fiscal_check_factura_electronica_lote,
            fiscal_check_iva_asumido,fiscal_check_factura_electronica_contingencia,
            otro_check_exist_consig_fc,otro_check_no_cambiar_ccost,otros_check_no_tener_cuenta_formula_mts2,
            fiscal_check_calcular_cree,inven_check_permite_facturar_negativo 
        };
        ComboBox[] cmbs = {
            principal_cmb_bodega2,
            principal_cmb_nota_translado,fiscal_cmb_cree_s,fiscal_cmb_cree_p,
            otros_cmb_documento_alterno,principal_cmb_modo_pago
        };
        Label[] lbs = {
            principal_label_bodega2,principal_label_modo_pago,
            principal_label_nota_translado,principal_lbl_turno,imp1_label_maximo_items_permitido,
            imp1_label_impresion_preimpresa,fiscal_label_cree_s,fiscal_label_cree_p,otros_label_documento_alterno,
        };
        TextField[] txts= {
            principal_txt_turno,items1_txt_maximo_items_permitidos,otros_txt_valor1_buscar,
            otros_txt_valor2_buscar
        };
        Button[] btns = {
            otros_btn_buscar
        };
        tab_prom.setDisable(true);
        tab_fiscal.setDisable(true);
        tab_inventario.setDisable(true);
        itemsFalse(checks,cmbs,lbs,txts,btns);
    }
    
    public void itemsFalse(CheckBox[] checks, ComboBox[] cmbs, Label[] lbs, TextField[] txts, Button[] btns){
        for (int i = 0; i < checks.length; i++) {
            checks[i].setVisible(false);
        }
        for (int i = 0; i < cmbs.length; i++) {
            cmbs[i].setVisible(false);
        }
        for (int i = 0; i < lbs.length; i++) {
            lbs[i].setVisible(false);
        }
        for (int i = 0; i < txts.length; i++) {
            txts[i].setVisible(false);
        }
        for (int i = 0; i < btns.length; i++) {
            btns[i].setVisible(false);
        }
    }
}

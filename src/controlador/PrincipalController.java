/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controlador;

import CRM_clientes.controlador.Acerca_deController;
import CRM_clientes.controlador.Seguimiento_clientesController;
import CRM_clientes.controlador.Seguimiento_cotizacionesController;
import CRM_clientes.controlador.Ventas_x_clientesController;
import controlador.controladores_maestro.Impuesto_industria_y_comercioController;
import controlador.controladores_maestro.Impuestro_sobre_ventasController;
import controlador.controladores_maestro.Modos_de_pagoController;
import controlador.controladores_maestro.Operaciones_frecuentesController;
import controlador.controladores_maestro.archivos_inventario.Archivos_inventarioController;
import controlador.controladores_maestro.configuracion_lotes.ConstantesController;
import controlador.controladores_maestro.configuracion_lotes.Constantes_generalesController;
import controlador.controladores_maestro.configuracion_lotes.NovedadesController;
import controlador.controladores_maestro.controladores_centro_costo.Centro_costosController;
import controlador.controladores_maestro.productos.ProductosController;
import controlador.controladores_maestro.servicios.ServiciosController;
import controlador.controladores_maestro.tablas_nomina.Tablas_nominaController;
import controlador.documentos.DocsController;
import controlador.documentos.docs_inventarios.Salida_inventariosController;
import controlador.documentos.docs_inventarios.Translado_entre_bodegasController;
import controlador.documentos.docs_nomina.Docs_nominaController;
import controlador.documentos.fact_puntVenta_PDV.Sic_punto_ventaController;
import controlador.documentos.nota_credito_cuentas_x_pagar.Nota_credito_cuentas_x_pagarController;
import controlador.documentos.nota_credito_devol_venta.Nota_credito_devol_ventaController;
import controlador.documentos.nota_debito_causa_cts_x_cobrar.Nota_debito_causa_cts_x_cobrarController;
import controlador.documentos.nota_debito_devol_compra.Nota_debito_devol_compraController;
import controlador.documentos.orden_servicio.Orden_servicioController;
import controlador.documentos.otros_area_ventas.Cotizacion_a_clienteController;
import controlador.documentos.saldos_iniciales.Saldos_inicialesController;
import controlador.informes.Informes_de_nominaController;
import controlador.informes.Informes_especificosController;
import controlador.informes.compras.Comparativo_comprasController;
import controlador.informes.compras.ComprasController;
import controlador.informes.compras.Informe_comprasController;
import controlador.informes.compras.Registros_ordenes_compraController;
import controlador.informes.contables_financieros.Analisis_graficoController;
import controlador.informes.contables_financieros.AuditoriaController;
import controlador.informes.contables_financieros.Auxiliar_especialController;
import controlador.informes.contables_financieros.AuxiliaresController;
import controlador.informes.contables_financieros.Comprobante_diarioController;
import controlador.informes.contables_financieros.Estados_financierosController;
import controlador.informes.contables_financieros.Ingresos_gastos_terceroController;
import controlador.informes.contables_financieros.Libros_oficialesController;
import controlador.informes.contables_financieros.Listado_documentoController;
import controlador.informes.contables_financieros.MovimientoController;
import controlador.informes.contables_financieros.Movimiento_ref1Controller;
import controlador.informes.contables_financieros.Resumen_contableController;
import controlador.informes.contables_financieros.Resumen_documentosController;
import controlador.informes.contables_financieros.Resumen_x_diasController;
import controlador.informes.contables_financieros.Saldos_centros_costosController;
import controlador.informes.contables_financieros.Saldos_tercerosController;
import controlador.informes.deudores.Analisis_morosidadController;
import controlador.informes.deudores.Cartas_cobrosController;
import controlador.informes.deudores.CarteraController;
import controlador.informes.deudores.Cartera_por_edadesController;
import controlador.informes.deudores.ConsultaDocumentosController;
import controlador.informes.deudores.Consulta_por_tercerosController;
import controlador.informes.deudores.Listado_clientes_saldosController;
import controlador.informes.deudores.Saldo_tercero_x_cuentasController;
import controlador.informes.facturacion.Click_informe_facturacionController;
import controlador.informes.facturacion.Comisiones_recaudoController;
import controlador.informes.facturacion.Comisiones_ventaController;
import controlador.informes.facturacion.Comisiones_venta_list_docController;
import controlador.informes.facturacion.Comparativo_facturacionController;
import controlador.informes.facturacion.Desc_comercialesController;
import controlador.informes.facturacion.Facturas_pedidoController;
import controlador.informes.facturacion.Informe_factura_marca_segController;
import controlador.informes.facturacion.Informe_pedidosController;
import controlador.informes.facturacion.Informe_puntosController;
import controlador.informes.facturacion.Informe_remisionesController;
import controlador.informes.facturacion.Informes_cotizacionController;
import controlador.informes.facturacion.Informes_fact_nuevoController;
import controlador.informes.facturacion.Nuevos_clientesController;
import controlador.informes.facturacion.Ver_trazabilidad_pedidoController;
import controlador.informes.fiscales.Certificado_retencionController;
import controlador.informes.fiscales.Comprobante_informe_diario_comprasController;
import controlador.informes.fiscales.Comprobante_informe_diario_factController;
import controlador.informes.fiscales.Comprobante_informe_diario_facturacionController;
import controlador.informes.fiscales.Concolidado_retencionController;
import controlador.informes.fiscales.Informe_ivaController;
import controlador.informes.fiscales.Informe_retenciones_nuevoController;
import controlador.informes.fiscales.Medios_magneticosController;
import controlador.informes.fiscales.Medios_magneticos_nuevoController;
import controlador.informes.fiscales.Pagos_tercerosController;
import controlador.informes.inventarios.Extracto_bodegaController;
import controlador.informes.inventarios.Extracto_inventario_bodegasController;
import controlador.informes.inventarios.Extracto_inventario_generalController;
import controlador.informes.inventarios.Informe_maximos_minimosController;
import controlador.informes.inventarios.Informe_translados_bodegasController;
import controlador.informes.inventarios.Kardex_bodegasController;
import controlador.informes.inventarios.Kardex_bodegas_mercan_consigController;
import controlador.informes.inventarios.Kardex_generalController;
import controlador.informes.inventarios.Rentabilidad_inventarioController;
import controlador.informes.inventarios.Rotacion_inventarioController;
import controlador.informes.inventarios.Saldo_inventario_bodegas_2Controller;
import controlador.informes.inventarios.Saldo_inventario_unidades_mayorController;
import controlador.informes.inventarios.Saldos_inventarioController;
import controlador.informes.inventarios.Saldos_inventario_acumu_seriesController;
import controlador.informes.inventarios.Saldos_inventarios_segmentosController;
import controlador.informes.proveedores_cxp.ConsultasController;
import controlador.informes.proveedores_cxp.Informe_cuentas_xpagarController;
import controlador.informes.tesoreria.Estado_caja_bancosController;
import controlador.informes.tesoreria.Informe_recaudosController;
import controlador.informes.tesoreria.Relacion_chequesController;
import controlador.procesos.Reconstruir_movimientosController;
import controlador.procesos.procesos_cartera.Causacion_interes_deudoresController;
import controlador.procesos.procesos_cartera.Clasificacion_cartera_comercialController;
import controlador.procesos.procesos_cartera.Cruce_cartera_clie_con_anticiposController;
import controlador.procesos.procesos_cartera.Definir_cuentas_categoriasController;
import controlador.procesos.procesos_contables.Consolidar_empresasController;
import controlador.procesos.procesos_contables.Corte_fisicoController;
import controlador.procesos.procesos_contables.Liquidacion_tercerosController;
import controlador.procesos.procesos_contables.Procesar_depreciacionController;
import controlador.procesos.procesos_contables.Reailzar_consilacion_bancariaController;
import controlador.procesos.procesos_contables.Reclasificacion_saldosController;
import controlador.procesos.procesos_inventario.Cancelacion_inventariosController;
import controlador.procesos.procesos_inventario.Conversion_insumosController;
import controlador.procesos.procesos_inventario.Inventarios_fisicosController;
import controlador.procesos.procesos_inventario.Manto_lotes_productosController;
import controlador.procesos.procesos_inventario.Nivelacion_de_costosController;
import controlador.procesos.procesos_inventario.Pedidos_a_proveedoresController;
import controlador.procesos.procesos_inventario.Procesar_costos_ventasController;
import controlador.procesos.procesos_ventas.Cierre_lapso_ventaController;
import controlador.procesos.procesos_ventas.Factura_saldos_bodegasController;
import controlador.procesos.procesos_ventas.Facturacion_cobros_loteController;
import controlador.procesos.procesos_ventas.Planilla_transportadoresController;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.MenuItem;
import javafx.scene.control.ScrollBar;
import javafx.scene.image.ImageView;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import mantenimiento.controlador.Bloquear_temporalmenteController;
import mantenimiento.controlador.Cambio_passwordController;
import mantenimiento.controlador.EmailController;
import mantenimiento.controlador.Examinar_fallas_informacionController;
import mantenimiento.controlador.Exportar_informacionController;
import mantenimiento.controlador.Historial_operacionesController;
import mantenimiento.controlador.Importar_informacionController;
import mantenimiento.controlador.Mantenimiento_bdController;
import mantenimiento.controlador.ParametrizacionController;
import mantenimiento.controlador.Usuarios_permisosController;
import modelo.AbrirVentanas;
import periodos.cambio_mes.controlador.Cambio_mesController;
import periodos.meses_abiertos.controlador.Meses_abiertosController;

/**
 * FXML Controller class
 *
 * @author SENA
 */
public class PrincipalController implements Initializable {

    @FXML
    private ImageView imgCambiomes;
    @FXML
    private ImageView imgCambiomes1;
    @FXML
    private ImageView imgCambiomes2;
    @FXML
    private ImageView imgCambiomes21;
    @FXML
    private ImageView imgCambiomes22;
    @FXML
    private ImageView imgCambiomes23;
    @FXML
    private ImageView imgCambiomes24;
    @FXML
    private ImageView imgCambiomes25;
    @FXML
    private ImageView imgCambiomes251;
    @FXML
    private ImageView imgCambiomes252;
    @FXML
    private ImageView imgCambiomes253;
    @FXML
    private ImageView imgCambiomes254;
    @FXML
    private ImageView imgCambiomes2541;
    @FXML
    private ImageView imgCambiomes2542;
    @FXML
    private ImageView imgCambiomes2543;
    @FXML
    private ImageView imgCambiomes2544;
    @FXML
    private ImageView imgCambiomes26;
    @FXML
    private ImageView imgCambiomes27;
    @FXML
    private ImageView imgCambiomes29;
    @FXML
    private ImageView imgCambiomes291;
    @FXML
    private ImageView imgCambiomes292;
    @FXML
    private ImageView imgCambiomes293;
    @FXML
    private ImageView imgCambiomes2931;
    @FXML
    private ImageView imgCambiomes28;
    @FXML
    private ImageView imgCambiomes293111;
    @FXML
    private ImageView imgCambiomes293112;
    @FXML
    private ImageView imgCambiomes293113;
    @FXML
    private ImageView imgCambiomes29311;
    @FXML
    private ImageView imgCambiomes293114;
    @FXML
    private ImageView imgCambiomes293115;
    @FXML
    private ImageView imgCambiomes293116;
    @FXML
    private ImageView imgCambiomes293117;
    @FXML
    private ImageView imgCambiomes293118;
    @FXML
    private ImageView imgCambiomes293119;
    @FXML
    private ImageView imgCambiomes2931110;
    @FXML
    private ImageView imgCambiomes2931111;
    @FXML
    private ImageView imgCambiomes2931112;
    @FXML
    private ImageView imgCambiomes2931113;
    @FXML
    private ImageView imgCambiomes2931114;
    @FXML
    private ImageView imgCambiomes272;
    @FXML
    private ImageView imgCambiomes273;
    @FXML
    private ImageView imgCambiomes274;
    @FXML
    private ImageView imgCambiomes275;
    @FXML
    private ImageView imgCambiomes276;
    @FXML
    private ImageView imgCambiomes277;
    @FXML
    private ImageView imgCambiomes271;
    @FXML
    private ImageView imgCambiomes2931115;
    @FXML
    private ImageView imgCambiomes2931116;
    @FXML
    private ImageView imgCambiomes2794665;
    @FXML
    private ImageView imgCambiomes2794664;
    @FXML
    private ImageView imgCambiomes2794663;
    @FXML
    private ImageView imgCambiomes2794662;
    @FXML
    private ImageView imgCambiomes2794661;
    @FXML
    private ImageView imgCambiomes279466;
    @FXML
    private ImageView imgCambiomes279465;
    @FXML
    private ImageView imgCambiomes279464;
    @FXML
    private ImageView imgCambiomes279463;
    @FXML
    private ImageView imgCambiomes279462;
    @FXML
    private ImageView imgCambiomes279461;
    @FXML
    private ImageView imgCambiomes27946;
    @FXML
    private ImageView imgCambiomes27945;
    @FXML
    private ImageView imgCambiomes27944;
    @FXML
    private ImageView imgCambiomes27943;
    @FXML
    private ImageView imgCambiomes27942;
    @FXML
    private ImageView imgCambiomes27941;
    @FXML
    private ImageView imgCambiomes2794;
    @FXML
    private ImageView imgCambiomes279;
    @FXML
    private ImageView imgCambiomes2791;
    @FXML
    private ImageView imgCambiomes2792;
    @FXML
    private ImageView imgCambiomes2793;
    @FXML
    private ImageView imgCambiomes278;
    @FXML
    private ImageView imgCambiomes2794666;
    @FXML
    private ImageView imgCambiomes27946661;
    @FXML
    private ImageView imgCambiomes27946662;
    @FXML
    private ImageView imgCambiomes27946663;
    @FXML
    private ImageView imgCambiomes27946664;
    @FXML
    private ImageView imgCambiomes27946665;
    @FXML
    private ImageView imgCambiomes27946666;
    @FXML
    private ImageView imgCambiomes27946667;
    @FXML
    private ImageView imgCambiomes27946668;
    @FXML
    private ImageView imgCambiomes27946669;
    @FXML
    private ImageView imgCambiomes279466610;
    @FXML
    private ImageView imgCambiomes279466611;
    @FXML
    private ImageView imgCambiomes2794666111;
    @FXML
    private ImageView imgCambiomes2794666112;
    @FXML
    private ImageView imgCambiomes27946661121;
    @FXML
    private ImageView imgCambiomes2794666101;
    @FXML
    private ImageView imgCambiomes2794666102;
    @FXML
    private ImageView imgCambiomes2794666103;
    @FXML
    private ImageView imgCambiomes2794666104;
    @FXML
    private ImageView imgCambiomes27946661041;
    @FXML
    private ImageView imgCambiomes27946661042;
    @FXML
    private ImageView imgCambiomes27946661043;
    @FXML
    private ImageView imgCambiomes2794666105;
    @FXML
    private ImageView imgCambiomes2794666106;
    @FXML
    private ImageView imgCambiomes2794666107;
    @FXML
    private ImageView imgCambiomes2794666108;
    AbrirVentanas abrir = new AbrirVentanas();
    @FXML
    private MenuItem idMante_documents;
    @FXML
    private MenuItem idFactVenta;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {

        // TODO
    }

    @FXML
    private void click_plan_cuentas(ActionEvent event) {

        abrir.AbrirPlanCuentas();

    }

    @FXML
    private void click_centro(ActionEvent event) {

        abrir.AbrirCentro("", "no");

    }

    @FXML
    private void click_zonas(ActionEvent event) {

        abrir.AbrirZona();

    }

    @FXML
    private void click_Dep(ActionEvent event) {

        abrir.AbrirDepartamentos(null, "no");

    }

    @FXML
    private void click_ciudad(ActionEvent event) {

        abrir.AbrirCiudades(null, "si");

    }

    @FXML
    private void ClickTerceros(ActionEvent event) {

        abrir.AbrirTerceros();

    }

    @FXML
    private void click_paises(ActionEvent event) {

        abrir.AbrirPaises(null, "si");
    }

    @FXML
    private void click_tiposDocumentos(ActionEvent event) {

        abrir.AbrirTipoDocumentos(null, "si");

    }

    @FXML
    private void click_mante_documents(ActionEvent event) {
        abrir.AbrirMantenimientoDocumentos(null, "si");
    }

    private void ventanaDocs() {
        try {
            FXMLLoader docs = new FXMLLoader(getClass().getResource("/vista/documentos/docs.fxml"));

            Parent root = docs.load();

            DocsController controlador = docs.getController();

            controlador.estado = "";

            String titulo = "Factura de venta";

            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setTitle(titulo);
            scene.setOnKeyPressed(event -> {
                if (event.getCode().toString().equals("ESCAPE")) {
                    stage.close();
                }
            });
            stage.setScene(scene);
            stage.show();

        } catch (IOException ex) {
            Logger.getLogger(PrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void AbrirSicPuntoVenta(String choose) {
        try {
            FXMLLoader sic_punto_venta = new FXMLLoader(getClass().getResource("/vista/documentos/fact_puntoVenta_PDV/sic_punto_venta.fxml"));

            Parent root = sic_punto_venta.load();

            Sic_punto_ventaController controlador = sic_punto_venta.getController();

            if (choose.equals("PP1")) {
                controlador.labelTipoDoc.setText("PP1");
                controlador.btnReimprime.setVisible(false);
                controlador.btnImprime.setDisable(true);
                controlador.btnAutoriza.setVisible(false);
                controlador.cmb_primero.setVisible(false);
                controlador.cmb_segundo.setVisible(false);
                controlador.cmb_tercero.setVisible(false);
                controlador.txt_primero.setVisible(false);
                controlador.txt_segundo.setVisible(false);
                controlador.txt_tercero.setVisible(false);
                controlador.lbl_primero.setVisible(false);
                controlador.lbl_segundo.setVisible(false);
                controlador.lbl_tercero.setVisible(false);
                controlador.lbl_modos.setVisible(false);
                controlador.lbl_pagof6.setVisible(false);
                controlador.lbl_billete.setVisible(false);
                controlador.txt_billete.setVisible(false);
                controlador.check_imprimir_en_carta.setVisible(false);

                String color = "green";
                controlador.paneInfoSuperior.setStyle("-fx-background-color: " + color);
            }
            String titulo = "SIC punto venta";

            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setTitle(titulo);
            scene.setOnKeyPressed(event -> {
                if (event.getCode().toString().equals("ESCAPE")) {
                    stage.close();
                }
            });
            stage.setScene(scene);
            stage.show();

        } catch (IOException ex) {
            Logger.getLogger(PrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void click_fact_venta(ActionEvent event) {
        ventanaDocs();
    }

    @FXML
    private void click_dev_venta(ActionEvent event) {
        ventanaDocs();
    }

    @FXML
    private void click_remision_cliente(ActionEvent event) {
        ventanaDocs();
    }

    @FXML
    private void click_pedido_de_cliente(ActionEvent event) {
        ventanaDocs();
    }

    @FXML
    private void click_nota_contabilidad(ActionEvent event) {
        ventanaDocs();
    }

    @FXML
    private void click_comprobante_egreso(ActionEvent event) {
        abrir.AbrirComprobanteEgreso(null, "si");
    }

    @FXML
    private void click_recibo_de_caja(ActionEvent event) {
        //abrir.AbrirReciboCaja(null, "si");
        ventanaDocs();
    }

    @FXML
    private void click_factura_compra_causacion_servicio(ActionEvent event) {
        ventanaDocs();
    }

    @FXML
    private void click_orden_compra(ActionEvent event) {
        ventanaDocs();
    }

    @FXML
    private void click_nota_inventarios(ActionEvent event) {
        ventanaDocs();
    }

    @FXML
    private void click_abrir_cajon(ActionEvent event) {
        abrir.AbrirCajonMonedero(null, "si");
    }

    @FXML
    private void click_busqueda_precios(ActionEvent event) {
        abrir.AbrirBusquedaPrecos(null, "si");
    }

    @FXML
    private void click_factura_de_venta_pdv(ActionEvent event) {
        AbrirSicPuntoVenta("");
    }

    @FXML
    private void click_toma_pedidos_cotizaciones_pdv(ActionEvent event) {
        AbrirSicPuntoVenta("PP1");
    }

    @FXML
    private void click_cotizacion_a_cliente(ActionEvent event) {
        abrirCotizacionACliente();

    }

    public void abrirCotizacionACliente() {
        try {
            FXMLLoader cotizacion = new FXMLLoader(getClass().getResource("/vista/documentos/otros_area_ventas/cotizacion_a_cliente.fxml"));

            Parent root = cotizacion.load();

            Cotizacion_a_clienteController controlador = cotizacion.getController();

            String titulo = "Documentos";

            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.initModality(Modality.WINDOW_MODAL);
            stage.setTitle(titulo);
            scene.setOnKeyPressed(event -> {
                if (event.getCode().toString().equals("ESCAPE")) {
                    stage.close();
                }
            });

            stage.setScene(scene);
            stage.show();

        } catch (IOException ex) {
            Logger.getLogger(PrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void click_consignacion_bancaria(ActionEvent event) {
        abrir.AbrirConsignacionBancaria(null, "si");
    }

    private void AbrirNotaDebitoCausaCtsXCobrar() {
        try {
            FXMLLoader nota_debito_causa_cts_xcobrar = new FXMLLoader(getClass().getResource("/vista/documentos/nota_debito_causa_cts_x_cobrar/nota_debito_causa_cts_x_cobrar.fxml"));

            Parent root = nota_debito_causa_cts_xcobrar.load();

            Nota_debito_causa_cts_x_cobrarController controlador = nota_debito_causa_cts_xcobrar.getController();

            String titulo = "Nota Débito Cuentas por Cobrar";

            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.initModality(Modality.WINDOW_MODAL);
            stage.setTitle(titulo);
            scene.setOnKeyPressed(event -> {
                if (event.getCode().toString().equals("ESCAPE")) {
                    stage.close();
                }
            });

            stage.setScene(scene);
            stage.show();

        } catch (IOException ex) {
            Logger.getLogger(PrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void AbrirNotaCreditoDevolVenta() {
        try {
            FXMLLoader nota_credito_devol_venta = new FXMLLoader(getClass().getResource("/vista/documentos/nota_credito_devol_venta/nota_credito_devol_venta.fxml"));

            Parent root = nota_credito_devol_venta.load();

            Nota_credito_devol_ventaController controlador = nota_credito_devol_venta.getController();

            String titulo = "Nota Crédito (Devolución en ventas)";

            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.initModality(Modality.WINDOW_MODAL);
            stage.setTitle(titulo);
            scene.setOnKeyPressed(event -> {
                if (event.getCode().toString().equals("ESCAPE")) {
                    stage.close();
                }
            });

            stage.setScene(scene);
            stage.show();

        } catch (IOException ex) {
            Logger.getLogger(PrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void AbrirNotaCreditoCuentasXPagar() {
        try {
            FXMLLoader nota_credito_cuentas_x_venta = new FXMLLoader(getClass().getResource("/vista/documentos/nota_credito_cuentas_x_pagar/nota_credito_cuentas_x_pagar.fxml"));

            Parent root = nota_credito_cuentas_x_venta.load();

            Nota_credito_cuentas_x_pagarController controlador = nota_credito_cuentas_x_venta.getController();

            String titulo = "Nota Crédito Cuentas x Pagar";

            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.initModality(Modality.WINDOW_MODAL);
            stage.setTitle(titulo);
            scene.setOnKeyPressed(event -> {
                if (event.getCode().toString().equals("ESCAPE")) {
                    stage.close();
                }
            });

            stage.setScene(scene);
            stage.show();

        } catch (IOException ex) {
            Logger.getLogger(PrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void AbrirNotaDebitoDevolCompra() {
        try {
            FXMLLoader nota_debito_devol_compra = new FXMLLoader(getClass().getResource("/vista/documentos/nota_debito_devol_compra/nota_debito_devol_compra.fxml"));

            Parent root = nota_debito_devol_compra.load();

            Nota_debito_devol_compraController controlador = nota_debito_devol_compra.getController();

            String titulo = "Nota débito (devol.compra)";

            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.initModality(Modality.WINDOW_MODAL);
            stage.setTitle(titulo);
            scene.setOnKeyPressed(event -> {
                if (event.getCode().toString().equals("ESCAPE")) {
                    stage.close();
                }
            });

            stage.setScene(scene);
            stage.show();

        } catch (IOException ex) {
            Logger.getLogger(PrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void AbrirOrdenServicio() {
        try {
            FXMLLoader orden_servicio = new FXMLLoader(getClass().getResource("/vista/documentos/orden_servicio/orden_servicio.fxml"));

            Parent root = orden_servicio.load();

            Orden_servicioController controlador = orden_servicio.getController();

            String titulo = "Orden de Servicio";

            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.initModality(Modality.WINDOW_MODAL);
            stage.setTitle(titulo);
            scene.setOnKeyPressed(event -> {
                if (event.getCode().toString().equals("ESCAPE")) {
                    stage.close();
                }
            });

            stage.setScene(scene);
            stage.show();

        } catch (IOException ex) {
            Logger.getLogger(PrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void AbrirSalidaInventario() {
        try {
            FXMLLoader salida_inventarios = new FXMLLoader(getClass().getResource("/vista/documentos/docs_inventarios/salida_inventarios.fxml"));

            Parent root = salida_inventarios.load();

            Salida_inventariosController controlador = salida_inventarios.getController();

            String titulo = "Salida de Inventario";

            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.initModality(Modality.WINDOW_MODAL);
            stage.setTitle(titulo);
            scene.setOnKeyPressed(event -> {
                if (event.getCode().toString().equals("ESCAPE")) {
                    stage.close();
                }
            });

            stage.setScene(scene);
            stage.show();

        } catch (IOException ex) {
            Logger.getLogger(PrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void AbrirTransladoEntreBodegas() {
        try {
            FXMLLoader translado_bodegas = new FXMLLoader(getClass().getResource("/vista/documentos/docs_inventarios/translado_entre_bodegas.fxml"));

            Parent root = translado_bodegas.load();

            Translado_entre_bodegasController controlador = translado_bodegas.getController();

            String titulo = "Translados entre Bodegas";

            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.initModality(Modality.WINDOW_MODAL);
            stage.setTitle(titulo);
            scene.setOnKeyPressed(event -> {
                if (event.getCode().toString().equals("ESCAPE")) {
                    stage.close();
                }
            });

            stage.setScene(scene);
            stage.show();

        } catch (IOException ex) {
            Logger.getLogger(PrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void AbrirDocumentosNomina() {
        try {
            FXMLLoader docs_nomina = new FXMLLoader(getClass().getResource("/vista/documentos/docs_nomina/docs_nomina.fxml"));

            Parent root = docs_nomina.load();

            Docs_nominaController controlador = docs_nomina.getController();

            String titulo = "Documentos de Nomina";

            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.initModality(Modality.WINDOW_MODAL);
            stage.setTitle(titulo);
            scene.setOnKeyPressed(event -> {
                if (event.getCode().toString().equals("ESCAPE")) {
                    stage.close();
                }
            });

            stage.setScene(scene);
            stage.show();

        } catch (IOException ex) {
            Logger.getLogger(PrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void AbrirSaldosIniciales() {
        try {
            FXMLLoader saldos_iniciales = new FXMLLoader(getClass().getResource("/vista/documentos/saldos_iniciales/saldos_iniciales.fxml"));

            Parent root = saldos_iniciales.load();

            Saldos_inicialesController controlador = saldos_iniciales.getController();

            String titulo = "Saldos Iniciales";

            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.initModality(Modality.WINDOW_MODAL);
            stage.setTitle(titulo);
            scene.setOnKeyPressed(event -> {
                if (event.getCode().toString().equals("ESCAPE")) {
                    stage.close();
                }
            });

            stage.setScene(scene);
            stage.show();

        } catch (IOException ex) {
            Logger.getLogger(PrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void AbrirArchivosInventario() {
        try {
            FXMLLoader archivos_inventario = new FXMLLoader(getClass().getResource("/vista/vistas_maestros/archivos_inventario/archivos_inventario.fxml"));

            Parent root = archivos_inventario.load();

            Archivos_inventarioController controlador = archivos_inventario.getController();

            String titulo = "Archivos de Inventario";

            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.initModality(Modality.WINDOW_MODAL);
            stage.setTitle(titulo);
            scene.setOnKeyPressed(event -> {
                if (event.getCode().toString().equals("ESCAPE")) {
                    stage.close();
                }
            });

            stage.setScene(scene);
            stage.show();

        } catch (IOException ex) {
            Logger.getLogger(PrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void AbrirProductos() {
        try {
            FXMLLoader productos = new FXMLLoader(getClass().getResource("/vista/vistas_maestros/productos/productos.fxml"));

            Parent root = productos.load();

            ProductosController controlador = productos.getController();

            String titulo = "Productos";

            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.initModality(Modality.WINDOW_MODAL);
            stage.setTitle(titulo);
            scene.setOnKeyPressed(event -> {
                if (event.getCode().toString().equals("ESCAPE")) {
                    stage.close();
                }
            });

            stage.setScene(scene);
            stage.show();

        } catch (IOException ex) {
            Logger.getLogger(PrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void AbrirServicios() {
        try {
            FXMLLoader servicios = new FXMLLoader(getClass().getResource("/vista/vistas_maestros/servicios/servicios.fxml"));

            Parent root = servicios.load();

            ServiciosController controlador = servicios.getController();

            String titulo = "Servicios";

            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.initModality(Modality.WINDOW_MODAL);
            stage.setTitle(titulo);
            scene.setOnKeyPressed(event -> {
                if (event.getCode().toString().equals("ESCAPE")) {
                    stage.close();
                }
            });

            stage.setScene(scene);
            stage.show();

        } catch (IOException ex) {
            Logger.getLogger(PrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void AbrirConstantes() {
        try {
            FXMLLoader constantes = new FXMLLoader(getClass().getResource("/vista/vistas_maestros/configuracion_lotes/constantes.fxml"));

            Parent root = constantes.load();

            ConstantesController controlador = constantes.getController();

            String titulo = "Servicios";

            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.initModality(Modality.WINDOW_MODAL);
            stage.setTitle(titulo);
            scene.setOnKeyPressed(event -> {
                if (event.getCode().toString().equals("ESCAPE")) {
                    stage.close();
                }
            });

            stage.setScene(scene);
            stage.show();

        } catch (IOException ex) {
            Logger.getLogger(PrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void AbrirNovedades() {
        try {
            FXMLLoader novedades = new FXMLLoader(getClass().getResource("/vista/vistas_maestros/configuracion_lotes/novedades.fxml"));

            Parent root = novedades.load();

            NovedadesController controlador = novedades.getController();

            String titulo = "Novedades en la Facturación en Lote";

            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.initModality(Modality.WINDOW_MODAL);
            stage.setTitle(titulo);
            scene.setOnKeyPressed(event -> {
                if (event.getCode().toString().equals("ESCAPE")) {
                    stage.close();
                }
            });

            stage.setScene(scene);
            stage.show();

        } catch (IOException ex) {
            Logger.getLogger(PrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void AbrirConstantes_Generales() {
        try {
            FXMLLoader generales = new FXMLLoader(getClass().getResource("/vista/vistas_maestros/configuracion_lotes/constantes_generales.fxml"));

            Parent root = generales.load();

            Constantes_generalesController controlador = generales.getController();

            String titulo = "Aplicar Constantes a Facturación en Lote";

            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.initModality(Modality.WINDOW_MODAL);
            stage.setTitle(titulo);
            scene.setOnKeyPressed(event -> {
                if (event.getCode().toString().equals("ESCAPE")) {
                    stage.close();
                }
            });

            stage.setScene(scene);
            stage.show();

        } catch (IOException ex) {
            Logger.getLogger(PrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void AbrirModosDePago() {
        try {
            FXMLLoader modosdepago = new FXMLLoader(getClass().getResource("/vista/vistas_maestros/modos_de_pago.fxml"));

            Parent root = modosdepago.load();

            Modos_de_pagoController controlador = modosdepago.getController();

            String titulo = "Modos de Pago";

            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.initModality(Modality.WINDOW_MODAL);
            stage.setTitle(titulo);
            scene.setOnKeyPressed(event -> {
                if (event.getCode().toString().equals("ESCAPE")) {
                    stage.close();
                }
            });

            stage.setScene(scene);
            stage.show();

        } catch (IOException ex) {
            Logger.getLogger(PrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void AbrirOperacionesFrecuentes() {
        try {
            FXMLLoader operaciones_frecuentes = new FXMLLoader(getClass().getResource("/vista/vistas_maestros/operaciones_frecuentes.fxml"));

            Parent root = operaciones_frecuentes.load();

            Operaciones_frecuentesController controlador = operaciones_frecuentes.getController();

            String titulo = "Configurar Operaciones Frecuentes";

            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.initModality(Modality.WINDOW_MODAL);
            stage.setTitle(titulo);
            scene.setOnKeyPressed(event -> {
                if (event.getCode().toString().equals("ESCAPE")) {
                    stage.close();
                }
            });

            stage.setScene(scene);
            stage.show();

        } catch (IOException ex) {
            Logger.getLogger(PrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void AbrirImpuestoSobreVentas() {
        try {
            FXMLLoader impuestro_sobre_ventas = new FXMLLoader(getClass().getResource("/vista/vistas_maestros/impuestro_sobre_ventas.fxml"));

            Parent root = impuestro_sobre_ventas.load();

            Impuestro_sobre_ventasController controlador = impuestro_sobre_ventas.getController();

            String titulo = "Tabla de Impuesto sobre las Ventas";

            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.initModality(Modality.WINDOW_MODAL);
            stage.setTitle(titulo);
            scene.setOnKeyPressed(event -> {
                if (event.getCode().toString().equals("ESCAPE")) {
                    stage.close();
                }
            });

            stage.setScene(scene);
            stage.show();

        } catch (IOException ex) {
            Logger.getLogger(PrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void AbrirImpuestoIndustriaYComercio() {
        try {
            FXMLLoader impuesto_industria_y_comercio = new FXMLLoader(getClass().getResource("/vista/vistas_maestros/impuesto_industria_y_comercio.fxml"));

            Parent root = impuesto_industria_y_comercio.load();

            Impuesto_industria_y_comercioController controlador = impuesto_industria_y_comercio.getController();

            String titulo = "Tabla de Impuesto de Industria y Comercio";

            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.initModality(Modality.WINDOW_MODAL);
            stage.setTitle(titulo);
            scene.setOnKeyPressed(event -> {
                if (event.getCode().toString().equals("ESCAPE")) {
                    stage.close();
                }
            });

            stage.setScene(scene);
            stage.show();

        } catch (IOException ex) {
            Logger.getLogger(PrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void AbrirTablasNomina() {
        try {
            FXMLLoader tablas_nomina = new FXMLLoader(getClass().getResource("/vista/vistas_maestros/tablas_nomina/tablas_nomina.fxml"));

            Parent root = tablas_nomina.load();

            Tablas_nominaController controlador = tablas_nomina.getController();

            String titulo = "Tablas de Nómina";

            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.initModality(Modality.WINDOW_MODAL);
            stage.setTitle(titulo);
            scene.setOnKeyPressed(event -> {
                if (event.getCode().toString().equals("ESCAPE")) {
                    stage.close();
                }
            });

            stage.setScene(scene);
            stage.show();

        } catch (IOException ex) {
            Logger.getLogger(PrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void AbrirReconstruirMovimientos() {
        try {
            FXMLLoader reconstruir_movimientos = new FXMLLoader(getClass().getResource("/vista/procesos/reconstruir_movimientos.fxml"));

            Parent root = reconstruir_movimientos.load();

            Reconstruir_movimientosController controlador = reconstruir_movimientos.getController();

            String titulo = "Actualizar Saldos";

            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.initModality(Modality.WINDOW_MODAL);
            stage.setTitle(titulo);
            scene.setOnKeyPressed(event -> {
                if (event.getCode().toString().equals("ESCAPE")) {
                    stage.close();
                }
            });

            stage.setScene(scene);
            stage.show();

        } catch (IOException ex) {
            Logger.getLogger(PrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void AbrirClasificacionCarteraComercial() {
        try {
            FXMLLoader clasificacion_cartera_comercial = new FXMLLoader(getClass().getResource("/vista/procesos/procesos_cartera/clasificacion_cartera_comercial.fxml"));

            Parent root = clasificacion_cartera_comercial.load();

            Clasificacion_cartera_comercialController controlador = clasificacion_cartera_comercial.getController();

            String titulo = "";

            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.initModality(Modality.WINDOW_MODAL);
            stage.setTitle(titulo);
            scene.setOnKeyPressed(event -> {
                if (event.getCode().toString().equals("ESCAPE")) {
                    stage.close();
                }
            });

            stage.setScene(scene);
            stage.show();

        } catch (IOException ex) {
            Logger.getLogger(PrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
  
    private void AbrirDefinirCuentasCategorias() {
        try {
            FXMLLoader definir_cuentas_categorias = new FXMLLoader(getClass().getResource("/vista/procesos/procesos_cartera/definir_cuentas_categorias.fxml"));

            Parent root = definir_cuentas_categorias.load();

            Definir_cuentas_categoriasController controlador = definir_cuentas_categorias.getController();

            String titulo = "Clasificación de cartera comercial";

            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.initModality(Modality.WINDOW_MODAL);
            stage.setTitle(titulo);
            scene.setOnKeyPressed(event -> {
                if (event.getCode().toString().equals("ESCAPE")) {
                    stage.close();
                }
            });

            stage.setScene(scene);
            stage.show();

        } catch (IOException ex) {
            Logger.getLogger(PrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void AbrirCruceCarteraClieConAnticipos() {
        try {
            FXMLLoader cruce_cartera_clie_con_anticipos = new FXMLLoader(getClass().getResource("/vista/procesos/procesos_cartera/cruce_cartera_clie_con_anticipos.fxml"));

            Parent root = cruce_cartera_clie_con_anticipos.load();

            Cruce_cartera_clie_con_anticiposController controlador = cruce_cartera_clie_con_anticipos.getController();

            String titulo = "Cruce de Cartera";

            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.initModality(Modality.WINDOW_MODAL);
            stage.setTitle(titulo);
            scene.setOnKeyPressed(event -> {
                if (event.getCode().toString().equals("ESCAPE")) {
                    stage.close();
                }
            });

            stage.setScene(scene);
            stage.show();

        } catch (IOException ex) {
            Logger.getLogger(PrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    // causacion_interes_deudores
    
    private void AbrirCausacionInteresesDeudores() {
        try {
            FXMLLoader causacion_interes_deudores = new FXMLLoader(getClass().getResource("/vista/procesos/procesos_cartera/causacion_interes_deudores.fxml"));

            Parent root = causacion_interes_deudores.load();

            Causacion_interes_deudoresController controlador = causacion_interes_deudores.getController();

            String titulo = "Causación de intereses en cuentas por cobrar";

            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.initModality(Modality.WINDOW_MODAL);
            stage.setTitle(titulo);
            scene.setOnKeyPressed(event -> {
                if (event.getCode().toString().equals("ESCAPE")) {
                    stage.close();
                }
            });

            stage.setScene(scene);
            stage.show();

        } catch (IOException ex) {
            Logger.getLogger(PrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void AbrirPlanillaTransportadores() {
        try {
            FXMLLoader planilla_transportadores = new FXMLLoader(getClass().getResource("/vista/procesos/procesos_ventas/planilla_transportadores.fxml"));

            Parent root = planilla_transportadores.load();

            Planilla_transportadoresController controlador = planilla_transportadores.getController();

            String titulo = "Planillas de entrega de mercancia";

            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.initModality(Modality.WINDOW_MODAL);
            stage.setTitle(titulo);
            scene.setOnKeyPressed(event -> {
                if (event.getCode().toString().equals("ESCAPE")) {
                    stage.close();
                }
            });

            stage.setScene(scene);
            stage.show();

        } catch (IOException ex) {
            Logger.getLogger(PrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
//    
    private void AbrirCierreLapsoVentas() {
        try {
            FXMLLoader cierre_lapso_venta = new FXMLLoader(getClass().getResource("/vista/procesos/procesos_ventas/cierre_lapso_venta.fxml"));

            Parent root = cierre_lapso_venta.load();

            Cierre_lapso_ventaController controlador = cierre_lapso_venta.getController();

            String titulo = "Cierre Lapso de Ventas";

            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.initModality(Modality.WINDOW_MODAL);
            stage.setTitle(titulo);
            scene.setOnKeyPressed(event -> {
                if (event.getCode().toString().equals("ESCAPE")) {
                    stage.close();
                }
            });

            stage.setScene(scene);
            stage.show();

        } catch (IOException ex) {
            Logger.getLogger(PrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void AbrirFacturaSalosBodega() {
        try {
            FXMLLoader factura_saldos_bodegas = new FXMLLoader(getClass().getResource("/vista/procesos/procesos_ventas/factura_saldos_bodegas.fxml"));

            Parent root = factura_saldos_bodegas.load();

            Factura_saldos_bodegasController controlador = factura_saldos_bodegas.getController();

            String titulo = "Facturar Saldos de Bodega";

            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.initModality(Modality.WINDOW_MODAL);
            stage.setTitle(titulo);
            scene.setOnKeyPressed(event -> {
                if (event.getCode().toString().equals("ESCAPE")) {
                    stage.close();
                }
            });

            stage.setScene(scene);
            stage.show();

        } catch (IOException ex) {
            Logger.getLogger(PrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   
    private void AbrirConsilacionBancaria() {
        try {
            FXMLLoader reailzar_consilacion_bancaria = new FXMLLoader(getClass().getResource("/vista/procesos/procesos_contables/reailzar_consilacion_bancaria.fxml"));

            Parent root = reailzar_consilacion_bancaria.load();

            Reailzar_consilacion_bancariaController controlador = reailzar_consilacion_bancaria.getController();

            String titulo = "Concilaciones Bancarias";

            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.initModality(Modality.WINDOW_MODAL);
            stage.setTitle(titulo);
            scene.setOnKeyPressed(event -> {
                if (event.getCode().toString().equals("ESCAPE")) {
                    stage.close();
                }
            });

            stage.setScene(scene);
            stage.show();

        } catch (IOException ex) {
            Logger.getLogger(PrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        
    private void AbrirFacturacionCobrosLotes() {
        try {
            FXMLLoader facturacion_cobros_lote = new FXMLLoader(getClass().getResource("/vista/procesos/procesos_ventas/facturacion_cobros_lote.fxml"));

            Parent root = facturacion_cobros_lote.load();

            Facturacion_cobros_loteController controlador = facturacion_cobros_lote.getController();

            String titulo = "Generación de Facturación (Cobros en Lote)";

            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.initModality(Modality.WINDOW_MODAL);
            stage.setTitle(titulo);
            scene.setOnKeyPressed(event -> {
                if (event.getCode().toString().equals("ESCAPE")) {
                    stage.close();
                }
            });

            stage.setScene(scene);
            stage.show();

        } catch (IOException ex) {
            Logger.getLogger(PrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void AbrirConsolidarEmpresas() {
        try {
            FXMLLoader consolidar_empresas = new FXMLLoader(getClass().getResource("/vista/procesos/procesos_contables/consolidar_empresas.fxml"));

            Parent root = consolidar_empresas.load();

            Consolidar_empresasController controlador = consolidar_empresas.getController();

            String titulo = "Consolidar empresas";

            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.initModality(Modality.WINDOW_MODAL);
            stage.setTitle(titulo);
            scene.setOnKeyPressed(event -> {
                if (event.getCode().toString().equals("ESCAPE")) {
                    stage.close();
                }
            });

            stage.setScene(scene);
            stage.show();

        } catch (IOException ex) {
            Logger.getLogger(PrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void AbrirCorteFisico() {
        try {
            FXMLLoader corte_fisico = new FXMLLoader(getClass().getResource("/vista/procesos/procesos_contables/corte_fisico.fxml"));

            Parent root = corte_fisico.load();

            Corte_fisicoController controlador = corte_fisico.getController();

            String titulo = "Corte de Movimiento";

            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.initModality(Modality.WINDOW_MODAL);
            stage.setTitle(titulo);
            scene.setOnKeyPressed(event -> {
                if (event.getCode().toString().equals("ESCAPE")) {
                    stage.close();
                }
            });

            stage.setScene(scene);
            stage.show();

        } catch (IOException ex) {
            Logger.getLogger(PrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void AbrirReclasificacionSaldos() {
        try {
            FXMLLoader reclasificacion_saldos = new FXMLLoader(getClass().getResource("/vista/procesos/procesos_contables/reclasificacion_saldos.fxml"));

            Parent root = reclasificacion_saldos.load();

            Reclasificacion_saldosController controlador = reclasificacion_saldos.getController();

            String titulo = "Reclasificación de saldos por Cuentas/Terceros";

            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.initModality(Modality.WINDOW_MODAL);
            stage.setTitle(titulo);
            scene.setOnKeyPressed(event -> {
                if (event.getCode().toString().equals("ESCAPE")) {
                    stage.close();
                }
            });

            stage.setScene(scene);
            stage.show();

        } catch (IOException ex) {
            Logger.getLogger(PrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void AbrirLiquidacionTercero() {
        try {
            FXMLLoader liquidacion_terceros = new FXMLLoader(getClass().getResource("/vista/procesos/procesos_contables/liquidacion_terceros.fxml"));

            Parent root = liquidacion_terceros.load();

            Liquidacion_tercerosController controlador = liquidacion_terceros.getController();

            String titulo = "Liquidacion de Terceros";

            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.initModality(Modality.WINDOW_MODAL);
            stage.setTitle(titulo);
            scene.setOnKeyPressed(event -> {
                if (event.getCode().toString().equals("ESCAPE")) {
                    stage.close();
                }
            });

            stage.setScene(scene);
            stage.show();

        } catch (IOException ex) {
            Logger.getLogger(PrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void AbrirProcesarDepreciacion() {
        try {
            FXMLLoader procesar_depreciacion = new FXMLLoader(getClass().getResource("/vista/procesos/procesos_contables/procesar_depreciacion.fxml"));

            Parent root = procesar_depreciacion.load();

            Procesar_depreciacionController controlador = procesar_depreciacion.getController();

            String titulo = "Depreciación";

            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.initModality(Modality.WINDOW_MODAL);
            stage.setTitle(titulo);
            scene.setOnKeyPressed(event -> {
                if (event.getCode().toString().equals("ESCAPE")) {
                    stage.close();
                }
            });

            stage.setScene(scene);
            stage.show();

        } catch (IOException ex) {
            Logger.getLogger(PrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }
    } 

    private void AbrirNivelacionCostos() {
        try {
            FXMLLoader nivelacion_de_costos = new FXMLLoader(getClass().getResource("/vista/procesos/procesos_inventario/nivelacion_de_costos.fxml"));

            Parent root = nivelacion_de_costos.load();

            Nivelacion_de_costosController controlador = nivelacion_de_costos.getController();

            String titulo = "Nivelación de costos";

            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.initModality(Modality.WINDOW_MODAL);
            stage.setTitle(titulo);
            scene.setOnKeyPressed(event -> {
                if (event.getCode().toString().equals("ESCAPE")) {
                    stage.close();
                }
            });

            stage.setScene(scene);
            stage.show();

        } catch (IOException ex) {
            Logger.getLogger(PrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }
    } 

    private void AbrirMantoLotesProductos() {
        try {
            FXMLLoader manto_lotes_productos = new FXMLLoader(getClass().getResource("/vista/procesos/procesos_inventario/manto_lotes_productos.fxml"));

            Parent root = manto_lotes_productos.load();

            Manto_lotes_productosController controlador = manto_lotes_productos.getController();

            String titulo = "Lotes de Productos";

            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.initModality(Modality.WINDOW_MODAL);
            stage.setTitle(titulo);
            scene.setOnKeyPressed(event -> {
                if (event.getCode().toString().equals("ESCAPE")) {
                    stage.close();
                }
            });

            stage.setScene(scene);
            stage.show();

        } catch (IOException ex) {
            Logger.getLogger(PrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }
    } 
    private void AbrirPedidosAProveedores() {
        try {
            FXMLLoader pedidos_a_proveedores = new FXMLLoader(getClass().getResource("/vista/procesos/procesos_inventario/pedidos_a_proveedores.fxml"));

            Parent root = pedidos_a_proveedores.load();

            Pedidos_a_proveedoresController controlador = pedidos_a_proveedores.getController();

            String titulo = "Pedidos a Proveedores";

            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.initModality(Modality.WINDOW_MODAL);
            stage.setTitle(titulo);
            scene.setOnKeyPressed(event -> {
                if (event.getCode().toString().equals("ESCAPE")) {
                    stage.close();
                }
            });

            stage.setScene(scene);
            stage.show();

        } catch (IOException ex) {
            Logger.getLogger(PrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }
    } 
    //
    private void AbrirCancelacionInventarios() {
        try {
            FXMLLoader cancelacion_inventarios = new FXMLLoader(getClass().getResource("/vista/procesos/procesos_inventario/cancelacion_inventarios.fxml"));

            Parent root = cancelacion_inventarios.load();

            Cancelacion_inventariosController controlador = cancelacion_inventarios.getController();

            String titulo = "Cancelación de Inventarios";

            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.initModality(Modality.WINDOW_MODAL);
            stage.setTitle(titulo);
            scene.setOnKeyPressed(event -> {
                if (event.getCode().toString().equals("ESCAPE")) {
                    stage.close();
                }
            });

            stage.setScene(scene);
            stage.show();

        } catch (IOException ex) {
            Logger.getLogger(PrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }
    } 
    
    // 
    private void AbrirInventariosFisicos() {
        try {
            FXMLLoader inventarios_fisicos = new FXMLLoader(getClass().getResource("/vista/procesos/procesos_inventario/inventarios_fisicos.fxml"));

            Parent root = inventarios_fisicos.load();

            Inventarios_fisicosController controlador = inventarios_fisicos.getController();

            String titulo = "Inventarios Fisicos";

            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.initModality(Modality.WINDOW_MODAL);
            stage.setTitle(titulo);
            scene.setOnKeyPressed(event -> {
                if (event.getCode().toString().equals("ESCAPE")) {
                    stage.close();
                }
            });

            stage.setScene(scene);
            stage.show();

        } catch (IOException ex) {
            Logger.getLogger(PrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }
    } 
    // 
    private void AbrirConversionInsumos() {
        try {
            FXMLLoader conversion_insumos = new FXMLLoader(getClass().getResource("/vista/procesos/procesos_inventario/conversion_insumos.fxml"));

            Parent root = conversion_insumos.load();

            Conversion_insumosController controlador = conversion_insumos.getController();

            String titulo = "Conversión insumos en productos";

            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.initModality(Modality.WINDOW_MODAL);
            stage.setTitle(titulo);
            scene.setOnKeyPressed(event -> {
                if (event.getCode().toString().equals("ESCAPE")) {
                    stage.close();
                }
            });

            stage.setScene(scene);
            stage.show();

        } catch (IOException ex) {
            Logger.getLogger(PrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }
    } 
    //
    private void AbrirProcesarCostosVentas() {
        try {
            FXMLLoader procesar_costos_ventas = new FXMLLoader(getClass().getResource("/vista/procesos/procesos_inventario/procesar_costos_ventas.fxml"));

            Parent root = procesar_costos_ventas.load();

            Procesar_costos_ventasController controlador = procesar_costos_ventas.getController();

            String titulo = "Procesar Costos de Ventas";

            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.initModality(Modality.WINDOW_MODAL);
            stage.setTitle(titulo);
            scene.setOnKeyPressed(event -> {
                if (event.getCode().toString().equals("ESCAPE")) {
                    stage.close();
                }
            });

            stage.setScene(scene);
            stage.show();

        } catch (IOException ex) {
            Logger.getLogger(PrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }
    } 
    @FXML
    private void click_nota_debito_causa_cts_x_cobrar(ActionEvent event) {
        AbrirNotaDebitoCausaCtsXCobrar();
    }

    @FXML
    private void click_nota_credito_devol_venta(ActionEvent event) {
        AbrirNotaCreditoDevolVenta();
    }

    @FXML
    private void click_nota_credito_cuentas_x_pagar(ActionEvent event) {
        AbrirNotaCreditoCuentasXPagar();
    }

    @FXML
    private void click_nota_debito_devol_compra(ActionEvent event) {
        AbrirNotaDebitoDevolCompra();
    }

    @FXML
    private void click_orden_servicio(ActionEvent event) {
        AbrirOrdenServicio();
    }

    @FXML
    private void click_salida_inventario(ActionEvent event) {
        AbrirSalidaInventario();
    }

    @FXML
    private void click_translado_bodegas(ActionEvent event) {
        AbrirTransladoEntreBodegas();
    }

    @FXML
    private void click_documentos_nomina(ActionEvent event) {
        AbrirDocumentosNomina();
    }

    @FXML
    private void click_documentos_iniciales(ActionEvent event) {
        AbrirSaldosIniciales();
    }

    @FXML
    private void click_archivos_inventarios(ActionEvent event) {
        AbrirArchivosInventario();
    }

    @FXML
    private void click_productos(ActionEvent event) {
        AbrirProductos();
    }

    @FXML
    private void click_servicios(ActionEvent event) {
        AbrirServicios();
    }

    @FXML
    private void click_constantes(ActionEvent event) {
        AbrirConstantes();
    }

    @FXML
    private void click_novedades(ActionEvent event) {
        AbrirNovedades();
    }

    @FXML
    private void click_constantes_generales(ActionEvent event) {
        AbrirConstantes_Generales();
    }

    @FXML
    private void click_modo_pagos(ActionEvent event) {
        AbrirModosDePago();
    }

    @FXML
    private void click_operaciones_frecuentes(ActionEvent event) {
        AbrirOperacionesFrecuentes();
    }

    @FXML
    private void click_impuestro_sobre_ventas(ActionEvent event) {
        AbrirImpuestoSobreVentas();
    }

    @FXML
    private void click_impuesto_industria_y_comercio(ActionEvent event) {
        AbrirImpuestoIndustriaYComercio();
    }

    @FXML
    private void click_tablas_nomina(ActionEvent event) {
        AbrirTablasNomina();
    }

    @FXML
    private void click_reconstruir_movimientos(ActionEvent event) {
        AbrirReconstruirMovimientos();
    }

    @FXML
    private void click_clasificacion_cartera_comercial(ActionEvent event) {
        AbrirClasificacionCarteraComercial();
    }

    @FXML
    private void click_definir_cuentas_categorias(ActionEvent event) {
        AbrirDefinirCuentasCategorias();
    }

    @FXML
    private void click_cruce_cartera_clie_con_anticipos(ActionEvent event) {
        AbrirCruceCarteraClieConAnticipos();
    }

    @FXML
    private void click_causacion_interes_deudores(ActionEvent event) {
        AbrirCausacionInteresesDeudores();
    }

    @FXML
    private void click_planilla_transportadores(ActionEvent event) {
        AbrirPlanillaTransportadores();
    }

    @FXML
    private void click_cierre_lapso_venta(ActionEvent event) {
        AbrirCierreLapsoVentas();
    }

    @FXML
    private void click_abrir_factura_saldos_bodega(ActionEvent event) {
        AbrirFacturaSalosBodega();
    }

    @FXML
    private void click_facturacion_cobro_lotes(ActionEvent event) {
        AbrirFacturacionCobrosLotes();
    }

    @FXML
    private void click_consolidar_empresas(ActionEvent event) {
        AbrirConsolidarEmpresas();
    }

    @FXML
    private void click_corte_fisico(ActionEvent event) {
        AbrirCorteFisico();
    }

    @FXML
    private void click_concilacion_bancaria(ActionEvent event) {
        AbrirConsilacionBancaria();
    }

    @FXML
    private void click_reclasificacion_saldos(ActionEvent event) {
        AbrirReclasificacionSaldos();
    }

    @FXML
    private void click_liquidacion_terceros(ActionEvent event) {
        AbrirLiquidacionTercero();
    }

    @FXML
    private void click_procesar_depreciacion(ActionEvent event) {
        AbrirProcesarDepreciacion();
    }

    @FXML
    private void click_nivelacion_de_costos(ActionEvent event) {
        AbrirNivelacionCostos();
    }

    @FXML
    private void click_manto_lotes_productos(ActionEvent event) {
        AbrirMantoLotesProductos();
    }

    @FXML
    private void click_pedidos_a_proveedores(ActionEvent event) {
        AbrirPedidosAProveedores();
    }

    @FXML
    private void click_cancelacion_inventarios(ActionEvent event) {
        AbrirCancelacionInventarios();
    }

    @FXML
    private void click_inventarios_fisicos(ActionEvent event) {
        AbrirInventariosFisicos();
    }

    @FXML
    private void click_conversion_insumos(ActionEvent event) {
        AbrirConversionInsumos();
    }

    @FXML
    private void click_procesar_costos_ventas(ActionEvent event) {
        AbrirProcesarCostosVentas();
    }
    private void AbrirInformesdeNomina() {
        try {
            FXMLLoader informes_de_nomina = new FXMLLoader(getClass().getResource("/vista/informes/informes_de_nomina.fxml"));

            Parent root = informes_de_nomina.load();

            Informes_de_nominaController controlador = informes_de_nomina.getController();

            String titulo = "Informes de Nómina";

            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.initModality(Modality.WINDOW_MODAL);
            stage.setTitle(titulo);
            scene.setOnKeyPressed(event -> {
                if (event.getCode().toString().equals("ESCAPE")) {
                    stage.close();
                }
            });

            stage.setScene(scene);
            stage.show();

        } catch (IOException ex) {
            Logger.getLogger(PrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }
    } 
    
    //
    private void AbrirMovimientoRef1() {
        try {
            FXMLLoader movimiento_ref1 = new FXMLLoader(getClass().getResource("/vista/informes/contables_financieros/movimiento_ref1.fxml"));

            Parent root = movimiento_ref1.load();

            Movimiento_ref1Controller controlador = movimiento_ref1.getController();

            String titulo = "Informe Movimiento Contable";

            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.initModality(Modality.WINDOW_MODAL);
            stage.setTitle(titulo);
            scene.setOnKeyPressed(event -> {
                if (event.getCode().toString().equals("ESCAPE")) {
                    stage.close();
                }
            });

            stage.setScene(scene);
            stage.show();

        } catch (IOException ex) {
            Logger.getLogger(PrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }
    } 
    //
    private void AbrirResumenDocumentos() {
        try {
            FXMLLoader resumen_documentos = new FXMLLoader(getClass().getResource("/vista/informes/contables_financieros/resumen_documentos.fxml"));

            Parent root = resumen_documentos.load();

            Resumen_documentosController controlador = resumen_documentos.getController();

            String titulo = "Resumen de Documentos";

            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.initModality(Modality.WINDOW_MODAL);
            stage.setTitle(titulo);
            scene.setOnKeyPressed(event -> {
                if (event.getCode().toString().equals("ESCAPE")) {
                    stage.close();
                }
            });

            stage.setScene(scene);
            stage.show();

        } catch (IOException ex) {
            Logger.getLogger(PrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }
    } 
    //
    private void AbrirListadoDocumentos() {
        try {
            FXMLLoader listado_documento = new FXMLLoader(getClass().getResource("/vista/informes/contables_financieros/listado_documento.fxml"));

            Parent root = listado_documento.load();

            Listado_documentoController controlador = listado_documento.getController();

            String titulo = "Listar Documentos";

            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.initModality(Modality.WINDOW_MODAL);
            stage.setTitle(titulo);
            scene.setOnKeyPressed(event -> {
                if (event.getCode().toString().equals("ESCAPE")) {
                    stage.close();
                }
            });

            stage.setScene(scene);
            stage.show();

        } catch (IOException ex) {
            Logger.getLogger(PrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //
    private void AbrirSaldosCentrosCostos() {
        try {
            FXMLLoader saldos_centros_costos = new FXMLLoader(getClass().getResource("/vista/informes/contables_financieros/saldos_centros_costos.fxml"));

            Parent root = saldos_centros_costos.load();

            Saldos_centros_costosController controlador = saldos_centros_costos.getController();

            String titulo = "Saldos de Centros de Costo";

            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.initModality(Modality.WINDOW_MODAL);
            stage.setTitle(titulo);
            scene.setOnKeyPressed(event -> {
                if (event.getCode().toString().equals("ESCAPE")) {
                    stage.close();
                }
            });

            stage.setScene(scene);
            stage.show();

        } catch (IOException ex) {
            Logger.getLogger(PrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //
    private void AbrirSaldosTerceros() {
        try {
            FXMLLoader saldos_terceros = new FXMLLoader(getClass().getResource("/vista/informes/contables_financieros/saldos_terceros.fxml"));

            Parent root = saldos_terceros.load();

            Saldos_tercerosController controlador = saldos_terceros.getController();

            String titulo = "Saldos Terceros";

            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.initModality(Modality.WINDOW_MODAL);
            stage.setTitle(titulo);
            scene.setOnKeyPressed(event -> {
                if (event.getCode().toString().equals("ESCAPE")) {
                    stage.close();
                }
            });

            stage.setScene(scene);
            stage.show();

        } catch (IOException ex) {
            Logger.getLogger(PrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    // 
    private void AbririAnalisisGrafico() {
        try {
            FXMLLoader analisis_grafico = new FXMLLoader(getClass().getResource("/vista/informes/contables_financieros/analisis_grafico.fxml"));

            Parent root = analisis_grafico.load();

            Analisis_graficoController controlador = analisis_grafico.getController();

            String titulo = "Análisis Grafico de Cuenta";

            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.initModality(Modality.WINDOW_MODAL);
            stage.setTitle(titulo);
            scene.setOnKeyPressed(event -> {
                if (event.getCode().toString().equals("ESCAPE")) {
                    stage.close();
                }
            });

            stage.setScene(scene);
            stage.show();

        } catch (IOException ex) {
            Logger.getLogger(PrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //
    private void AbrirIngresosGastosPorTercero() {
        try {
            FXMLLoader ingresos_gastos_tercero = new FXMLLoader(getClass().getResource("/vista/informes/contables_financieros/ingresos_gastos_tercero.fxml"));

            Parent root = ingresos_gastos_tercero.load();

            Ingresos_gastos_terceroController controlador = ingresos_gastos_tercero.getController();

            String titulo = "Ingresos y gastos por tercero";

            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.initModality(Modality.WINDOW_MODAL);
            stage.setTitle(titulo);
            scene.setOnKeyPressed(event -> {
                if (event.getCode().toString().equals("ESCAPE")) {
                    stage.close();
                }
            });

            stage.setScene(scene);
            stage.show();

        } catch (IOException ex) {
            Logger.getLogger(PrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //
    private void AbrirResumenContable() {
        try {
            FXMLLoader resumen_contable = new FXMLLoader(getClass().getResource("/vista/informes/contables_financieros/resumen_contable.fxml"));

            Parent root = resumen_contable.load();

            Resumen_contableController controlador = resumen_contable.getController();

            String titulo = "Resumen Contable";

            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.initModality(Modality.WINDOW_MODAL);
            stage.setTitle(titulo);
            scene.setOnKeyPressed(event -> {
                if (event.getCode().toString().equals("ESCAPE")) {
                    stage.close();
                }
            });

            stage.setScene(scene);
            stage.show();

        } catch (IOException ex) {
            Logger.getLogger(PrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //resumen_x_dias
    private void AbrirResumenDias() {
        try {
            FXMLLoader resumen_x_dias = new FXMLLoader(getClass().getResource("/vista/informes/contables_financieros/resumen_x_dias.fxml"));

            Parent root = resumen_x_dias.load();

            Resumen_x_diasController controlador = resumen_x_dias.getController();

            String titulo = "Resumen Diarios";

            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.initModality(Modality.WINDOW_MODAL);
            stage.setTitle(titulo);
            scene.setOnKeyPressed(event -> {
                if (event.getCode().toString().equals("ESCAPE")) {
                    stage.close();
                }
            });

            stage.setScene(scene);
            stage.show();

        } catch (IOException ex) {
            Logger.getLogger(PrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //comprobante_diario
    private void AbrirComprobanteDiario() {
        try {
            FXMLLoader comprobante_diario = new FXMLLoader(getClass().getResource("/vista/informes/contables_financieros/comprobante_diario.fxml"));

            Parent root = comprobante_diario.load();

            Comprobante_diarioController controlador = comprobante_diario.getController();

            String titulo = "Comprobande de Diario";

            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.initModality(Modality.WINDOW_MODAL);
            stage.setTitle(titulo);
            scene.setOnKeyPressed(event -> {
                if (event.getCode().toString().equals("ESCAPE")) {
                    stage.close();
                }
            });

            stage.setScene(scene);
            stage.show();

        } catch (IOException ex) {
            Logger.getLogger(PrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //auditoria
    private void AbrirAuditoria() {
        try {
            FXMLLoader auditoria = new FXMLLoader(getClass().getResource("/vista/informes/contables_financieros/auditoria.fxml"));

            Parent root = auditoria.load();

            AuditoriaController controlador = auditoria.getController();

            String titulo = "Informe de Auditoria";

            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.initModality(Modality.WINDOW_MODAL);
            stage.setTitle(titulo);
            scene.setOnKeyPressed(event -> {
                if (event.getCode().toString().equals("ESCAPE")) {
                    stage.close();
                }
            });

            stage.setScene(scene);
            stage.show();

        } catch (IOException ex) {
            Logger.getLogger(PrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //auxiliar_especial
    private void AbrirAuxiliarEspecial() {
        try {
            FXMLLoader auxiliar_especial = new FXMLLoader(getClass().getResource("/vista/informes/contables_financieros/auxiliar_especial.fxml"));

            Parent root = auxiliar_especial.load();

            Auxiliar_especialController controlador = auxiliar_especial.getController();

            String titulo = "Periodo";

            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.initModality(Modality.WINDOW_MODAL);
            stage.setTitle(titulo);
            scene.setOnKeyPressed(event -> {
                if (event.getCode().toString().equals("ESCAPE")) {
                    stage.close();
                }
            });

            stage.setScene(scene);
            stage.show();

        } catch (IOException ex) {
            Logger.getLogger(PrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //movimiento
    private void AbrirMovimientosInforme() {
        try {
            FXMLLoader movimiento = new FXMLLoader(getClass().getResource("/vista/informes/contables_financieros/movimiento.fxml"));

            Parent root = movimiento.load();

            MovimientoController controlador = movimiento.getController();

            String titulo = "Informe Movimiento Contable";

            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.initModality(Modality.WINDOW_MODAL);
            stage.setTitle(titulo);
            scene.setOnKeyPressed(event -> {
                if (event.getCode().toString().equals("ESCAPE")) {
                    stage.close();
                }
            });

            stage.setScene(scene);
            stage.show();

        } catch (IOException ex) {
            Logger.getLogger(PrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //auxiliares
    private void AbrirAuxiliares() {
        try {
            FXMLLoader auxiliares = new FXMLLoader(getClass().getResource("/vista/informes/contables_financieros/auxiliares.fxml"));

            Parent root = auxiliares.load();

            AuxiliaresController controlador = auxiliares.getController();

            String titulo = "Auxiliares";

            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.initModality(Modality.WINDOW_MODAL);
            stage.setTitle(titulo);
            scene.setOnKeyPressed(event -> {
                if (event.getCode().toString().equals("ESCAPE")) {
                    stage.close();
                }
            });

            stage.setScene(scene);
            stage.show();

        } catch (IOException ex) {
            Logger.getLogger(PrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //libros_oficiales
    private void AbrirLibrosOficiales() {
        try {
            FXMLLoader libros_oficiales = new FXMLLoader(getClass().getResource("/vista/informes/contables_financieros/libros_oficiales.fxml"));

            Parent root = libros_oficiales.load();

            Libros_oficialesController controlador = libros_oficiales.getController();

            String titulo = "Libros Oficiales";

            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.initModality(Modality.WINDOW_MODAL);
            stage.setTitle(titulo);
            scene.setOnKeyPressed(event -> {
                if (event.getCode().toString().equals("ESCAPE")) {
                    stage.close();
                }
            });

            stage.setScene(scene);
            stage.show();

        } catch (IOException ex) {
            Logger.getLogger(PrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //estados_financieros
    private void AbrirEstadosFinancieros() {
        try {
            FXMLLoader estados_financieros = new FXMLLoader(getClass().getResource("/vista/informes/contables_financieros/estados_financieros.fxml"));

            Parent root = estados_financieros.load();

            Estados_financierosController controlador = estados_financieros.getController();

            String titulo = "Informes Financieros";

            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.initModality(Modality.WINDOW_MODAL);
            stage.setTitle(titulo);
            scene.setOnKeyPressed(event -> {
                if (event.getCode().toString().equals("ESCAPE")) {
                    stage.close();
                }
            });

            stage.setScene(scene);
            stage.show();

        } catch (IOException ex) {
            Logger.getLogger(PrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //informes_especificos
    private void AbrirInformesEspecificos() {
        try {
            FXMLLoader informes_especificos = new FXMLLoader(getClass().getResource("/vista/informes/informes_especificos.fxml"));

            Parent root = informes_especificos.load();

            Informes_especificosController controlador = informes_especificos.getController();

            String titulo = "Informes Especiales";

            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.initModality(Modality.WINDOW_MODAL);
            stage.setTitle(titulo);
            scene.setOnKeyPressed(event -> {
                if (event.getCode().toString().equals("ESCAPE")) {
                    stage.close();
                }
            });

            stage.setScene(scene);
            stage.show();

        } catch (IOException ex) {
            Logger.getLogger(PrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //comprobante_informe_diario_fact
    private void AbrirComprobanteInformeDiarioFact() {
        try {
            FXMLLoader comprobante_informe_diario_fact = new FXMLLoader(getClass().getResource("/vista/informes/fiscales/comprobante_informe_diario_fact.fxml"));

            Parent root = comprobante_informe_diario_fact.load();

            Comprobante_informe_diario_factController controlador = comprobante_informe_diario_fact.getController();

            String titulo = "CIDXMULTI- Comprobante Informe Diario de Factuación";

            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.initModality(Modality.WINDOW_MODAL);
            stage.setTitle(titulo);
            scene.setOnKeyPressed(event -> {
                if (event.getCode().toString().equals("ESCAPE")) {
                    stage.close();
                }
            });

            stage.setScene(scene);
            stage.show();

        } catch (IOException ex) {
            Logger.getLogger(PrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //medios_magneticos_nuevo
    private void AbrirMediosMagneticosNuevo() {
        try {
            FXMLLoader medios_magneticos_nuevo = new FXMLLoader(getClass().getResource("/vista/informes/fiscales/medios_magneticos_nuevo.fxml"));

            Parent root = medios_magneticos_nuevo.load();

            Medios_magneticos_nuevoController controlador = medios_magneticos_nuevo.getController();

            String titulo = "MEDIOS MAGNETICOS 2";

            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.initModality(Modality.WINDOW_MODAL);
            stage.setTitle(titulo);
            scene.setOnKeyPressed(event -> {
                if (event.getCode().toString().equals("ESCAPE")) {
                    stage.close();
                }
            });

            stage.setScene(scene);
            stage.show();

        } catch (IOException ex) {
            Logger.getLogger(PrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    // informe_retenciones_nuevo
    private void AbrirInformesRetencionesNuevo() {
        try {
            FXMLLoader informe_retenciones_nuevo = new FXMLLoader(getClass().getResource("/vista/informes/fiscales/informe_retenciones_nuevo.fxml"));

            Parent root = informe_retenciones_nuevo.load();

            Informe_retenciones_nuevoController controlador = informe_retenciones_nuevo.getController();

            String titulo = "Informes de Retenciones";

            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.initModality(Modality.WINDOW_MODAL);
            stage.setTitle(titulo);
            scene.setOnKeyPressed(event -> {
                if (event.getCode().toString().equals("ESCAPE")) {
                    stage.close();
                }
            });

            stage.setScene(scene);
            stage.show();

        } catch (IOException ex) {
            Logger.getLogger(PrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //medios_magneticos
    private void AbrirMediosMagneticos() {
        try {
            FXMLLoader medios_magneticos = new FXMLLoader(getClass().getResource("/vista/informes/fiscales/medios_magneticos.fxml"));

            Parent root = medios_magneticos.load();

            Medios_magneticosController controlador = medios_magneticos.getController();

            String titulo = "Medios Magneticos DIAN";

            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.initModality(Modality.WINDOW_MODAL);
            stage.setTitle(titulo);
            scene.setOnKeyPressed(event -> {
                if (event.getCode().toString().equals("ESCAPE")) {
                    stage.close();
                }
            });

            stage.setScene(scene);
            stage.show();

        } catch (IOException ex) {
            Logger.getLogger(PrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //pagos_terceros
    private void AbrirPagosTerceros() {
        try {
            FXMLLoader pagos_terceros = new FXMLLoader(getClass().getResource("/vista/informes/fiscales/pagos_terceros.fxml"));

            Parent root = pagos_terceros.load();

            Pagos_tercerosController controlador = pagos_terceros.getController();

            String titulo = "Informe de Pagos a Terceros";

            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.initModality(Modality.WINDOW_MODAL);
            stage.setTitle(titulo);
            scene.setOnKeyPressed(event -> {
                if (event.getCode().toString().equals("ESCAPE")) {
                    stage.close();
                }
            });

            stage.setScene(scene);
            stage.show();

        } catch (IOException ex) {
            Logger.getLogger(PrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //informe_iva
    private void AbrirInformeIva() {
        try {
            FXMLLoader informe_iva = new FXMLLoader(getClass().getResource("/vista/informes/fiscales/informe_iva.fxml"));

            Parent root = informe_iva.load();

            Informe_ivaController controlador = informe_iva.getController();

            String titulo = "Informe de Iva";

            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.initModality(Modality.WINDOW_MODAL);
            stage.setTitle(titulo);
            scene.setOnKeyPressed(event -> {
                if (event.getCode().toString().equals("ESCAPE")) {
                    stage.close();
                }
            });

            stage.setScene(scene);
            stage.show();

        } catch (IOException ex) {
            Logger.getLogger(PrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //
    private void AbrirConsolidacionRetencion() {
        try {
            FXMLLoader concolidado_retencion = new FXMLLoader(getClass().getResource("/vista/informes/fiscales/concolidado_retencion.fxml"));

            Parent root = concolidado_retencion.load();

            Concolidado_retencionController controlador = concolidado_retencion.getController();

            String titulo = "Consolidado de Retención en la Fuente";

            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.initModality(Modality.WINDOW_MODAL);
            stage.setTitle(titulo);
            scene.setOnKeyPressed(event -> {
                if (event.getCode().toString().equals("ESCAPE")) {
                    stage.close();
                }
            });

            stage.setScene(scene);
            stage.show();

        } catch (IOException ex) {
            Logger.getLogger(PrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //
    private void AbrirCertificadoRetencion() {
        try {
            FXMLLoader certificado_retencion = new FXMLLoader(getClass().getResource("/vista/informes/fiscales/certificado_retencion.fxml"));

            Parent root = certificado_retencion.load();

            Certificado_retencionController controlador = certificado_retencion.getController();

            String titulo = "Certificados de Retención";

            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.initModality(Modality.WINDOW_MODAL);
            stage.setTitle(titulo);
            scene.setOnKeyPressed(event -> {
                if (event.getCode().toString().equals("ESCAPE")) {
                    stage.close();
                }
            });

            stage.setScene(scene);
            stage.show();

        } catch (IOException ex) {
            Logger.getLogger(PrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //comprobante_informe_diario_compras
    private void AbrirInformeDiarioCompras() {
        try {
            FXMLLoader comprobante_informe_diario_compras = new FXMLLoader(getClass().getResource("/vista/informes/fiscales/comprobante_informe_diario_compras.fxml"));

            Parent root = comprobante_informe_diario_compras.load();

            Comprobante_informe_diario_comprasController controlador = comprobante_informe_diario_compras.getController();

            String titulo = "Informe Diario de Compras";

            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.initModality(Modality.WINDOW_MODAL);
            stage.setTitle(titulo);
            scene.setOnKeyPressed(event -> {
                if (event.getCode().toString().equals("ESCAPE")) {
                    stage.close();
                }
            });

            stage.setScene(scene);
            stage.show();

        } catch (IOException ex) {
            Logger.getLogger(PrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //comprobante_informe_diario_facturacion
    private void AbrirComprobanteInformeDiarioFacturacion() {
        try {
            FXMLLoader comprobante_informe_diario_facturacion = new FXMLLoader(getClass().getResource("/vista/informes/fiscales/comprobante_informe_diario_facturacion.fxml"));

            Parent root = comprobante_informe_diario_facturacion.load();

            Comprobante_informe_diario_facturacionController controlador = comprobante_informe_diario_facturacion.getController();

            String titulo = "Informe Diario de Facturación";

            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.initModality(Modality.WINDOW_MODAL);
            stage.setTitle(titulo);
            scene.setOnKeyPressed(event -> {
                if (event.getCode().toString().equals("ESCAPE")) {
                    stage.close();
                }
            });

            stage.setScene(scene);
            stage.show();

        } catch (IOException ex) {
            Logger.getLogger(PrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //informe_recaudos
    private void AbrirInformeRecaudos() {
        try {
            FXMLLoader informe_recaudos = new FXMLLoader(getClass().getResource("/vista/informes/tesoreria/informe_recaudos.fxml"));

            Parent root = informe_recaudos.load();

            Informe_recaudosController controlador = informe_recaudos.getController();

            String titulo = "Informe de Recaudos";

            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.initModality(Modality.WINDOW_MODAL);
            stage.setTitle(titulo);
            scene.setOnKeyPressed(event -> {
                if (event.getCode().toString().equals("ESCAPE")) {
                    stage.close();
                }
            });

            stage.setScene(scene);
            stage.show();

        } catch (IOException ex) {
            Logger.getLogger(PrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //relacion_cheques
    private void AbrirRelacionCheques() {
        try {
            FXMLLoader relacion_cheques = new FXMLLoader(getClass().getResource("/vista/informes/tesoreria/relacion_cheques.fxml"));

            Parent root = relacion_cheques.load();

            Relacion_chequesController controlador = relacion_cheques.getController();

            String titulo = "Relación de cheques";

            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.initModality(Modality.WINDOW_MODAL);
            stage.setTitle(titulo);
            scene.setOnKeyPressed(event -> {
                if (event.getCode().toString().equals("ESCAPE")) {
                    stage.close();
                }
            });

            stage.setScene(scene);
            stage.show();

        } catch (IOException ex) {
            Logger.getLogger(PrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //estado_caja_bancos
    private void AbrirEstadoCajaBancos() {
        try {
            FXMLLoader estado_caja_bancos = new FXMLLoader(getClass().getResource("/vista/informes/tesoreria/estado_caja_bancos.fxml"));

            Parent root = estado_caja_bancos.load();

            Estado_caja_bancosController controlador = estado_caja_bancos.getController();

            String titulo = "Estado de Caja y Bancos";

            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.initModality(Modality.WINDOW_MODAL);
            stage.setTitle(titulo);
            scene.setOnKeyPressed(event -> {
                if (event.getCode().toString().equals("ESCAPE")) {
                    stage.close();
                }
            });

            stage.setScene(scene);
            stage.show();

        } catch (IOException ex) {
            Logger.getLogger(PrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //registros_ordenes_compra
    private void AbrirRegistrosOrdenesCompra() {
        try {
            FXMLLoader registros_ordenes_compra = new FXMLLoader(getClass().getResource("/vista/informes/compras/registros_ordenes_compra.fxml"));

            Parent root = registros_ordenes_compra.load();

            Registros_ordenes_compraController controlador = registros_ordenes_compra.getController();

            String titulo = "Registros de Ordenes de Compra";

            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.initModality(Modality.WINDOW_MODAL);
            stage.setTitle(titulo);
            scene.setOnKeyPressed(event -> {
                if (event.getCode().toString().equals("ESCAPE")) {
                    stage.close();
                }
            });

            stage.setScene(scene);
            stage.show();

        } catch (IOException ex) {
            Logger.getLogger(PrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //compras
    private void AbrirCompras() {
        try {
            FXMLLoader compras = new FXMLLoader(getClass().getResource("/vista/informes/compras/compras.fxml"));

            Parent root = compras.load();

            ComprasController controlador = compras.getController();

            String titulo = "Informe de Compras";

            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.initModality(Modality.WINDOW_MODAL);
            stage.setTitle(titulo);
            scene.setOnKeyPressed(event -> {
                if (event.getCode().toString().equals("ESCAPE")) {
                    stage.close();
                }
            });

            stage.setScene(scene);
            stage.show();

        } catch (IOException ex) {
            Logger.getLogger(PrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //comparativo_compras
    private void AbrirComparativoCompras() {
        try {
            FXMLLoader comparativo_compras = new FXMLLoader(getClass().getResource("/vista/informes/compras/comparativo_compras.fxml"));

            Parent root = comparativo_compras.load();

            Comparativo_comprasController controlador = comparativo_compras.getController();

            String titulo = "Comparativo de Compras";

            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.initModality(Modality.WINDOW_MODAL);
            stage.setTitle(titulo);
            scene.setOnKeyPressed(event -> {
                if (event.getCode().toString().equals("ESCAPE")) {
                    stage.close();
                }
            });

            stage.setScene(scene);
            stage.show();

        } catch (IOException ex) {
            Logger.getLogger(PrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //informe_compras
    private void AbrirInformeRegistroCompra() {
        try {
            FXMLLoader informe_compras = new FXMLLoader(getClass().getResource("/vista/informes/compras/informe_compras.fxml"));

            Parent root = informe_compras.load();

            Informe_comprasController controlador = informe_compras.getController();

            String titulo = "Informe de Registros de Compras";

            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.initModality(Modality.WINDOW_MODAL);
            stage.setTitle(titulo);
            scene.setOnKeyPressed(event -> {
                if (event.getCode().toString().equals("ESCAPE")) {
                    stage.close();
                }
            });

            stage.setScene(scene);
            stage.show();

        } catch (IOException ex) {
            Logger.getLogger(PrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //cambio_mes
    private void AbrirCambioMes() {
        try {
            FXMLLoader cambio_mes = new FXMLLoader(getClass().getResource("/periodos/cambio_mes/vista/cambio_mes.fxml"));

            Parent root = cambio_mes.load();

            Cambio_mesController controlador = cambio_mes.getController();

            String titulo = "Seleccionar periodo";

            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.initModality(Modality.WINDOW_MODAL);
            stage.setTitle(titulo);
            scene.setOnKeyPressed(event -> {
                if (event.getCode().toString().equals("ESCAPE")) {
                    stage.close();
                }
            });

            stage.setScene(scene);
            stage.show();

        } catch (IOException ex) {
            Logger.getLogger(PrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //meses_abiertos
    private void AbrirMesesAbiertos() {
        try {
            FXMLLoader meses_abiertos = new FXMLLoader(getClass().getResource("/periodos/meses_abiertos/vista/meses_abiertos.fxml"));

            Parent root = meses_abiertos.load();

            Meses_abiertosController controlador = meses_abiertos.getController();

            String titulo = "Meses Abiertos";

            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.initModality(Modality.WINDOW_MODAL);
            stage.setTitle(titulo);
            scene.setOnKeyPressed(event -> {
                if (event.getCode().toString().equals("ESCAPE")) {
                    stage.close();
                }
            });

            stage.setScene(scene);
            stage.show();

        } catch (IOException ex) {
            Logger.getLogger(PrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //informe_maximos_minimos
    private void AbrirInformeMaximoMinimos() {
        try {
            FXMLLoader informe_maximos_minimos = new FXMLLoader(getClass().getResource("/vista/informes/inventarios/informe_maximos_minimos.fxml"));

            Parent root = informe_maximos_minimos.load();

            Informe_maximos_minimosController controlador = informe_maximos_minimos.getController();

            String titulo = "Informe a Excel de Maximos y Minimos";

            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.initModality(Modality.WINDOW_MODAL);
            stage.setTitle(titulo);
            scene.setOnKeyPressed(event -> {
                if (event.getCode().toString().equals("ESCAPE")) {
                    stage.close();
                }
            });

            stage.setScene(scene);
            stage.show();

        } catch (IOException ex) {
            Logger.getLogger(PrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //kardex_bodegas_mercan_consig
    private void AbrirKardexBodegaMercanConsig() {
        try {
            FXMLLoader kardex_bodegas_mercan_consig = new FXMLLoader(getClass().getResource("/vista/informes/inventarios/kardex_bodegas_mercan_consig.fxml"));

            Parent root = kardex_bodegas_mercan_consig.load();

            Kardex_bodegas_mercan_consigController controlador = kardex_bodegas_mercan_consig.getController();

            String titulo = "Kardex por Bodegas (M/cia en Consignación)";

            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.initModality(Modality.WINDOW_MODAL);
            stage.setTitle(titulo);
            scene.setOnKeyPressed(event -> {
                if (event.getCode().toString().equals("ESCAPE")) {
                    stage.close();
                }
            });

            stage.setScene(scene);
            stage.show();

        } catch (IOException ex) {
            Logger.getLogger(PrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //saldo_inventario_bodegas_2
    private void AbrirSaldoInventarioBodegas2() {
        try {
            FXMLLoader saldo_inventario_bodegas_2 = new FXMLLoader(getClass().getResource("/vista/informes/inventarios/saldo_inventario_bodegas_2.fxml"));

            Parent root = saldo_inventario_bodegas_2.load();

            Saldo_inventario_bodegas_2Controller controlador = saldo_inventario_bodegas_2.getController();

            String titulo = "Saldos de Bodega";

            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.initModality(Modality.WINDOW_MODAL);
            stage.setTitle(titulo);
            scene.setOnKeyPressed(event -> {
                if (event.getCode().toString().equals("ESCAPE")) {
                    stage.close();
                }
            });

            stage.setScene(scene);
            stage.show();

        } catch (IOException ex) {
            Logger.getLogger(PrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //informe_translados_bodegas
    private void AbrirInformeTransladosBodega() {
        try {
            FXMLLoader informe_translados_bodegas = new FXMLLoader(getClass().getResource("/vista/informes/inventarios/informe_translados_bodegas.fxml"));

            Parent root = informe_translados_bodegas.load();

            Informe_translados_bodegasController controlador = informe_translados_bodegas.getController();

            String titulo = "Informe de Translados a Bodega";

            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.initModality(Modality.WINDOW_MODAL);
            stage.setTitle(titulo);
            scene.setOnKeyPressed(event -> {
                if (event.getCode().toString().equals("ESCAPE")) {
                    stage.close();
                }
            });

            stage.setScene(scene);
            stage.show();

        } catch (IOException ex) {
            Logger.getLogger(PrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //extracto_bodega
    private void AbrirExtractoBodega() {
        try {
            FXMLLoader extracto_bodega = new FXMLLoader(getClass().getResource("/vista/informes/inventarios/extracto_bodega.fxml"));

            Parent root = extracto_bodega.load();

            Extracto_bodegaController controlador = extracto_bodega.getController();

            String titulo = "Extracto de Bodega";

            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.initModality(Modality.WINDOW_MODAL);
            stage.setTitle(titulo);
            scene.setOnKeyPressed(event -> {
                if (event.getCode().toString().equals("ESCAPE")) {
                    stage.close();
                }
            });

            stage.setScene(scene);
            stage.show();

        } catch (IOException ex) {
            Logger.getLogger(PrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //rentabilidad_inventario
    private void AbrirRentabilidadInventario() {
        try {
            FXMLLoader rentabilidad_inventario = new FXMLLoader(getClass().getResource("/vista/informes/inventarios/rentabilidad_inventario.fxml"));

            Parent root = rentabilidad_inventario.load();

            Rentabilidad_inventarioController controlador = rentabilidad_inventario.getController();

            String titulo = "Rentabilidad de Inventario";

            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.initModality(Modality.WINDOW_MODAL);
            stage.setTitle(titulo);
            scene.setOnKeyPressed(event -> {
                if (event.getCode().toString().equals("ESCAPE")) {
                    stage.close();
                }
            });

            stage.setScene(scene);
            stage.show();

        } catch (IOException ex) {
            Logger.getLogger(PrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //rotacion_inventario
    private void AbrirRotacionInventario() {
        try {
            FXMLLoader rotacion_inventario = new FXMLLoader(getClass().getResource("/vista/informes/inventarios/rotacion_inventario.fxml"));

            Parent root = rotacion_inventario.load();

            Rotacion_inventarioController controlador = rotacion_inventario.getController();

            String titulo = "Rotación de Inventario";

            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.initModality(Modality.WINDOW_MODAL);
            stage.setTitle(titulo);
            scene.setOnKeyPressed(event -> {
                if (event.getCode().toString().equals("ESCAPE")) {
                    stage.close();
                }
            });

            stage.setScene(scene);
            stage.show();

        } catch (IOException ex) {
            Logger.getLogger(PrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //extracto_inventario_bodegas
    private void AbrirExtractoInventarioBodegas() {
        try {
            FXMLLoader extracto_inventario_bodegas = new FXMLLoader(getClass().getResource("/vista/informes/inventarios/extracto_inventario_bodegas.fxml"));

            Parent root = extracto_inventario_bodegas.load();

            Extracto_inventario_bodegasController controlador = extracto_inventario_bodegas.getController();

            String titulo = "Extracto de Inventario";

            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.initModality(Modality.WINDOW_MODAL);
            stage.setTitle(titulo);
            scene.setOnKeyPressed(event -> {
                if (event.getCode().toString().equals("ESCAPE")) {
                    stage.close();
                }
            });

            stage.setScene(scene);
            stage.show();

        } catch (IOException ex) {
            Logger.getLogger(PrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //extracto_inventario_general
    private void AbrirExtractoInventarioGeneral() {
        try {
            FXMLLoader extracto_inventario_general = new FXMLLoader(getClass().getResource("/vista/informes/inventarios/extracto_inventario_general.fxml"));

            Parent root = extracto_inventario_general.load();

            Extracto_inventario_generalController controlador = extracto_inventario_general.getController();

            String titulo = "Extracto de Inventarios";

            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.initModality(Modality.WINDOW_MODAL);
            stage.setTitle(titulo);
            scene.setOnKeyPressed(event -> {
                if (event.getCode().toString().equals("ESCAPE")) {
                    stage.close();
                }
            });

            stage.setScene(scene);
            stage.show();

        } catch (IOException ex) {
            Logger.getLogger(PrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //saldos_inventario_acumu_series
    private void AbrirSaldosInventarioAcumSeries() {
        try {
            FXMLLoader saldos_inventario_acumu_series = new FXMLLoader(getClass().getResource("/vista/informes/inventarios/saldos_inventario_acumu_series.fxml"));

            Parent root = saldos_inventario_acumu_series.load();

            Saldos_inventario_acumu_seriesController controlador = saldos_inventario_acumu_series.getController();

            String titulo = "Saldos de Inventarios - Series";

            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.initModality(Modality.WINDOW_MODAL);
            stage.setTitle(titulo);
            scene.setOnKeyPressed(event -> {
                if (event.getCode().toString().equals("ESCAPE")) {
                    stage.close();
                }
            });

            stage.setScene(scene);
            stage.show();

        } catch (IOException ex) {
            Logger.getLogger(PrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //saldo_inventario_unidades_mayor
    private void AbrirSaldoInventarioUnidadesMayor() {
        try {
            FXMLLoader saldo_inventario_unidades_mayor = new FXMLLoader(getClass().getResource("/vista/informes/inventarios/saldo_inventario_unidades_mayor.fxml"));

            Parent root = saldo_inventario_unidades_mayor.load();

            Saldo_inventario_unidades_mayorController controlador = saldo_inventario_unidades_mayor.getController();

            String titulo = "Saldos de Inventario x segmentos";

            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.initModality(Modality.WINDOW_MODAL);
            stage.setTitle(titulo);
            scene.setOnKeyPressed(event -> {
                if (event.getCode().toString().equals("ESCAPE")) {
                    stage.close();
                }
            });

            stage.setScene(scene);
            stage.show();

        } catch (IOException ex) {
            Logger.getLogger(PrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //saldos_inventarios_segmentos
    private void AbrirSaldosInventarioSegmentos() {
        try {
            FXMLLoader saldos_inventarios_segmentos = new FXMLLoader(getClass().getResource("/vista/informes/inventarios/saldos_inventarios_segmentos.fxml"));

            Parent root = saldos_inventarios_segmentos.load();

            Saldos_inventarios_segmentosController controlador = saldos_inventarios_segmentos.getController();

            String titulo = "Saldos de Inventario x segmentos";

            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.initModality(Modality.WINDOW_MODAL);
            stage.setTitle(titulo);
            scene.setOnKeyPressed(event -> {
                if (event.getCode().toString().equals("ESCAPE")) {
                    stage.close();
                }
            });

            stage.setScene(scene);
            stage.show();

        } catch (IOException ex) {
            Logger.getLogger(PrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //saldos_inventario
    private void AbrirSaldosDeInventario() {
        try {
            FXMLLoader saldos_inventario = new FXMLLoader(getClass().getResource("/vista/informes/inventarios/saldos_inventario.fxml"));

            Parent root = saldos_inventario.load();

            Saldos_inventarioController controlador = saldos_inventario.getController();

            String titulo = "Saldo de Inventario";

            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.initModality(Modality.WINDOW_MODAL);
            stage.setTitle(titulo);
            scene.setOnKeyPressed(event -> {
                if (event.getCode().toString().equals("ESCAPE")) {
                    stage.close();
                }
            });

            stage.setScene(scene);
            stage.show();

        } catch (IOException ex) {
            Logger.getLogger(PrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //kardex_bodegas
    private void AbrirKardexBodegas() {
        try {
            FXMLLoader kardex_bodegas = new FXMLLoader(getClass().getResource("/vista/informes/inventarios/kardex_bodegas.fxml"));

            Parent root = kardex_bodegas.load();

            Kardex_bodegasController controlador = kardex_bodegas.getController();

            String titulo = "Kardex Bodegas";

            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.initModality(Modality.WINDOW_MODAL);
            stage.setTitle(titulo);
            scene.setOnKeyPressed(event -> {
                if (event.getCode().toString().equals("ESCAPE")) {
                    stage.close();
                }
            });

            stage.setScene(scene);
            stage.show();

        } catch (IOException ex) {
            Logger.getLogger(PrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //kardex_general
    private void AbrirKardexGeneral() {
        try {
            FXMLLoader kardex_general = new FXMLLoader(getClass().getResource("/vista/informes/inventarios/kardex_general.fxml"));

            Parent root = kardex_general.load();

            Kardex_generalController controlador = kardex_general.getController();

            String titulo = "Kardex General";

            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.initModality(Modality.WINDOW_MODAL);
            stage.setTitle(titulo);
            scene.setOnKeyPressed(event -> {
                if (event.getCode().toString().equals("ESCAPE")) {
                    stage.close();
                }
            });

            stage.setScene(scene);
            stage.show();

        } catch (IOException ex) {
            Logger.getLogger(PrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //informe_cuentas_xpagar
    private void AbrirInformeCuentasXPagar() {
        try {
            FXMLLoader informe_cuentas_xpagar = new FXMLLoader(getClass().getResource("/vista/informes/proveedores_cxp/informe_cuentas_xpagar.fxml"));

            Parent root = informe_cuentas_xpagar.load();

            Informe_cuentas_xpagarController controlador = informe_cuentas_xpagar.getController();

            String titulo = "Cuentas por Pagar";

            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.initModality(Modality.WINDOW_MODAL);
            stage.setTitle(titulo);
            scene.setOnKeyPressed(event -> {
                if (event.getCode().toString().equals("ESCAPE")) {
                    stage.close();
                }
            });

            stage.setScene(scene);
            stage.show();

        } catch (IOException ex) {
            Logger.getLogger(PrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //consultas
    private void AbrirConsultas() {
        try {
            FXMLLoader consultas = new FXMLLoader(getClass().getResource("/vista/informes/proveedores_cxp/consultas.fxml"));

            Parent root = consultas.load();

            ConsultasController controlador = consultas.getController();

            String titulo = "Consulta Proveedores CxP";

            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.initModality(Modality.WINDOW_MODAL);
            stage.setTitle(titulo);
            scene.setOnKeyPressed(event -> {
                if (event.getCode().toString().equals("ESCAPE")) {
                    stage.close();
                }
            });

            stage.setScene(scene);
            stage.show();

        } catch (IOException ex) {
            Logger.getLogger(PrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //cartas_cobros
    private void AbrirCartasCobros() {
        try {
            FXMLLoader cartas_cobros = new FXMLLoader(getClass().getResource("/vista/informes/deudores/cartas_cobros.fxml"));

            Parent root = cartas_cobros.load();

            Cartas_cobrosController controlador = cartas_cobros.getController();

            String titulo = "Cartas de cobro";

            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.initModality(Modality.WINDOW_MODAL);
            stage.setTitle(titulo);
            scene.setOnKeyPressed(event -> {
                if (event.getCode().toString().equals("ESCAPE")) {
                    stage.close();
                }
            });

            stage.setScene(scene);
            stage.show();

        } catch (IOException ex) {
            Logger.getLogger(PrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void click_medios_magneticos_nuevo(ActionEvent event) {
        AbrirMediosMagneticosNuevo();
    }

    @FXML
    private void click_informes_de_nomina(ActionEvent event) {
        AbrirInformesdeNomina();
    }

    @FXML
    private void click_movimiento_ref1(ActionEvent event) {
        AbrirMovimientoRef1();
    }

    @FXML
    private void click_resumen_documentos(ActionEvent event) {
        AbrirResumenDocumentos();
    }

    @FXML
    private void click_listado_documento(ActionEvent event) {
        AbrirListadoDocumentos();
    }

    @FXML
    private void click_saldos_centros_costos(ActionEvent event) {
        AbrirSaldosCentrosCostos();
    }

    @FXML
    private void click_saldos_terceros(ActionEvent event) {
        AbrirSaldosTerceros();
    }

    @FXML
    private void click_analisis_grafico(ActionEvent event) {
        AbririAnalisisGrafico();
    }

    @FXML
    private void click_ingresos_gastos_tercero(ActionEvent event) {
        AbrirIngresosGastosPorTercero();
    }

    @FXML
    private void click_resumen_contable(ActionEvent event) {
        AbrirResumenContable();
    }

    @FXML
    private void click_resumen_x_dias(ActionEvent event) {
        AbrirResumenDias();
    }

    @FXML
    private void click_comprobante_diario(ActionEvent event) {
        AbrirComprobanteDiario();
    }

    @FXML
    private void click_auditoria(ActionEvent event) {
        AbrirAuditoria();
    }

    @FXML
    private void click_auxiliar_especial(ActionEvent event) {
        AbrirAuxiliarEspecial();
    }

    @FXML
    private void click_movimiento(ActionEvent event) {
        AbrirMovimientosInforme();
    }

    @FXML
    private void click_auxiliares(ActionEvent event) {
        AbrirAuxiliares();
    }

    @FXML
    private void click_libros_oficiales(ActionEvent event) {
        AbrirLibrosOficiales();
    }

    @FXML
    private void click_estados_financieros(ActionEvent event) {
        AbrirEstadosFinancieros();
    }

    @FXML
    private void click_informes_especificos(ActionEvent event) {
        AbrirInformesEspecificos();
    }

    @FXML
    private void click_comprobante_informe_diario_fact(ActionEvent event) {
        AbrirComprobanteInformeDiarioFact();
    }

    @FXML
    private void click_informe_retenciones_nuevo(ActionEvent event) {
        AbrirInformesRetencionesNuevo();
    }

    @FXML
    private void click_medios_magneticos(ActionEvent event) {
        AbrirMediosMagneticos();
    }

    @FXML
    private void click_pagos_terceros(ActionEvent event) {
        AbrirPagosTerceros();
    }

    @FXML
    private void click_informe_iva(ActionEvent event) {
        AbrirInformeIva();
    }

    @FXML
    private void click_concolidado_retencion(ActionEvent event) {
        AbrirConsolidacionRetencion();
    }

    @FXML
    private void click_certificado_retencion(ActionEvent event) {
        AbrirCertificadoRetencion();
    }

    @FXML
    private void click_comprobante_informe_diario_compras(ActionEvent event) {
        AbrirInformeDiarioCompras();
    }

    @FXML
    private void click_comprobante_informe_diario_facturacion(ActionEvent event) {
        AbrirComprobanteInformeDiarioFacturacion();
    }

    @FXML
    private void click_informe_recaudos(ActionEvent event) {
        AbrirInformeRecaudos();
    }

    @FXML
    private void click_relacion_cheques(ActionEvent event) {
        AbrirRelacionCheques();
    }

    @FXML
    private void click_estado_caja_bancos(ActionEvent event) {
        AbrirEstadoCajaBancos();
    }

    @FXML
    private void click_registros_ordenes_compra(ActionEvent event) {
        AbrirRegistrosOrdenesCompra();
    }

    @FXML
    private void click_compras(ActionEvent event) {
        AbrirCompras();
    }

    @FXML
    private void click_comparativo_compras(ActionEvent event) {
        AbrirComparativoCompras();
    }

    @FXML
    private void click_informe_compras(ActionEvent event) {
        AbrirInformeRegistroCompra();
    }

    @FXML
    private void click_cambio_mes(ActionEvent event) {
        AbrirCambioMes();
    }

    @FXML
    private void click_meses_abiertos(ActionEvent event) {
        AbrirMesesAbiertos();
    }

    @FXML
    private void click_informe_maximos_minimos(ActionEvent event) {
        AbrirInformeMaximoMinimos();
    }

    @FXML
    private void click_kardex_bodegas_mercan_consig(ActionEvent event) {
        AbrirKardexBodegaMercanConsig();
    }

    @FXML
    private void click_saldo_inventario_bodegas_2(ActionEvent event) {
        AbrirSaldoInventarioBodegas2();
    }

    @FXML
    private void clicl_informe_translados_bodegas(ActionEvent event) {
        AbrirInformeTransladosBodega();
    }

    @FXML
    private void click_extracto_bodega(ActionEvent event) {
        AbrirExtractoBodega();
    }

    @FXML
    private void click_rentabilidad_inventario(ActionEvent event) {
        AbrirRentabilidadInventario();
    }

    @FXML
    private void click_rotacion_inventario(ActionEvent event) {
        AbrirRotacionInventario();
    }

    @FXML
    private void click_extracto_inventario_bodegas(ActionEvent event) {
        AbrirExtractoInventarioBodegas();
    }

    @FXML
    private void click_extracto_inventario_general(ActionEvent event) {
        AbrirExtractoInventarioGeneral();
    }

    @FXML
    private void click_saldos_inventario_acumu_series(ActionEvent event) {
        AbrirSaldosInventarioAcumSeries();
    }

    @FXML
    private void click_saldo_inventario_unidades_mayor(ActionEvent event) {
        AbrirSaldoInventarioUnidadesMayor();
    }

    @FXML
    private void click_saldos_inventarios_segmentos(ActionEvent event) {
        AbrirSaldosInventarioSegmentos();
    }

    @FXML
    private void click_saldos_inventario(ActionEvent event) {
        AbrirSaldosDeInventario();
    }

    @FXML
    private void click_kardex_bodegas(ActionEvent event) {
        AbrirKardexBodegas();
    }

    @FXML
    private void click_kardex_general(ActionEvent event) {
        AbrirKardexGeneral();
    }

    @FXML
    private void click_informe_cuentas_xpagar(ActionEvent event) {
        AbrirInformeCuentasXPagar();
    }

    @FXML
    private void click_consultas(ActionEvent event) {
        AbrirConsultas();
    }

    @FXML
    private void click_cartas_cobros(ActionEvent event) {
        AbrirCartasCobros();
    }
    //consultas_x_documentos
    private void AbrirConsultDocumentosDeudores() {
        try {
            FXMLLoader consultaDocumentos = new FXMLLoader(getClass().getResource("/vista/informes/deudores/consultaDocumentos.fxml"));

            Parent roots = consultaDocumentos.load();

            ConsultaDocumentosController controlador = consultaDocumentos.getController();

            String titulo = "Consulta FACTURAS";

            Scene scene = new Scene(roots);
            Stage stage = new Stage();
            stage.initModality(Modality.WINDOW_MODAL);
            stage.setTitle(titulo);
            scene.setOnKeyPressed(event -> {
                if (event.getCode().toString().equals("ESCAPE")) {
                    stage.close();
                }
            });

            stage.setScene(scene);
            stage.show();

        } catch (IOException ex) {
            Logger.getLogger(PrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //saldo_tercero_x_cuentas
    private void AbrirSaldoTerceroCuentas() {
        try {
            FXMLLoader saldo_tercero_x_cuentas = new FXMLLoader(getClass().getResource("/vista/informes/deudores/saldo_tercero_x_cuentas.fxml"));

            Parent roots = saldo_tercero_x_cuentas.load();

            Saldo_tercero_x_cuentasController controlador = saldo_tercero_x_cuentas.getController();

            String titulo = "Saldos Terceros Cuentas";

            Scene scene = new Scene(roots);
            Stage stage = new Stage();
            stage.initModality(Modality.WINDOW_MODAL);
            stage.setTitle(titulo);
            scene.setOnKeyPressed(event -> {
                if (event.getCode().toString().equals("ESCAPE")) {
                    stage.close();
                }
            });

            stage.setScene(scene);
            stage.show();

        } catch (IOException ex) {
            Logger.getLogger(PrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //listado_clientes_saldos
    private void AbrirListadoClientesSaldos() {
        try {
            FXMLLoader listado_clientes_saldos = new FXMLLoader(getClass().getResource("/vista/informes/deudores/listado_clientes_saldos.fxml"));

            Parent roots = listado_clientes_saldos.load();

            Listado_clientes_saldosController controlador = listado_clientes_saldos.getController();

            String titulo = "Listado de Clientes y Saldos en Cartera";

            Scene scene = new Scene(roots);
            Stage stage = new Stage();
            stage.initModality(Modality.WINDOW_MODAL);
            stage.setTitle(titulo);
            scene.setOnKeyPressed(event -> {
                if (event.getCode().toString().equals("ESCAPE")) {
                    stage.close();
                }
            });

            stage.setScene(scene);
            stage.show();

        } catch (IOException ex) {
            Logger.getLogger(PrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //analisis_morosidad
    private void AbrirAnalisisDeMorosidad() {
        try {
            FXMLLoader analisis_morosidad = new FXMLLoader(getClass().getResource("/vista/informes/deudores/analisis_morosidad.fxml"));

            Parent roots = analisis_morosidad.load();

            Analisis_morosidadController controlador = analisis_morosidad.getController();

            String titulo = "Analisis de Morosidad";

            Scene scene = new Scene(roots);
            Stage stage = new Stage();
            stage.initModality(Modality.WINDOW_MODAL);
            stage.setTitle(titulo);
            scene.setOnKeyPressed(event -> {
                if (event.getCode().toString().equals("ESCAPE")) {
                    stage.close();
                }
            });

            stage.setScene(scene);
            stage.show();

        } catch (IOException ex) {
            Logger.getLogger(PrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //consulta_por_terceros
    private void AbrirConsultaPorTerceros() {
        try {
            FXMLLoader consulta_por_terceros = new FXMLLoader(getClass().getResource("/vista/informes/deudores/consulta_por_terceros.fxml"));

            Parent roots = consulta_por_terceros.load();

            Consulta_por_tercerosController controlador = consulta_por_terceros.getController();

            String titulo = "Consulta Cartera";

            Scene scene = new Scene(roots);
            Stage stage = new Stage();
            stage.initModality(Modality.WINDOW_MODAL);
            stage.setTitle(titulo);
            scene.setOnKeyPressed(event -> {
                if (event.getCode().toString().equals("ESCAPE")) {
                    stage.close();
                }
            });

            stage.setScene(scene);
            stage.show();

        } catch (IOException ex) {
            Logger.getLogger(PrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //cartera_por_edades
    private void AbrirCarteraPorEdades() {
        try {
            FXMLLoader cartera_por_edades = new FXMLLoader(getClass().getResource("/vista/informes/deudores/cartera_por_edades.fxml"));

            Parent roots = cartera_por_edades.load();

            Cartera_por_edadesController controlador = cartera_por_edades.getController();

            String titulo = "Informe de Cuentas por Cobrar - Deudores";

            Scene scene = new Scene(roots);
            Stage stage = new Stage();
            stage.initModality(Modality.WINDOW_MODAL);
            stage.setTitle(titulo);
            scene.setOnKeyPressed(event -> {
                if (event.getCode().toString().equals("ESCAPE")) {
                    stage.close();
                }
            });

            stage.setScene(scene);
            stage.show();

        } catch (IOException ex) {
            Logger.getLogger(PrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //cartera
    private void AbrirCartera() {
        try {
            FXMLLoader cartera = new FXMLLoader(getClass().getResource("/vista/informes/deudores/cartera.fxml"));

            Parent roots = cartera.load();

            CarteraController controlador = cartera.getController();

            String titulo = "Informe de Cartera";

            Scene scene = new Scene(roots);
            Stage stage = new Stage();
            stage.initModality(Modality.WINDOW_MODAL);
            stage.setTitle(titulo);
            scene.setOnKeyPressed(event -> {
                if (event.getCode().toString().equals("ESCAPE")) {
                    stage.close();
                }
            });

            stage.setScene(scene);
            stage.show();

        } catch (IOException ex) {
            Logger.getLogger(PrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //ver_trazabilidad_pedido
    private void AbrirTrazabilidadPedido() {
        try {
            FXMLLoader ver_trazabilidad_pedido = new FXMLLoader(getClass().getResource("/vista/informes/facturacion/ver_trazabilidad_pedido.fxml"));

            Parent roots = ver_trazabilidad_pedido.load();

            Ver_trazabilidad_pedidoController controlador = ver_trazabilidad_pedido.getController();

            String titulo = "VERFAVPED - Ver trazabilidad de pedidos";

            Scene scene = new Scene(roots);
            Stage stage = new Stage();
            stage.initModality(Modality.WINDOW_MODAL);
            stage.setTitle(titulo);
            scene.setOnKeyPressed(event -> {
                if (event.getCode().toString().equals("ESCAPE")) {
                    stage.close();
                }
            });

            stage.setScene(scene);
            stage.show();

        } catch (IOException ex) {
            Logger.getLogger(PrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //informes_cotizacion
    private void AbrirInformesCotizacion() {
        try {
            FXMLLoader informes_cotizacion = new FXMLLoader(getClass().getResource("/vista/informes/facturacion/informes_cotizacion.fxml"));

            Parent roots = informes_cotizacion.load();

            Informes_cotizacionController controlador = informes_cotizacion.getController();

            String titulo = "Listar Cotizaciones";

            Scene scene = new Scene(roots);
            Stage stage = new Stage();
            stage.initModality(Modality.WINDOW_MODAL);
            stage.setTitle(titulo);
            scene.setOnKeyPressed(event -> {
                if (event.getCode().toString().equals("ESCAPE")) {
                    stage.close();
                }
            });

            stage.setScene(scene);
            stage.show();

        } catch (IOException ex) {
            Logger.getLogger(PrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //comisiones_venta_list_doc
    private void AbrirComisionesVentaListDoc() {
        try {
            FXMLLoader comisiones_venta_list_doc = new FXMLLoader(getClass().getResource("/vista/informes/facturacion/comisiones_venta_list_doc.fxml"));

            Parent roots = comisiones_venta_list_doc.load();

            Comisiones_venta_list_docController controlador = comisiones_venta_list_doc.getController();

            String titulo = "Calculo de Comisiones en Ventas";

            Scene scene = new Scene(roots);
            Stage stage = new Stage();
            stage.initModality(Modality.WINDOW_MODAL);
            stage.setTitle(titulo);
            scene.setOnKeyPressed(event -> {
                if (event.getCode().toString().equals("ESCAPE")) {
                    stage.close();
                }
            });

            stage.setScene(scene);
            stage.show();

        } catch (IOException ex) {
            Logger.getLogger(PrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //informe_factura_marca_seg
    private void AbrirInformeFacturaMarcaSeg() {
        try {
            FXMLLoader informe_factura_marca_seg = new FXMLLoader(getClass().getResource("/vista/informes/facturacion/informe_factura_marca_seg.fxml"));

            Parent roots = informe_factura_marca_seg.load();

            Informe_factura_marca_segController controlador = informe_factura_marca_seg.getController();

            String titulo = "Ventas";

            Scene scene = new Scene(roots);
            Stage stage = new Stage();
            stage.initModality(Modality.WINDOW_MODAL);
            stage.setTitle(titulo);
            scene.setOnKeyPressed(event -> {
                if (event.getCode().toString().equals("ESCAPE")) {
                    stage.close();
                }
            });

            stage.setScene(scene);
            stage.show();

        } catch (IOException ex) {
            Logger.getLogger(PrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //informe_remisiones
    private void AbrirInformeRemisiones() {
        try {
            FXMLLoader informe_remisiones = new FXMLLoader(getClass().getResource("/vista/informes/facturacion/informe_remisiones.fxml"));

            Parent roots = informe_remisiones.load();

            Informe_remisionesController controlador = informe_remisiones.getController();

            String titulo = "Listar Remisiones";

            Scene scene = new Scene(roots);
            Stage stage = new Stage();
            stage.initModality(Modality.WINDOW_MODAL);
            stage.setTitle(titulo);
            scene.setOnKeyPressed(event -> {
                if (event.getCode().toString().equals("ESCAPE")) {
                    stage.close();
                }
            });

            stage.setScene(scene);
            stage.show();

        } catch (IOException ex) {
            Logger.getLogger(PrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //facturas_pedido
    private void AbrirFacturasPedidos() {
        try {
            FXMLLoader facturas_pedido = new FXMLLoader(getClass().getResource("/vista/informes/facturacion/facturas_pedido.fxml"));

            Parent roots = facturas_pedido.load();

            Facturas_pedidoController controlador = facturas_pedido.getController();

            String titulo = "FACTURAS POR PEDIDO";

            Scene scene = new Scene(roots);
            Stage stage = new Stage();
            stage.initModality(Modality.WINDOW_MODAL);
            stage.setTitle(titulo);
            scene.setOnKeyPressed(event -> {
                if (event.getCode().toString().equals("ESCAPE")) {
                    stage.close();
                }
            });

            stage.setScene(scene);
            stage.show();

        } catch (IOException ex) {
            Logger.getLogger(PrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //informe_puntos
    private void AbrirInformePuntos() {
        try {
            FXMLLoader informe_puntos = new FXMLLoader(getClass().getResource("/vista/informes/facturacion/informe_puntos.fxml"));

            Parent roots = informe_puntos.load();

            Informe_puntosController controlador = informe_puntos.getController();

            String titulo = "Informe de Puntos";

            Scene scene = new Scene(roots);
            Stage stage = new Stage();
            stage.initModality(Modality.WINDOW_MODAL);
            stage.setTitle(titulo);
            scene.setOnKeyPressed(event -> {
                if (event.getCode().toString().equals("ESCAPE")) {
                    stage.close();
                }
            });

            stage.setScene(scene);
            stage.show();

        } catch (IOException ex) {
            Logger.getLogger(PrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //comisiones_recaudo
    private void AbrirComisionesRecaudo() {
        try {
            FXMLLoader comisiones_recaudo = new FXMLLoader(getClass().getResource("/vista/informes/facturacion/comisiones_recaudo.fxml"));

            Parent roots = comisiones_recaudo.load();

            Comisiones_recaudoController controlador = comisiones_recaudo.getController();

            String titulo = "Comisiones de Venta al Recaudo";

            Scene scene = new Scene(roots);
            Stage stage = new Stage();
            stage.initModality(Modality.WINDOW_MODAL);
            stage.setTitle(titulo);
            scene.setOnKeyPressed(event -> {
                if (event.getCode().toString().equals("ESCAPE")) {
                    stage.close();
                }
            });

            stage.setScene(scene);
            stage.show();

        } catch (IOException ex) {
            Logger.getLogger(PrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //comisiones_venta
    private void AbrirComisionesVenta() {
        try {
            FXMLLoader comisiones_venta = new FXMLLoader(getClass().getResource("/vista/informes/facturacion/comisiones_venta.fxml"));

            Parent roots = comisiones_venta.load();

            Comisiones_ventaController controlador = comisiones_venta.getController();

            String titulo = "Calculo de Comisiones en Ventas";

            Scene scene = new Scene(roots);
            Stage stage = new Stage();
            stage.initModality(Modality.WINDOW_MODAL);
            stage.setTitle(titulo);
            scene.setOnKeyPressed(event -> {
                if (event.getCode().toString().equals("ESCAPE")) {
                    stage.close();
                }
            });

            stage.setScene(scene);
            stage.show();

        } catch (IOException ex) {
            Logger.getLogger(PrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //informe_pedidos
    private void AbrirInformePedidos() {
        try {
            FXMLLoader informe_pedidos = new FXMLLoader(getClass().getResource("/vista/informes/facturacion/informe_pedidos.fxml"));

            Parent roots = informe_pedidos.load();

            Informe_pedidosController controlador = informe_pedidos.getController();

            String titulo = "Informe de Pedidos";

            Scene scene = new Scene(roots);
            Stage stage = new Stage();
            stage.initModality(Modality.WINDOW_MODAL);
            stage.setTitle(titulo);
            scene.setOnKeyPressed(event -> {
                if (event.getCode().toString().equals("ESCAPE")) {
                    stage.close();
                }
            });

            stage.setScene(scene);
            stage.show();

        } catch (IOException ex) {
            Logger.getLogger(PrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //nuevos_clientes
    private void AbrirNuevosClientes() {
        try {
            FXMLLoader nuevos_clientes = new FXMLLoader(getClass().getResource("/vista/informes/facturacion/nuevos_clientes.fxml"));

            Parent roots = nuevos_clientes.load();

            Nuevos_clientesController controlador = nuevos_clientes.getController();

            String titulo = "Nuevos Clientes";

            Scene scene = new Scene(roots);
            Stage stage = new Stage();
            stage.initModality(Modality.WINDOW_MODAL);
            stage.setTitle(titulo);
            scene.setOnKeyPressed(event -> {
                if (event.getCode().toString().equals("ESCAPE")) {
                    stage.close();
                }
            });

            stage.setScene(scene);
            stage.show();

        } catch (IOException ex) {
            Logger.getLogger(PrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //desc_comerciales
    private void AbrirDescComerciales() {
        try {
            FXMLLoader desc_comerciales = new FXMLLoader(getClass().getResource("/vista/informes/facturacion/desc_comerciales.fxml"));

            Parent roots = desc_comerciales.load();

            Desc_comercialesController controlador = desc_comerciales.getController();

            String titulo = "Descuentos en Facturación";

            Scene scene = new Scene(roots);
            Stage stage = new Stage();
            stage.initModality(Modality.WINDOW_MODAL);
            stage.setTitle(titulo);
            scene.setOnKeyPressed(event -> {
                if (event.getCode().toString().equals("ESCAPE")) {
                    stage.close();
                }
            });

            stage.setScene(scene);
            stage.show();

        } catch (IOException ex) {
            Logger.getLogger(PrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //comparativo_facturacion
    private void AbrirComparativoFacturacion() {
        try {
            FXMLLoader comparativo_facturacion = new FXMLLoader(getClass().getResource("/vista/informes/facturacion/comparativo_facturacion.fxml"));

            Parent roots = comparativo_facturacion.load();

            Comparativo_facturacionController controlador = comparativo_facturacion.getController();

            String titulo = "Comparativo de Facturación";

            Scene scene = new Scene(roots);
            Stage stage = new Stage();
            stage.initModality(Modality.WINDOW_MODAL);
            stage.setTitle(titulo);
            scene.setOnKeyPressed(event -> {
                if (event.getCode().toString().equals("ESCAPE")) {
                    stage.close();
                }
            });

            stage.setScene(scene);
            stage.show();

        } catch (IOException ex) {
            Logger.getLogger(PrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //informes_fact_nuevo
    private void AbrirInformesFactNuevo() {
        try {
            FXMLLoader informes_fact_nuevo = new FXMLLoader(getClass().getResource("/vista/informes/facturacion/informes_fact_nuevo.fxml"));

            Parent roots = informes_fact_nuevo.load();

            Informes_fact_nuevoController controlador = informes_fact_nuevo.getController();

            String titulo = "INFVENnew";

            Scene scene = new Scene(roots);
            Stage stage = new Stage();
            stage.initModality(Modality.WINDOW_MODAL);
            stage.setTitle(titulo);
            scene.setOnKeyPressed(event -> {
                if (event.getCode().toString().equals("ESCAPE")) {
                    stage.close();
                }
            });

            stage.setScene(scene);
            stage.show();

        } catch (IOException ex) {
            Logger.getLogger(PrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //click_informe_facturacion
    private void AbrirInformeFacturacion() {
        try {
            FXMLLoader click_informe_facturacion = new FXMLLoader(getClass().getResource("/vista/informes/facturacion/click_informe_facturacion.fxml"));

            Parent roots = click_informe_facturacion.load();

            Click_informe_facturacionController controlador = click_informe_facturacion.getController();

            String titulo = "Informes de Facturación";

            Scene scene = new Scene(roots);
            Stage stage = new Stage();
            stage.initModality(Modality.WINDOW_MODAL);
            stage.setTitle(titulo);
            scene.setOnKeyPressed(event -> {
                if (event.getCode().toString().equals("ESCAPE")) {
                    stage.close();
                }
            });

            stage.setScene(scene);
            stage.show();

        } catch (IOException ex) {
            Logger.getLogger(PrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //email
    private void AbrirEviarEmail() {
        try {
            FXMLLoader email = new FXMLLoader(getClass().getResource("/mantenimiento/vista/email.fxml"));

            Parent roots = email.load();

            EmailController controlador = email.getController();

            String titulo = "Enviar correo electronico";

            Scene scene = new Scene(roots);
            Stage stage = new Stage();
            stage.initModality(Modality.WINDOW_MODAL);
            stage.setTitle(titulo);
            scene.setOnKeyPressed(event -> {
                if (event.getCode().toString().equals("ESCAPE")) {
                    stage.close();
                }
            });

            stage.setScene(scene);
            stage.show();

        } catch (IOException ex) {
            Logger.getLogger(PrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //historial_operaciones
    private void AbrirHistorialOperaciones() {
        try {
            FXMLLoader historial_operacioness = new FXMLLoader(getClass().getResource("/mantenimiento/vista/historial_operaciones.fxml"));

            Parent roots = historial_operacioness.load();

            Historial_operacionesController controlador = historial_operacioness.getController();

            String titulo = "Historial de Operaciones";

            Scene scene = new Scene(roots);
            Stage stage = new Stage();
            stage.initModality(Modality.WINDOW_MODAL);
            stage.setTitle(titulo);
            scene.setOnKeyPressed(event -> {
                if (event.getCode().toString().equals("ESCAPE")) {
                    stage.close();
                }
            });

            stage.setScene(scene);
            stage.show();

        } catch (IOException ex) {
            Logger.getLogger(PrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //examinar_fallas_informacion
    private void AbrirExaminarFallasInformacion() {
        try {
            FXMLLoader examinar_fallas_informacion = new FXMLLoader(getClass().getResource("/mantenimiento/vista/examinar_fallas_informacion.fxml"));

            Parent roots = examinar_fallas_informacion.load();

            Examinar_fallas_informacionController controlador = examinar_fallas_informacion.getController();

            String titulo = "Busqueda de Inconsistencias";

            Scene scene = new Scene(roots);
            Stage stage = new Stage();
            stage.initModality(Modality.WINDOW_MODAL);
            stage.setTitle(titulo);
            scene.setOnKeyPressed(event -> {
                if (event.getCode().toString().equals("ESCAPE")) {
                    stage.close();
                }
            });

            stage.setScene(scene);
            stage.show();

        } catch (IOException ex) {
            Logger.getLogger(PrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //importar_informacion
    private void AbrirImportarInformacion() {
        try {
            FXMLLoader importar_informacion = new FXMLLoader(getClass().getResource("/mantenimiento/vista/importar_informacion.fxml"));

            Parent roots = importar_informacion.load();

            Importar_informacionController controlador = importar_informacion.getController();

            String titulo = "Importar Información desde otros Sistemas";

            Scene scene = new Scene(roots);
            Stage stage = new Stage();
            stage.initModality(Modality.WINDOW_MODAL);
            stage.setTitle(titulo);
            scene.setOnKeyPressed(event -> {
                if (event.getCode().toString().equals("ESCAPE")) {
                    stage.close();
                }
            });

            stage.setScene(scene);
            stage.show();

        } catch (IOException ex) {
            Logger.getLogger(PrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //exportar_informacion
    private void AbrirExportarInformacion() {
        try {
            FXMLLoader exportar_informacion = new FXMLLoader(getClass().getResource("/mantenimiento/vista/exportar_informacion.fxml"));

            Parent roots = exportar_informacion.load();

            Exportar_informacionController controlador = exportar_informacion.getController();

            String titulo = "Exportar Información";

            Scene scene = new Scene(roots);
            Stage stage = new Stage();
            stage.initModality(Modality.WINDOW_MODAL);
            stage.setTitle(titulo);
            scene.setOnKeyPressed(event -> {
                if (event.getCode().toString().equals("ESCAPE")) {
                    stage.close();
                }
            });

            stage.setScene(scene);
            stage.show();

        } catch (IOException ex) {
            Logger.getLogger(PrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //cambio_password
    private void AbrirCambioContrasena() {
        try {
            FXMLLoader cambio_password = new FXMLLoader(getClass().getResource("/mantenimiento/vista/cambio_password.fxml"));

            Parent roots = cambio_password.load();

            Cambio_passwordController controlador = cambio_password.getController();

            String titulo = "Cambio de Clave";

            Scene scene = new Scene(roots);
            Stage stage = new Stage();
            stage.initModality(Modality.WINDOW_MODAL);
            stage.setTitle(titulo);
            scene.setOnKeyPressed(event -> {
                if (event.getCode().toString().equals("ESCAPE")) {
                    stage.close();
                }
            });

            stage.setScene(scene);
            stage.show();

        } catch (IOException ex) {
            Logger.getLogger(PrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //usuarios_permisos
    private void AbrirUsuariosPermisos() {
        try {
            FXMLLoader usuarios_permisos = new FXMLLoader(getClass().getResource("/mantenimiento/vista/usuarios_permisos.fxml"));

            Parent roots = usuarios_permisos.load();

            Usuarios_permisosController controlador = usuarios_permisos.getController();

            String titulo = "Usuarios y Permisos";

            Scene scene = new Scene(roots);
            Stage stage = new Stage();
            stage.initModality(Modality.WINDOW_MODAL);
            stage.setTitle(titulo);
            scene.setOnKeyPressed(event -> {
                if (event.getCode().toString().equals("ESCAPE")) {
                    stage.close();
                }
            });

            stage.setScene(scene);
            stage.show();

        } catch (IOException ex) {
            Logger.getLogger(PrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //bloquear_temporalmente
    private void AbrirBloqueoTemporal() {
        try {
            FXMLLoader bloquear_temporalmente = new FXMLLoader(getClass().getResource("/mantenimiento/vista/bloquear_temporalmente.fxml"));

            Parent roots = bloquear_temporalmente.load();

            Bloquear_temporalmenteController controlador = bloquear_temporalmente.getController();

            String titulo = "Sistema bloqueado por el usuario";

            Scene scene = new Scene(roots);
            Stage stage = new Stage();
            stage.initModality(Modality.WINDOW_MODAL);
            stage.setTitle(titulo);
            scene.setOnKeyPressed(event -> {
                if (event.getCode().toString().equals("ESCAPE")) {
                    stage.close();
                }
            });

            stage.setScene(scene);
            stage.show();

        } catch (IOException ex) {
            Logger.getLogger(PrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //mantenimiento_bd
    private void AbrirMantneimentoBd() {
        try {
            FXMLLoader mantenimiento_bd = new FXMLLoader(getClass().getResource("/mantenimiento/vista/mantenimiento_bd.fxml"));

            Parent roots = mantenimiento_bd.load();

            Mantenimiento_bdController controlador = mantenimiento_bd.getController();

            String titulo = "Mantenimiento y Copia de Base de Datos";

            Scene scene = new Scene(roots);
            Stage stage = new Stage();
            stage.initModality(Modality.WINDOW_MODAL);
            stage.setTitle(titulo);
            scene.setOnKeyPressed(event -> {
                if (event.getCode().toString().equals("ESCAPE")) {
                    stage.close();
                }
            });

            stage.setScene(scene);
            stage.show();

        } catch (IOException ex) {
            Logger.getLogger(PrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //parametrizacion
    private void AbrirParametrizacion() {
        try {
            FXMLLoader parametrizacion = new FXMLLoader(getClass().getResource("/mantenimiento/vista/parametrizacion.fxml"));

            Parent roots = parametrizacion.load();

            ParametrizacionController controlador = parametrizacion.getController();

            String titulo = "Parametrización";

            Scene scene = new Scene(roots);
            Stage stage = new Stage();
            stage.initModality(Modality.WINDOW_MODAL);
            stage.setTitle(titulo);
            scene.setOnKeyPressed(event -> {
                if (event.getCode().toString().equals("ESCAPE")) {
                    stage.close();
                }
            });

            stage.setScene(scene);
            stage.show();

        } catch (IOException ex) {
            Logger.getLogger(PrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //seguimiento_cotizaciones
    private void AbrirSeguiminetoCotizaciones() {
        try {
            FXMLLoader seguimiento_cotizaciones = new FXMLLoader(getClass().getResource("/CRM_clientes/vista/seguimiento_cotizaciones.fxml"));

            Parent roots = seguimiento_cotizaciones.load();

            Seguimiento_cotizacionesController controlador = seguimiento_cotizaciones.getController();

            String titulo = "Seguimiento de Cotizaciones";

            Scene scene = new Scene(roots);
            Stage stage = new Stage();
            stage.initModality(Modality.WINDOW_MODAL);
            stage.setTitle(titulo);
            scene.setOnKeyPressed(event -> {
                if (event.getCode().toString().equals("ESCAPE")) {
                    stage.close();
                }
            });

            stage.setScene(scene);
            stage.show();

        } catch (IOException ex) {
            Logger.getLogger(PrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //seguimiento_clientes
    private void AbrirSeguimientoClientes() {
        try {
            FXMLLoader seguimiento_clientes = new FXMLLoader(getClass().getResource("/CRM_clientes/vista/seguimiento_clientes.fxml"));

            Parent roots = seguimiento_clientes.load();

            Seguimiento_clientesController controlador = seguimiento_clientes.getController();

            String titulo = "Seguimiento de Clientes";

            Scene scene = new Scene(roots);
            Stage stage = new Stage();
            stage.initModality(Modality.WINDOW_MODAL);
            stage.setTitle(titulo);
            scene.setOnKeyPressed(event -> {
                if (event.getCode().toString().equals("ESCAPE")) {
                    stage.close();
                }
            });

            stage.setScene(scene);
            stage.show();

        } catch (IOException ex) {
            Logger.getLogger(PrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //ventas_x_clientes
    private void AbrirVentasPorClientes() {
        try {
            FXMLLoader ventas_x_clientes = new FXMLLoader(getClass().getResource("/CRM_clientes/vista/ventas_x_clientes.fxml"));

            Parent roots = ventas_x_clientes.load();

            Ventas_x_clientesController controlador = ventas_x_clientes.getController();

            String titulo = "Ventas por Cliente";

            Scene scene = new Scene(roots);
            Stage stage = new Stage();
            stage.initModality(Modality.WINDOW_MODAL);
            stage.setTitle(titulo);
            scene.setOnKeyPressed(event -> {
                if (event.getCode().toString().equals("ESCAPE")) {
                    stage.close();
                }
            });

            stage.setScene(scene);
            stage.show();

        } catch (IOException ex) {
            Logger.getLogger(PrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //acerca_de
    private void AbrirAcercaDe() {
        try {
            FXMLLoader acerca_de = new FXMLLoader(getClass().getResource("/CRM_clientes/vista/acerca_de.fxml"));

            Parent roots = acerca_de.load();

            Acerca_deController controlador = acerca_de.getController();

            String titulo = "Acerca de Nosotros";

            Scene scene = new Scene(roots);
            Stage stage = new Stage();
            stage.initModality(Modality.WINDOW_MODAL);
            stage.setTitle(titulo);
            scene.setOnKeyPressed(event -> {
                if (event.getCode().toString().equals("ESCAPE")) {
                    stage.close();
                }
            });

            stage.setScene(scene);
            stage.show();

        } catch (IOException ex) {
            Logger.getLogger(PrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    @FXML
    private void click_consultas_x_documento(ActionEvent event) {
        AbrirConsultDocumentosDeudores();
    }

    @FXML
    private void click_saldo_tercero_x_cuentas(ActionEvent event) {
        AbrirSaldoTerceroCuentas();
    }

    @FXML
    private void click_listado_clientes_saldos(ActionEvent event) {
        AbrirListadoClientesSaldos();
    }

    @FXML
    private void click_analisis_morosidad(ActionEvent event) {
        AbrirAnalisisDeMorosidad();
    }

    @FXML
    private void click_consulta_por_terceros(ActionEvent event) {
        AbrirConsultaPorTerceros();
    }

    @FXML
    private void click_cartera_por_edades(ActionEvent event) {
        AbrirCarteraPorEdades();
    }

    @FXML
    private void click_cartera(ActionEvent event) {
        AbrirCartera();
    }

    @FXML
    private void click_ver_trazabilidad_pedido(ActionEvent event) {
        AbrirTrazabilidadPedido();
    }

    @FXML
    private void click_informes_cotizacion(ActionEvent event) {
        AbrirInformesCotizacion();
    }

    @FXML
    private void click_comisiones_venta_list_doc(ActionEvent event) {
        AbrirComisionesVentaListDoc();
    }

    @FXML
    private void click_informe_factura_marca_seg(ActionEvent event) {
        AbrirInformeFacturaMarcaSeg();
    }

    @FXML
    private void click_informe_remisiones(ActionEvent event) {
        AbrirInformeRemisiones();
    }

    @FXML
    private void click_facturas_pedido(ActionEvent event) {
        AbrirFacturasPedidos();
    }

    @FXML
    private void click_informe_puntos(ActionEvent event) {
        AbrirInformePuntos();
    }

    @FXML
    private void click_comisiones_recaudo(ActionEvent event) {
        AbrirComisionesRecaudo();
    }

    @FXML
    private void click_comisiones_venta(ActionEvent event) {
        AbrirComisionesVenta();
    }

    @FXML
    private void click_informe_pedidos(ActionEvent event) {
        AbrirInformePedidos();
    }

    @FXML
    private void click_nuevos_clientes(ActionEvent event) {
        AbrirNuevosClientes();
    }

    @FXML
    private void click_desc_comerciales(ActionEvent event) {
        AbrirDescComerciales();
    }

    @FXML
    private void click_comparativo_facturacion(ActionEvent event) {
        AbrirComparativoFacturacion();
    }

    @FXML
    private void click_informes_fact_nuevo(ActionEvent event) {
        AbrirInformesFactNuevo();
    }

    @FXML
    private void click_informe_facturacion(ActionEvent event) {
        AbrirInformeFacturacion();
    }

    @FXML
    private void click_email(ActionEvent event) {
        AbrirEviarEmail();
    }

    @FXML
    private void click_historial_operaciones(ActionEvent event) {
        AbrirHistorialOperaciones();
    }

    @FXML
    private void click_examinar_fallas_informacion(ActionEvent event) {
        AbrirExaminarFallasInformacion();
    }

    @FXML
    private void click_importar_informacion(ActionEvent event) {
        AbrirImportarInformacion();
    }

    @FXML
    private void click_exportar_informacion(ActionEvent event) {
        AbrirExportarInformacion();
    }

    @FXML
    private void click_cambio_password(ActionEvent event) {
        AbrirCambioContrasena();
    }

    @FXML
    private void click_bloquear_temporalmente(ActionEvent event) {
        AbrirBloqueoTemporal();
    }

    @FXML
    private void click_usuarios_permisos(ActionEvent event) {
        AbrirUsuariosPermisos();
    }

    @FXML
    private void click_mantenimiento_bd(ActionEvent event) {
        AbrirMantneimentoBd();
    }

    @FXML
    private void click_parametrizacion(ActionEvent event) {
        AbrirParametrizacion();
    }

    @FXML
    private void click_seguimiento_cotizaciones(ActionEvent event) {
        AbrirSeguiminetoCotizaciones();
    }

    @FXML
    private void click_seguimiento_clientes(ActionEvent event) {
        AbrirSeguimientoClientes();
    }

    @FXML
    private void click_ventas_x_clientes(ActionEvent event) {
        AbrirVentasPorClientes();
    }

    @FXML
    private void click_acerca_de(ActionEvent event) {
        AbrirAcercaDe();
    }
}

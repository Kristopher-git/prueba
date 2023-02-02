/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import controlador.PrincipalController;
import controlador.controladores_maestro.Buscar_cuentaController;
import controlador.controladores_maestro.Cuenta_impuestosController;
import controlador.controladores_maestro.CuentasController;
import controlador.controladores_maestro.DepreciacionController;
import controlador.controladores_maestro.ListadoController;
import controlador.controladores_maestro.Plan_de_cuentasController;
import controlador.controladores_maestro.PlanesController;
import controlador.controladores_maestro.PresupuestoController;
import controlador.controladores_maestro.Reclasificacion_cuentasController;
import controlador.controladores_maestro.controladores_centro_costo.Centro_costosController;
import controlador.controladores_maestro.controladores_centro_costo.ReclasificacionController;
import controlador.controladores_maestro.controladores_centro_costo.SubcentroController;
import controlador.controladores_maestro.controladores_regiones_geograficas.Asignar_zonaController;
import controlador.controladores_maestro.controladores_regiones_geograficas.CiudadesController;
import controlador.controladores_maestro.controladores_regiones_geograficas.DepartamentosController;
import controlador.controladores_maestro.controladores_regiones_geograficas.PaisesController;
import controlador.controladores_maestro.controladores_regiones_geograficas.ZonasController;
import controlador.controladores_maestro.controladores_terceros.TercerosController;
import controlador.controladores_maestro.tiposDocumentos.Tipos_documentosController;
import controlador.documentos.DocsController;
import controlador.documentos.comprobante_egreso.Comprobante_de_egresoController;
import controlador.documentos.consignacion_bancaria.Consignacion_bancariaController;
import controlador.documentos.fact_puntVenta_PDV.Busqueda_de_preciosController;
import controlador.documentos.fact_puntVenta_PDV.Cajon_monederoController;
import controlador.documentos.fact_puntVenta_PDV.Sic_punto_ventaController;
import controlador.documentos.mante_docs.Mantenimiento_documentosController;
import controlador.documentos.recibo_caja.Recibo_cajaController;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 *
 * @author User
 */
public class AbrirVentanas {

    FuncionesVarias FuncionesV = new FuncionesVarias();

    public void AbrirPaises(String data, String model) {
        try {
            FXMLLoader paises = new FXMLLoader(getClass().getResource("/vista/vistas_maestros/regiones_geograficas/paises.fxml"));

            Parent root = paises.load();

            PaisesController controlador = paises.getController();

            controlador.estado = data;
            String titulo = "Paises";
            FuncionesV.generarPestallas(root, titulo, model);

        } catch (IOException ex) {
            Logger.getLogger(PrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void AbrirTipoDocumentos(String data, String model) {
        try {
            FXMLLoader tiposDocumentos = new FXMLLoader(getClass().getResource("/vista/vistas_maestros/tipos_documentos/tipos_documentos.fxml"));

            Parent root = tiposDocumentos.load();

            Tipos_documentosController controlador = tiposDocumentos.getController();

            controlador.estado = data;
            String titulo = "Tipos de Documentos";
            FuncionesV.generarPestallas(root, titulo, model);

        } catch (IOException ex) {
            Logger.getLogger(PrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void AbrirCiudades(String ciudad, String model) {
        try {
            FXMLLoader ciudades = new FXMLLoader(getClass().getResource("/vista/vistas_maestros/regiones_geograficas/ciudades.fxml"));

            Parent root = ciudades.load();

            CiudadesController controlador = ciudades.getController();

            controlador.txtdep.setText(ciudad);
            String titulo = "Ciudades";
            FuncionesV.generarPestallas(root, titulo, model);

        } catch (IOException ex) {
            Logger.getLogger(PrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void AbrirZona() {
        try {
            FXMLLoader zonas = new FXMLLoader(getClass().getResource("/vista/vistas_maestros/regiones_geograficas/zonas.fxml"));

            Parent root = zonas.load();

            ZonasController controlador = zonas.getController();

            String titulo = "Zonas";
            FuncionesV.generarPestallas(root, titulo, "si");

        } catch (IOException ex) {
            Logger.getLogger(PrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void AbrirTerceros() {
        try {
            FXMLLoader terceros = new FXMLLoader(getClass().getResource("/vista/vistas_maestros/vistas_terceros/terceros.fxml"));

            Parent root = terceros.load();

            TercerosController controlador = terceros.getController();

            String titulo = "Terceros";
            FuncionesV.generarPestallas(root, titulo, "si");

        } catch (IOException ex) {
            Logger.getLogger(PrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void abrirAsignarZona() {
        try {
            FXMLLoader asignarzona = new FXMLLoader(getClass().getResource("/vista/vistas_maestros/regiones_geograficas/asignar_Zona.fxml"));

            Parent root = asignarzona.load();

            Asignar_zonaController controlador = asignarzona.getController();

            String titulo = "Asignar zona";
            FuncionesV.generarPestallas(root, titulo, "si");

        } catch (IOException ex) {
            Logger.getLogger(PrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void AbrirDepartamentos(String data, String modal) {
        try {
            FXMLLoader departamento = new FXMLLoader(getClass().getResource("/vista/vistas_maestros/regiones_geograficas/departamentos.fxml"));

            Parent root = departamento.load();

            DepartamentosController controlador = departamento.getController();
            controlador.estado = data;
            String titulo = "Departamentos";
            FuncionesV.generarPestallas(root, titulo, modal);

        } catch (IOException ex) {
            Logger.getLogger(PrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void AbrirCentro(String data, String modal) {
        try {
            FXMLLoader centro_costos = new FXMLLoader(getClass().getResource("/vista/vistas_maestros/centro_costos/centro_costos.fxml"));

            Parent root = centro_costos.load();

            Centro_costosController controlador = centro_costos.getController();
            if (!data.equals("")) {
                controlador.btnPasar.setVisible(true);
            }
            controlador.estado = data;
            String titulo = "Centro de Costos";
            FuncionesV.generarPestallas(root, titulo, modal);

        } catch (IOException ex) {
            Logger.getLogger(PrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void AbrirPlanCuentas() {

        try {
            FXMLLoader plan_cuentas = new FXMLLoader(getClass().getResource("/vista/vistas_maestros/plan_de_cuentas.fxml"));

            Parent root = plan_cuentas.load();

            Plan_de_cuentasController controlador = plan_cuentas.getController();

            String titulo = "Plan de Cuentas";
            FuncionesV.generarPestallas(root, titulo, "si");

        } catch (IOException ex) {
            Logger.getLogger(PrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void AbrirReclasificacion() {
        try {

            FXMLLoader loader = new FXMLLoader(getClass().getResource("/vista/vistas_maestros/centro_costos/reclasificacion.fxml"));

            Parent root = loader.load();

            ReclasificacionController controlador = loader.getController();

            String titulo = "Reclasificación de Centro de Costo";
            FuncionesV.generarPestallas(root, titulo, "si");

        } catch (IOException ex) {
            Logger.getLogger(Plan_de_cuentasController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // PESTAÑAS DE ABRIR DE PLAN DE CUENTAS
    public void AbrirBuscarPlanCuentas() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/vista/vistas_maestros/buscar_cuenta.fxml"));

            Parent root = loader.load();

            Buscar_cuentaController controlador = loader.getController();

            String titulo = "Buscando Cuentas";
            FuncionesV.generarPestallas(root, titulo, "si");

        } catch (IOException ex) {
            Logger.getLogger(Plan_de_cuentasController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void AbrirListadoPlanCuentas() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/vista/vistas_maestros/listado.fxml"));

            Parent root = loader.load();

            ListadoController controlador = loader.getController();

            String titulo = "Listar Plan de Cuentas";
            FuncionesV.generarPestallas(root, titulo, "si");

        } catch (IOException ex) {
            Logger.getLogger(Plan_de_cuentasController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void AbrirReclasificacionPlanCuentas() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/vista/vistas_maestros/reclasificacion_cuentas.fxml"));

            Parent root = loader.load();

            Reclasificacion_cuentasController controlador = loader.getController();

            String titulo = "Reclasificación de cuentas";
            FuncionesV.generarPestallas(root, titulo, "si");

        } catch (IOException ex) {
            Logger.getLogger(Plan_de_cuentasController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void AbrirCuentasPlanCuentas() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/vista/vistas_maestros/cuentas.fxml"));

            Parent root = loader.load();

            CuentasController controlador = loader.getController();

            String titulo = "Config. Cuentas";
            FuncionesV.generarPestallas(root, titulo, "si");

        } catch (IOException ex) {
            Logger.getLogger(Plan_de_cuentasController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void AbrirPlanesPlanCuentas() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/vista/vistas_maestros/planes.fxml"));

            Parent root = loader.load();

            PlanesController controlador = loader.getController();

            String titulo = "Plan de Cuentas Maestro";
            FuncionesV.generarPestallas(root, titulo, "si");

        } catch (IOException ex) {
            Logger.getLogger(Plan_de_cuentasController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void AbrirPresupuestoPlanCuentas() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/vista/vistas_maestros/presupuesto.fxml"));

            Parent root = loader.load();

            PresupuestoController controlador = loader.getController();

            String titulo = "Presupuesto";
            FuncionesV.generarPestallas(root, titulo, "si");

        } catch (IOException ex) {
            Logger.getLogger(Plan_de_cuentasController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void AbrirImprimirPlanCuentas() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/vista/vistas_maestros/cuenta_impuestos.fxml"));

            Parent root = loader.load();

            Cuenta_impuestosController controlador = loader.getController();

            String titulo = "Cuenta de impuesto";
            FuncionesV.generarPestallas(root, titulo, "si");

        } catch (IOException ex) {
            Logger.getLogger(Plan_de_cuentasController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void AbrirDepreciaPlanCuentas() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/vista/vistas_maestros/depreciacion.fxml"));

            Parent root = loader.load();

            DepreciacionController controlador = loader.getController();

            String titulo = "Configuración de cuentas";

            FuncionesV.generarPestallas(root, titulo, "si");

        } catch (IOException ex) {
            Logger.getLogger(Plan_de_cuentasController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void AbrirSubCentroCosto(TextField Codigo) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/vista/vistas_maestros/centro_costos/subcentro.fxml"));

            Parent root = loader.load();

            SubcentroController controlador = loader.getController();

            controlador.txtCodigoCentro.setText(Codigo.getText());
            String titulo = "Crear SubCentro de Costo";
            FuncionesV.generarPestallas(root, titulo, "si");

        } catch (IOException ex) {
            Logger.getLogger(Plan_de_cuentasController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void AbrirMantenimientoDocumentos(String data, String model) {
        try {
            FXMLLoader mantenimiento_documentos = new FXMLLoader(getClass().getResource("/vista/documentos/mante_docs/mantenimiento_documentos.fxml"));

            Parent root = mantenimiento_documentos.load();

            Mantenimiento_documentosController controlador = mantenimiento_documentos.getController();

            controlador.estado = data;
            String titulo = "Documentos";
            FuncionesV.generarPestallas(root, titulo, model);

        } catch (IOException ex) {
            Logger.getLogger(PrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void AbrirCajonMonedero(String data, String model) {
        try {
            FXMLLoader cajonMonedero = new FXMLLoader(getClass().getResource("/vista/documentos/fact_puntoVenta_PDV/cajon_monedero.fxml"));

            Parent root = cajonMonedero.load();

            Cajon_monederoController controlador = cajonMonedero.getController();

            controlador.estado = data;
            String titulo = "Abrir Cajón monedero";
            FuncionesV.generarPestallas(root, titulo, model);

        } catch (IOException ex) {
            Logger.getLogger(PrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void AbrirBusquedaPrecos(String data, String model) {
        try {
            FXMLLoader busquedaPrecios = new FXMLLoader(getClass().getResource("/vista/documentos/fact_puntoVenta_PDV/busqueda_de_precios.fxml"));

            Parent root = busquedaPrecios.load();

            Busqueda_de_preciosController controlador = busquedaPrecios.getController();

            controlador.estado = data;
            String titulo = "Busqueda de Precios";
            FuncionesV.generarPestallas(root, titulo, model);

        } catch (IOException ex) {
            Logger.getLogger(PrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void AbrirComprobanteEgreso(String data, String model) {
        try {
            FXMLLoader comprobante_egreso = new FXMLLoader(getClass().getResource("/vista/documentos/comprobante_egreso/comprobante_de_egreso.fxml"));

            Parent root = comprobante_egreso.load();

            Comprobante_de_egresoController controlador = comprobante_egreso.getController();

            controlador.estado = data;
            String titulo = "Comprobante de egreso";
            FuncionesV.generarPestallas(root, titulo, model);

        } catch (IOException ex) {
            Logger.getLogger(PrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void AbrirReciboCaja(String data, String model) {
        try {
            FXMLLoader recibo_caja = new FXMLLoader(getClass().getResource("/vista/documentos/recibo_caja/recibo_caja.fxml"));

            Parent root = recibo_caja.load();

            Recibo_cajaController controlador = recibo_caja.getController();

            controlador.estado = data;
            String titulo = "Recibo de Caja";
            FuncionesV.generarPestallas(root, titulo, model);

        } catch (IOException ex) {
            Logger.getLogger(PrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void AbrirConsignacionBancaria(String data, String model) {
        try {
            FXMLLoader consignacion_bancaria = new FXMLLoader(getClass().getResource("/vista/documentos/consignacion_bancaria/consignacion_bancaria.fxml"));

            Parent root = consignacion_bancaria.load();

            Consignacion_bancariaController controlador = consignacion_bancaria.getController();

            controlador.estado = data;
            String titulo = "Consignacion";
            FuncionesV.generarPestallas(root, titulo, model);

        } catch (IOException ex) {
            Logger.getLogger(PrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

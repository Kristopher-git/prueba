/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.maestros.PlanCuentas;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javax.swing.JOptionPane;
import modelo.FuncionesVarias;
import modelo.model;

/**
 *
 * @author User
 */
public class planCuentasModel {

    private String CodigoPlanCuentas;
    private String NombrePlanCuentas;
    private String NaturalezaPlanCuentas;
    private String codigo_plan_unico;
    private String codigoCCosto;
    private String codigoSCCosto;
    private String codigoMaestro;
    private boolean maneja_tercero;
    private boolean maneja_ccosto;
    private boolean maneja_cuenta_inventario;
    private boolean maneja_cxc;
    private boolean se_deprecia;
    private boolean es_cuenta_impuesto;
    private boolean maneja_presupuesto;
    private boolean es_cuenta_corriente;
    private boolean no_genera_interes;

    model con = new model();
    Connection conexion = con.conectarme();
    FuncionesVarias funciones = new FuncionesVarias();
    private ObservableList<planCuentasModel> obs;

    public planCuentasModel(String CodigoPlanCuentas, String NombrePlanCuentas, String NaturalezaPlanCuentas, String codigoCCosto, String codigoSCCosto) {
        this.CodigoPlanCuentas = CodigoPlanCuentas;
        this.NombrePlanCuentas = NombrePlanCuentas;
        this.NaturalezaPlanCuentas = NaturalezaPlanCuentas;
        this.codigoCCosto = codigoCCosto;
        this.codigoSCCosto = codigoSCCosto;
        this.codigo_plan_unico = this.getPlanUnicoDefectoParametrizacion();

    }

    public planCuentasModel(String CodigoPlanCuentas, String NombrePlanCuentas, String NaturalezaPlanCuentas, String codigoCCosto, String codigoSCCosto, boolean maneja_tercero, boolean maneja_ccosto, boolean maneja_cuenta_inventario, boolean maneja_cxc, boolean se_deprecia, boolean es_cuenta_impuesto, boolean maneja_presupuesto, boolean es_cuenta_corriente, boolean no_genera_interes) {
        this.CodigoPlanCuentas = CodigoPlanCuentas;
        this.NombrePlanCuentas = NombrePlanCuentas;
        this.NaturalezaPlanCuentas = NaturalezaPlanCuentas;
        this.codigoCCosto = codigoCCosto;
        this.codigoSCCosto = codigoSCCosto;
        this.maneja_tercero = maneja_tercero;
        this.maneja_ccosto = maneja_ccosto;
        this.maneja_cuenta_inventario = maneja_cuenta_inventario;
        this.maneja_cxc = maneja_cxc;
        this.se_deprecia = se_deprecia;
        this.es_cuenta_impuesto = es_cuenta_impuesto;
        this.maneja_presupuesto = maneja_presupuesto;
        this.es_cuenta_corriente = es_cuenta_corriente;
        this.no_genera_interes = no_genera_interes;
        this.codigo_plan_unico = this.getPlanUnicoDefectoParametrizacion();

    }

    public planCuentasModel(String CodigoPlanCuentas, String NombrePlanCuentas) {
        this.CodigoPlanCuentas = CodigoPlanCuentas;
        this.NombrePlanCuentas = NombrePlanCuentas;
    }

    public planCuentasModel(String CodigoPlanCuentas) {
        this.CodigoPlanCuentas = CodigoPlanCuentas;
        this.codigo_plan_unico = this.getPlanUnicoDefectoParametrizacion();
    }

    public planCuentasModel(String CodigoPlanCuentas, String NombrePlanCuentas, String codigoMaestro) {
        this.CodigoPlanCuentas = CodigoPlanCuentas;
        this.NombrePlanCuentas = NombrePlanCuentas;
        this.codigoMaestro = codigoMaestro;
    }

    public planCuentasModel() {
    }

    public String getCodigoMaestro() {
        return codigoMaestro;
    }

    public void setCodigoMaestro(String codigoMaestro) {
        this.codigoMaestro = codigoMaestro;
    }

    public String getCodigoPlanCuentas() {
        return CodigoPlanCuentas;
    }

    public void setCodigoPlanCuentas(String CodigoPlanCuentas) {
        this.CodigoPlanCuentas = CodigoPlanCuentas;
    }

    public String getNombrePlanCuentas() {
        return NombrePlanCuentas;
    }

    public void setNombrePlanCuentas(String NombrePlanCuentas) {
        this.NombrePlanCuentas = NombrePlanCuentas;
    }

    public String getNaturalezaPlanCuentas() {
        return NaturalezaPlanCuentas;
    }

    public void setNaturalezaPlanCuentas(String NaturalezaPlanCuentas) {
        this.NaturalezaPlanCuentas = NaturalezaPlanCuentas;
    }

    public String getCodigoCCosto() {
        return codigoCCosto;
    }

    public void setCodigoCCosto(String codigoCCosto) {
        this.codigoCCosto = codigoCCosto;
    }

    public String getCodigoSCCosto() {
        return codigoSCCosto;
    }

    public void setCodigoSCCosto(String codigoSCCosto) {
        this.codigoSCCosto = codigoSCCosto;
    }

    public boolean isManeja_tercero() {
        return maneja_tercero;
    }

    public void setManeja_tercero(boolean maneja_tercero) {
        this.maneja_tercero = maneja_tercero;
    }

    public boolean isManeja_ccosto() {
        return maneja_ccosto;
    }

    public void setManeja_ccosto(boolean maneja_ccosto) {
        this.maneja_ccosto = maneja_ccosto;
    }

    public boolean isManeja_cuenta_inventario() {
        return maneja_cuenta_inventario;
    }

    public void setManeja_cuenta_inventario(boolean maneja_cuenta_inventario) {
        this.maneja_cuenta_inventario = maneja_cuenta_inventario;
    }

    public boolean isManeja_cxc() {
        return maneja_cxc;
    }

    public void setManeja_cxc(boolean maneja_cxc) {
        this.maneja_cxc = maneja_cxc;
    }

    public boolean isSe_deprecia() {
        return se_deprecia;
    }

    public void setSe_deprecia(boolean se_deprecia) {
        this.se_deprecia = se_deprecia;
    }

    public boolean isEs_cuenta_impuesto() {
        return es_cuenta_impuesto;
    }

    public void setEs_cuenta_impuesto(boolean es_cuenta_impuesto) {
        this.es_cuenta_impuesto = es_cuenta_impuesto;
    }

    public boolean isManeja_presupuesto() {
        return maneja_presupuesto;
    }

    public void setManeja_presupuesto(boolean maneja_presupuesto) {
        this.maneja_presupuesto = maneja_presupuesto;
    }

    public boolean isEs_cuenta_corriente() {
        return es_cuenta_corriente;
    }

    public void setEs_cuenta_corriente(boolean es_cuenta_corriente) {
        this.es_cuenta_corriente = es_cuenta_corriente;
    }

    public boolean isNo_genera_interes() {
        return no_genera_interes;
    }

    public void setNo_genera_interes(boolean no_genera_interes) {
        this.no_genera_interes = no_genera_interes;
    }

    public boolean insertarPlanCuentas() {
        try {
            int maneja_tercero = 0;
            int maneja_ccosto = 0;
            int maneja_cuenta_inventario = 0;
            int maneja_cxc = 0;
            int se_deprecia = 0;
            int es_cuenta_impuesto = 0;
            int maneja_presupuesto = 0;
            int es_cuenta_corriente = 0;
            int no_genera_intereses = 0;

            if (this.isManeja_tercero() == true) {
                maneja_tercero = 1;
            }
            if (this.isManeja_ccosto() == true) {
                maneja_ccosto = 1;
            }
            if (this.isManeja_cuenta_inventario() == true) {
                maneja_cuenta_inventario = 1;
            }
            if (this.isManeja_cxc() == true) {
                maneja_cxc = 1;
            }
            if (this.isSe_deprecia() == true) {
                se_deprecia = 1;
            }
            if (this.isEs_cuenta_impuesto() == true) {
                es_cuenta_impuesto = 1;
            }
            if (this.isManeja_presupuesto() == true) {
                maneja_presupuesto = 1;
            }
            if (this.isEs_cuenta_corriente() == true) {
                es_cuenta_corriente = 1;
            }
            if (this.isNo_genera_interes() == true) {
                no_genera_intereses = 1;
            }

            java.sql.Statement st = conexion.createStatement();

            String sql = "INSERT INTO plan_cuentas(codigo,nombre,naturaleza,maneja_tercero,maneja_ccosto,maneja_cuenta_inventario,maneja_cxc,se_deprecia,es_cuenta_impuesto,maneja_presupuesto,es_cuenta_corriente,no_genera_interes,codigoccosto,codigosccosto,cod_maestro)"
                    + "values("
                    + "'" + this.getCodigoPlanCuentas() + "',"
                    + "'" + this.getNombrePlanCuentas() + "',"
                    + "'" + this.getNaturalezaPlanCuentas() + "',"
                    + "'" + maneja_tercero + "',"
                    + "'" + maneja_ccosto + "',"
                    + "'" + maneja_cuenta_inventario + "',"
                    + "'" + maneja_cxc + "',"
                    + "'" + se_deprecia + "',"
                    + "'" + es_cuenta_impuesto + "',"
                    + "'" + maneja_presupuesto + "',"
                    + "'" + es_cuenta_corriente + "',"
                    + "'" + no_genera_intereses + "',"
                    + "'" + this.getCodigoCCosto() + "',"
                    + "'" + this.getCodigoSCCosto() + "',"
                    + "'" + 1 + "'"
                    + ")";
            st.execute(sql);
            st.close();
            conexion.close();
            return true;
        } catch (Exception e) {
            funciones.alerta(null, "Error", "El codigo que esta intentando ingresar ya se encuentra registrado..." + e);
        }
        return false;
    }

    public boolean existePlanCuenta() {

        PreparedStatement ps = null;
        ResultSet rs = null;
        try {

            ps = conexion.prepareStatement("SELECT * FROM plan_cuentas WHERE codigo = ? and cod_maestro = ?");
            ps.setString(1, this.CodigoPlanCuentas);
            ps.setString(2, this.codigo_plan_unico);
            rs = ps.executeQuery();
            if (rs.next()) {
                return true;
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudo ejecutar la existencia" + e, "Mensaje", JOptionPane.ERROR_MESSAGE);
        }

        return false;

    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final planCuentasModel other = (planCuentasModel) obj;
        if (!Objects.equals(this.CodigoPlanCuentas, other.CodigoPlanCuentas)) {
            return false;
        }
        return Objects.equals(this.NombrePlanCuentas, other.NombrePlanCuentas);
    }

    public ObservableList<planCuentasModel> getPlanCuentas() {

        obs = FXCollections.observableArrayList();

        try {

            java.sql.Statement st = conexion.createStatement();

            String sql = "SELECT codigo,nombre,cod_maestro FROM plan_cuentas order by codigo";

            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {

                String codigo = rs.getString("codigo");
                String nombre = rs.getString("nombre");

                planCuentasModel plancuentas = new planCuentasModel(codigo, nombre);

                obs.add(plancuentas);

            }

            st.close();
            con.cerrar();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No pudieron mostrar los planes de cuenta: " + e, "Mensaje", JOptionPane.ERROR_MESSAGE);

        }

        return obs;
    }

    private String getPlanUnicoDefectoParametrizacion() {

        try {
            java.sql.Statement st = conexion.createStatement();

            String sql = ("SELECT codigo_plan_unico FROM cuntas_maestro");
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                return rs.getString("codigo_plan_unico");
            }
            st.close();
            con.cerrar();

        } catch (Exception e) {
            System.out.println(e);
        }
        return null;

    }

//Actualiza
    public boolean actualizarPlan() {

        PreparedStatement ps = null;

        int maneja_tercero = 0;
        int maneja_ccosto = 0;
        int maneja_cuenta_inventario = 0;
        int maneja_cxc = 0;
        int se_deprecia = 0;
        int es_cuenta_impuesto = 0;
        int maneja_presupuesto = 0;
        int es_cuenta_corriente = 0;
        int no_genera_intereses = 0;

        if (this.isManeja_tercero() == true) {
            maneja_tercero = 1;
        }
        if (this.isManeja_ccosto() == true) {
            maneja_ccosto = 1;
        }
        if (this.isManeja_cuenta_inventario() == true) {
            maneja_cuenta_inventario = 1;
        }
        if (this.isManeja_cxc() == true) {
            maneja_cxc = 1;
        }
        if (this.isSe_deprecia() == true) {
            se_deprecia = 1;
        }
        if (this.isEs_cuenta_impuesto() == true) {
            es_cuenta_impuesto = 1;
        }
        if (this.isManeja_presupuesto() == true) {
            maneja_presupuesto = 1;
        }
        if (this.isEs_cuenta_corriente() == true) {
            es_cuenta_corriente = 1;
        }
        if (this.isNo_genera_interes() == true) {
            no_genera_intereses = 1;
        }

        try {
            String query = "UPDATE plan_cuentas SET nombre = ?, naturaleza = ?, "
                    + "maneja_tercero = ?, maneja_ccosto = ?, maneja_cuenta_inventario = ?, "
                    + "maneja_cxc = ?, se_deprecia = ?, es_cuenta_impuesto = ?,"
                    + "maneja_presupuesto = ?, es_cuenta_corriente = ?, no_genera_interes = ?,"
                    + "codigoccosto = ?, codigosccosto = ? WHERE codigo = ? AND cod_maestro = ?";
            ps = conexion.prepareStatement(query);
            ps.setString(1, this.NombrePlanCuentas);
            ps.setString(2, this.NaturalezaPlanCuentas);
            ps.setInt(3, maneja_tercero);
            ps.setInt(4, maneja_ccosto);
            ps.setInt(5, maneja_cuenta_inventario);
            ps.setInt(6, maneja_cxc);
            ps.setInt(7, se_deprecia);
            ps.setInt(8, es_cuenta_impuesto);
            ps.setInt(9, maneja_presupuesto);
            ps.setInt(10, es_cuenta_corriente);
            ps.setInt(11, no_genera_intereses);
            ps.setString(12, this.codigoCCosto);
            ps.setString(13, this.codigoSCCosto);
            ps.setString(14, this.CodigoPlanCuentas);
            ps.setString(15, this.codigo_plan_unico);
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            System.out.println("error" + e.getMessage());
        }

        return false;
    }

    public short eliminarPlan() {

        PreparedStatement ps = null;

        try {
            String SQL = "DELETE FROM plan_cuentas WHERE codigo = ?";
            ps = conexion.prepareStatement(SQL);
            ps.setString(1, this.getCodigoPlanCuentas());
            ps.executeUpdate();
            return 1;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return 0;
        }
    }

    public planCuentasModel filtro_plan_cuenta() {

        PreparedStatement ps = null;
        ResultSet rs = null;
        planCuentasModel filtro = null;

        try {
            String sql = ("SELECT p.nombre, p.naturaleza, c.nombre_centro,sc.nombre as nombre_sc, p.maneja_tercero, p.maneja_ccosto, p.maneja_cuenta_inventario, p.maneja_cxc, p.se_deprecia, p.es_cuenta_impuesto, p.maneja_presupuesto, p.es_cuenta_corriente, p.no_genera_interes FROM plan_cuentas as p left join centro_costo as c on p.codigoccosto = c.codigo left join subcentro_costo as sc on sc.id_centro_costo= c.codigo where p.codigo = '"+this.CodigoPlanCuentas+"' and p.cod_maestro = '1'");
            ps = conexion.prepareStatement(sql);
            rs = ps.executeQuery(sql);

            while (rs.next()) {
                String nombre = rs.getString("nombre");
                String naturaleza = rs.getString("naturaleza");
                String ccosto = rs.getString("nombre_centro");
                String scosto = rs.getString("nombre_sc");
                boolean maneja_tercero = rs.getBoolean("maneja_tercero");
                boolean maneja_ccosto = rs.getBoolean("maneja_ccosto");
                boolean maneja_cuenta_inventario = rs.getBoolean("maneja_cuenta_inventario");
                boolean maneja_cxc = rs.getBoolean("maneja_cxc");
                boolean se_deprecia = rs.getBoolean("se_deprecia");
                boolean es_cuenta_impuesto = rs.getBoolean("es_cuenta_impuesto");
                boolean maneja_presupuesto = rs.getBoolean("maneja_presupuesto");
                boolean es_cuenta_corriente = rs.getBoolean("es_cuenta_corriente");
                boolean no_genera_interes = rs.getBoolean("no_genera_interes");
                filtro = new planCuentasModel(this.CodigoPlanCuentas, nombre, naturaleza, ccosto, scosto, maneja_tercero, maneja_ccosto, maneja_cuenta_inventario, maneja_cxc, se_deprecia, es_cuenta_impuesto, maneja_presupuesto, es_cuenta_corriente, no_genera_interes);
            }

        } catch (Exception e) {
            System.out.println(e);
        }

        return filtro;
    }

    /* MOSTRAR TODOS LOS PLANES DE CUENTAS*/
    public ObservableList<planCuentasModel> showPlanesAll() {

        Connection conexiones = con.conectarme();
        obs = FXCollections.observableArrayList();

        try {
            java.sql.Statement st = conexiones.createStatement();

            String SQL = "SELECT * FROM plan_cuentas ORDER BY codigo;";
            ResultSet rs = st.executeQuery(SQL);

            while (rs.next()) {

                String codigo = rs.getString("codigo");
                String nombre = rs.getString("nombre");
                String codigo_plan_unico = rs.getString("cod_maestro");

                planCuentasModel p = new planCuentasModel(codigo, nombre, codigo_plan_unico);
                obs.add(p);

            }

        } catch (SQLException ex) {
            Logger.getLogger(planCuentasModel.class.getName()).log(Level.SEVERE, null, ex);
        }

        return obs;
    }
}

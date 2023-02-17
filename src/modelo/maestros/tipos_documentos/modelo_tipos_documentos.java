/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.maestros.tipos_documentos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javax.swing.JOptionPane;
import modelo.FuncionesVarias;
import modelo.model;

/**
 *
 * @author User
 */
public class modelo_tipos_documentos {

    model con = new model();
    Connection conexion = con.conectarme();
    FuncionesVarias funciones = new FuncionesVarias();
    private ObservableList<modelo_tipos_documentos> obs;
    private ObservableList<modelo_tipos_documentos> medpago;
    private ObservableList<modelo_tipos_documentos> bodegas;
    
    private String codigo;
    private String nombre;
    private ImageView imagen;
    private String codigo_cantidad;
    private String clasedoc;
    private String nombre_Clase;
    
    // PRINCIPAL - VARIBLES
    private int modo_pago;
    private int bodega;
    private int centro_costo;
    private int subcentro_costo;
    private String lista_precios;
    private int list_prec_prede;
    private int ut_siem_bodeg_pred;
    private int no_camb_bodegas;
    private int puede_facturar_serv;
    private int desactivar_desc_general_fv;
    private int preg_consecutivo;
    private int precios_pdv;
    private int mostrar_interfaz_efectivo;
    private int no_cambiar_lgeneral;
    private int modo_pago_fijo;
    private int inactivo;
    private String turno;
    private String bodega2;
    private String nota_translado;
    private String nombre_centro_costo;
    private String nombre_subcentro_costo;
    private String nombre_precio;
    private String nombre_bodega2;
    
    // IMP 1 - VARIABLES
    private int formato_personalizado;
    private int generar_archivo;
    private int no_imprime;
    private int permitir_sobrep_items_usados;
    private int max_items_permi_doc;
    
    // IMP 2 - VARIABLES
    private String encabezado1;
    private String encabezado2;
    private String encabezado3;
    private String encabezado4;
    private String encabezado5;
    private String pie_pagina1;
    private String pie_pagina2;
    private String pie_pagina3;
    private String pie_pagina4;
    private String pie_pagina5;
    private int nombre_documento;
    private int si_es_copia;
    private int desc_factura;
    private int seg_productos;
    
    // IMP 3
    private String leyenda_pie_pag_doc;
    
    // FISCAL
    private String No;
    private String Fecha;
    private int vigencia_meses;
    private String prefijo;
    private String desde;
    private String hasta;
    private int ne_inicio;
    private int genera_iva_consumo;
    private int genera_fact_elec_nomina;
    private int no_calc_iva;
    private int genera_factura_elect_lote;
    private int retencion_aplicar;
    private int iva_asumido_r_simplificado;
    private int factura_elect_contig;
    private int calc_cree;
    private String creep;
    private String crees;
    
    // PDV
    private int abrir_cajon_billetes;
    private int utilizar_impresion_pdv;
    
    // PROM
    private int mostra_evento_consect;
    private String detalle_evento;
    
    // REFERENCIAS
    private int num1;
    private int num2;
    private int num3;
    private int num4;
    private String nombref1;
    private String nombref2;
    private String nombref3;
    private String nombref4;
    
    // INVENTARIO
    private String uso_nota_inventarios;
    private int registrar_modificar_costo_prod;
    private int maneja_invent_period_tipo_doc;
    private int permite_fact_negativo;
    
    // SEGUIMIENTOS
    private String usuarios;
    private String pcid;
    
    // OTROS
    private int excluir_consolidacion_empresas;
    private int tratamiento_como_translados_sucursales;
    private int aplicar_efecto_nulo_todos_docs;
    private int documento_origen_externo;
    private int existenc_consig_parafc;
    private int no_tener_cuenta_form_mts2;
    private int no_cambiar_centro_costo;
    private String grupo;
    private String docu;
    private String cliente_defecto;
    
    
    // METODOS DE PAGO
    private String nombre_metodo_pago;
    private int id_metodo_pago;
    
    public modelo_tipos_documentos(String nombre_metodo_pago, int id_metodo_pago) {
        this.nombre_metodo_pago = nombre_metodo_pago;
        this.id_metodo_pago = id_metodo_pago;
    }

    public String getNombre_metodo_pago() {
        return nombre_metodo_pago;
    }

    public void setNombre_metodo_pago(String nombre_metodo_pago) {
        this.nombre_metodo_pago = nombre_metodo_pago;
    }

    public int getId_metodo_pago() {
        return id_metodo_pago;
    }

    public void setId_metodo_pago(int id_metodo_pago) {
        this.id_metodo_pago = id_metodo_pago;
    }

    // BODEGA
    private String nombre_bodega;
    private int id_bodega;
    private String codigo_bodega;

    public modelo_tipos_documentos(String nombre_bodega, int id_bodega, String codigo_bodega) {
        this.nombre_bodega = nombre_bodega;
        this.id_bodega = id_bodega;
        this.codigo_bodega = codigo_bodega;
    }

    public ObservableList<modelo_tipos_documentos> getMedpago() {
        return medpago;
    }

    public void setMedpago(ObservableList<modelo_tipos_documentos> medpago) {
        this.medpago = medpago;
    }

    public String getNombre_bodega() {
        return nombre_bodega;
    }

    public void setNombre_bodega(String nombre_bodega) {
        this.nombre_bodega = nombre_bodega;
    }

    public int getId_bodega() {
        return id_bodega;
    }

    public void setId_bodega(int id_bodega) {
        this.id_bodega = id_bodega;
    }

    public String getNombre_centro_costo() {
        return nombre_centro_costo;
    }

    public void setNombre_centro_costo(String nombre_centro_costo) {
        this.nombre_centro_costo = nombre_centro_costo;
    }

    public String getNombre_subcentro_costo() {
        return nombre_subcentro_costo;
    }

    public void setNombre_subcentro_costo(String nombre_subcentro_costo) {
        this.nombre_subcentro_costo = nombre_subcentro_costo;
    }

    public String getNombre_precio() {
        return nombre_precio;
    }

    public void setNombre_precio(String nombre_precio) {
        this.nombre_precio = nombre_precio;
    }

    public String getNombre_bodega2() {
        return nombre_bodega2;
    }

    public void setNombre_bodega2(String nombre_bodega2) {
        this.nombre_bodega2 = nombre_bodega2;
    }

    public int getInactivo() {
        return inactivo;
    }

    public void setInactivo(int inactivo) {
        this.inactivo = inactivo;
    }

    
    
    
    
    // OTROS GETTERS AND SETTERS
    public int getExcluir_consolidacion_empresas() {
        return excluir_consolidacion_empresas;
    }

    public void setExcluir_consolidacion_empresas(int excluir_consolidacion_empresas) {
        this.excluir_consolidacion_empresas = excluir_consolidacion_empresas;
    }

    public int getTratamiento_como_translados_sucursales() {
        return tratamiento_como_translados_sucursales;
    }

    public void setTratamiento_como_translados_sucursales(int tratamiento_como_translados_sucursales) {
        this.tratamiento_como_translados_sucursales = tratamiento_como_translados_sucursales;
    }

    public int getAplicar_efecto_nulo_todos_docs() {
        return aplicar_efecto_nulo_todos_docs;
    }

    public void setAplicar_efecto_nulo_todos_docs(int aplicar_efecto_nulo_todos_docs) {
        this.aplicar_efecto_nulo_todos_docs = aplicar_efecto_nulo_todos_docs;
    }

    public int getDocumento_origen_externo() {
        return documento_origen_externo;
    }

    public void setDocumento_origen_externo(int documento_origen_externo) {
        this.documento_origen_externo = documento_origen_externo;
    }

    public int getExistenc_consig_parafc() {
        return existenc_consig_parafc;
    }

    public void setExistenc_consig_parafc(int existenc_consig_parafc) {
        this.existenc_consig_parafc = existenc_consig_parafc;
    }

    public int getNo_tener_cuenta_form_mts2() {
        return no_tener_cuenta_form_mts2;
    }

    public void setNo_tener_cuenta_form_mts2(int no_tener_cuenta_form_mts2) {
        this.no_tener_cuenta_form_mts2 = no_tener_cuenta_form_mts2;
    }

    public int getNo_cambiar_centro_costo() {
        return no_cambiar_centro_costo;
    }

    public void setNo_cambiar_centro_costo(int no_cambiar_centro_costo) {
        this.no_cambiar_centro_costo = no_cambiar_centro_costo;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public String getDocu() {
        return docu;
    }

    public void setDocu(String docu) {
        this.docu = docu;
    }

    public String getCliente_defecto() {
        return cliente_defecto;
    }

    public void setCliente_defecto(String cliente_defecto) {
        this.cliente_defecto = cliente_defecto;
    }
    // HASTA AQUI

    
    // SEGUIMIENTOS GETTERS AND SETTERS
    public String getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(String usuarios) {
        this.usuarios = usuarios;
    }

    public String getPcid() {
        return pcid;
    }

    public void setPcid(String pcid) {
        this.pcid = pcid;
    }
    // HASTA AQUI
    
    // INVENTARIO GETTERS AND SETTERS
    public String getUso_nota_inventarios() {
        return uso_nota_inventarios;
    }

    public void setUso_nota_inventarios(String uso_nota_inventarios) {
        this.uso_nota_inventarios = uso_nota_inventarios;
    }

    public int getRegistrar_modificar_costo_prod() {
        return registrar_modificar_costo_prod;
    }

    public void setRegistrar_modificar_costo_prod(int registrar_modificar_costo_prod) {
        this.registrar_modificar_costo_prod = registrar_modificar_costo_prod;
    }

    public int getManeja_invent_period_tipo_doc() {
        return maneja_invent_period_tipo_doc;
    }

    public void setManeja_invent_period_tipo_doc(int maneja_invent_period_tipo_doc) {
        this.maneja_invent_period_tipo_doc = maneja_invent_period_tipo_doc;
    }

    public int getPermite_fact_negativo() {
        return permite_fact_negativo;
    }

    public void setPermite_fact_negativo(int permite_fact_negativo) {
        this.permite_fact_negativo = permite_fact_negativo;
    }
    // HASTA AQUI
        
    // PRINCIPAL GETTERS AND SETTERS

    public int getModo_pago() {
        return modo_pago;
    }

    public void setModo_pago(int modo_pago) {
        this.modo_pago = modo_pago;
    }

    public int getBodega() {
        return bodega;
    }

    public void setBodega(int bodega) {
        this.bodega = bodega;
    }

    public int getCentro_costo() {
        return centro_costo;
    }

    public void setCentro_costo(int centro_costo) {
        this.centro_costo = centro_costo;
    }

    public int getSubcentro_costo() {
        return subcentro_costo;
    }

    public void setSubcentro_costo(int subcentro_costo) {
        this.subcentro_costo = subcentro_costo;
    }

    public String getLista_precios() {
        return lista_precios;
    }

    public void setLista_precios(String lista_precios) {
        this.lista_precios = lista_precios;
    }

    public int getList_prec_prede() {
        return list_prec_prede;
    }

    public void setList_prec_prede(int list_prec_prede) {
        this.list_prec_prede = list_prec_prede;
    }

    public int getUt_siem_bodeg_pred() {
        return ut_siem_bodeg_pred;
    }

    public void setUt_siem_bodeg_pred(int ut_siem_bodeg_pred) {
        this.ut_siem_bodeg_pred = ut_siem_bodeg_pred;
    }

    public int getNo_camb_bodegas() {
        return no_camb_bodegas;
    }

    public void setNo_camb_bodegas(int no_camb_bodegas) {
        this.no_camb_bodegas = no_camb_bodegas;
    }

    public int getPuede_facturar_serv() {
        return puede_facturar_serv;
    }

    public void setPuede_facturar_serv(int puede_facturar_serv) {
        this.puede_facturar_serv = puede_facturar_serv;
    }

    public int getDesactivar_desc_general_fv() {
        return desactivar_desc_general_fv;
    }

    public void setDesactivar_desc_general_fv(int desactivar_desc_general_fv) {
        this.desactivar_desc_general_fv = desactivar_desc_general_fv;
    }

    public int getPreg_consecutivo() {
        return preg_consecutivo;
    }

    public void setPreg_consecutivo(int preg_consecutivo) {
        this.preg_consecutivo = preg_consecutivo;
    }

    public int getPrecios_pdv() {
        return precios_pdv;
    }

    public void setPrecios_pdv(int precios_pdv) {
        this.precios_pdv = precios_pdv;
    }

    public int getMostrar_interfaz_efectivo() {
        return mostrar_interfaz_efectivo;
    }

    public void setMostrar_interfaz_efectivo(int mostrar_interfaz_efectivo) {
        this.mostrar_interfaz_efectivo = mostrar_interfaz_efectivo;
    }

    public int getNo_cambiar_lgeneral() {
        return no_cambiar_lgeneral;
    }

    public void setNo_cambiar_lgeneral(int no_cambiar_lgeneral) {
        this.no_cambiar_lgeneral = no_cambiar_lgeneral;
    }

    public int getModo_pago_fijo() {
        return modo_pago_fijo;
    }

    public void setModo_pago_fijo(int modo_pago_fijo) {
        this.modo_pago_fijo = modo_pago_fijo;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public String getBodega2() {
        return bodega2;
    }

    public void setBodega2(String bodega2) {
        this.bodega2 = bodega2;
    }

    public String getNota_translado() {
        return nota_translado;
    }

    public void setNota_translado(String nota_translado) {
        this.nota_translado = nota_translado;
    }
     
    // HASTA AQUI
   
    // IMP 1
    public int getGenerar_archivo() {
        return generar_archivo;
    }

    public void setGenerar_archivo(int generar_archivo) {
        this.generar_archivo = generar_archivo;
    }

    public int getNo_imprime() {
        return no_imprime;
    }

    public void setNo_imprime(int no_imprime) {
        this.no_imprime = no_imprime;
    }

    public int getPermitir_sobrep_items_usados() {
        return permitir_sobrep_items_usados;
    }

    public void setPermitir_sobrep_items_usados(int permitir_sobrep_items_usados) {
        this.permitir_sobrep_items_usados = permitir_sobrep_items_usados;
    }

    public int getMax_items_permi_doc() {
        return max_items_permi_doc;
    }

    public void setMax_items_permi_doc(int max_items_permi_doc) {
        this.max_items_permi_doc = max_items_permi_doc;
    }
              
    // HASTA QUI
    
    // IMP 2
    public int getFormato_personalizado() {
        return formato_personalizado;
    }

    public void setFormato_personalizado(int formato_personalizado) {
        this.formato_personalizado = formato_personalizado;
    }

    public String getEncabezado1() {
        return encabezado1;
    }

    public void setEncabezado1(String encabezado1) {
        this.encabezado1 = encabezado1;
    }

    public String getEncabezado2() {
        return encabezado2;
    }

    public void setEncabezado2(String encabezado2) {
        this.encabezado2 = encabezado2;
    }

    public String getEncabezado3() {
        return encabezado3;
    }

    public void setEncabezado3(String encabezado3) {
        this.encabezado3 = encabezado3;
    }

    public String getEncabezado4() {
        return encabezado4;
    }

    public void setEncabezado4(String encabezado4) {
        this.encabezado4 = encabezado4;
    }

    public String getEncabezado5() {
        return encabezado5;
    }

    public void setEncabezado5(String encabezado5) {
        this.encabezado5 = encabezado5;
    }

    public String getPie_pagina1() {
        return pie_pagina1;
    }

    public void setPie_pagina1(String pie_pagina1) {
        this.pie_pagina1 = pie_pagina1;
    }

    public String getPie_pagina2() {
        return pie_pagina2;
    }

    public void setPie_pagina2(String pie_pagina2) {
        this.pie_pagina2 = pie_pagina2;
    }

    public String getPie_pagina3() {
        return pie_pagina3;
    }

    public void setPie_pagina3(String pie_pagina3) {
        this.pie_pagina3 = pie_pagina3;
    }

    public String getPie_pagina4() {
        return pie_pagina4;
    }

    public void setPie_pagina4(String pie_pagina4) {
        this.pie_pagina4 = pie_pagina4;
    }

    public String getPie_pagina5() {
        return pie_pagina5;
    }

    public void setPie_pagina5(String pie_pagina5) {
        this.pie_pagina5 = pie_pagina5;
    }

    public int getNombre_documento() {
        return nombre_documento;
    }

    public void setNombre_documento(int nombre_documento) {
        this.nombre_documento = nombre_documento;
    }

    public int getSi_es_copia() {
        return si_es_copia;
    }

    public void setSi_es_copia(int si_es_copia) {
        this.si_es_copia = si_es_copia;
    }

    public int getDesc_factura() {
        return desc_factura;
    }

    public void setDesc_factura(int desc_factura) {
        this.desc_factura = desc_factura;
    }

    public int getSeg_productos() {
        return seg_productos;
    }

    public void setSeg_productos(int seg_productos) {
        this.seg_productos = seg_productos;
    }
           
    // HASTA AQUI
    
    // IMP 3
    public String getLeyenda_pie_pag_doc() {
        return leyenda_pie_pag_doc;
    }

    public void setLeyenda_pie_pag_doc(String leyenda_pie_pag_doc) {    
        this.leyenda_pie_pag_doc = leyenda_pie_pag_doc;
    }

    // HASTA AQUI
    
    // FILCAL

    public String getNo() {
        return No;
    }

    public void setNo(String No) {
        this.No = No;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public int getVigencia_meses() {
        return vigencia_meses;
    }

    public void setVigencia_meses(int vigencia_meses) {
        this.vigencia_meses = vigencia_meses;
    }

    public String getPrefijo() {
        return prefijo;
    }

    public void setPrefijo(String prefijo) {
        this.prefijo = prefijo;
    }

    public String getDesde() {
        return desde;
    }

    public void setDesde(String desde) {
        this.desde = desde;
    }

    public String getHasta() {
        return hasta;
    }

    public void setHasta(String hasta) {
        this.hasta = hasta;
    }

    public int getNe_inicio() {
        return ne_inicio;
    }

    public void setNe_inicio(int ne_inicio) {
        this.ne_inicio = ne_inicio;
    }

    public int getGenera_iva_consumo() {
        return genera_iva_consumo;
    }

    public void setGenera_iva_consumo(int genera_iva_consumo) {
        this.genera_iva_consumo = genera_iva_consumo;
    }

    public int getGenera_fact_elec_nomina() {
        return genera_fact_elec_nomina;
    }

    public void setGenera_fact_elec_nomina(int genera_fact_elec_nomina) {
        this.genera_fact_elec_nomina = genera_fact_elec_nomina;
    }

    public int getNo_calc_iva() {
        return no_calc_iva;
    }

    public void setNo_calc_iva(int no_calc_iva) {
        this.no_calc_iva = no_calc_iva;
    }

    public int getGenera_factura_elect_lote() {
        return genera_factura_elect_lote;
    }

    public void setGenera_factura_elect_lote(int genera_factura_elect_lote) {
        this.genera_factura_elect_lote = genera_factura_elect_lote;
    }

    public int getRetencion_aplicar() {
        return retencion_aplicar;
    }

    public void setRetencion_aplicar(int retencion_aplicar) {
        this.retencion_aplicar = retencion_aplicar;
    }

    public int getIva_asumido_r_simplificado() {
        return iva_asumido_r_simplificado;
    }

    public void setIva_asumido_r_simplificado(int iva_asumido_r_simplificado) {
        this.iva_asumido_r_simplificado = iva_asumido_r_simplificado;
    }

    public int getFactura_elect_contig() {
        return factura_elect_contig;
    }

    public void setFactura_elect_contig(int factura_elect_contig) {
        this.factura_elect_contig = factura_elect_contig;
    }

    public int getCalc_cree() {
        return calc_cree;
    }

    public void setCalc_cree(int calc_cree) {
        this.calc_cree = calc_cree;
    }

    public String getCreep() {
        return creep;
    }

    public void setCreep(String creep) {
        this.creep = creep;
    }

    public String getCrees() {
        return crees;
    }

    public void setCrees(String crees) {
        this.crees = crees;
    }
    // HASTA AQUI
    
    // PDV

    public int getAbrir_cajon_billetes() {
        return abrir_cajon_billetes;
    }

    public void setAbrir_cajon_billetes(int abrir_cajon_billetes) {
        this.abrir_cajon_billetes = abrir_cajon_billetes;
    }

    public int getUtilizar_impresion_pdv() {
        return utilizar_impresion_pdv;
    }

    public void setUtilizar_impresion_pdv(int utilizar_impresion_pdv) {
        this.utilizar_impresion_pdv = utilizar_impresion_pdv;
    }        
    // HASTA AQUI
    
    // PROM
    public int getMostra_evento_consect() {
        return mostra_evento_consect;
    }

    public void setMostra_evento_consect(int mostra_evento_consect) {
        this.mostra_evento_consect = mostra_evento_consect;
    }

    public String getDetalle_evento() {
        return detalle_evento;
    }

    public void setDetalle_evento(String detalle_evento) {
        this.detalle_evento = detalle_evento;
    }
    // HASTA AQUI
    
    // REFERENCIAS
    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int getNum3() {
        return num3;
    }

    public void setNum3(int num3) {
        this.num3 = num3;
    }

    public int getNum4() {
        return num4;
    }

    public void setNum4(int num4) {
        this.num4 = num4;
    }

    public String getNombref1() {
        return nombref1;
    }

    public void setNombref1(String nombref1) {
        this.nombref1 = nombref1;
    }

    public String getNombref2() {
        return nombref2;
    }

    public void setNombref2(String nombref2) {
        this.nombref2 = nombref2;
    }

    public String getNombref3() {
        return nombref3;
    }

    public void setNombref3(String nombref3) {
        this.nombref3 = nombref3;
    }

    public String getNombref4() {
        return nombref4;
    }

    public void setNombref4(String nombref4) {
        this.nombref4 = nombref4;
    }
    //HASTA AQUI
    
    public String getNombre_Clase() {
        return nombre_Clase;
    }

    public void setNombre_Clase(String nombre_Clase) {
        this.nombre_Clase = nombre_Clase;
    }

    public String getClasedoc() {
        return clasedoc;
    }

    public void setClasedoc(String clasedoc) {
        this.clasedoc = clasedoc;
    }

    public String getCodigo_cantidad() {
        return codigo_cantidad;
    }

    public void setCodigo_cantidad(String codigo_cantidad) {
        this.codigo_cantidad = codigo_cantidad;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ImageView getImagen() {
        return imagen;
    }

    public void setImagen(ImageView imagen) {
        this.imagen = imagen;
    }

    public modelo_tipos_documentos() {
    }

    public modelo_tipos_documentos(String codigo, String nombre, String clasedocs) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.clasedoc = clasedocs;
    }

    public modelo_tipos_documentos(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }
    
    

    public ObservableList<modelo_tipos_documentos> get_tipo_documentos() {

        obs = FXCollections.observableArrayList();

        try {
            java.sql.Statement st = conexion.createStatement();
            String sql = "SELECT codigo,nombre,clasedoc FROM tipodocs order by codigo";
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                String codigo = rs.getString("codigo");
                String nombre = rs.getString("nombre");
                String clasedocs = rs.getString("clasedoc");
                //Image img = new Image(getClass().getResourceAsStream("../../../img/botones/documentos.png"));
                //mageView image = new ImageView(img);
                modelo_tipos_documentos plancuentas = new modelo_tipos_documentos(codigo, nombre, clasedocs);

                obs.add(plancuentas);
            }
            
            st.close();
            conexion.close();
            con.cerrar();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No pudieron mostrar los tipos de documentos: " + e, "Mensaje", JOptionPane.ERROR_MESSAGE);
        }
        return obs;
    }
    
    public void get_un_documento(String codigo){
                
        try {
            
            java.sql.Statement st = conexion.createStatement();
            String sql = "SELECT t.detapie, t.impdivs, t.impridtos, t.infcopia, t.impnom, t.detpie1, t.detpie2, t.detpie3, t.detpie4, t.detpie5, t.encabe1, t.encabe2, t.encabe3, t.encabe4, t.encabe5, t.maxitemsx, t.maxitems, t.noimp, t.filealter, t.impper, t.inactivo, p.nombre_precio, b.nombre as bodega_nombre, b2.nombre as bodega2_nombre, cc.nombre_centro, sc.nombre as sc_nombre, m.nombre, t.caraefe, t.nolista, t.modoprm, t.turno, t.bodega2, t.docu2, t.codigo_cantidad, t.lprefij, t.forbodega, t.nocamb, t.maneserv, t.dtocli, t.preconiva, t.consecmanu FROM tipodocs as t left join medpago as m on t.fpago = m.id left join bodega as b on t.bodega = b.id left join centro_costo as cc on cc.id_centro_costo = t.ccosto left join subcentro_costo as sc on sc.id_subcentro = t.succosto left join precios as p on p.codigo = t.precio left join bodega as b2 on b2.codigo = t.bodega2 WHERE t.codigo='"+codigo+"'";
            ResultSet rs = st.executeQuery(sql);
            if(rs.next()){
                String cantidad = rs.getString("codigo_cantidad");
                // PRINCIPAL
                int lista_precio  = rs.getInt("lprefij");
                int utilizar_siemp_bodega_pred = rs.getInt("forbodega");
                int no_cambiar_bodegas = rs.getInt("nocamb");
                int puede_facturar_serve = rs.getInt("maneserv");
                int desactivar_doc_general = rs.getInt("dtocli");
                int preg_consecutiv = rs.getInt("consecmanu");
                int precio_pdv = rs.getInt("preconiva");
                int mostrar_interfaz_efec = rs.getInt("caraefe");
                int no_cambiar_lgeneral = rs.getInt("nolista");
                int modo_pago_fijo = rs.getInt("modoprm");
                String turno = rs.getString("turno");
                String bodega_2 = rs.getString("bodega2");
                String documento_2 = rs.getString("docu2");
                String modo_pago = rs.getString("nombre");
                String bodega = rs.getString("bodega_nombre");
                String centro_costo = rs.getString("nombre_centro");
                String sc_nombre = rs.getString("sc_nombre");
                String nombre_precio = rs.getString("nombre_precio");
                String bodega2_nombre = rs.getString("bodega2_nombre");
                int inactivo = rs.getInt("inactivo");
                int formato_personalizado = rs.getInt("impper");
                int generar_archivo = rs.getInt("filealter");
                int no_imprime = rs.getInt("noimp");
                int maximo_items_permitido_doc = rs.getInt("maxitems");
                int permitir_sobrepasar_items = rs.getInt("maxitemsx");
                String encabezado1 = rs.getString("encabe1");
                String encabezado2 = rs.getString("encabe2");
                String encabezado3 = rs.getString("encabe3");
                String encabezado4 = rs.getString("encabe4");
                String encabezado5 = rs.getString("encabe5");
                String pie_pagina1 = rs.getString("detpie1");
                String pie_pagina2 = rs.getString("detpie2");
                String pie_pagina3 = rs.getString("detpie3");
                String pie_pagina4 = rs.getString("detpie4");
                String pie_pagina5 = rs.getString("detpie5");
                int nombre_documento = rs.getInt("impnom");
                int si_Es_copia = rs.getInt("infcopia");
                int descuentos_factura = rs.getInt("impridtos");
                int seg_productos = rs.getInt("impdivs");
                String leyenda_pie_pagina = rs.getString("detapie");
                
                if (modo_pago == null){
                    modo_pago = "";
                }
                if (bodega == null){
                    bodega = "";
                }
                if (centro_costo == null){
                    centro_costo = "";
                }
                if (sc_nombre == null){
                    sc_nombre = "";
                }
                if (nombre_precio == null){
                    nombre_precio = "";
                }
                if (bodega2_nombre == null){
                    bodega2_nombre = "";
                }
                
                setCodigo_cantidad(cantidad);
                setList_prec_prede(lista_precio);
                setUt_siem_bodeg_pred(utilizar_siemp_bodega_pred);
                setNo_camb_bodegas(no_cambiar_bodegas);
                setPuede_facturar_serv(puede_facturar_serve);
                setDesactivar_desc_general_fv(desactivar_doc_general);
                setPreg_consecutivo(preg_consecutiv);
                setPrecios_pdv(precio_pdv);
                setMostrar_interfaz_efectivo(mostrar_interfaz_efec);
                setNo_cambiar_lgeneral(no_cambiar_lgeneral);
                setModo_pago_fijo(modo_pago_fijo);
                setTurno(turno);
                setBodega2(bodega_2);
                setNota_translado(documento_2);
                setNombre_metodo_pago(modo_pago);
                setNombre_bodega(bodega);
                setNombre_centro_costo(centro_costo);
                setNombre_subcentro_costo(sc_nombre);
                setNombre_precio(nombre_precio);
                setNombre_bodega2(bodega2_nombre);
                setInactivo(inactivo);
                setFormato_personalizado(formato_personalizado);
                setGenerar_archivo(generar_archivo);
                setNo_imprime(no_imprime);
                setMax_items_permi_doc(maximo_items_permitido_doc);
                setPermitir_sobrep_items_usados(permitir_sobrepasar_items);
                setEncabezado1(encabezado1);
                setEncabezado2(encabezado2);
                setEncabezado3(encabezado3);
                setEncabezado4(encabezado4);
                setEncabezado5(encabezado5);
                setPie_pagina1(pie_pagina1);
                setPie_pagina2(pie_pagina2);
                setPie_pagina3(pie_pagina3);
                setPie_pagina4(pie_pagina4);
                setPie_pagina5(pie_pagina5);
                setNombre_documento(nombre_documento);
                setSi_es_copia(si_Es_copia);
                setDesc_factura(descuentos_factura);
                setSeg_productos(seg_productos);
                setLeyenda_pie_pag_doc(leyenda_pie_pagina);
            }
            st.close();
            conexion.close();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No pudo encontrar documento" +e, "Mensaje", JOptionPane.ERROR_MESSAGE);
        }    
    }
    public void get_un_clase(String clasedoc){
                
        try {
            
            java.sql.Statement st = conexion.createStatement();
            String sql = "SELECT * FROM clase_documentos WHERE codigo_clase='"+clasedoc+"'";
            ResultSet rs = st.executeQuery(sql);
            if(rs.next()){
                String nombre_clase = rs.getString("nombre_clase");
                setNombre_Clase(nombre_clase);
            }
            st.close();
            conexion.close();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No consultar la clase"+e, "Mensaje", JOptionPane.ERROR_MESSAGE);
        }    
    }
    public ObservableList<modelo_tipos_documentos> get_metodos_pago(){
        
        medpago = FXCollections.observableArrayList();
        try {
            
            java.sql.Statement st = conexion.createStatement();
            String sql = "SELECT * FROM medpago";
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                String nombre_clase = rs.getString("nombre");
                int id_clase = rs.getInt("id");
                
                modelo_tipos_documentos metodos_pago = new modelo_tipos_documentos(nombre_clase, id_clase);

                medpago.add(metodos_pago);
            }
            st.close();
            conexion.close();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al consultar metodos de pago"+e, "Mensaje", JOptionPane.ERROR_MESSAGE);
        }
        return medpago;
    }
    public ObservableList<modelo_tipos_documentos> get_bodegas(){
        
        bodegas = FXCollections.observableArrayList();
        try {
            
            java.sql.Statement st = conexion.createStatement();
            String sql = "SELECT * FROM bodega";
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                String nombre_bodega = rs.getString("nombre");
                int id_bodega = rs.getInt("id");
                String codigo_bodega = rs.getString("codigo");
                
                modelo_tipos_documentos bodega = new modelo_tipos_documentos(nombre_bodega, id_bodega,codigo_bodega);

                bodegas.add(bodega);
            }
            st.close();
            conexion.close();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al consultar bodegas"+e, "Mensaje", JOptionPane.ERROR_MESSAGE);
        }
        return bodegas;
    }
}

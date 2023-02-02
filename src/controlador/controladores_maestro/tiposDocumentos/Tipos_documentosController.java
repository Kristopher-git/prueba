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
                
                System.out.println(clasedoc);
                try {
                    FXMLLoader documentos = new FXMLLoader(getClass().getResource("/vista/vistas_maestros/tipos_documentos/tiposinterfaz.fxml"));

                    Parent root = documentos.load();

                    TiposinterfazController controlador = documentos.getController();

                    // controlador.txtdep.setText(ciudad);
                    // controlador.codeDepartamento = codigoDep;
                    controlador.txtCodigo.setText(codigo);
                    controlador.txtNombre.setText(nombre);
                    controlador.txtNumero.setText(model.getCodigo_cantidad());
                    controlador.txtClase.setText(nombre);
                    controlador.claseDocs = clasedoc;
                    if (clasedoc.equals("CC") || clasedoc.equals("CO")){
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

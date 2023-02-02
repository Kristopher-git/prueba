/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.function.UnaryOperator;
import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.TextFormatter;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.util.converter.IntegerStringConverter;

/**
 *
 * @author User
 */
public class FuncionesVarias {

    public static Stage generarPestallas(Parent var1, String var2, String modal){
        Scene scene = new Scene(var1);
        Stage stage = new Stage();
        stage.initModality(Modality.NONE);
        stage.setTitle(var2);
        scene.setOnKeyPressed(event -> {
            if(event.getCode().toString().equals("ESCAPE")){
                stage.close();
            }
        });
        stage.setScene(scene);
        if(modal.equals("si")){
             stage.showAndWait();
        }else if(modal.equals("no")){
            stage.show();
        }
    
        return stage;
        

    }
    
    
    public void alerta(String header, String title, String contentido){
        Alert alerta = new Alert(Alert.AlertType.INFORMATION);
        alerta.setHeaderText(header);
        alerta.setTitle(title);
        alerta.setContentText(contentido);
        alerta.showAndWait();
    }
    
    public void  TipoTextoHexaNumericoDeTres(TextField Texto){
        UnaryOperator<TextFormatter.Change> StringFilter = change -> {
        String newText = change.getControlNewText();
        int newLenght = change.getControlNewText().length();            
            if(change.isContentChange()){
                if(newLenght < 4){
                    change.setText(change.getText().toUpperCase());
                    return change;
                }else{
                    return null;
                }
            }    
            return change;          
        };
        
        
        TextFormatter<String> formato= new TextFormatter(StringFilter);
        Texto.setTextFormatter(formato);
    }
    
    public void TipoTextoMayuscula(TextField Texto){
        
        Texto.setTextFormatter(new TextFormatter<>((change) -> {
            
             change.setText(change.getText().toUpperCase());
             
             return change;
             
         }));
        
    }
    
    public void TipoTextoNumericoDeDosCaracteres(TextField Texto){
            UnaryOperator<TextFormatter.Change> integerFilter = change -> {
            String newText = change.getControlNewText();
            int newLenght = change.getControlNewText().length();            
            if(change.isContentChange()){
                if(newLenght < 3 && newText.matches("-?([0-9]*)?")){
                return change;
                }else{
                    return null;
                }
            }    
            return change;          
        };

        TextFormatter<String> formato= new TextFormatter((integerFilter));
        Texto.setTextFormatter(formato);
    }
    
    public void TipoTextoNumericoDeTresCaracteres(TextField Texto){
            UnaryOperator<TextFormatter.Change> integerFilter = change -> {
            String newText = change.getControlNewText();
            int newLenght = change.getControlNewText().length();            
            if(change.isContentChange()){
                if(newLenght < 4 && newText.matches("-?([0-9]*)?")){
                return change;
                }else{
                    return null;
                }
            }    
            return change;          
        };

        TextFormatter<String> formato= new TextFormatter((integerFilter));
        Texto.setTextFormatter(formato);
    }
    
    public void TipoTextoDosCaracteres(TextField Texto){
            UnaryOperator<TextFormatter.Change> StringFilter = change -> {
            String newText = change.getControlNewText();
            int newLenght = change.getControlNewText().length();            
            if(change.isContentChange()){
                if(newLenght < 3 && !newText.matches("[0-9]")){
                    change.setText(change.getText().toUpperCase());
                    return change;
                }else{
                    return null;
                }
            }    
            return change;          
        };

        TextFormatter<String> formato= new TextFormatter((StringFilter));
        Texto.setTextFormatter(formato);
    }
    
    public void TipoTextoNumerico(TextField Texto){
        UnaryOperator<TextFormatter.Change> integerFilter = change -> {
        String newText = change.getControlNewText();
        int newLenght = change.getControlNewText().length();            
        if(change.isContentChange()){
            if(newText.matches("-?([0-9]*)?")){
            return change;
            }else{
                return null;
            }
        }    
        return change;          
        };

        TextFormatter<Integer> formato= new TextFormatter(new IntegerStringConverter(),0,(integerFilter));
        Texto.setTextFormatter(formato);
    }
}

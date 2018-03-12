/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch01.firstapp.main;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author barcvilla
 */
public class MainJavaFx extends Application
{
    @Override
    public void start(Stage stage) throws Exception 
    {
        Label label = new Label("Enter your name: ");
        TextField textField = new TextField();
        Button button = new Button("Ok");
        
        button.setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent event)
            {
                String msg = "";
                String name = textField.getText();
                if(name.trim().length() > 0)
                {
                    msg = "Hello " + name;
                }
                else
                {
                    msg = "Hello there";
                }
                
                Alert alert = new Alert(Alert.AlertType.INFORMATION.INFORMATION);
                alert.setTitle("Informacion dialog");
                alert.setHeaderText(null);
                alert.setContentText(msg);
                alert.showAndWait();
            }
        });
        
        // creamos contenedor
        VBox root = new VBox(label, textField, button);
        
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    
    public static void main(String[] args) {
        Application.launch(args);
    }
}

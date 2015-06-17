/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication1;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;

/**
 * FXML Controller class
 *
 * @author dezynetech
 */
public class NewController implements Initializable {

     @FXML
    private Label label;
    private static Button button;
    
    @FXML
    private void handleButtonAction1(ActionEvent event) {
        System.out.println("You clicked Next");
        
    }
    @FXML
    
    private void handleButtonAction2(ActionEvent event)
    {
       
        
    }
    @FXML
    private void handleButtonAction3(ActionEvent event)
    {
        System.exit(1);
    }
   
    @FXML
    private void handleButtonAction4(ActionEvent event)
    {
         //FileChooser fc= new FileChooser

            FileChooser fc;
         fc = new FileChooser();
         configureFileChooser(fc);
         fc.showOpenDialog(null);
            
    }
        public static void configureFileChooser(final FileChooser fileChooser)
        {
            fileChooser.setTitle("Open PDF Files");
            
           fileChooser.getExtensionFilters().addAll(
            new FileChooser.ExtensionFilter("PDF","*.PDF")
            
            );
        
        }
        


    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}

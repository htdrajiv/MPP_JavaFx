package com.mum.labs.lab6.javaFx.problem4.logincss;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * Created by Rajiv on 5/31/2016.
 */
public class LoginController
        implements Initializable {

    @FXML
    private Button myButton; // Value injected by FXMLLoader
    @FXML
    private Text actiontarget;


    @Override // This method is called by the FXMLLoader when initialization is complete
    public void initialize(URL fxmlFileLocation, ResourceBundle resources) {
        assert myButton != null : "fx:id=\"myButton\" was not injected: something wrong in your FXML file 'Login.fxml'.";
        assert actiontarget != null : "fx:id=\"targetText\" was not injected: something wrong in your FXML file 'Login.fxml'.";

        // initialize of logic : all @FXML variables will have been injected
        myButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                actiontarget.setText("Submit Button Pressed");
            }
        });

    }

}

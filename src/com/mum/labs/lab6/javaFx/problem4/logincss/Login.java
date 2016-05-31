package com.mum.labs.lab6.javaFx.problem4.logincss;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.awt.*;
import java.io.IOException;

public class Login extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @FXML
    public void actionListener(ActionEvent event){
        System.out.println("abc");
    };

    @Override
    public void start(Stage primaryStage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Login.fxml"));
        primaryStage.setTitle("FXML Welcome");
        Scene scene = new Scene(root, 300, 275);
        primaryStage.setScene(scene);
        scene.getStylesheets().add(getClass().getResource("Login.css").toExternalForm());
        primaryStage.show();

    }
}
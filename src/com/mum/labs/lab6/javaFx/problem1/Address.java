package com.mum.labs.lab6.javaFx.problem1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Address extends Application{
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		
		Parent root = FXMLLoader.load(getClass().getResource("Address.fxml"));
		Scene scene = new Scene(root, 300, 200);
		stage.setTitle("Address");
		stage.setScene(scene);
		stage.show();
		
	}

}

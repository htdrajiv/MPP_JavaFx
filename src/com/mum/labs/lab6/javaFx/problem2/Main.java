package com.lab6.problem2;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Control;
import javafx.scene.control.TextField;

public class Main extends Application {

	@FXML
	TextField txtInputLetter;

	@FXML
	TextField txtOutputLetter;

	@FXML
	public void buttonPressed(ActionEvent event) {
		Object source = event.getSource();
		String id = ((Control) source).getId();
		String letters;
		switch (id) {
		case "btnCountLetters":
			// System.out.println("count");
			letters = txtInputLetter.getText();
			txtOutputLetter.setText(String.format("%d", letters.length()));
			break;

		case "btnReverseLetter":
			letters = txtInputLetter.getText();
			txtOutputLetter.setText(String.format(new StringBuilder(letters).reverse().toString()));

			break;

		case "btnRemDuplicate":
			letters = txtInputLetter.getText();
			txtOutputLetter.setText(removeDuplicates(letters));
			break;
		}
	}

	String removeDuplicates(String s) {
		StringBuilder noDupes = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			String si = s.substring(i, i + 1);
			if (noDupes.indexOf(si) == -1) {
				noDupes.append(si);
			}
		}
		return noDupes.toString();
	}

	@Override
	public void start(Stage stage) {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("Main.fxml"));

			Scene scene = new Scene(root, 300, 275);

			stage.setTitle("Lab6 Problem 2");
			stage.setScene(scene);

			stage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}

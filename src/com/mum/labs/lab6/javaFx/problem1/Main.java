package com.lab6.problem1;
	
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Text;


public class Main extends Application {
 
	@Override
	public void start(Stage stage) {
		try {
			  Parent root = FXMLLoader.load(getClass().getResource("prob1.fxml"));
			    
		        Scene scene = new Scene(root, 300, 275);
		    
		        stage.setTitle("Lab6 Problem 1");
		        stage.setScene(scene);
		        
		        stage.show();
		        
		  	  Button button = (Button)root.lookup("#btnSubmit");
		      button.setOnAction(new EventHandler<ActionEvent>() {

		          @Override
		          public void handle(ActionEvent e) {  
		        	  TextField actiontarget = (TextField) root.lookup("#txtName");
		        	  String name = actiontarget.getText();
		        	  
		        	  actiontarget = (TextField) root.lookup("#txtStreet");
		        	  String street = actiontarget.getText();
		        	  
		        	  actiontarget = (TextField) root.lookup("#txtCity");
		        	  String city = actiontarget.getText();
		        	  
		        	  actiontarget = (TextField) root.lookup("#txtState");
		        	  String state = actiontarget.getText();
		        	  
		        	  actiontarget = (TextField) root.lookup("#txtZip");
		        	  String zip = actiontarget.getText();
		        	  
		        	  if(!name.equals("") && !street.equals("") && !city.equals("") && !state.equals("") && !zip.equals(""))
		        	  {
			        	  System.out.println(name);

			        	  System.out.println(street);

			        	  System.out.print(city+ ", ");
 
			        	  System.out.print(state);
			        	  
			        	  System.out.print(zip);
			        	  
			        	  Text actionText = (Text) root.lookup("#actiontarget");
		        		  actionText.setText("Submited");
		        	  }
		        	  else
		        	  {
		        		  Text actionText = (Text) root.lookup("#actiontarget");
		        		  actionText.setText("Please fill up the form first");
		        	  }
		        	 
		        	  
		          }
		      });
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}

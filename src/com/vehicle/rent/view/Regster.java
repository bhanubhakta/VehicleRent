package com.vehicle.rent.view;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Regster extends Application {
    Stage window;
    Scene scene1, scene2;
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("RegistrationForm.fxml"));
        window = primaryStage;
        
//        window.setTitle("VHS User Registration");
//        window.setScene(new Scene(root, 600, 475));
//        window.show();        
        TextField firstNameText = (TextField)root.lookup("#firstNameText");
        TextField lastNameText = (TextField)root.lookup("#lastNameText");
        TextField phoneNumberText = (TextField)root.lookup("#phoneNumberText");
        TextField addressText = (TextField)root.lookup("#addressText");
        
        Button button = (Button)root.lookup("#registerBtn");
        button.setOnAction(new EventHandler<ActionEvent>() {
        	 @Override
             public void handle(ActionEvent e) { 
//        		 System.out.println("ohmbhrimsankate");
        		 if(firstNameText.getText().isEmpty() || lastNameText.getText().isEmpty() || phoneNumberText.getText().isEmpty() || addressText.getText().isEmpty()){
     	        	
     	        	 //to do
     	        	
     	        }
     	        else{
        		 window.setScene(scene2); 
     	        }
             }            
        });        
        StackPane layout1 = new StackPane();
        layout1.getChildren().addAll(root);
        scene1 = new Scene(layout1,800, 700);        
        
        Parent root1 = FXMLLoader.load(getClass().getResource("UserDashboard.fxml"));
        StackPane layout2 = new StackPane();
        layout2.getChildren().add(root1);
        scene2 = new Scene(layout2, 800, 700);	
        
        window.setScene(scene1);
        window.show();       
    }
    
    public static void main(String[] args) {
        Application.launch(args);
    }
}

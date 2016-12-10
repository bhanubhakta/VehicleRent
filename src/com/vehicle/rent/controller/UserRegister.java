package com.vehicle.rent.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class UserRegister {
	
	 @FXML private TextField firstNameText,lastNameText,phoneNumberText,addressText;
	 
	 @FXML protected void handleRegisterButtonAction(ActionEvent event) {
	        if(firstNameText.getText().isEmpty() 
	        		|| lastNameText.getText().isEmpty() 
	        		|| phoneNumberText.getText().isEmpty() 
	        		|| addressText.getText().isEmpty()){
	        	
	        	 //to do
	        	
	        }
	        else{
	        	
	        	System.out.println("ohmbhrimsankatemamarogamnashayaswahaa");
	        	
//	        	
//	        	try{
//	        		
//	        		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("com.vehicle.rent.view/UserDashboard.fxml"));
//		            Parent root1 = (Parent) fxmlLoader.load();
//		            Stage stage = new Stage();
//	                stage.setScene(new Scene(root1));  
//	                stage.show();
//	        	}
//	        	 catch(Exception e) {
//	                 e.printStackTrace();
 //                }
	        	
	        	
	        }
	    }

}

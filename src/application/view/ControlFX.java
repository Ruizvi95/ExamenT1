package application.view;

import java.io.IOException;

import com.jfoenix.controls.JFXButton;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class ControlFX {
	@FXML
	JFXButton boton;
	
	@FXML
	JFXButton botonCerrar;
	
	
	Stage stage;
	@FXML
	public void sendStage(){
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("GetMe.fxml"));
			
			AnchorPane ventanaDos = (AnchorPane) loader.load();

			
				
			
			 stage = new Stage();
			
			
			
			Scene scene = new Scene(ventanaDos);
			stage.setTitle("GET ME");
			stage.setScene(scene);
			stage.show();
			
			Stage thisStage= (Stage) boton.getScene().getWindow();
			thisStage.close();	

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	@FXML
	public void  closeStage(){
	
		Stage thisStage= (Stage) botonCerrar.getScene().getWindow();
		thisStage.close();
	
	}
}

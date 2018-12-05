package application.view;

import java.io.IOException;

import com.jfoenix.controls.JFXButton;

import javafx.animation.FadeTransition;
import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Tooltip;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.util.Duration;

public class ControlFX {
	@FXML
	ImageView imagen; 
	
	@FXML
	JFXButton boton;
	
	@FXML
	JFXButton botonCerrar;
	
	
	Stage stage;
	
	public void initialize() {
		
//		Tooltip tooltip = new Tooltip("“Do you know me?");
//		boton.setTooltip(tooltip);
		
		
		FadeTransition fadeTransition = new FadeTransition(
				Duration.seconds(3), imagen);
		fadeTransition.setFromValue(0);
		fadeTransition.setToValue(1);
		fadeTransition.play();

	}
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

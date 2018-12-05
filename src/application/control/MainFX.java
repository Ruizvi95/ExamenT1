package application.control;
	
import java.io.IOException;

import com.jfoenix.controls.JFXButton;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.scene.Scene;
import javafx.scene.control.Tooltip;
import javafx.scene.effect.GaussianBlur;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Font;

/**
 * 
 * @author ruizv
 * @version 1.0
 * @see application.view.ControlFX
 * 
 */


public class MainFX extends Application {
	private AnchorPane mypane;
	
	@FXML
	JFXButton boton;
	
	
	@Override
	public void start(Stage primaryStage) {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/application/view/Profile.fxml"));
		
		
		try {
			mypane = (AnchorPane) loader.load();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Font.loadFont(
				getClass().getResourceAsStream(
						"/application/view/assets/PoiretOne-Regular"), 20);
		
//		primaryStage.initStyle(StageStyle.UNDECORATED);
		
		
		
		
		primaryStage.setTitle("My GitHub Profile");
		primaryStage.setScene(new Scene(mypane));
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
	

}

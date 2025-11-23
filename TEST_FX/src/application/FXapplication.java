package application;

import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class FXapplication extends Application {
	
	private Image icon = new Image ("assets/icon.png") ;
	

	// just launch the app 
	public static void launchApp ( String [] args ) {
		Application.launch(args);
	}
	
	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
	
		Parent root = FXMLLoader.load( getClass().getResource("Main.fxml" ) ) ;
		Scene scene = new Scene (root) ;
		
		
		stage.getIcons().add( icon );
		stage.setScene(scene) ;
		stage.show();
		
	}

}

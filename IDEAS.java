package application;

import javafx.geometry.Insets;
import javafx.application.Application;  
import javafx.event.ActionEvent;  
import javafx.event.EventHandler;  
import javafx.scene.Scene;  
import javafx.scene.control.Button;  
import javafx.stage.Stage;  
import javafx.scene.layout.GridPane;
import javafx.scene.control.TextField;
import java.lang.StringBuilder;

public class IDEAS extends Application {
	//area of declaration
	Button btnNewFile;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		GridPane gp = new GridPane();
		Button btnNewFile = new Button("New File");

		gp.add(btnNewFile, 1, 0);

		Scene scene = new Scene(gp, 1920, 1080);
		primaryStage.setFullScreen(true);
		primaryStage.setTitle("IDE - AS");
    primaryStage.setScene(scene);

    primaryStage.show();
	}

	public static void main(String... args) {
		launch(args);
	}
}

package application;

import javafx.geometry.Insets;
import javafx.application.Application;  
import javafx.event.ActionEvent;  
import javafx.event.EventHandler;  
import javafx.scene.Scene;  
import javafx.scene.control.Button;  
import javafx.stage.Stage;  
import javafx.scene.layout.StackPane;
import java.lang.StringBuilder;

public class JavaFXLearn extends Application{  
  
    @Override  
    public void start(Stage primaryStage) throws Exception {
        StringBuilder str = new StringBuilder();
        // TODO Auto-generated method stub  
        Button btn1 = new Button("1");
        Button btn2 = new Button("2");
        Button btn3 = new Button("3");  
        Button btn4 = new Button("4");
        Button btn5 = new Button("5");
	Button btn6 = new Button("6");
	Button btn7 = new Button("7");
	Button btn8 = new Button("8");  
        Button btn9 = new Button("9");  
        btn1.setOnAction(new EventHandler<ActionEvent>() {  
              
            @Override  
            public void handle(ActionEvent arg0) {  
                // TODO Auto-generated method stub  
                str.append("1");  
            }  
        });
        btn2.setOnAction(new EventHandler<ActionEvent>() {  
              
            @Override  
            public void handle(ActionEvent arg0) {  
                // TODO Auto-generated method stub  
                str.append("2");  
            }  
        });
        btn3.setOnAction(new EventHandler<ActionEvent>() {  
              
            @Override  
            public void handle(ActionEvent arg0) {  
                // TODO Auto-generated method stub  
                str.append("3");  
            }  
        });

	StackPane.setMargin(btn1, new Insets(15, 60, 0, 0));
	StackPane.setMargin(btn2, new Insets(15, 30, 0, 0));
	StackPane.setMargin(btn3, new Insets(15, 0, 0, 0));

        StackPane root=new StackPane();

        root.getChildren().addAll(btn1, btn2, btn3);

        Scene scene=new Scene(root,300,200);      
        primaryStage.setTitle("First JavaFX Application");  
        primaryStage.setScene(scene);  
        primaryStage.show();  
    }  
    public static void main (String... args)  
    {  
        launch(args);  
    }  
  
}  

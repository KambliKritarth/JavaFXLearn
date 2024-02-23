package application;

import javafx.geometry.Insets;
import javafx.application.Application;  
import javafx.event.ActionEvent;  
import javafx.event.EventHandler;  
import javafx.scene.Scene;  
import javafx.scene.control.Button;  
import javafx.stage.Stage;  
import javafx.scene.layout.StackPane;
import javafx.scene.control.TextField;
import java.lang.StringBuilder;

public class JavaFXLearn extends Application{  
  
    @Override  
    public void start(Stage primaryStage) throws Exception {
        StringBuilder str = new StringBuilder();
        // TODO Auto-generated method stub
	
	TextField exprField = new TextField();
	exprField.setMaxWidth(120);
	//StackPane prefers the TextField to cover the entire screen hence 'prefWidth()' is used
	TextField dispField = new TextField();
	dispField.setMaxWidth(120);

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
        btn4.setOnAction(new EventHandler<ActionEvent>() {  
              
            @Override  
            public void handle(ActionEvent arg0) {  
                // TODO Auto-generated method stub  
                str.append("4");  
            }  
        });
        btn5.setOnAction(new EventHandler<ActionEvent>() {  
              
            @Override  
            public void handle(ActionEvent arg0) {  
                // TODO Auto-generated method stub  
                str.append("5");  
            }  
        });
        btn6.setOnAction(new EventHandler<ActionEvent>() {  
              
            @Override  
            public void handle(ActionEvent arg0) {  
                // TODO Auto-generated method stub  
                str.append("6");  
            }  
        });
        btn7.setOnAction(new EventHandler<ActionEvent>() {  
              
            @Override  
            public void handle(ActionEvent arg0) {  
                // TODO Auto-generated method stub  
                str.append("7");  
            }  
        });
        btn8.setOnAction(new EventHandler<ActionEvent>() {  
              
            @Override  
            public void handle(ActionEvent arg0) {  
                // TODO Auto-generated method stub  
                str.append("8");  
            }  
        });
        btn9.setOnAction(new EventHandler<ActionEvent>() {  
              
            @Override  
            public void handle(ActionEvent arg0) {  
                // TODO Auto-generated method stub  
                str.append("9");  
            }  
        });
	
	StackPane.setMargin(exprField, new Insets(-120, 0, 0, 0));
	StackPane.setMargin(dispField, new Insets(-60, 0, 0, 0));
	StackPane.setMargin(btn1, new Insets(15 ,0, 0, -60));
	StackPane.setMargin(btn2, new Insets(15, 0, 0, 0));
	StackPane.setMargin(btn3, new Insets(15, 0, 0, 60));
	StackPane.setMargin(btn4, new Insets(75 ,0, 0,-60));
	StackPane.setMargin(btn5, new Insets(75, 0, 0, 0));
	StackPane.setMargin(btn6, new Insets(75, 0, 0, 60));
	StackPane.setMargin(btn7, new Insets(135, 0, 0,-60));
	StackPane.setMargin(btn8, new Insets(135, 0, 0, 0));
	StackPane.setMargin(btn9, new Insets(135, 0, 0, 60));

        StackPane root=new StackPane();

        root.getChildren().addAll( exprField, dispField, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9);

        Scene scene=new Scene(root,300,200);      
        primaryStage.setTitle("NeoCalculator");  
        primaryStage.setScene(scene);  
        primaryStage.show();  
    }  
    public static void main (String... args)  
    {  
        launch(args);  
    }  
}  

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

public class JavaFXLearn extends Application {
    String prevOp = "+";
    double num1 = 0.0, num2 = 0.0;
    StringBuilder numStr = new StringBuilder();
    StringBuilder str = new StringBuilder();
    @Override  
    public void start(Stage primaryStage) throws Exception {

        TextField exprField = new TextField();
        exprField.setMaxWidth(120);
        //StackPane prefers the TextField to cover the entire screen hence 'prefWidth()' is used
        TextField dispField = new TextField("0.0");
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
        Button btnDot = new Button(".");
        Button btn0 = new Button("0");
        Button btnEq = new Button("=");
        Button btnPlus = new Button("+");
        Button btnClr = new Button("C");
        Button btnAClr = new Button("AC");
        Button btnMin = new Button("-");
        Button btnMpt = new Button("*");
        Button btnDiv = new Button("/");

        //button array

        btn1.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent arg0) {
                // TODO Auto-generated method stub 
                str.append("1");
                numStr.append("1");
		num2 = Double.valueOf(numStr.toString());
                exprField.setText(str.toString());
            }
        });
        btn2.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent arg0) {
                // TODO Auto-generated method stub  
                str.append("2");
                numStr.append("2");
		num2 = Double.valueOf(numStr.toString());
                exprField.setText(str.toString());
            }
        });
        btn3.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent arg0) {
                // TODO Auto-generated method stub  
                str.append("3");
                numStr.append("3");
		num2 = Double.valueOf(numStr.toString());
                exprField.setText(str.toString());
            }
        });
        btn4.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent arg0) {
                // TODO Auto-generated method stub  
                str.append("4");
                numStr.append("4");
		num2 = Double.valueOf(numStr.toString());
                exprField.setText(str.toString());
            }
        });
        btn5.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent arg0) {
                // TODO Auto-generated method stub  
                str.append("5");
                numStr.append("5");
		num2 = Double.valueOf(numStr.toString());
                exprField.setText(str.toString());
            }
        });
        btn6.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent arg0) {
                // TODO Auto-generated method stub  
                str.append("6");
                numStr.append("6");
		num2 = Double.valueOf(numStr.toString());
                exprField.setText(str.toString());
            }
        });
        btn7.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent arg0) {
                // TODO Auto-generated method stub  
                str.append("7");
                numStr.append("7");
		num2 = Double.valueOf(numStr.toString());
                exprField.setText(str.toString());
            }
        });
        btn8.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent arg0) {
                // TODO Auto-generated method stub  
                str.append("8");
                numStr.append("8");
		num2 = Double.valueOf(numStr.toString());
                exprField.setText(str.toString());
            }
        });
        btn9.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent arg0) {
                // TODO Auto-generated method stub  
                str.append("9");
                numStr.append("9");
		num2 = Double.valueOf(numStr.toString());
                exprField.setText(str.toString());
            }
        });
        btn0.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent arg0) {
                // TODO Auto-generated method stub  
                str.append("0");
                numStr.append("0");
		num2 = Double.valueOf(numStr.toString());
                exprField.setText(str.toString());
            }
        });
        btnDot.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent arg0) {
                // TODO Auto-generated method stub  
                str.append(".");
                numStr.append(".");
                exprField.setText(str.toString());
            }
        });
        btnPlus.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent arg0) {
                // TODO Auto-generated method stub  
		num2 = Double.valueOf(numStr.toString());
                str.append("+");
                double res;
                res = calculate(num1, num2, prevOp);
                
                prevOp = "+";
                num1 = res;
		numStr = new StringBuilder();

                exprField.setText(str.toString());
                dispField.setText(String.valueOf(res));
            }
        });
        btnMin.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent arg0) {
                // TODO Auto-generated method stub  
		num2 = Double.valueOf(numStr.toString());
                str.append("-");
                double res;
                res = calculate(num1, num2, prevOp);
                
                prevOp = "-";
                num1 = res;
		numStr = new StringBuilder();

                exprField.setText(str.toString());
                dispField.setText(String.valueOf(res));
            }
	});
        btnMpt.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent arg0) {
                // TODO Auto-generated method stub  
		num2 = Double.valueOf(numStr.toString());
                str.append("*");
                double res;
                res = calculate(num1, num2, prevOp);
                
                prevOp = "*";
                num1 = res;
		numStr = new StringBuilder();

                exprField.setText(str.toString());
                dispField.setText(String.valueOf(res));
            }
	});
        btnDiv.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent arg0) {
                // TODO Auto-generated method stub  
		num2 = Double.valueOf(numStr.toString());
                str.append("/");
                double res;
                res = calculate(num1, num2, prevOp);
                
                prevOp = "/";
                num1 = res;
		numStr = new StringBuilder();

                exprField.setText(str.toString());
                dispField.setText(String.valueOf(res));
            }
	});
        btnEq.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent arg0) {
                // TODO Auto-generated method stub  
		num2 = Double.valueOf(numStr.toString());
                double res = calculate(num1, num2, prevOp);
                
                prevOp = "+";
                num1 = 0.0;
		numStr = new StringBuilder(String.valueOf(res));
		str = new StringBuilder(String.valueOf(res));

                exprField.setText(String.valueOf(res));
                dispField.setText(String.valueOf(res));
            }
        });
        btnClr.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent arg0) {
                // TODO Auto-generated method stub
                String exprStr;
                exprStr = str.substring(0, str.length() - 1);
        	
		if(str.length() >1){
			str.deleteCharAt(str.length() - 1);
			numStr.deleteCharAt(numStr.length() - 1);
		}
		else{
			exprStr = "0.0";
                	dispField.setText(exprStr);
		}
                exprField.setText(exprStr);
            }
        });

        StackPane.setMargin(exprField, new Insets(-120, 0, 0, 0));
        StackPane.setMargin(dispField, new Insets(-60, 0, 0, 0));
        StackPane.setMargin(btn1, new Insets(15, 0, 0, -60));
        StackPane.setMargin(btn2, new Insets(15, 0, 0, 0));
        StackPane.setMargin(btn3, new Insets(15, 0, 0, 60));
        StackPane.setMargin(btn4, new Insets(75, 0, 0, -60));
        StackPane.setMargin(btn5, new Insets(75, 0, 0, 0));
        StackPane.setMargin(btn6, new Insets(75, 0, 0, 60));
        StackPane.setMargin(btn7, new Insets(135, 0, 0, -60));
        StackPane.setMargin(btn8, new Insets(135, 0, 0, 0));
        StackPane.setMargin(btn9, new Insets(135, 0, 0, 60));
        StackPane.setMargin(btnDot, new Insets(195, 0, 0, -60));
        StackPane.setMargin(btn0, new Insets(195, 0, 0, 0));
        StackPane.setMargin(btnEq, new Insets(195, 0, 0, 60));
        StackPane.setMargin(btnPlus, new Insets(255, 0, 0, -60));
        StackPane.setMargin(btnClr, new Insets(255, 0, 0, 0));
        StackPane.setMargin(btnAClr, new Insets(255, 0, 0, 60));
        StackPane.setMargin(btnMin, new Insets(315, 0, 0, -60));
        StackPane.setMargin(btnMpt, new Insets(315, 0, 0, 0));
        StackPane.setMargin(btnDiv, new Insets(315, 0, 0, 60));

        StackPane root = new StackPane();

        root.getChildren().addAll(exprField, dispField, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnDot,btn0, btnEq, btnClr, btnPlus, btnAClr, btnMin, btnMpt, btnDiv);

        Scene scene = new Scene(root, 300, 400);
        primaryStage.setTitle("NeoCalculator");
        primaryStage.setScene(scene);

        primaryStage.show();
    }
    
    public double calculate(double num1, double num2, String op) {
        switch (op) {
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "*":
                return num1 * num2;
            case "/":
                return num1 / num2;
            
            default:
                return 0.0;
        }
    }
    public static void main (String... args)  
    {  
        launch(args);  
    }  
}  


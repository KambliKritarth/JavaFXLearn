import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        StackPane stackPane = new StackPane();

        TextField textField = new TextField();
        textField.setMaxWidth(45);

        stackPane.getChildren().add(textField);

        Scene scene = new Scene(stackPane, 200, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

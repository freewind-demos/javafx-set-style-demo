package demo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Hello extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Hello");
        VBox root = new VBox() {{
            setStyle("-fx-background-color: red;");
        }};
        primaryStage.setScene(new Scene(root, 300, 250));
        primaryStage.show();
    }
}
package app;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.application.Platform;
import java.util.Random;


public class SecondJavaFX extends Application {
    @Override
    public void start(final Stage stage) {
        Group root = new Group();
        Scene scene = new Scene(root, 600, 500);
        stage.setTitle("ButtonGame");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}

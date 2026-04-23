package app;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.geometry.Pos;
import javafx.scene.layout.Pane;
import javafx.application.Platform;
import java.util.Random;


public class SecondJavaFX extends Application {
    @Override
    public void start(final Stage stage) {
        BorderPane root = new BorderPane();
        Scene scene = new Scene(root, 600, 500);

        Label score = new Label("Score: 0");
        Button exit = new Button("Exit");
        root.setTop(score);
        root.setBottom(exit);
        root.setAlignment(exit, Pos.CENTER);

        stage.setTitle("ButtonGame");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}

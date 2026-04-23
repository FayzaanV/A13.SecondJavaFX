package app;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.event.ActionEvent;
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
        exit.addEventHandler(ActionEvent.ACTION,
            (event) -> Platform.exit()
        );
        root.setTop(score);
        root.setBottom(exit);
        root.setAlignment(exit, Pos.CENTER);

        Pane buttons = new Pane();
        Button button1 = new Button("Click Me!");
        Button button2 = new Button("Click Me?");
        Button button3 = new Button("Click Me?");
        Button button4 = new Button("Click Me?");
        Button button5 = new Button("Click Me?");
        Button button6 = new Button("Click Me?");
        Button button7 = new Button("Click Me?");
        Button button8 = new Button("Click Me?");
        Button button9 = new Button("Click Me?");
        buttons.getChildren().addAll(button1, button2, button3, button4, button5, button6, button7, button8, button9);
        root.setCenter(buttons);

        stage.setTitle("ButtonGame");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}

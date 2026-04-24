package app;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.layout.Pane;
import javafx.application.Platform;
import java.util.Random;


public class SecondJavaFX extends Application {

    private int scoreCount = 0;

    @SuppressWarnings("static-access")
    @Override
    public void start(final Stage stage) {
        BorderPane root = new BorderPane();
        

        Label score = new Label("Score: 0");
        Button exit = new Button("Exit");
        exit.addEventHandler(ActionEvent.ACTION,
            (event) -> Platform.exit()
        );

        Random random = new Random();

        Pane pane = new Pane();
        Button[] buttons = new Button[9];
        for (int i = 0; i < 9; i++) {
            if (i == 0) {
                buttons[i] = new Button("Click Me!");
                buttons[i].addEventHandler(ActionEvent.ACTION,
                    (event) -> {
                        scoreCount += 1;
                        score.setText("Score: " + scoreCount);
                        scrambleButtons(random, buttons);
                        exit.requestFocus();
                    }
                );
            } else {
                buttons[i] = new Button("Click Me?");
                buttons[i].addEventHandler(ActionEvent.ACTION,
                    (event) -> {
                        scoreCount -= 1;
                        score.setText("Score: " + scoreCount);
                        scrambleButtons(random, buttons);
                        exit.requestFocus();
                    }
                );
            }
            pane.getChildren().add(buttons[i]);
        }

        scrambleButtons(random, buttons);
        exit.requestFocus();
        

        root.setTop(score);
        root.setBottom(exit);
        root.setAlignment(exit, Pos.CENTER);
        root.setCenter(pane);

        Scene scene = new Scene(root, 600, 500);
        stage.setTitle("ButtonGame");
        stage.setScene(scene);
        stage.show();

        exit.requestFocus();
    }

    private void scrambleButtons(Random random, Button[] buttons) {
        for (Button b : buttons) {
            b.setLayoutX(random.nextInt(501));
            b.setLayoutY(random.nextInt(401));
        }
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}

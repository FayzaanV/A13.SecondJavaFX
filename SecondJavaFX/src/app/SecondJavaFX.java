package app;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;

public class SecondJavaFX extends Application {
    @Override
    public void start(Stage window) {
        Label line1 = new Label("If debugging is the process of removing software bugs,");
        Label line2 = new Label("then programming must be the process of putting them in.");
        Label line3 = new Label("-- Edsger W. Dijkstra");
        line2.setLayoutY(25);
        line3.setLayoutY(50);

        Circle circle = new Circle(160, 120, 60);
        Polygon triangle = new Polygon(160, 120, 220, 280, 100, 280);

        Group group = new Group(line1, line2, line3, circle, triangle);
        Scene scene = new Scene(group, 480, 320);

        window.setScene(scene);
        window.setTitle("CS400");
        window.show();
    }

    public static void main(String[] args) {
        Application.launch();
    }
}

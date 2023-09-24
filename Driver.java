//Driver code for Color Match

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;

public class Driver extends Application
{
    public static final int WIDTH = 600, HEIGHT = 600;

    public void start(Stage stage)
    {
        StackPane root = new StackPane();
        ColorClick colorClick = new ColorClick();
        root.getChildren().add(colorClick);

        Scene scene = new Scene(root, WIDTH, HEIGHT);
        stage.setTitle("COLOR CLICK");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args)
    {
        launch(args);
    }
}
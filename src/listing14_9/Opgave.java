package listing14_9;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

import static javafx.application.Application.launch;

public class Opgave extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
       /* Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        //Button btOK = new Button("Click here Cunt!");
        //Scene scene = new Scene(btOK, 600, 550);

        StackPane pane = new StackPane();
        pane.getChildren().add(new Button("OK"));
        Scene scene = new Scene(pane, 600, 550);
        primaryStage.setTitle("Hello Cunt");
        primaryStage.setScene(scene);
        primaryStage.show();*/


        Stage stage = new Stage();
        stage.setTitle("Bastard!");

        Pane pane1 = new HBox(10);
        pane1.setPadding(new Insets(5, 5, 5, 5));
        javafx.scene.image.Image image = new Image("http://liveexample.pearsoncmg.com/book/image/us.gif");
        pane1.getChildren().add(new ImageView(image));

        ImageView imageView2 = new ImageView(image);
        imageView2.setFitHeight(100);
        imageView2.setFitWidth(100);
        pane1.getChildren().add(imageView2);

        ImageView imageView3 = new ImageView(image);
        imageView3.setRotate(90);
        pane1.getChildren().add(imageView3);


        Scene scene1 = new Scene(pane1);
        stage.setTitle("Bastard!");
        stage.setScene(scene1);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

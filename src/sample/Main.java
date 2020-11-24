package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;



public class Main extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception{
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
        Pane pane1 = new Pane();

        Circle circle = new Circle();
        circle.setRadius(50);
        circle.setStroke(Color.BEIGE);
        circle.setFill(Color.BROWN);
        pane1.getChildren().add(circle);

        Label label = new Label("Cunt label");
        label.setFont(Font.font("Times New Roman",FontWeight.BOLD,FontPosture.ITALIC,20));
        pane1.getChildren().add(label);

        Scene scene1 = new Scene(pane1, 300, 300);
        stage.setTitle("Bastard!");
        stage.setScene(scene1);
        stage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}

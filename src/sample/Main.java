package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;



public class Main extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        Parent root1 = FXMLLoader.load(getClass().getResource("uitest.fxml"));

        Scene scene = new Scene(root, 600, 600);
        primaryStage.setTitle("Hello Cunt");
        primaryStage.setScene(scene);
        primaryStage.show();

        Stage stage1 = new Stage();
        Scene scene1 = new Scene(root1, 600, 600);
        stage1.setTitle("Hello Cunt");
        stage1.setScene(scene1);
        stage1.show();




       /* Stage stage = new Stage();
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
        stage.show();*/
    }


    public static void main(String[] args) {
        launch(args);
    }
}

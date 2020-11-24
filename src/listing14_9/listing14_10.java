package listing14_9;


import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class listing14_10 extends Application {
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

        FlowPane pane1 = new FlowPane();
        pane1.setPadding(new Insets(11, 12, 13, 14));
        pane1.setHgap(5);
        pane1.setVgap(5);

        pane1.getChildren().addAll(new Label("First Name"),
                new TextField(), new Label("MI:"));
        TextField tfMi = new TextField();
        tfMi.setPrefColumnCount(1);
        pane1.getChildren().addAll(tfMi, new Label("Last Name"), new TextField());

        Scene scene = new Scene(pane1, 200, 250);
        stage.setTitle("yup");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}

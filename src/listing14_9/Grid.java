package listing14_9;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Grid extends Application {
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

        GridPane pane1 = new GridPane();
        pane1.setAlignment(Pos.CENTER);
        pane1.setHgap(5.5);
        pane1.setVgap(5.5);

        pane1.add(new Label("First Name"), 0, 0);
        pane1.add(new TextField(), 1 ,0);
        pane1.add(new Label("MI:"), 0,1);
        pane1.add(new TextField(),1,1);
        pane1.add(new Label("Last Name"),0,2);
        pane1.add(new TextField(),1,2 );
        Button btAdd = new Button("Add Name");
        pane1.add(btAdd, 1,3);
        GridPane.setHalignment(btAdd, HPos.RIGHT);



        Scene scene = new Scene(pane1);
        stage.setTitle("yup");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}

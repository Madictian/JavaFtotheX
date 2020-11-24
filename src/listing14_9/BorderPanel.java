package listing14_9;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class BorderPanel extends Application {
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

        BorderPane pane1 = new BorderPane();

        pane1.setBottom(new CustomPane("Floor"));
        pane1.setCenter(new CustomPane("Middle"));
        pane1.setLeft(new CustomPane("notRight"));
        pane1.setRight(new CustomPane("notLeft"));
        pane1.setTop(new CustomPane("Roof"));

        Scene scene = new Scene(pane1);
        stage.setTitle("yup");
        stage.setScene(scene);
        stage.show();
    }
    class CustomPane extends StackPane{
        public CustomPane(String title){
            getChildren().add(new Label(title));
            setStyle("-fx-border-color: red");
            setPadding(new Insets(11.5,12.5,13.5,14.5));
        }
    }

    public static void main(String[] args) {
        launch(args);
    }

}


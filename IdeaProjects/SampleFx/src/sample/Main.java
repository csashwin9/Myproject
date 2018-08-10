package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.event.EventHandler;

import java.awt.*;
import java.awt.Button;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        javafx.scene.control.Button b=new javafx.scene.control.Button("click");
        Group group=new Group(b);
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(group, 300, 275));
        primaryStage.show();
        EventHandler eventHandler=new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                System.out.println("hello world");
            }
        };
        b.addEventFilter(MouseEvent.MOUSE_CLICKED,eventHandler);

    }


    public static void main(String[] args) {
        launch(args);
    }
}

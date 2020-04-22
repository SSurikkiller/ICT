import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.util.ArrayList;

import javafx.scene.control.Button;
public class CarRacing extends Application {
    private static Pane GreatPane;
    private static Stage SuperStage = new Stage();
    private static Circle A1 = new Circle(120,100,20);
    private static Circle A2 = new Circle(20,100,20);
    private static Rectangle B1 = new Rectangle(0,50, 150,30);
    private static Rectangle B2 = new Rectangle(20,40,100,10);
    private static Button B = new Button("Next");
    public static void main(String[] args) {
        B.setOnAction(new ShowNewPane());
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        GreatPane = NewCar();
        Scene scene = new Scene(GreatPane, 400, 400);
        primaryStage.setTitle("Car Racing");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    static class ShowNewPane implements EventHandler<ActionEvent> {
        @Override
        public void handle(ActionEvent e) {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            GreatPane = NewCar();
            SuperStage.close();
            Scene scene = new Scene(GreatPane, 400, 400);
            SuperStage.setTitle("ControllingCircle");
            SuperStage.setScene(scene);
            SuperStage.show();
        }
    }


    public static Pane NewCar(){
            GreatPane = new Pane();
            A1.setCenterX(A1.getCenterX() + 20);
            A2.setCenterX(A2.getCenterX() + 20);
            B1.setX(B1.getX() + 20);
            B2.setX(B2.getX() + 20);
            if(A1.getCenterX()==400){
                A1.setCenterX(120);
                A2.setCenterX( 20);
                B1.setX(0);
                B2.setX(20);
            }

            GreatPane.getChildren().add(A1);
            GreatPane.getChildren().add(A2);
            GreatPane.getChildren().add(B1);
            GreatPane.getChildren().add(B2);
            GreatPane.getChildren().add(B);
            B.relocate(300,300);
            return GreatPane;
    }
}

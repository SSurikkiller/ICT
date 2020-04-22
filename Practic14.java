import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.util.Scanner;

public class Practic14  extends Application {
    public static void main(String[] args) {
        System.out.println("Ex1");
        launch(args);
    }
    public  static StringBuilder Build = new StringBuilder();
    @Override
    public void start(Stage primaryStage) throws Exception {
        Scanner in = new Scanner(System.in);
        Pane OwnPane = new Pane();
        TextArea Area = new TextArea();
        Area.setText("");
        System.out.println("Write how many nums");
        int AmountOfNums = in.nextInt();
        System.out.println("Write how many chars");
        int AmountOfChars = in.nextInt();
        System.out.println("And what char is it");
        String R1 = in.nextLine();
        char Ch = ' ';
        if(R1.length()==1){
            Ch = R1.charAt(1);
        }
        else {
            System.out.println("Bad input");
            System.exit(0);
        }
        
        new Thread(new Runnable() {
            @Override
            public void run() {
                Area.setText(Area.getText() + PrintNum( AmountOfNums));
            }
        });

        char finalCh = Ch;
        new Thread(new Runnable() {
            @Override
            public void run() {
                Area.setText(Area.getText() + PrintChar( AmountOfChars, finalCh));
            }
        });
        OwnPane.getChildren().add(Area);
        Area.relocate(100,100);


        Scene scene = new Scene(OwnPane, 700, 400);
        primaryStage.setTitle("Car Racing");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    private static String PrintNum(int Amount){
        StringBuilder S = new StringBuilder();
        for(int i=0; i < Amount;i++){
            S.append(i);
        }
        return S.toString();
    }
    
    private static String PrintChar(int Amount, char WhatChar){
        StringBuilder S = new StringBuilder();
        for(int i=0; i < Amount;i++){
            S.append(WhatChar);
        }
        return S.toString();
    }
}

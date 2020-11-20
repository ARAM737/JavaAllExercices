package ru.mirea.exercies11and12;

import javafx.application.Application;
import javafx.stage.Stage;

public class main11_12 extends Application {

    public static void main(String[] args) {
        launch(args);
               /* SampleHelloWorld helloWorld= new SampleHelloWorld();
        helloWorld.launcchthis();*/
        Calc calc = new Calc();
        calc.thisStart();
    }

    @Override
    public void start(Stage primaryStage) {

    }
}
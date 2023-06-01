package com.jp.hospital;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class App extends Application {

    private static Stage primaryStage;

    @Override
    public void start(Stage stage) throws IOException {
        primaryStage = stage;
        primaryStage.setScene(createScene("primary.fxml"));
        primaryStage.show();
    }

    public static void switchToScene(String fxml) throws IOException {
        primaryStage.setScene(createScene(fxml));
    }

    private static Scene createScene(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml));
        Parent root = fxmlLoader.load();
        return new Scene(root);
    }



    public static void main(String[] args) {
        launch();
    }
}

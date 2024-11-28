package org.example;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Launcher extends Application {

    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage stage) throws IOException {
        stage.setScene(new Scene(FXMLLoader.load(this.getClass().getResource("/view/admin_dashboard_form.fxml"))));
        stage.setTitle("Log in");
        stage.centerOnScreen();
        stage.show();
    }
}

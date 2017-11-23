package org.example.apps;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class LoginManager {

    private final Stage stage;

    public LoginManager(Stage primaryStage) {
        stage = primaryStage;
    }

    public void initAuthScreen() throws Exception {
        Parent root = FXMLLoader.load(LoginManager.class.getResource("/fxml/authWindow.fxml"));

        stage.setTitle("Authorization window");
        stage.setScene(new Scene(root));
        stage.show();
    }



}

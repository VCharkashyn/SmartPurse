package org.example.apps;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.springframework.stereotype.Component;

@Component
public class LoginManager {
    private Stage stage;

    public void initAuthScreen(Stage primaryStage) throws Exception {
        stage = primaryStage;
        Parent root = FXMLLoader.load(LoginManager.class.getResource("/fxml/authWindow.fxml"));

        stage.setTitle("Authorization window");
        stage.setScene(new Scene(root));
        stage.show();
    }



}

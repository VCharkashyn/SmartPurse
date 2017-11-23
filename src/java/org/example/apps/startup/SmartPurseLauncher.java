package org.example.apps.startup;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.example.apps.LoginManager;

public class SmartPurseLauncher extends Application {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"SpringBeans.xml"});
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
       LoginManager loginManager = new LoginManager(primaryStage);

    }

}

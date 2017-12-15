package org.example.apps.startup;

import javafx.application.Application;
import javafx.stage.Stage;
import org.example.apps.LoginManager;
import org.example.database.ConnectionManager;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.Connection;

public class SmartPurseLauncher extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        ApplicationContext context = new AnnotationConfigApplicationContext(org.example.config.ApplicationContext.class);
        LoginManager loginManager = context.getBean(LoginManager.class);
        ConnectionManager conManager = context.getBean(ConnectionManager.class);
        Connection con = conManager.getConnection();
        loginManager.initAuthScreen(primaryStage);
    }

}

package org.example.apps.startup;

import javafx.application.Application;
import javafx.stage.Stage;
import org.example.apps.LoginManager;
import org.example.config.DatabaseConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class SmartPurseLauncher extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(org.example.config.ApplicationContext.class);
        LoginManager loginManager = ctx.getBean(LoginManager.class);
        DataSource dataSource = ctx.getBean(DatabaseConfiguration.class).dataSource();
        Connection con = dataSource.getConnection();

        Statement stm = con.createStatement();
        ResultSet resSet = stm.executeQuery("SELECT * FROM T_USER");
        while (resSet.next()) {
            String s = resSet.getString(2);
        }

        loginManager.initAuthScreen(primaryStage);


    }

}

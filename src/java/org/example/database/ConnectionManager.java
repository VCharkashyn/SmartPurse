package org.example.database;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.sql.Connection;
import java.sql.DriverManager;

@Component
public class ConnectionManager {

    @Autowired
    private ConnectionProperties props;

    private Connection connection;

    @PostConstruct
    private void init() {
        try {
            //Registering the HSQLDB JDBC driver
            Class.forName(props.getDriverClassName());
            //Creating the connection with HSQLDB
            connection = DriverManager.getConnection(props.getUrl(), props.getUserName(), props.getPassword());
        }  catch (Exception e) {
            e.printStackTrace(System.out);
        }
    }

    public Connection getConnection() {
        return connection;
    }

}

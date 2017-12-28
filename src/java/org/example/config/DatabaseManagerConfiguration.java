package org.example.config;

import org.hsqldb.util.DatabaseManagerSwing;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import javax.annotation.PostConstruct;

@Configuration
@Profile("db.debug")
public class DatabaseManagerConfiguration {

    @PostConstruct
    public void databaseManager() {
        DatabaseManagerSwing.main(new String[]{"--url", "jdbc:hsqldb:mem:smart_purse", "--user", "sa", "--password", ""});
    }
}

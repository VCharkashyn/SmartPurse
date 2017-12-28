package org.example.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;



@Configuration
@Import(DatabaseConfiguration.class)
@ComponentScan("org.example")
public class ApplicationContext {


}

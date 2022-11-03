package com.example.StudentSubjectproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Collections;

@SpringBootApplication
public class TomcatWebServer {

    public static void main(String[] args) {

        SpringApplication application = new SpringApplication(TomcatWebServer.class);
        application.setDefaultProperties(Collections.singletonMap("server.port", "7777"));
        application.run(args);

    }

}

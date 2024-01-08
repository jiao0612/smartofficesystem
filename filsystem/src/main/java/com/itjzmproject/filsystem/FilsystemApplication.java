package com.itjzmproject.filsystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FilsystemApplication {

    public static void main(String[] args) {
        try {
            SpringApplication.run(FilsystemApplication.class, args);
        } catch (Error error) {
            System.out.println("start application file! please see error log!");
        }
    }

}

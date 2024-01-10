package com.itjzmproject.filsystem;

import com.itjzmproject.filsystem.common.util.LoggerUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FilsystemApplication {

    private final static Logger LOGGER = LoggerFactory.getLogger(FilsystemApplication.class);

    public static void main(String[] args) {
        try {
            SpringApplication.run(FilsystemApplication.class, args);
        } catch (Error error) {
            LoggerUtil.error(LOGGER, error, "start application file! please see error log!");
        }
    }

}

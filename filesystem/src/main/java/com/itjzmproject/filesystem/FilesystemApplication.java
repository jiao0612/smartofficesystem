package com.itjzmproject.filesystem;

import com.itjzmproject.filesystem.common.util.LoggerUtil;
import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class FilesystemApplication {

    private final static Logger LOGGER = LoggerFactory.getLogger(FilesystemApplication.class);

    public static void main(String[] args) {
        try {
            SpringApplication.run(FilesystemApplication.class, args);
        } catch (Throwable e) {
            LoggerUtil.error(LOGGER, e, "spring application start filed!");
        }
    }

}

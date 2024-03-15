package edu.java;

import edu.java.configuration.ApplicationConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
@EnableConfigurationProperties(ApplicationConfig.class)
@Slf4j
public class ScrapperApplication {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(ScrapperApplication.class, args);
    }
}

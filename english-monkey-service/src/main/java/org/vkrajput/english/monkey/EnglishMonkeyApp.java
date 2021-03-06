package org.vkrajput.english.monkey;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.vkrajput.english.monkey.loader.config.EnglishMonkeyWordLoaderConfig;
import org.vkrajput.english.monkey.service.config.EnglishMonkeyServiceConfig;

/**
 * EnglishMonkeyApp
 */

@SpringBootApplication
@Import({EnglishMonkeyServiceConfig.class, EnglishMonkeyWordLoaderConfig.class})
public class EnglishMonkeyApp {
    public static void main(String[] args) {
        SpringApplication.run(EnglishMonkeyApp.class,args);
    }
}

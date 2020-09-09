package com.vega.springit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import org.springframework.context.annotation.Bean;

import com.vega.springit.config.SpringitProperties;

@SpringBootApplication
@EnableConfigurationProperties(SpringitProperties.class)
public class SpringitApplication {

    private static final Logger log = LoggerFactory.getLogger(SpringitApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringitApplication.class, args);
	}

    @Bean
    CommandLineRunner runner() {
        return args -> {
            log.error("CommandLineRunner.run();");
            log.warn("CommandLineRunner.run();");
            log.info("CommandLineRunner.run();");
            log.debug("CommandLineRunner.run();");
            log.trace("CommandLineRunner.run();");
        };
    }
}

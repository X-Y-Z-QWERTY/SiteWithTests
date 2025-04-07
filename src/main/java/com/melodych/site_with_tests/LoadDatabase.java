package com.melodych.site_with_tests;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadDatabase {
        private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

        @Bean
        CommandLineRunner initDatabase(EmployeeRepository repository) { //is used to execute code after the application has started

            return args -> {
                log.info("Preloading " + repository.save(new Employee("Bilbo", "Baggins", "burglar")));
                log.info("Preloading " + repository.save(new Employee("Frodo", "Baggins", "thief")));
            };
        }
}

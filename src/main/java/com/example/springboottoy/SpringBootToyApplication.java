package com.example.springboottoy;

import com.example.springboottoy.entity.User;
import com.example.springboottoy.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class SpringBootToyApplication {

    private static final Logger log = LoggerFactory.getLogger(SpringBootToyApplication.class);

    public static void main(String[] args) {

        SpringApplication.run(SpringBootToyApplication.class, args);
        log.info("bokunn91) main: Application started.");

    }

    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> {

            log.info("bokunn91) commandLineRunner:");

//            String[] beanNames = ctx.getBeanDefinitionNames();
//            Arrays.sort(beanNames);
//            for (String beanName : beanNames) {
//                System.out.println(beanName);
//            }

        };
    }

    @Bean
    public CommandLineRunner testJPA(UserRepository r) {
        return args -> {

            log.info("bokunn91) testJPA:");
            r.save(new User("Alex"));
            r.findByName("Bogeun Kim").forEach(user -> {
                log.debug(user.getName());
            });

        };
    }

}

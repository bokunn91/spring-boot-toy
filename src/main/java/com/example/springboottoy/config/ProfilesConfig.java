package com.example.springboottoy.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProfilesConfig {

    @Value("${spring.profiles.active:none}")
    private String profiles;

    public ProfilesConfig() {
         System.out.println(profiles);
    }

}

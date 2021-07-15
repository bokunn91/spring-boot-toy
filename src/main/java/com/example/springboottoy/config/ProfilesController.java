package com.example.springboottoy.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProfilesController {

    @Value("${spring.profiles.active:none}")
    private String profiles;

    @RequestMapping("/config/profiles")
    public String getProfiles() {
        System.out.println(profiles);
        return "/config/profiles";
    }

}

package com.dys.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class RootC {
    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/home")
    public String home() {
        return "hello";
    }

    @GetMapping("/call")
    public String call() {
        return restTemplate.getForObject("http://server/home", String.class);
    }
}

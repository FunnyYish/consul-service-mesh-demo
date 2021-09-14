package com.dys.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.web.client.RestTemplate;

import lombok.extern.slf4j.Slf4j;

@Slf4j
// @Service
public class MyRunner implements CommandLineRunner {
    @Autowired
    RestTemplate restTemplate;

    @Override
    public void run(String... args) throws Exception {
        log.info(restTemplate.getForObject("http://server/home", String.class));
    }

}

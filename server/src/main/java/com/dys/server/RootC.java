package com.dys.server;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RootC {
    @GetMapping("/home")
    public String home() {
        return "hello";
    }
}

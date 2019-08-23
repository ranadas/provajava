package com.arzamed.demohello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class BasicHelloController {
    @GetMapping("/hello")
    public String handleHello (@RequestParam(defaultValue = "human") String name) {
        return "Hello " + name;
    }
}

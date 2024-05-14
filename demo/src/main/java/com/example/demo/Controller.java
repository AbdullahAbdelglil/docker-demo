package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/")
public class Controller {

    @GetMapping("hello")
    public String sayHello(){
        printLogInfo();
        return "Hello from port 9093";
    }

    @GetMapping("account")
    public String getAccount() {
        printLogInfo();
        return """
                {
                    firstName: Mohammed,
                    lastName: Abdullah,
                    email: mohammed.abdullah@gmail.com
                }""";
    }

    private String printLogInfo() {
        StringBuilder log = new StringBuilder();
        log.append("[ ");
        log.append(LocalDateTime.now());
        log.append(" : Server Access !]");
        return log.toString();
    }
}

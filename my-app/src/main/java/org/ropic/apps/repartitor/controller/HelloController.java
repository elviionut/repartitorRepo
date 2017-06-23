package org.ropic.apps.repartitor.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/heyl")
public class HelloController {

    @RequestMapping("/")
    public String getHello2() {
        return "Hey!!";
    }
}

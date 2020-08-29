package com.cyan.ChallengeCyanAgro.harvest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MillController {

    public MillController() {
        super();
    }

    @GetMapping
    public String index() {
        return "e ae";
    }

}

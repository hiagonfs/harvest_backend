package com.cyan.ChallengeCyanAgro.harvest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MillController {

    private MillService millService;

    public MillController(MillService mService) {
        super();
        this.millService = mService;
    }

    @PostMapping("/registerMill")
    public ResponseEntity<Mill> registerMill(@RequestBody Mill mill) {
        return new ResponseEntity<Mill>(this.millService.registerMill(mill), HttpStatus.CREATED);
    }

}

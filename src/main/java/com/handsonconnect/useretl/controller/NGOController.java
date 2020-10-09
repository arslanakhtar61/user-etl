package com.handsonconnect.useretl.controller;

import com.handsonconnect.useretl.model.NGO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "${v1API}/ngo")
public class NGOController {

    @PostMapping(value="/partner", consumes="application/json", produces="application/json")
    public ResponseEntity<String> newPartner(@RequestBody NGO ngo){
        NGO ngo1 = ngo;
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

}

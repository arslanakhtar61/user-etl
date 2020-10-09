package com.handsonconnect.useretl.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "${v1API}/ngo")
public class NGOController {

    @PostMapping("/partner")
    public String newPartner(@RequestBody String partner){
        String partner1 = partner;
        return partner;
    }

}

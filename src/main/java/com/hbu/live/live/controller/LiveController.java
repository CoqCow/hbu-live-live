package com.hbu.live.live.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/lives")
public class LiveController {
    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity getLive(){
        return  ResponseEntity.ok().body("真棒，看到这个，说明live模块接口调通");
    }
}

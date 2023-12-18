package com.example.Controller.controller;

import com.example.Controller.impl.StringService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("first")
public class FirstController {
    private StringService  stringService ;

    public FirstController(StringService stringService) {
        this.stringService = stringService;
    }

    @GetMapping("/getOk/{name}")
    public String getsimplStrng(@PathVariable String name){
        return  stringService.proguseName(name);
    }


}

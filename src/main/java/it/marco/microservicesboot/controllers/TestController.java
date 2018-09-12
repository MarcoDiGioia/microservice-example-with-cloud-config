package it.marco.microservicesboot.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
public class TestController {

    @Value("${parolamagica:default}")
    private String text;

    @RequestMapping("/properties")
    @ResponseBody
    public String hellow(){
        return "Ho caricato le properties da github: "+ this.text;
    }


}
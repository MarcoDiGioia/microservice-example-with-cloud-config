package it.dstech.microservicesboot.controllers;

import com.sun.org.apache.xpath.internal.operations.Bool;
import it.dstech.microservicesboot.models.Team;
import it.dstech.microservicesboot.repositories.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
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
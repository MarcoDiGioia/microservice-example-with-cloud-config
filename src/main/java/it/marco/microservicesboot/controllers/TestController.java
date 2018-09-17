package it.marco.microservicesboot.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;

@RestController
@ConfigurationProperties(prefix = "conf-word")
public class TestController {

    public String getParolamagica() {
        return parolamagica;
    }

    public void setParolamagica(String parolamagica) {
        this.parolamagica = parolamagica;
    }

    //    @Value("${parolamagica}")
    private String parolamagica;

    @RequestMapping("/properties")
    @ResponseBody
    public String hellow(){
        return "Ho caricato le properties da github: "+ this.parolamagica;
    }



}
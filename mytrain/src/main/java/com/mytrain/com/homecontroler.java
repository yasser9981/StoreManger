package com.mytrain.com;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class homecontroler {
    @RequestMapping(value = "/")
    public String greeting (){
        return "hi , welcome to spring boot";
    }
    @GetMapping(value = "/{name}" )
    public String greetingwithname(@PathVariable String name){
        return "hello " + name;
    }

}

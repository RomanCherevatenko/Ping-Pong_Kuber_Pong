package com.example.pong;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;

@RestController
public class HelloController {


    @PostMapping("/ping-pong")
    public ResponseEntity<String> method(@RequestBody HelloBody helloBody) {
        System.out.println("Logger....");
        System.out.println(helloBody.getText());
        return new ResponseEntity<String>(HttpStatus.OK);
    }
}

//    @GetMapping("/test")
//    public String testHost() {
//        System.out.println("test endpoint");
//        return "Hello world!";
//    }

//    @PostConstruct
//    public void init(){
//        System.out.println("we have added /test !!!!!!!!!!!!!!!!!!!!!");
//    }

package com.example.demo_retourdevances;

import org.apache.logging.log4j.message.Message;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class monsupercontroler {
    @RequestMapping(path = "/toto")
    public ResponseEntity <Coucou>getToto(){
        return new ResponseEntity(new Coucou("coucou"), HttpStatus.OK);
}
}

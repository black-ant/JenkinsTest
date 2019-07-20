package com.gang.jenkinsource.demo;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StartController {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @GetMapping("start")
    public void run(){
        logger.info("is run");
    }
}

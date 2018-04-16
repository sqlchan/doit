package com.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

//@Controller
public class IndexController {
    private static final Logger logger= LoggerFactory.getLogger(IndexController.class);

    @RequestMapping("/")
    @ResponseBody
    public String index(){
        logger.info("index");
        return "hello";
    }
    @RequestMapping("/profile/{userid}")
    @ResponseBody
    public String profile(@PathVariable("userid") int userid,
                          @RequestParam(value = "name",defaultValue = "lf",required = false)String name){
        return "profile "+userid+" "+name;
    }

    @ExceptionHandler
    @ResponseBody
    public String error(Exception e){
        return "error : "+e.getMessage();
    }
}

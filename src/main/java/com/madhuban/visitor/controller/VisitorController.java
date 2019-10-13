package com.madhuban.visitor.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/madhuban")
public class VisitorController {
    @RequestMapping(value = "/")
        public String getHome(){
        return "Hello World";
        }
}

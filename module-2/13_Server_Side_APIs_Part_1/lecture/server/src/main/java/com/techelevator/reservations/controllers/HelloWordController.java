package com.techelevator.reservations.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @RequestMapping(path = "/hello", method= RequestMethod.GET)
    public String helloWorld(){
        return "Hello World, this is a GET!";
    }

    @RequestMapping(path = "/hello", method= RequestMethod.POST)
    public String helloWorldPost(){
        return "Hello World, this is a POST!";
    }

    @RequestMapping(path = "/hello", method= RequestMethod.PUT)
    public String helloWorldPut(){
        return "Hello World, this is a PUT!";
    }

    @RequestMapping(path = "/hello", method= RequestMethod.DELETE)
    public String helloWorldDelete(){
        return "Hello World, this is a DELETE!";
    }
}
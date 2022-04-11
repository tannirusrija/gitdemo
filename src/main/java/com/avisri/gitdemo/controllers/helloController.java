package com.avisri.gitdemo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class helloController {
    
    @RequestMapping(value="/Login", method = RequestMethod.GET)
        public String check()
        {
            return "Login";
        }

    @RequestMapping(value="/done", method = RequestMethod.GET)
        public String check2()
        {
            return "Hi";
        }
}



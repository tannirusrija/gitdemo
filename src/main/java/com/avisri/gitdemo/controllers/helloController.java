package com.avisri.gitdemo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class helloController {
    
    @RequestMapping(value="/ok", method = RequestMethod.GET)
        public String check()
        {
            return "hello";
        }
}



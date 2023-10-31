package org.launchcode.codingevents.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.lang.reflect.Method;

@Controller
public class HomeController {

    @GetMapping
    public String index() {

        return "index";
    }
    //Add a single GET handler method that returns the name templated index, which will be the name of the template we create in the next step.
}

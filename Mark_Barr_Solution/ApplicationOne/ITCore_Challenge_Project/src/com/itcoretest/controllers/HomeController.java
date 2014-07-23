package com.itcoretest.controllers;

 
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
 
/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
 
   // @Autowired
    //Comparator<String> comparator;
 
    @RequestMapping(value = "/")
    public String home() {
        System.out.println("HomeController: Passing through...");
        return "home";
    }
 
   
}
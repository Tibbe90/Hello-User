package com.Hello_User.Hello_User;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainPageController {


    @GetMapping("/main") 
    public String getHomePage(Model model){
        model.addAttribute("Startup", model);
        return "mainPage";
    } 
    
}

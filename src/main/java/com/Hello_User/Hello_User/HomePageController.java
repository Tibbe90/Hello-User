package com.Hello_User.Hello_User;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomePageController {
protected static String admin = "e1345b8f-82dc-44de-92d4-b822eae259c5";
public static String currentUser = "";

    @GetMapping("/home") 
    public String getHomePage(Model model){
        model.addAttribute("Startup", model);
        model.addAttribute("admin", admin);
        model.addAttribute("currentUser", currentUser);
        return "homePage";
    } 
    @PostMapping("/Get-Id")
    String getUser(@RequestParam("userId") String getUser) {
        currentUser = getUser;
        return "redirect:/home";
    }
    
}

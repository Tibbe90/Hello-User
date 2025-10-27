package com.Hello_User.Hello_User;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NewMemberPageController {

@GetMapping("new-Member-Page")
public String getMemberPage(Model model) {
    return "/newMemberPage";
}

}

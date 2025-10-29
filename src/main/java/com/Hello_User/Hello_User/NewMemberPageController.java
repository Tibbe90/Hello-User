package com.Hello_User.Hello_User;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class NewMemberPageController {
Boolean ageIncorrect = false;

@GetMapping("new-Member-Page")
public String getMemberPage(Model model) {
    model.addAttribute("ageIncorrect", ageIncorrect);
    model.addAttribute("memberList", MemberPageController.memberList);
    model.addAttribute("newMember", new Member(null, 0, null, null, null));
    return "/newMemberPage";
}
@PostMapping("/Add-member")
public String postNewMember(Member member) {
    if (member.getAge() > 16 && member.getAge() < 105) {
        MemberPageController.memberList.add(member);
        this.ageIncorrect = false;
    }
    else {
        this.ageIncorrect = true;
    }
    return "redirect:/new-Member-Page";
}


}

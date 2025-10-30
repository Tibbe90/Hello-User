package com.Hello_User.Hello_User;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@Controller
public class MemberPageController {
    
    public static final List<Member> memberList = new ArrayList<>();
    static {
        memberList.add(new Member("Jonas Tibbelin", 35, "Founder", "1993 Honda CRX Del Sol", true));
        memberList.add(new Member("Mikael Fridsson", 36, "Master Mechanic", "1988 Honda CRX", true));
        memberList.add(new Member("Carolina Trelin", 33, "Bookkeeping", "2005 Honda Accord", true));
        memberList.add(new Member("Anders Johnsson", 42, "Event Organizer", "1979 Honda Prelude", false));
    }

@GetMapping("member-Page")
public String getMemberPage(Model model) {
    model.addAttribute("memberList", memberList);
    model.addAttribute("admin", HomePageController.admin);
    model.addAttribute("currentUser", HomePageController.currentUser);
    return "/memberPage";
}

@GetMapping("/remove-member/{memberId}")
public String removeMember(@PathVariable UUID memberId) {
    memberList.removeIf(member -> member.getId().equals(memberId));
    return "redirect:/member-Page";
}
}
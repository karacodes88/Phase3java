package com.mindweaver.demo.view;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/Login")
@RequiredArgsConstructor
public class Login {

    @PostMapping("")
    public String checkLogin(@RequestParam String email,
                             @RequestParam String password){
        if (email.equals("karawhite59@gmail.com")& password.equals("Pass1")){
            return "redirect:/product";
        }
        return "product";
    }
}

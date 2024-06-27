package com.ajspire.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    @RequestMapping("/loginPage")
    public String loginPage() {
        return "login";
    }

    @PostMapping("/login")
    public String doLogin(@RequestParam String userName, @RequestParam String password, ModelMap model) {
        if ("admin".equals(userName) && "hrAdmin".equals(password)) {
            return "showMenu";
        } else {
            model.addAttribute("msg", "Invalid username or password. Please try again.");
            return "login";
        }
    }
    
    @RequestMapping("/showListMenu")
    public String showListMenu() {
        return "showMenu";
    }
    
    @RequestMapping("/logout")
    public String logout() {
        return "login";
    }
}

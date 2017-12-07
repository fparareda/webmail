package com.demo.web.controller.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmailWebController {

    @RequestMapping("emails")
    public String list(Model model) {
        return "web/emails/list";
    }
}

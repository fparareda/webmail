package com.demo.web.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("admin")
public class EmailAdminController {

    @RequestMapping("emails")
    public String list(Model model) {
        return "admin/emails/list";
    }
}

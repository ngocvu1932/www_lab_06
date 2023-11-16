package vn.edu.iuh.fit.www_lab_06.frontend.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/home")
    public String homePage(Model model) {
        return "home";
    }
}

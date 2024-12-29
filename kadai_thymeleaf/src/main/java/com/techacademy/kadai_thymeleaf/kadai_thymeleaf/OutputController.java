package com.techacademy.kadai_thymeleaf.kadai_thymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class OutputController {

    @PostMapping("/output")
    public String postOutput(@RequestParam("input") String input, Model model) {
        model.addAttribute("input", input);
        return "output";
    }
}

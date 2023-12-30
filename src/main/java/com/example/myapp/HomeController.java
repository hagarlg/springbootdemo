package com.example.myapp;

// HomeController.java

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	
	@GetMapping("/")
	public String index(Model model) {
	    return "index";
	}

    @GetMapping("/home")
    public String home(Model model) {
        model.addAttribute("companyName", "E-CUBED"); // Set your actual company name here
        return "home";
    }

    // ... other mappings if needed
}

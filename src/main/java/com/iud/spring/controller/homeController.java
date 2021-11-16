package com.iud.spring.controller;


	

import java.util.Date;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class homeController {

    @GetMapping("/")
    public String mostrarHome(Model model) {
        model.addAttribute("mensaje", "Hola yo");
        model.addAttribute("fecha", new Date());
        return "home";
    }

    @GetMapping("/listar")
    public String listarHome(Model model) {
        model.addAttribute("mensaje", "Hola yo");
        model.addAttribute("fecha", new Date());
        return "listar";
    }
}




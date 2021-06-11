package it.ntt.concessionario.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import it.ntt.concessionario.repositories.AutoRepository;

@Controller
public class ControllerAuto {


    private final AutoRepository autoRepository;

    public ControllerAuto(AutoRepository autoRepository){
        this.autoRepository = autoRepository;
    }

    @GetMapping("/automobili")
    public String getAuto(Model model){
        model.addAttribute("automobili", autoRepository.findAll());
        return "auto";
    }
}

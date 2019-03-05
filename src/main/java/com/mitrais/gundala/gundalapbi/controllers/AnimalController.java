package com.mitrais.gundala.gundalapbi.controllers;

import com.mitrais.gundala.gundalapbi.services.AnimalServices;
import com.mitrais.gundala.gundalapbi.models.Animal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class AnimalController {

    private AnimalServices animalServices;

    public AnimalController(AnimalServices animalServices) {
        this.animalServices = animalServices;
    }

    @GetMapping()
    public String index (Model model) {
        model.addAttribute("animal", "ayam");
        return "index";
//        return animalServices.showAllAnimal();
    }
}

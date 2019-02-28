package com.mitrais.gundala.gundalapbi.controller;

import com.mitrais.gundala.gundalapbi.AnimalServices;
import com.mitrais.gundala.gundalapbi.model.Animal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("myanimal")
public class AnimalController {

    private AnimalServices animalServices;

    public AnimalController(AnimalServices animalServices) {
        this.animalServices = animalServices;
    }

    @GetMapping()
    public List<Animal> displayAllAnimal() {
        return animalServices.showAllAnimal();
    }
}

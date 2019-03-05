package com.mitrais.gundala.gundalapbi.controllers;

import com.mitrais.gundala.gundalapbi.services.AnimalServices;
import com.mitrais.gundala.gundalapbi.models.Animal;
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

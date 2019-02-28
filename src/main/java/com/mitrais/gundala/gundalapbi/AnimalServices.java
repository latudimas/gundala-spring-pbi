package com.mitrais.gundala.gundalapbi;

import com.mitrais.gundala.gundalapbi.model.Animal;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class AnimalServices {
    private List<Animal> ANIMALS = Arrays.asList(
            new Animal(4, "Uganda", "Ugandan Knuckle"),
            new Animal(2, "China", "Flying Duck"),
            new Animal(2, "Japan", "Dead Fish"),
            new Animal(3, "Indonesia", "Dog Peeing"),
            new Animal(4, "Australian", "Blind Kangaroo"),
            new Animal(1, "Saudi Arabia", "One Leg Falcon"),
            new Animal(5, "South Pole", "Mainland Whale"));

    public List<Animal> showAllAnimal() {
        return ANIMALS;
    }

    public void create(Animal animal) {
        ANIMALS.add(animal);
    }
}

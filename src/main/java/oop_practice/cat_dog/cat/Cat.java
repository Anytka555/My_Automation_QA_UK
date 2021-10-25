package oop_practice.cat_dog.cat;

import oop_practice.cat_dog.animal.Animal;

public class Cat extends Animal {

    String type = "Cat";
    String name = "Vasya";
    String voice = "Mew";

    // new method in subclass
    public void sound() {

        System.out.println("I'am a " + type + ". " + "My name is " + name + ". " + voice);
    }
}



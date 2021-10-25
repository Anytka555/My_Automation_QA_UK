package oop_practice.cat_dog.dog;
import oop_practice.cat_dog.animal.Animal;

public class Dog extends Animal {

    String type = "Dog";
    String name = "Tuzik";
    String voice = "Gav";

    // new method in subclass
    public void sound() {

        System.out.println("I'am a " + type + ". " + "My name is " + name + ". " + voice);
    }

}

package oop_practice.cat_dog.animal;

//make code from cat.dog.main.Practice_cat_dog executable
// to reach the goal modify classes Animal, Cat and Dog
// from oop_practice.cat_dog package expected output:
//I'am a Dog. My name is Tuzik. Gav
//I'am a Cat. My name is Vasya. Mew

public class Animal {

    String type;
    String name;
    String voice;

   public void sound(){

       System.out.println("I'am a " + type + ". " + "My name is " + name + ". " + voice);
   }
}





package com.osahonAtm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("implementbean")
public class DogAndOwnerProf {
    private Person person;
    private Dog dog;

    public Person getPerson() {
        return person;
    }

    @Autowired
    public void setPerson(Person person) {
        this.person = person;
    }

    public Dog getDog() {
        return dog;
    }

    @Autowired
    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public void impl(){
        person.setFirstName("Osahon");
        person.setLastName("Jonathan-Odia");
        person.setAge(21);

        dog.setName("Ragnar");
        dog.setBreed("German Shepherd");
        dog.setAge(0.3);

        System.out.println("owner details:");
        System.out.println("Name: " + person.getFirstName() + " " + person.getLastName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Dog details:");
        System.out.println("Name: " + dog.getName());
        System.out.println("Breed: " + dog.getBreed());
        System.out.println("Age: " + dog.getAge());

    }


}

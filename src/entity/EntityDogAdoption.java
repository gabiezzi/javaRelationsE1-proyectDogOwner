/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.util.ArrayList;

/**
 *
 * @author Gabi
 */
public class EntityDogAdoption {

    ArrayList<EntityPerson> persons;

    ArrayList<EntityDog> dogs;

    public EntityDogAdoption() {
    }

    public EntityDogAdoption(ArrayList<EntityPerson> persons, ArrayList<EntityDog> dogs) {
        this.persons = persons;
        this.dogs = dogs;
    }

    public ArrayList<EntityPerson> getPersons() {
        return persons;
    }

    public void setPersons(ArrayList<EntityPerson> persons) {
        this.persons = persons;
    }

    public ArrayList<EntityDog> getDogs() {
        return dogs;
    }

    public void setDogs(ArrayList<EntityDog> dogs) {
        this.dogs = dogs;
    }

    @Override
    public String toString() {
        return "DogAdoption{" + "persons=" + persons + ", dogs=" + dogs + '}';
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import entity.EntityDog;
import entity.EntityDogAdoption;
import entity.EntityPerson;
import implement.ServiceImplementDogAdoption;
import java.util.ArrayList;

/**
 *
 * @author Gabi
 */
public interface ServiceDogAdoption {
    
    public EntityDogAdoption newClassStart();

    public String addPersonToList(EntityPerson newPerson,ArrayList<EntityPerson> persons);
    
    public String adoptDog(String futureOwner, String futureHappy ,ArrayList<EntityPerson> persons, ArrayList<EntityDog> dogs);

    public String showAllPersonsData(ArrayList<EntityPerson> persons);

    public String searchDogData(String dogName, ArrayList<EntityDog> dogs);

    public void menu();
    
    public String showSelectedPersonData(String personSelected, ArrayList<EntityPerson> persons);
    
    public String showAllDogsData(ArrayList<EntityDog> dogs);

}

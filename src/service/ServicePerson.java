/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import entity.EntityDog;
import entity.EntityPerson;

/**
 *
 * @author Anita
 */
public interface ServicePerson {
    
    public EntityPerson createNewPerson();
    public String printPersonData(String dataPerson);
    public void menu();
    public String addToPersonList(EntityPerson newPerson);
    public String showAllPersonsData();
}

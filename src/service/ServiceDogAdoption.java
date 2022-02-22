/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import entity.EntityPerson;

/**
 *
 * @author Gabi
 */
public interface ServiceDogAdoption {
    
    public String addPersonToList(EntityPerson newPerson);
    public String showAllPersonsData();
    public void menu();
    
}

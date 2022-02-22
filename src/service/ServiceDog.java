/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import entity.EntityDog;

/**
 *
 * @author Gabi
 */
public interface ServiceDog {
    
    public EntityDog createNewDog();
    public String printDogData(EntityDog newDog);
    
}

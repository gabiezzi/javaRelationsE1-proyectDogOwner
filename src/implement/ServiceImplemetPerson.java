/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implement;

import entity.Person;
import service.ServiceEntity;

/**
 *
 * @author Anita
 */
public class ServiceImplemetPerson implements ServiceEntity{
    
    
    @Override
    public Person createNewEntity(){
        Person person = new Person();
        
        return person;
    }
    
    
}

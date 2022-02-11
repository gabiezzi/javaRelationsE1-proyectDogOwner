/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implement;

import entity.Dog;
import service.ServiceEntity;




public class ServiceImplementDog implements ServiceEntity{
    
    @Override
    public Dog createNewEntity(){
        Dog newDog = new Dog();
        
        
        return newDog;
    }
    
    
}

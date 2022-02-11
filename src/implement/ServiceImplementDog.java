/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implement;

import entity.EntityDog;
import java.util.Scanner;
import service.ServiceDog;




public class ServiceImplementDog implements ServiceDog{
    
    
    Scanner read;

    public ServiceImplementDog() {
        
        this.read = new Scanner(System.in).useDelimiter("\n");
        
    }
    
    
    
    @Override
    public EntityDog createNewDog(){
        EntityDog newDog = new EntityDog();
        
        System.out.println("Insert the dog name");
        newDog.setDogName(read.next());
        System.out.println("Insert the dog breed");
        newDog.setDogBreed(read.next());
        System.out.println("Insert the dog size");
        newDog.setDogSize(read.next());
        System.out.println("Insert the dog age");
        newDog.setDogAge(read.nextInt());
        
        
        return newDog;
    }
    
    
    @Override
    public String printDogData(EntityDog newDog){
        
        if (newDog.equals(null)) {
            
            return "The dog or the owner doesnt exist!";
        } else {
            
        return newDog.toString();
        
        }
    }
    
}

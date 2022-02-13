
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
        newDog.setName(read.next());
        System.out.println("Insert the dog breed");
        newDog.setDogBreed(read.next());
        System.out.println("Insert the dog size");
        newDog.setDogSize(read.next());
        System.out.println("Insert the dog age");
        newDog.setAge(read.nextInt());
        
        
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

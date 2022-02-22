package implement;

import entity.EntityDog;
import entity.EntityPerson;
import java.util.ArrayList;
import java.util.Scanner;
import service.ServicePerson;

public class ServiceImplementPerson implements ServicePerson {

    Scanner scan;
    ServiceImplementDog newServiceDog;
    
    
    
    
    public ServiceImplementPerson() {
        scan = new Scanner(System.in).useDelimiter("\n");
        
    }

    @Override
    public EntityPerson createNewPerson() {
        EntityPerson person = new EntityPerson();
        System.out.println("Insert the person name");
        person.setName(scan.next());
        System.out.println("Insert the person last name");
        person.setPersonLastName(scan.next());
        System.out.println("Insert the person age");
        person.setAge(scan.nextInt());
        System.out.println("Insert the person dni");
        person.setDni(scan.nextLong());
        return person;
    }
}

   
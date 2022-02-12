package implement;

import entity.EntityDog;
import entity.EntityPerson;
import java.util.ArrayList;
import java.util.Scanner;
import service.ServicePerson;


public class ServiceImplementPerson implements ServicePerson {

    Scanner read;
    ArrayList<EntityPerson> persons;
    ServiceImplementDog newDogService;

    public ServiceImplementPerson() {
        this.read = new Scanner(System.in).useDelimiter("\n");

        this.persons = new ArrayList();

        newDogService = new ServiceImplementDog();
    }

    @Override
    public EntityPerson createNewPerson() {
        EntityPerson person = new EntityPerson();
        System.out.println("Insert the person name");
        person.setName(read.next());
        System.out.println("Insert the person last name");
        person.setPersonLastName(read.next());
        System.out.println("Insert the person age");
        person.setAge(read.nextInt());
        System.out.println("Insert the person dni");
        person.setDni(read.nextLong());
        System.out.println("Insert the person's dog data: \n");
        person.setDog(newDogService.createNewDog());
        return person;
    }

    @Override
    public String addToPersonList(EntityPerson newPerson) {

        persons.add(newPerson);

        return "ADDED TO LIST : " + newPerson.toString();

    }

    @Override
    public String printPersonData(String dataPerson) {

        String personDataToString = "Person not founded" ;
        
        for (int i = 0; i < persons.size(); i++) {
            if (persons.get(i).getPersonLastName().equals(dataPerson)) {
                
              personDataToString =  persons.get(i).toString();
                
            }
        }
        
        
        
        return personDataToString;

    }

    @Override
    public String showAllPersonsData() {

        String dataPersonListed = "The list of person is : \n";
        for (EntityPerson unitaryPerson : persons) {
            dataPersonListed += unitaryPerson.toString()+ "\n";
        }

        return dataPersonListed;
    }
    
    public EntityDog searchDogData(String dataOwner){
        
        for (int i = 0; i < persons.size(); i++) {
            if (persons.get(i).getPersonLastName().equalsIgnoreCase(dataOwner)){
                
                return persons.get(i).getDog();
                
            }
        }
        
        return null;
    }

    @Override
    public void menu() {

      
        int option = 0;

        do {

            System.out.println(constants.constantsPerson.MENU_MESSAGE);

            option = read.nextInt();

            switch (option) {
                case 1:
                    
                    persons.add(createNewPerson());

                    break;
                case 2:
                    System.out.println("Select the data person you want to read (insert last name): ");
                    String dataPerson = read.next();
                    System.out.println(printPersonData(dataPerson));
                    break;
                case 3:
                    
                    System.out.println("Select the owner of the dog's data you want to read(insert last name): ");
                    String dataOwner = read.next();
                     System.out.println(newDogService.printDogData(searchDogData(dataOwner)));

                    break;

                case 4:
                    System.out.println(showAllPersonsData());
                    break;
                case 5:

                    String optionQuit;

                    System.out.println("Are you sure you want to quit?");
                    optionQuit = read.next();
                    if (optionQuit.equalsIgnoreCase("y")) {
                        System.out.println("The program has finished.");
                    } else {

                        option = 0;

                    }
                    break;
            }
        } while (option != 5);

    }

}

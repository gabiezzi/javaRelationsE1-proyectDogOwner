package implement;

import entity.EntityDog;
import entity.EntityPerson;
import java.util.ArrayList;
import java.util.Scanner;
import service.ServicePerson;

public class ServiceImplementPerson implements ServicePerson {

    Scanner scan;
    ArrayList<EntityPerson> persons;
    
    public ServiceImplementPerson() {
        this.scan = new Scanner(System.in).useDelimiter("\n");

        this.persons = new ArrayList();

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

    @Override
    public String addToPersonList(EntityPerson newPerson) {

        persons.add(newPerson);

        return "ADDED TO LIST : " + newPerson.toString();

    }

    @Override
    public String printPersonData(String dataPerson) {

        String personDataToString = "Person not founded";

        for (int i = 0; i < persons.size(); i++) {
            if (persons.get(i).getPersonLastName().equals(dataPerson)) {

                personDataToString = persons.get(i).toString();

            }
        }

        return personDataToString;

    }

    @Override
    public String showAllPersonsData() {

        String dataPersonListed = "The list of person is : \n";
        for (EntityPerson unitaryPerson : persons) {
            dataPersonListed += unitaryPerson.toString() + "\n";
        }

        return dataPersonListed;
    }

    public EntityDog searchDogData(String dataOwner) {

        for (int i = 0; i < persons.size(); i++) {
            if (persons.get(i).getPersonLastName().equalsIgnoreCase(dataOwner)) {

                return persons.get(i).getDog();

            }
        }

        return null;
    }

    @Override
    public EntityDog createNewDog() {
        EntityDog newDog = new EntityDog();

        System.out.println("Insert the dog name");
        newDog.setName(scan.next());
        System.out.println("Insert the dog breed");
        newDog.setDogBreed(scan.next());
        System.out.println("Insert the dog size");
        newDog.setDogSize(scan.next());
        System.out.println("Insert the dog age");
        newDog.setAge(scan.nextInt());

        return newDog;
    }

    @Override
    public String printDogData(EntityDog newDog) {

        if (newDog.equals(null)) {

            return "The dog or the owner doesnt exist!";
        } else {

            return newDog.toString();

        }
    }
    
    
    @Override
    public String asignDogToOwner(){
        
        
        
        
        
        return
    }

    @Override
    public void menu() {

        int option = 0;

        do {

            System.out.println(constants.constantsPerson.MENU_MESSAGE);

            option = scan.nextInt();

            switch (option) {
                case 1:

                    persons.add(createNewPerson());

                    break;
                case 2:
                    System.out.println("Select the data person you want to read (insert last name): ");
                    String dataPerson = scan.next();
                    System.out.println(printPersonData(dataPerson));
                    break;
                case 3:

                    System.out.println("Select the owner of the dog's data you want to read(insert last name): ");
                    String dataOwner = scan.next();
                    System.out.println(printDogData(searchDogData(dataOwner)));

                    break;

                case 4:
                    System.out.println(showAllPersonsData());
                    break;
                case 5:

                    String optionQuit;

                    System.out.println("Are you sure you want to quit?");
                    optionQuit = scan.next();
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

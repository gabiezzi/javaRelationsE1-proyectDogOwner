/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implement;

import entity.EntityDog;
import entity.EntityDogAdoption;
import entity.EntityPerson;
import java.util.ArrayList;

/**
 *
 * @author Gabi
 */
public class ServiceImplementDogAdoption {
    
    
    @Override
    public EntityDogAdoption startClassDogAdoption(){
        
        ArrayList<EntityDog> dogs = new ArrayList();
        ArrayList<EntityPerson> persons = new ArrayList();
        
        
        return new EntityDogAdoption(persons, dogs);
    }

    @Override
    public String addPersonToList(ArrayList<EntityPerson> persons, EntityPerson newPerson) {

        persons.add(newPerson);

        return "ADDED TO LIST : " + newPerson.toString();

    }

    @Override
    public String showAllPersonsData(ArrayList<EntityPerson> persons) {

        String dataPersonListed = "The list of person is : \n";
        for (EntityPerson unitaryPerson : persons) {
            dataPersonListed += unitaryPerson.toString() + "\n";
        }

        return dataPersonListed;
    }

    public EntityDog searchDogData(String dataOwner,ArrayList<EntityPerson> persons) {

        for (int i = 0; i < persons.size(); i++) {
            if (persons.get(i).getPersonLastName().equalsIgnoreCase(dataOwner)) {

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

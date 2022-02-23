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
import java.util.Scanner;
import service.ServiceDogAdoption;

/**
 *
 * @author Gabi
 */
public class ServiceImplementDogAdoption implements ServiceDogAdoption {

    ServiceImplementDog newServiceDog;
    ServiceImplementPerson newServicePerson;
    Scanner scan;

    public ServiceImplementDogAdoption() {
        scan = new Scanner(System.in).useDelimiter("\n");
        newServiceDog = new ServiceImplementDog();
        newServicePerson = new ServiceImplementPerson();

    }

    @Override
    public EntityDogAdoption newClassStart() {

        ArrayList<EntityDog> dogs = new ArrayList();
        ArrayList<EntityPerson> persons = new ArrayList();

        return new EntityDogAdoption(persons, dogs);
    }

    @Override
    public String addPersonToList(EntityPerson newPerson, ArrayList<EntityPerson> persons) {

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

    @Override
    public String showAllDogsData(ArrayList<EntityDog> dogs) {

        String dataDogListed = "The list of dogs is : \n";
        for (EntityDog unitaryDog : dogs) {
            dataDogListed += unitaryDog+ "\n";
        }

        return dataDogListed;
    }

    @Override
    public String showSelectedPersonData(String personSelected, ArrayList<EntityPerson> persons) {

        for (EntityPerson unitaryPerson : persons) {

            if (personSelected.equalsIgnoreCase(unitaryPerson.getName())) {

                return unitaryPerson.toString();

            }

        }

        return "Person selected doesnt exist in the list!";
    }

    public String searchDogData(String dogName, ArrayList<EntityDog> dogs) {

        for (int i = 0; i < dogs.size(); i++) {
            if (dogs.get(i).getName().equalsIgnoreCase(dogName)) {

                return dogs.get(i).toString();

            }
        }

        return "Dog doesnt exist!";
    }

    @Override
    public String adoptDog(String futureOwner, String futureHappy, ArrayList<EntityPerson> persons, ArrayList<EntityDog> dogs) {

        for (EntityDog unitaryDog : dogs) {

            if (futureHappy.equalsIgnoreCase(unitaryDog.getName())) {

                if (unitaryDog.isHasOwner()) {

                    return "Sorry, this dog already has an owner";

                } else {

                    for (EntityPerson unitaryPerson : persons) {

                        if (unitaryPerson.getName().equalsIgnoreCase(futureOwner)) {

                            unitaryPerson.setDog(unitaryDog);
                            unitaryDog.setHasOwner(true);

                            return "angel " + unitaryDog + " has been adopted by " + unitaryPerson;
                        }

                    }

                }

            }

        }

        return "The owner doesnt exist!";
    }

    @Override
    public void menu() {

        EntityDogAdoption newAdoption = newClassStart();

        int option = 0;

        do {

            System.out.println(constants.constantsPerson.MENU_MESSAGE);

            option = scan.nextInt();

            switch (option) {
                case 1:

                    addPersonToList(newServicePerson.createNewPerson(), newAdoption.getPersons());

                    break;
                case 2:

                    newAdoption.getDogs().add(newServiceDog.createNewDog());

                    break;
                case 3:
                    System.out.println("Select the name of the future owner: ");
                    String futureOwner = scan.next();
                    System.out.println("Select the name of the dog to adopt: ");
                    String futureHappy = scan.next();
                    System.out.println(adoptDog(futureOwner, futureHappy, newAdoption.getPersons(), newAdoption.getDogs()));

                    break;
                case 4:

                    System.out.println("Select the person's data you want access to");
                    String dataOwner = scan.next();

                    System.out.println(showSelectedPersonData(dataOwner, newAdoption.getPersons()));

                    break;

                case 5:

                    System.out.println("Insert the dog's name:");
                    String dogName = scan.next();
                    System.out.println(searchDogData(dogName, newAdoption.getDogs()));

                    break;
                case 6:

                    System.out.println(showAllPersonsData(newAdoption.getPersons()));

                    break;
                case 7:

                    System.out.println(showAllDogsData(newAdoption.getDogs()));

                    break;

                case 8:

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
        } while (option != 8);

    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author Anita
 */
public class EntityDog {
    
    private String dogName;
    private String dogBreed;
    private Integer dogAge;
    private String dogSize;

    public EntityDog() {
    }

    
    
    public EntityDog(String dogName, String dogBreed, Integer dogAge, String dogSize) {
        this.dogName = dogName;
        this.dogBreed = dogBreed;
        this.dogAge = dogAge;
        this.dogSize = dogSize;
    }

    public String getDogName() {
        return dogName;
    }

    public void setDogName(String dogName) {
        this.dogName = dogName;
    }

    public String getDogBreed() {
        return dogBreed;
    }

    public void setDogBreed(String dogBreed) {
        this.dogBreed = dogBreed;
    }

    public Integer getDogAge() {
        return dogAge;
    }

    public void setDogAge(Integer dogAge) {
        this.dogAge = dogAge;
    }

    public String getDogSize() {
        return dogSize;
    }

    public void setDogSize(String dogSize) {
        this.dogSize = dogSize;
    }

    @Override
    public String toString() {
        return "Dog{" + "dogName=" + dogName + ", dogBreed=" + dogBreed + ", dogAge=" + dogAge + ", dogSize=" + dogSize + '}';
    }
    
    
}

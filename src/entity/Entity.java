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
public abstract class Entity {
    
    protected String name;
    protected int age;

    public Entity(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Entity() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Entity{" + "name=" + name + ", age=" + age + '}';
    }
    
    
}

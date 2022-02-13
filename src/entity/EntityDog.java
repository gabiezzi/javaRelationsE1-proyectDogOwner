
package entity;


public class EntityDog extends Entity {

    private String dogBreed;
    private String dogSize;

    public EntityDog(String dogBreed, String dogSize, String name, int age) {
        super(name, age);
        this.dogBreed = dogBreed;
        this.dogSize = dogSize;
    }

    public EntityDog() {
    }

    public String getDogBreed() {
        return dogBreed;
    }

    public void setDogBreed(String dogBreed) {
        this.dogBreed = dogBreed;
    }

    public String getDogSize() {
        return dogSize;
    }

    public void setDogSize(String dogSize) {
        this.dogSize = dogSize;
    }

    @Override
    public String toString() {
        return "EntityDog{" + "dogBreed=" + dogBreed + ", dogSize=" + dogSize + '}';
    }

    
}

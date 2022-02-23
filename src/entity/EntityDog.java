
package entity;


public class EntityDog extends Entity {

    private String dogBreed;
    private String dogSize;
    private boolean hasOwner;
    private EntityPerson owner;

    public EntityDog(String dogBreed, String dogSize, String name, int age) {
        super(name, age);
        this.dogBreed = dogBreed;
        this.dogSize = dogSize;
        this.hasOwner = hasOwner = false;
        
    }

    public EntityDog() {
       
        this.hasOwner = hasOwner=false;
        
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

    public boolean isHasOwner() {
        return hasOwner;
    }

    public void setHasOwner(boolean hasOwner) {
        this.hasOwner = hasOwner;
    }

    public EntityPerson getOwner() {
        return owner;
    }

    public void setOwner(EntityPerson owner) {
        this.owner = owner;
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
        return "EntityDog{" +" name = "+ name + " age = " + age + "dogBreed=" + dogBreed + ", dogSize=" + dogSize + ", hasOwner=" + hasOwner + ", owner=" + owner + '}';
    }
    
    
   

    
    
}

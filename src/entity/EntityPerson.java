package entity;

public class EntityPerson extends Entity {

    private String personLastName;
    private long dni;
    private EntityDog dog;

    public EntityPerson() {
    }

    public EntityPerson(String personLastName, long dni, String name, int age) {
        super(name, age);
        this.personLastName = personLastName;
        this.dni = dni;
       
    }

    public String getPersonLastName() {
        return personLastName;
    }

    public void setPersonLastName(String personLastName) {
        this.personLastName = personLastName;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public EntityDog getDog() {
        return dog;
    }

    public void setDog(EntityDog dog) {
        this.dog = dog;
    }

    @Override
    public String toString() {
        return "EntityPerson{" +" name = "+ name + " age = " + age + "personLastName=" + personLastName + ", dni=" + dni + ", dog=" + dog + '}';
    }

    
    
    
    
}


package entity;



public class EntityPerson {

    private String personName;
    private String personLastName;
    private Integer personAge;
    private long dni; 
    private EntityDog dog;

    public EntityPerson() {
    }

    public EntityPerson(String personName, String personLastName, Integer personAge, long dni, EntityDog dog) {
        this.personName = personName;
        this.personLastName = personLastName;
        this.personAge = personAge;
        this.dni = dni;
        this.dog = dog;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getPersonLastName() {
        return personLastName;
    }

    public void setPersonLastName(String personLastName) {
        this.personLastName = personLastName;
    }

    public Integer getPersonAge() {
        return personAge;
    }

    public void setPersonAge(Integer personAge) {
        this.personAge = personAge;
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
        return "Person{" + "personName=" + personName + ", personLastName=" + personLastName + ", personAge=" + personAge + ", dni=" + dni + ", dog=" + dog + '}';
    }
    
    

    
}

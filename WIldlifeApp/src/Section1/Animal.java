/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Section1;

/**
 *
 * @author Darius Joaquim Alvares
 */
public class Animal {
    private int animalId;
    private String species, location, condition;
    private ArrayList<Animal> animals;

    public Animal(int animalId, String species, String location, String condition, ArrayList animals) {
        this.animalId = animalId;
        this.species = species;
        this.location = location;
        this.condition = condition;
        this.animals = animals;
    }
    
    public void displayAnimal()
    {
    
    }
    
    public void updateCondition(String condition)
    {
    
    }

    public int getAnimalId() {
        return animalId;
    }

    public String getSpecies() {
        return species;
    }

    public String getLocation() {
        return location;
    }

    public String getCondition() {
        return condition;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }
    
    
}

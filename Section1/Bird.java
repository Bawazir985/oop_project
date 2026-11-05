/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Section1;

/**
 *
 * @author Darius Joaquim Alvares
 */
public class Bird extends Animal{
    private double wingspan;

    public Bird(double wingspan, int animalId, String species, String location, String condition, Object animals) {
        super(animalId, species, location, condition, animals);
        this.wingspan = wingspan;
    }

    
    @Override
    public void displayAnimal()
    {
    
    }
    
    public double getWingspan() {
        return wingspan;
    }

    public void setWingspan(double wingspan) {
        this.wingspan = wingspan;
    }
    
    
}

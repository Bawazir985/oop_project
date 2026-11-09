/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Section3;

/**
 *
 * @author Omar Bawazir
 */
public class Habitat {
    private int habitatId;
    private String name, location, habitatType;
    private boolean protectedArea;
    private ArrayList<Habitat> habitats;

    public Habitat(int habitatId, String name, String location, String habitatType, boolean protectedArea, ArrayList habitats) {
        this.habitatId = habitatId;
        this.name = name;
        this.location = location;
        this.habitatType = habitatType;
        this.protectedArea = protectedArea;
        this.habitats = habitats;
    }
    
    public void displayHabitat()
    {
    
    }
    
    public void updateProtectionStatus(boolean protectedArea)
    {
    
    }

    public int getHabitatId() {
        return habitatId;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public String getHabitatType() {
        return habitatType;
    }

    public boolean isProtectedArea() {
        return protectedArea;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setHabitatType(String habitatType) {
        this.habitatType = habitatType;
    }
    
    
}

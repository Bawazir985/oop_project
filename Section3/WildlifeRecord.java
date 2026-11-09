/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Section3;

/**
 *
 * @author Omar Bawazir
 */
public class WildlifeRecord {
    private int recordId;
    private String species, habitat, populationStatus;
    private ArrayList<WildlifeRecord> wildlifeRecords;

    public WildlifeRecord(int recordId, String species, String habitat, String populationStatus, ArrayList wildlifeRecords) {
        this.recordId = recordId;
        this.species = species;
        this.habitat = habitat;
        this.populationStatus = populationStatus;
        this.wildlifeRecords = wildlifeRecords;
    }
    
    public void displayRecord()
    {
    
    }
    
    public void updatePopulationStatus(String status)
    {
    
    }

    public int getRecordId() {
        return recordId;
    }

    public String getSpecies() {
        return species;
    }

    public String getHabitat() {
        return habitat;
    }

    public String getPopulationStatus() {
        return populationStatus;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public void setPopulationStatus(String populationStatus) {
        this.populationStatus = populationStatus;
    }
    
    
}

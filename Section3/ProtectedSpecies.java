/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Section3;

/**
 *
 * @author Omar Bawazir
 */
public class ProtectedSpecies extends WildlifeRecord{
    private String protectionStatus, protectedArea;

    public ProtectedSpecies(String protectionStatus, String protectedArea, int recordId, String species, String habitat, String populationStatus, Object wildlifeRecords) {
        super(recordId, species, habitat, populationStatus, wildlifeRecords);
        this.protectionStatus = protectionStatus;
        this.protectedArea = protectedArea;
    }

    
    @Override
    public void displayRecord()
    {
    
    }

    public String getProtectionStatus() {
        return protectionStatus;
    }

    public void setProtectionStatus(String protectionStatus) {
        this.protectionStatus = protectionStatus;
    }

    public String getProtectedArea() {
        return protectedArea;
    }

    public void setProtectedArea(String protectedArea) {
        this.protectedArea = protectedArea;
    }
    
    
}

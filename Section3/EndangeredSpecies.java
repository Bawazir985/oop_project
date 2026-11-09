/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Section3;

/**
 *
 * @author Omar Bawazir
 */
public class EndangeredSpecies extends WildlifeRecord{
    private int estimatedPopulation;
    private String riskLevel;

    public EndangeredSpecies(int estimatedPopulation, String riskLevel, int recordId, String species, String habitat, String populationStatus, Object wildlifeRecords) {
        super(recordId, species, habitat, populationStatus, wildlifeRecords);
        this.estimatedPopulation = estimatedPopulation;
        this.riskLevel = riskLevel;
    }

    
    @Override
    public void displayRecord()
    {
    
    }

    public int getEstimatedPopulation() {
        return estimatedPopulation;
    }

    public void setEstimatedPopulation(int estimatedPopulation) {
        this.estimatedPopulation = estimatedPopulation;
    }

    public String getRiskLevel() {
        return riskLevel;
    }

    public void setRiskLevel(String riskLevel) {
        this.riskLevel = riskLevel;
    }
    
    
}

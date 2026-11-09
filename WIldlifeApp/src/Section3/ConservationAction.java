/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Section3;

/**
 *
 * @author Omar Bawazir
 */
public class ConservationAction implements Trackable, Reportable{
    private int actionId;
    private String actionName, description, status;
    private WildlifeRecord species;
    private ArrayList<ConservationAction> conservationActions;

    public ConservationAction(int actionId, String actionName, String description, String status, WildlifeRecord species, ArrayList conservationActions) {
        this.actionId = actionId;
        this.actionName = actionName;
        this.description = description;
        this.status = status;
        this.species = species;
        this.conservationActions = conservationActions;
    }
    
    public void displayAction()
    {
    
    }
    
    public void updateStatus(String status)
    {
    
    }

    public int getActionId() {
        return actionId;
    }

    public String getActionName() {
        return actionName;
    }

    public String getDescription() {
        return description;
    }

    public String getStatus() {
        return status;
    }

    public WildlifeRecord getSpecies() {
        return species;
    }

    public void setActionName(String actionName) {
        this.actionName = actionName;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
}

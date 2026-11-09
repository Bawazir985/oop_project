/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Section2;

/**
 *
 * @author Dhruv Menon
 */
public class EmergencyRescue extends RescueMission{
    private int priorityLevel;

    public EmergencyRescue(int priorityLevel, int missionId, String status, Object report, Volunteer volunteer, RescueCentre rescueCentre, Object missions) {
        super(missionId, status, report, volunteer, rescueCentre, missions);
        this.priorityLevel = priorityLevel;
    }

    
    @Override
    public void displayMission()
    {
    
    }
    
    public int getPriorityLevel() {
        return priorityLevel;
    }

    public void setPriorityLevel(int priorityLevel) {
        this.priorityLevel = priorityLevel;
    }
    
    
}

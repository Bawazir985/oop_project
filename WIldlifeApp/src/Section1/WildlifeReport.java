/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Section1;

/**
 *
 * @author Darius Joaquim Alvares
 */
public class WildlifeReport implements Reportable, Trackable{
    private int reportId;
    private String description, severity, status;
    private Reporter reporter;
    private Animal animal;

    public WildlifeReport(int reportId, String description, String severity, String status, Reporter reporter, Animal animal) {
        this.reportId = reportId;
        this.description = description;
        this.severity = severity;
        this.status = status;
        this.reporter = reporter;
        this.animal = animal;
    }
    
    public void displayReport()
    {
    
    }
    
    public void updateStatus(String status)
    {
    
    }
    
    public void updateSeverity(String severity)
    {
    
    }

    public int getReportId() {
        return reportId;
    }

    public String getDescription() {
        return description;
    }

    public String getSeverity() {
        return severity;
    }

    public String getStatus() {
        return status;
    }

    public Reporter getReporter() {
        return reporter;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
}

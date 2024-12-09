/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

/**
 *
 * @author revan
 */
public class ngoVolunteerRequest extends WorkRequest {

    private String region;
    private int population;
    private double volunteerRequested;

    

    public ngoVolunteerRequest(String location, int population, double requestVolunteer) {
        this.region = location;
        this.population = population;
        this.volunteerRequested = requestVolunteer;

    }

    @Override
    public String toString() {
        return region;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }
    
    public double getVolunteerRequested() {
        return volunteerRequested;
    }

    public void setVolunteerRequested(double VolunteerRequested) {
        this.volunteerRequested = volunteerRequested;
    }

    

}

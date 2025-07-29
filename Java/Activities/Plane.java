package Activities;

import java.util.ArrayList;
import java.util.Date;

public class Plane {
	private int maxPassengers;
    private ArrayList<String> passengers;
    private Date lastTimeLanded;
    private Date takeOffTime;

    // Constructor
    public Plane(int maxPassengers) {
        this.maxPassengers = maxPassengers;
        this.passengers = new ArrayList<>();
    }

    // Add a passenger onboard
    public void onboard(String passenger) {
        if (passengers.size() <= maxPassengers) {
           this.passengers.add(passenger);
        } else {
            System.out.println("Plane is full. Cannot add more passengers.");
        }
    }

    // Record takeoff time
    public Date takeOff() {
        takeOffTime = new Date();
        return takeOffTime;
    }

    // Land the plane and clear passengers
    public void land() {
        lastTimeLanded = new Date();
        passengers.clear();
    }

    // Return the last landing time
    public Date getLastTimeLanded() {
        return lastTimeLanded;
    }

    // Return list of passengers
    public ArrayList<String> getPassengers() {
        return passengers;
    }
}


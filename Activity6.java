package Activities;

public class Activity6 {

	public static void main(String[] args) {
		 // Create Plane object with max 10 passengers
        Plane plane = new Plane(10);

        // Add passengers
        plane.onboard("Alice");
        plane.onboard("Bob");
        plane.onboard("Charlie");
        plane.onboard("Diana");
        plane.onboard("Ethan");

        // Take off and print takeoff time
        System.out.println("Take-off time: " + plane.takeOff());

        // Print passengers list
        System.out.println("Passengers on board: " + plane.getPassengers());

        // Emulate flight time
        try {
            Thread.sleep(5000); // 5 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Land the plane
        plane.land();

        // Print landing time
        System.out.println("Landing time: " + plane.getLastTimeLanded());
        System.out.println("People on the plane after landing: " + plane.getPassengers());
    }

}



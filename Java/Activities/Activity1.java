package Activities;

public class Activity1 {

	public static void main(String[] args) {
		// create object of car
		
		Car honda = new Car("Black","Automatic",2020);
		
		//print details of the car
		honda.displaycharacterstics();
		//move the car
		honda.accelerate();
		//stop the car
		honda.brake();
		

	}

}

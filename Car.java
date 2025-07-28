package Activities;

public class Car {
	String color;
	String transmission;
	int make;
	int tyres = 4;
	int door = 4;
	
	//Constructor
	
	public Car (String color, String transmission, int make)
	{
		this.color = color;
		this.transmission = transmission;
		this.make = make;
		}
	//methods
	
	public void displaycharacterstics() {
		//print the values of the class
		
		System.out.println("this color is:" + color);
		System.out.println("this transmission type is:" + transmission);
		System.out.println("this car was made in:" + make);
		System.out.println("It has:" + door + "door");
		System.out.println("It has:" + tyres + "tyre");
	}
	public void accelerate() {
		System.out.println("Car is moving forward.");
	    }
	public void brake() {
		System.out.println("Car has stopped.");
	    }

}

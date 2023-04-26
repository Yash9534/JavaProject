package DEMO;

public class Car extends Vehicale{
String type;

	public Car(String brand, double price, String color, String model, String type) {
	super(brand, price, color, model);
	this.type = type;
	System.out.println("type is "+type);
}

	public static void main(String[] args) {
Car ob=new Car("mahindra",1500000d,"white","Bs6","desial");
ob.detailsVehicale();
	}

}

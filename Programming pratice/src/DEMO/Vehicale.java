package DEMO;

public class Vehicale {
String brand;
double price;
String color;
String model;
public Vehicale(String brand, double price, String color, String model) {
	this.brand = brand;
	this.price = price;
	this.color = color;
	this.model = model;
}
void detailsVehicale()
{
	System.out.println("Brand is "+brand);
	System.out.println("price is "+price);
	System.out.println("color is "+color);
	System.out.println("model is "+model);
}
}

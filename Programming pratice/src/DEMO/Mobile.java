package DEMO;

public class Mobile {
String brand;
int price;
String model;
String color;

	public Mobile(String brand, int price, String model, String color) {
	this.brand = brand;
	this.price = price;
	this.model = model;
	this.color = color;
}
	public static void main(String[] args) {
Mobile m1=new Mobile("apple",70000,"iphone11","white");
Mobile m2=new Mobile("samsung",25000,"samsung galaxy","golden");
m1.display();
m2.display();
	}
	public void display()
	{
		System.out.println("Brand is "+brand);
		System.out.println("price is "+price);
		System.out.println("model is "+model);
		System.out.println("color is "+color);
	}
}
package DEMO;

public class Product {
int pid;
String quantity;
double price;

	public Product(int pid, String quantity, double price) {
	this.pid = pid;
	this.quantity = quantity;
	this.price = price;
}
	public String toString()
	{
		return pid+" "+quantity+" "+price;
	}

	public static void main(String[] args) {
Product p=new Product(1006,"500gm",90d);
System.out.println(p);
	}

}

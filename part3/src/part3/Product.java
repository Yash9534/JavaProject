package part3;

public class Product {
int id;
String quantity;
double price;
public Product(int id, String quantity, double price) {
	this.id = id;
	this.quantity = quantity;
	this.price = price;
}
public String toString() {
	return id+" "+quantity+" "+price;
}
	public boolean equals(Product q)
	{
		if((this .quantity.equals(q.quantity)==true) &&this.id==q.id)
			return true;
		else
			return false;
	}

public static void main(String[] args) {
	Product p1=new Product(501,"1kg",150d);
	System.out.println(p1);
	Product p2=new Product(601,"10kg",300d);
	System.out.println(p2);
	System.out.println(p1.equals(p2));
}
}

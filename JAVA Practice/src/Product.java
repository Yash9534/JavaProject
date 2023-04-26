import java.util.Objects;

public class Product {
int id;
String quantity;
double price;
	public Product(int id, String quantity, double price) 
	{
	this.id = id;
	this.quantity = quantity;
	this.price = price;
}
	public String toString() {
		return id+" " +quantity+" "+price+" ";
	}
	
	public boolean equals(Product q) {
		if (this.id==q.id )
			return true;
		else
			return false;
	}
	public static void main(String[] args) {
Product p=new Product(1002,"20kg",25.5d);
Product p2=new Product(1002,"25kg",30.6d);
System.out.println(p);
System.out.println(p2);
System.out.println(p.equals(p2));

	}

}

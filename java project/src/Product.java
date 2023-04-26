
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
	return "Product [id=" + id + ", quantity=" + quantity + ", price=" + price + "]";
}
public boolean equals(Product p)
{
	if((this.quantity.equals(p.quantity)==true)&&(this.id==p.id))
		return true;
	else 
		return false;
}
public static void main(String[] args) {
	Product p1=new Product(205,"10kg",2000d);
	Product p2=new Product(501,"15kg",6000d);
	System.out.println(p1);
	System.out.println(p2);
	System.out.println(p1.equals(p2));
}


}

package Collection;

public class Mobile implements Comparable<Mobile>{
double price;
String brand;
String color;
public Mobile(double price,String brand,String color) {
	this.price=price;
	this.brand=brand;
	this.color=color;
}
public String toString() {
	return price+" "+brand+" "+ color;
}

public int compareTo(Mobile m) {
	if(this.price>m.price)
		return 1;
	else if(this.price<m.price)
		return -1;
	else
		return 0;
}
}

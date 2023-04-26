package Collection;

import java.util.ArrayList;
import java.util.Collections;

public class Mobile implements Comparable<Mobile>{
int price;
String brand;
String color;
	public Mobile(int price, String brand, String color) 
	{
	this.price = price;
	this.brand = brand;
	this.color = color;
}
	public String toString() {
		return price+" "+brand+" "+color;
	}

	public int compareTo(Mobile m) {
		if(this.price>m.price)
			return 1;
		else if(this.price<m.price)
			return -1;
		else
		return 0;
	}
	public static void main(String[] args) {
		ArrayList<Mobile>m=new ArrayList<>();
		m.add(new Mobile(12000,"vivo","blue"));
		m.add(new Mobile(10000,"oppo","white"));
		m.add(new Mobile(15000,"motrola","black"));
		
		for(Mobile a:m)
		{
			System.out.println(a);
		}
		Collections.sort(m);
		System.out.println(m);
	}
}

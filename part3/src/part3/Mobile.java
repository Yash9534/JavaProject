package part3;

import java.util.ArrayList;
import java.util.Collections;
public class Mobile implements Comparable<Mobile> 
{
	double price;
	String brand;
	String color;
	public Mobile (double price,String brand,String color)
	{
		this.price=price;
		this.brand=brand;
		this.color=color;
	}
	public String toString()
	{
		return price+" "+brand+" "+color;
	}
	public int CompareTo(Mobile m)
	{
		if(this.price>m.price)
			return 1;
		else if(this.price<m.price)
			return -1;
		else
			return 0;
	}
	@Override
	public int compareTo(Mobile o) {
		// TODO Auto-generated method stub
		return 0;
	}
}
class DriversEx
{
	public static void main(String[] args) {
		ArrayList<Mobile>al=new ArrayList<Mobile>();
		al.add(new Mobile(2599d,"vivo","white"));
		al.add(new Mobile(20999d,"oppo","blue"));
		System.out.println("=========Before sorting========");
		System.out.println(al);
		Collections.sort(al);
		System.out.println("========After sorting=========");
		System.out.println(al);
		System.out.println("=========printing using for each loop==========");
		for(Object i:al)
		{System.out.println(i);
		}
	}
}


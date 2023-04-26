package test;
import java.util.Scanner;
public class Rectangle {
	public static void main(String[] args) {
		
	
int length,breadth,perimeter,area;
Scanner sc=new Scanner(System.in);
System.out.println("enter length of rectangle:");
length=sc.nextInt();
System.out.println("enter breadth of rectangle:");
breadth=sc.nextInt();
perimeter=2*(length+breadth);
System.out.println("perimeter of rectangle:"+perimeter);
area=length*breadth;
System.out.println("area of rectangle:"+area);

}
}
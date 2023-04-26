package Logical;

import java.util.Scanner;

public class CircleArea {

	public static void main(String[] args) {
		double radius,area,circumference;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the radius of circle: ");
	radius=sc.nextInt();
	area=3.14*radius*radius;
	circumference=2*3.14*radius;
	System.out.println(" Area of circle : "+area);
	System.out.println("circumference of circle : "+circumference);

	}

}

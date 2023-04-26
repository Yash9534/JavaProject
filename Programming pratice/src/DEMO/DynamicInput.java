package DEMO;

import java.util.Scanner;

public class DynamicInput {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("enter your name");
String name=sc.next();
System.out.println("enter your age");
int age=sc.nextInt();
System.out.println("enter your percentage ");
float perc=sc.nextFloat();
System.out.println("enter your contact number");
long phno=sc.nextLong();
System.out.println(name);
System.out.println(age);
System.out.println(perc);
System.out.println(phno);

	}

}

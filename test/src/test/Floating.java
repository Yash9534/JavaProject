package test;
import java.util.Scanner;
public class Floating {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter floating value");
	float a=sc.nextInt();
	float b=sc.nextInt();
	float c=sc.nextInt();
	float d=sc.nextInt();
	if(a>b&&a>c&&a>d)
	System.out.println(a+" is biggest");
	else if(b>c&&b>d)
	System.out.println(b+" is biggest");
	else if(c>d)
	System.out.println(c+" is biggest");
	else
	System.out.println(d+" is biggest");
}
}

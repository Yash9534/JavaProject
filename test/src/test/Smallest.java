package test;
import java.util.Scanner;
public class Smallest {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the integer value");
	int a=sc.nextInt();
	int b=sc.nextInt();
	int c=sc.nextInt();
	if(a<b&&a<c)
	System.out.println(a+" is smallest");
	else if(b<c)
	System.out.println(b+" is smallest");
	else
	System.out.println(c+" is smallest");
	
}
}

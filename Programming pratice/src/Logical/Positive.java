package Logical;
import java.util.Scanner;
public class Positive {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the integer value");
		int x=sc.nextInt();
		if(x<0)
			x=x*-1;
		System.out.println("positive integer is: "+x);
	}
}

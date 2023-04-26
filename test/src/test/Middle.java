package test;
import java.util.Scanner;
public class Middle {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the three integer values");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
	if(a>b&&a<c||a>c&&a<b)
		System.out.println(a+"is the middle number");
	else if(b>a&&b<c||b>c&&b<a)
		System.out.println(b+"is the middle number");
	else
	    System.out.println(c+"is the middle number");
	}
}

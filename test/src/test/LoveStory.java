package test;
import java.util.Scanner;
public class LoveStory {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter one integer value:");
	int a=sc.nextInt();
	if(a%3==0&&a%5==0)
		System.out.println("sanju weds geeta");
	else if(a%3==0)
	System.out.println("Sanju");
	else if(a%5==0)
		System.out.println("geeta");
	
	else
		System.out.println("breakup");
}
}
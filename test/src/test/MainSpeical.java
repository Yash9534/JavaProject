package test;
import java.util.Scanner;
public class MainSpeical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter the number");
int x=sc.nextInt();
int d1=x/10;
int d2=x%10;
int sum=d1+d2+d1*d2;
if(sum==x)
	System.out.println(x+" is a speical two digit number");
else
	System.out.println(x+" is a not speical two digit number");
	
	}

}

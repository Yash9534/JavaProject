package test;
import java.util.Scanner;
public class Date {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner (System.in);
System.out.println("enter the date(dd mm yyyy):");
int dd=sc.nextInt();
int mm=sc.nextInt();
int yy=sc.nextInt();
if(dd<1||mm<1||yy<1||mm>12||dd>31)
	System.out.println("invalid");
else if ((mm==4||mm==6||mm==11)&&dd>30)
    System.out.println("invalid");
else if (mm==2&&!(yy%400==0||yy%4==0&&yy%100!=0)&&dd>28)
       System.out.println("invalid");
else
	System.out.println("valid");
	
	}

}

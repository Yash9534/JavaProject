package test;
import java.util.Scanner;
public class ArmStrongTrueFalse {
static boolean isArmStrong(int x)
{
	int sum=0,t=x;
	do
	{
		int r=x%10;
		sum=sum+r*r*r;
		x=x/10;
	}
	while(x!=0);
	return sum==t;
}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the value of n: ");
	int n=sc.nextInt();
	boolean rs=isArmStrong(n);
	if(rs==true)
	System.out.println(n +" is armstrong number");
	else
		System.out.println(n +" is not a armstrong number");
}
}


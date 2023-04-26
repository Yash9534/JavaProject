package part3;

import java.util.Scanner;

public class OddEven {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("enter the range");
	int n=sc.nextInt();
	int sum=0;
	if(n%2==0)
	{
		for(int i=0;i<=n;i=i+2) {
			sum=sum+i;
		}
		System.out.println("sum of even number "+sum);
	}
	else
	{
		for(int i=1;i<=n;i=i+2) {
			sum=sum+i;
	}
	System.out.println("sum of odd number "+sum);
}
}
}
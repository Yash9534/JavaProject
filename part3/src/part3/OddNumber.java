package part3;

import java.util.Scanner;

public class OddNumber {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("enter the number");
int n=sc.nextInt();
for(int i=1;i<=n;i=i+2)
{
	System.out.println(i);
}
	}

}

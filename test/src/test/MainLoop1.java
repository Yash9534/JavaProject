package test;
import java.util.Scanner;
public class MainLoop1 {

public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter the range:");
int n=sc.nextInt();
/*
for (int i=1;i<=n;i++)
{
	System.out.println(i);
}
*/
int i=1;
while(i<=n)
{
	System.out.println(i);
	i++;
}
	}

}

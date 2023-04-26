package test;
import java.util.Scanner;
public class MainSumFactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter the value of n: ");
int n=sc.nextInt();
int s=0;
for(int i=1;i<=n;i++)
{
	if(n%i==0)
		s=s+i;
}

System.out.println("Sum of factor  is "+s);
	}

}

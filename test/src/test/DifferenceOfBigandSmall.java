package test;
import java.util.Scanner;
public class DifferenceOfBigandSmall {
static int diffOfBigandSmall(int x)
{
	int big=-9,small=9;
	do {
		int r=x%10;
		if(r>big)
			big=r;
		if(r<small)
			small=r;
		x=x/10;
	}
	while(x!=0);
	return big-small;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter the number");
int n=sc.nextInt();
int diff=diffOfBigandSmall(n);
System.out.println("Difference of Biggest and Smallest digits is: "+diff);
	}
}

package test;
import java.util.Scanner;
public class DiffBigSmall {
static int DiffBigSmall(int x)
{
	int big=-9,small=9;
	do {
		int r=x%10;
		if(r>big)
			big=r;
		if (r<small)
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
int diff=DiffBigSmall(n);
System.out.println("difference of biggest and smallest digits is: "+diff);
	}

}

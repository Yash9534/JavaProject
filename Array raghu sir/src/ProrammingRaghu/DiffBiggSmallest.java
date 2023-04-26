package ProrammingRaghu;

import java.util.Scanner;

public class DiffBiggSmallest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		int diff=differenceOfBAndSDigits(n);
		System.out.println("diff of biggest and smallest digits is "+diff);
	}

	static int differenceOfBAndSDigits(int x) {
		int big=-9,small=9;
		do
		{
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

}

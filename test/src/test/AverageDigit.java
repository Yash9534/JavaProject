package test;
import java.util.Scanner;
public class AverageDigit {
static double averageOfDigits(int x) {
double sum=0;
int count=0;
do {
	int r=x%10;
	sum=sum+r;
	x=x/10;
	count++;
   }
while(x!=0);
return sum/count;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter the number");
int n=sc.nextInt();
double avg=averageOfDigits(n);
System.out.println("average of digit "+avg);
	}

}

package test;
import java .util.Scanner;
public class Marks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter four subject marks");
int p=sc.nextInt();
int c=sc.nextInt();
int m=sc.nextInt();
int b=sc.nextInt();
if(p<35||c<35||m<35||b<35)
  System.out.println("Fail");
else {
	double per=(p+c+m+b)/4.0;
	if (per>85)
       System.out.println("distintion");
	else if(per>=60)
	
        System.out.println("First class");
	else if(per>=50)
         System.out.println("Second class");
	else
        System.out.println("pass");
	}
	}
}

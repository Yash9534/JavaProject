package Logical;

import java.util.Scanner;

public class Calculation {

	public static void main(String[] args) {
String yn;
do {
Scanner s=new Scanner(System.in);
System.out.println("enter first no: ");
int no1=s.nextInt();
System.out.println("enter second no: ");
int no2=s.nextInt();
System.out.println("select symbol (+,-,*,/");
String sym=s.next();
int res;
switch(sym)
{
case"+":res=no1+no2;
System.out.println("Addition is: "+res);
break;
case"-":res=no1-no2;
System.out.println("Substraction is: "+res);
break;
case"*":res=no1*no2;
System.out.println("Miltiplication is: "+res);
break;
case"/":res=no1/no2;
System.out.println("Division is: "+res);
}
System.out.println("Do you want to continue (press y for yes and n for no)");
yn=s.next();
}
while(yn.equals("y")||yn.equals("Y"));
	}
	}


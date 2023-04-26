package DEMO;

public class NestedIf2 {

	public static void main(String[] args) {
int number=20;
if(number%2==0)
{
	System.out.println("the given number is even: ");
	if(number%3==0)
	{
		System.out.println("the given number is divisible by 3 also");
		System.out.println(number+2);
	}
	else {
		System.out.println("the given number is even number but not divisible by 3");
	}
}
else
{
	System.out.println("the given number is an odd number: ");
}
	}
}

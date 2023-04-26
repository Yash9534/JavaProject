package Oops;

public class AnimalByUsingMethod {
String color;
int age;
void intObj(String c,int a)
{
	color=c;
	age=a;
}
void display()
{
	System.out.println(color+" "+age);
}
public static void main(String[] args) {
	AnimalByUsingMethod buzo=new AnimalByUsingMethod();
	buzo.intObj("black",10);
	buzo.display();
}
}

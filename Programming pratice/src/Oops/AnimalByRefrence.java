package Oops;

public class AnimalByRefrence {
String color;
int age;
	public static void main(String[] args) {
		
		AnimalByRefrence buzo=new AnimalByRefrence();
		buzo.color="black";
		buzo.age=10;
		System.out.println(buzo.color+" "+buzo.age);
	}

}

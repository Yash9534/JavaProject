package Polymorphism;

public class Sbi extends Rbi
{
void homeLoneIntrestRate() {
	System.out.println("you can get 7.5% rate");
}
void great()
{
	System.out.println("welcome to Sbi");
}
public static void main(String[] args) {
	Sbi obj=new Sbi();
	obj.printGuideLines();
	obj.homeLoneIntrestRate();
	Sbi s=new Sbi();
	s.great();
}
	}




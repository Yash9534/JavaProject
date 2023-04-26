package Shadowing;

public class VariableShadow {
int a=250;
static float c=50.2f;
void display()
{
	int a=30;
	int c=120;
	System.out.println(a);
	System.out.println(c);
	System.out.println(this.a);
	System.out.println(VariableShadow.c);
}
void print()
{
	System.out.println(a);
	System.out.println(c);
	System.out.println(VariableShadow.c);
}
	public static void main(String[] args) {
VariableShadow ob=new VariableShadow();
ob.display();
ob.print();
	}

}

package DEMO;

public class Q extends P{
int x=100;
int y=200;
void display()
{
	System.out.println("good afternoon");
}
public static void main(String[] args) {
	Q ob=new Q();
	System.out.println(ob.x);//100
	System.out.println(ob.b);//20
	ob.print();
	ob.display();
}
}

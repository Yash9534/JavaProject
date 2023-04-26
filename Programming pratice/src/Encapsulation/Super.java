package Encapsulation;

public class Super {
int i=10;
}
class Keywords extends Super
{
	int i=20;
	void show(int i)
	{
		System.out.println(super.i);
	}
	public static void main(String[] args) {
		Keywords ob=new Keywords();
		ob.show(40);
	}
}

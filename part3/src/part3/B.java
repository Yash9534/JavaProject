package part3;

public class B extends A{
	int b;

	public B(int a, int b) {
		super(a);
		this.b = b;
	}
	void display()
	{
		System.out.println(b*100);
	}

}

package part3;

public class C extends A{
int c;

public C(int a, int c) {
	super(a);
	this.c = c;
}
void view()
{
	System.out.println(a+c+100);
}

}

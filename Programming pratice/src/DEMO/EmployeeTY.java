package DEMO;

public class EmployeeTY {
String ename;
int id;
String desig;
double sal;
long phno;
public EmployeeTY(String ename, int id, String desig, double sal, long phno) {
	this.ename = ename;
	this.id = id;
	this.desig = desig;
	this.sal = sal;
	this.phno = phno;
}
public EmployeeTY(String ename, int id, long phno) {
	this.ename = ename;
	this.id = id;
	this.phno = phno;
}
public EmployeeTY(int id, double sal, long phno) {
	this.id = id;
	this.sal = sal;
	this.phno = phno;
}
public void profile()
{
	System.out.println("employee name "+ename);
	System.out.println("employee id "+id);
	System.out.println("employee designation is "+desig);
	System.out.println("employee salary "+sal);
	System.out.println("employee phone number "+phno);
}
public static void main(String[] args) {
EmployeeTY e1=new EmployeeTY("motu",101,"manager",950000d,9865385964l);
EmployeeTY e2=new EmployeeTY("patlu",102,8523697415l);
EmployeeTY e3=new EmployeeTY(103,50000d,9856754325l);
e1.profile();
e2.profile();
e3.profile();


}
}

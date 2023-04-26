
public class MEmployee extends Person {
String designation;
double sal;
int eid;
public MEmployee(String name, int age, long phno, String designation, double sal, int eid) {
	super(name, age, phno);
	this.designation = designation;
	this.sal = sal;
	this.eid = eid;
}
void detailsMEmployee()
{
	detailsPerson();
  System.out.println("Designation is "+designation);
  System.out.println("Salary is "+sal);
  System.out.println("eid is "+eid);
  
}
}

package DEMO;

public class StudentQJ {
int id;
String name;
String branch;
long phno;
static String Branch="Btm";

	public StudentQJ(int id, String name, String branch, long phno) {
	this.id = id;
	this.name = name;
	this.branch = branch;
	this.phno = phno;
}

	public static void main(String[] args) {
StudentQJ s1=new StudentQJ(001,"motu","mech",7896583254l);
StudentQJ s2=new StudentQJ(002,"patlu","civil",5896325489l);
s1.displayProfile();
s2.displayProfile();
printBranch();
	}
	public void displayProfile()
	{
		System.out.println("name is :"+name);
		System.out.println("id is :"+id);
		System.out.println("branch is :"+branch);
		System.out.println("phone number is :"+phno);
	}
	public static void printBranch()
	{
		System.out.println("branch name is :"+Branch);
	}
	

}

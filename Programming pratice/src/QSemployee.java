
public class QSemployee extends MEmployee {
String branch;
double hike;
public QSemployee(String name, int age, long phno, String designation, double sal, int eid, String branch,
		double hike) {
	super(name, age, phno, designation, sal, eid);
	this.branch = branch;
	this.hike = hike;
}
void detailsQSemployee()
{
	detailsMEmployee();
	System.out.println("branch is "+branch);
	System.out.println("hike is "+hike);
}
}

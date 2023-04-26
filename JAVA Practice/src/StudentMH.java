import java.util.HashMap;

public class StudentMH 
{
String name;
int id;
float per;
public StudentMH(String name, int id, float per) 
{
	this.name = name;
	this.id = id;
	this.per = per;
}
class Student
{
	public static void main(String[] args) 
	{
	HashMap<Integer,StudentMH>h=new HashMap<Integer,StudentMH>();
	h.put(101,new StudentMH("Mahi",45,65.2f));
	h.put(105,new StudentMH("Krish",55,60.2f));
	h.put(107,new StudentMH("Amit",48,85.2f));
	h.put(108,new StudentMH("Raju",49,95.5f));
	h.put(109,new StudentMH("Riya",65,69.8f));
	System.out.println(h.entrySet());
	}
}
}

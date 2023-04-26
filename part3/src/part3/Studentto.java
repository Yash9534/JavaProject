package part3;

public class Studentto {

int id;
String name;
Studentto(int id,String name)
{
	this.id=id;
	this.name=name;
}
public String toString() {
	return id+" "+name;
}
public static void main(String[] args) {
	Studentto ob=new Studentto(102,"sumo");
	System.out.println(ob);
	}


}



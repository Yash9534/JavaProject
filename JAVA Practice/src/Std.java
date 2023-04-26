import java.util.ArrayList;
import java.util.Collections;

public class Std implements Comparable <Std> 
{
 int id;
 String name;
public Std(int id, String name) 
{
	this.id = id;
	this.name = name;
}
public String toString() {
	return id+" "+name;
}
	
	public int compareTo(Std s) {
		if(this.id>s.id)
			return 1;
		else if(this.id<s.id)
			return -1;
		else
			return 0;
	}
}


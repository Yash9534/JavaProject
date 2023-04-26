import java.util.*;
import java.util.TreeSet;
import java.util.HashSet;
public class FbAcc implements Comparable<FbAcc>
{
String username;
String password;
long contact;
public FbAcc(String username, String password, long contact)
{
	this.username = username;
	this.password = password;
	this.contact = contact;
}
public int compareTo(FbAcc f)
{
	if(this.username.compareTo(f.username)>0)
		return 1;
	else if(this.username.compareTo(f.username)<0)
		return -1;
	else
		return 0;
}
public String toString() {
	return "username= "+username+" password= "+password+" contact= "+contact;
}
public static void main(String[] args) 
{
	HashSet<FbAcc>h=new HashSet<FbAcc>();
	h.add(new FbAcc("Amit12","523.25",8963587588l));
	h.add(new FbAcc("Hitesh123","524.25",8967514533l));
	h.add(new FbAcc("Samita124","5299.25",8963578454l));
	
	
	TreeSet<FbAcc>t=new TreeSet<FbAcc>(h);
	for(FbAcc i:t)
	{
		System.out.println(i);
	}

}

}

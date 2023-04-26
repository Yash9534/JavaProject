package Collection;

import java.util.Collections;
import java.util.LinkedList;

public class Execution {

	public static void main(String[] args) {
LinkedList<Account>l=new LinkedList<>();
l.add(new Account(55000d,1258963458l,"ajay"));
l.add(new Account(49000d,1000589634l,"raman"));
l.add(new Account(60000d,1369875426l,"kman"));
Collections.sort(l);
System.out.println("After sorting");
for(Account i:l)
{
System.out.println(i);
	}
	}
}

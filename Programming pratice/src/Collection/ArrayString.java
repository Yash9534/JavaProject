package Collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayString {

	public static void main(String[] args) {
ArrayList<String> s=new ArrayList<>();
s.add("btm");
s.add("jpnagar");
s.add("whitefield");
s.add("amit");
//System.out.println(s);
for(String i:s)
{
	//System.out.println(i);
}
Collections.sort(s);
System.out.println(s);
	}

}

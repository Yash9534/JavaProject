package HashSetMethod;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MH1 {

	public static void main(String[] args) {
HashMap<String,Object> h=new HashMap<>();
h.put("name","Pappu");
h.put("Age",45);
h.put("Contact ",853693478925l);
h.put("Place","Bangalore");
//System.out.println(h);
for(Map.Entry<String,Object> mh: h.entrySet()) {
System.out.println(mh.getKey());
System.out.println(mh.getValue());
}
Set<String>keys=h.keySet();
for(String key:keys) {
	System.out.println(key+" "+h.get(key));
}
h.remove("name");
System.out.println(h);
	}
	}


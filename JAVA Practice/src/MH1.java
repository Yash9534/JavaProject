import java.util.HashMap;

public class MH1 
{
public static void main(String[] args) 
{
HashMap<String,Object>h=new HashMap<String,Object>();
h.put("name", "Mahi");
h.put("Age", 25);
h.put("Contact", 7856983648l);
h.put("Place", "Bangalore");
System.out.println(h);
System.out.println(h.entrySet());
System.out.println(h.keySet());
System.out.println(h.values());
//System.out.println(h.remove("Age"));
System.out.println(h.entrySet());
System.out.println(h.containsKey("Age"));
System.out.println(h.putIfAbsent("id",102));
System.out.println(h.entrySet());
System.out.println(h.size());
}
}

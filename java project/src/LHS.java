import java.util.LinkedHashSet;
public class LHS
{
public static void main(String[] args)
{
LinkedHashSet<Object> hs=new LinkedHashSet<Object>();
hs.add(100);
hs.add(58.5f);
hs.add("BTM");
hs.add('A');
hs.add("BTM");
for(Object i:hs)
{
System.out.println(i);
}
}
}

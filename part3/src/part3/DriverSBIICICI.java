package part3;
import java.util.ArrayList;
public class DriverSBIICICI {
public static void main(String[] args) {
	ArrayList<Object>al=new ArrayList<Object>();
	al.add(new ArraySBI( 100002000544l,"riya",9563489562l));
	al.add(new ICICI(100200030005l,9658763245l,80000d));
	for(Object i:al)
		System.out.println(i);
}
}

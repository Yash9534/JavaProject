package Collection;

import java.util.ArrayList;

public class DriverSbiIcici {

	public static void main(String[] args) {
ArrayList<Object> al=new ArrayList<>();
al.add(new Sbi("SBI Bank:",10002005006358l,"satya",8693547856l));
al.add(new Icici("ICICI Bank:",100026633558l,7689236579l,50000d));
for(Object i:al) {
	System.out.println(i);
}
	}

}

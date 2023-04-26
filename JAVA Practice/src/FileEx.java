import java.io.*;
public class FileEx {
public static void main(String[] args) throws IOException {
	File f=new File("E:\\last suffer hstl to hm//A.text");
	PrintWriter pw=new PrintWriter(f);
	pw.println("This is an example");
	pw.println(100);
	pw.println('A');
	pw.println(25.6f);
	pw.println(true);
	pw.close();
	FileReader fr=new FileReader(f);
	BufferedReader bf=new BufferedReader(fr);
	String s=bf.readLine();
	System.out.println("Reading from file");
	while(s!=null)
	{
		System.out.println(s);
		s=bf.readLine();
	}
}
}
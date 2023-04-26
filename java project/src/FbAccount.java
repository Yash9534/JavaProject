import java.util.HashSet;
public class FbAccount {
String username;
String password;
long contact;
public FbAccount(String username, String password, long contact) {
	super();
	this.username = username;
	this.password = password;
	this.contact = contact;
}
public String toString() {
	return "FbAccount [username=" + username + ", password=" + password + ", contact=" + contact + "]";
}
public static void main(String[] args) {
	HashSet<FbAccount>h=new HashSet<FbAccount>();
	h.add(new FbAccount("Sam12","523.25",89635875818l));
	h.add(new FbAccount("Suma123","524.25",896375145313l));
	h.add(new FbAccount("Samita124","5299.25",896357845124l));
	for(FbAccount i:h)
	{
		System.out.println(i);
	}
}

}

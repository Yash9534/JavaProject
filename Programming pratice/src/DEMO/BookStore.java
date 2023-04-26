package DEMO;

public class BookStore {
private String bname;
private float price;
private String auth;
int bookid;
public String getBname()
{
	return bname;
}
public float getPrice()
{
	return price;
}
public String getAuth()
{
	return auth;
}
public void setPrice(float price)
{
	this.price=price;
	System.out.println("price update suceesfully");
}
	public BookStore(int bookid,String auth,String bname,float price)
	{
		this.bookid=bookid;
		this.auth=auth;
		this.bname=bname;
		this.price=price;
	}
}


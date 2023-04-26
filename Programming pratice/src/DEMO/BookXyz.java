package DEMO;

public class BookXyz {

	public static void main(String[] args) {
BookStore bs=new BookStore(101,"John","Sql",500f);
System.out.print("Book price is  "+bs.getPrice());
bs.setPrice(750f);
System.out.println("book price is "+bs.getPrice());
System.out.println("book name is "+bs.getBname());
System.out.println("bok author is "+bs.getAuth());
System.out.println("book id is "+bs.bookid);
	}

}

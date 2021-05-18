public class Book{

private String name;
private Author author;
private double price;
private int qty;

Book(String name, Author author, double price, int qty){
		this.name=name;
		this.author=author;
		this.price=price;
		this.qty=qty;
	
}//close constructor
public String getname(){
	return this.name=name;
}//close get method


public double getprice(){
	return this.price;
}
public int getqty(){
	return this.qty;	
}

public void setname(String name){
	this.name=name;
}//close set method
	
public void setauthor(Author author){
	this.author=author;
	
}//close set method

public void setprice(double price){
	this.price=price;
	
}//close set method

public void setqty(int qty){
	this.qty=qty;
}
	
	public void getAuthorDetails(){
		System.out.println("Author Name: "+author.getAuthorName());
		System.out.println("Author Email: "+author.getEmail());
		System.out.println("Author gender: "+author.getgender());
	}
	

}//Close Class

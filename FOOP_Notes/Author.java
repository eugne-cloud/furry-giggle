public class Author{
	String AuthorName, Email;
	char gender;

Author(String AuthorName, String Email, char gender){
	this.AuthorName=AuthorName;
	this.Email=Email;
	this.gender=gender;	
	
}//close developer constructor

public String getAuthorName(){
	return this.AuthorName=AuthorName;
}//close get method

public char getgender(){
	return this.gender=gender;
}
public String getEmail(){
	return this.Email=Email;
}

public void setAuthorName(String AuthorName){
	this.AuthorName=AuthorName;
}//close set method
	
public void setEmail(String Email){
	this.Email=Email;
	
}//close set method

public void set(char gender){
	this.gender=gender;
	
}//close set method
}//Close Class

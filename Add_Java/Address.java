import java.io.Serializable;
public class Address implements Serializable{
	String UnitNo;
	String StreetName;
	String city, postCode;
	
Address(String UnitNo, String StreetName, String city, String postCode){
	this.UnitNo=UnitNo;
	this.StreetName=StreetName;
	this.city=city;
	this.postCode=postCode;
}//close developer constructor

public String getUnitNo(){
	return this.UnitNo=UnitNo;
}//close get method

public String getStreetName(){
	return this.StreetName=StreetName;
}

public String getcity(){
	return this.city=city;
}

public String getpostCode(){
	return this.postCode=postCode;
}

public void setUnitNo(String UnitNo){
	this.UnitNo=UnitNo;
	
}//close set method
public void setcity(String city){
	this.city=city;
	
}//close set method
public void setpostCode(String postCode){
	this.postCode=postCode;	
}//close set method

public void setStreetName(String StreetName){
	this.StreetName=StreetName;
}//close set method

}//close class
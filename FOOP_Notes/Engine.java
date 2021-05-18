public class Engine{
	String PartNo, manufacturer;

Vehicles(String PartNo, String manufacturer){
	this.PartNo=PartNo;
	this.manufacturer=manufacturer;
	
}//close developer constructor

public String getPartNo(){
	return this.PartNo;
}//close get method

public double getmanufacturer(){
	return this.manufacturer;
}

public void setPartNo(String PartNo){
	this.PartNo=PartNo;
	
}//close set method
public void setmanufacturer(String manufacturer){
	this.manufacturer=manufacturer;
	
}

}//Close Class

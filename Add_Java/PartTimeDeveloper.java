/**AUTHOR NAME: LOH EU-GNE 
   STUDENT ID: 0125919
   SUBJECT CODE: XDCS 1094
   PAGE: PT DEVELOPER*/


import java.io.Serializable;

public class PartTimeDeveloper extends Developer implements Serializable{
	double HourlyRate, MaxNumOfHour;
	
PartTimeDeveloper(String DeveloperName, String gender, String DeveloperID, double HourlyRate, double MaxNumOfHour, Address add, project p){
	super(DeveloperName, gender, DeveloperID, add, p);
	this.HourlyRate=HourlyRate;
	this.MaxNumOfHour=MaxNumOfHour;
	
}//close developer constructor


public String getDeveloperName(){
	return this.DeveloperName=DeveloperName;
}//close get method

public String getgender(){
	return this.gender=gender;
}

public String getDeveloperId(){
	return this.DeveloperId=DeveloperId;
}

public double getHourlyRate(){
	return this.HourlyRate=HourlyRate;
}

public double getMaxNumOfHour(){
	return this.MaxNumOfHour=MaxNumOfHour;
}

public void DisplayAddressDetails(){
	System.out.println("Part Time Developer Unit No: " +add.getUnitNo());
	System.out.println("Part Time Developer StreetName: " +add.getStreetName());
	System.out.println("Part Time Developer City: " +add.getcity());
	System.out.println("Part Time Developer Post Code: " +add.getpostCode());
}
public void DisplayProjectDetails(){
	System.out.println("Part Time Developer Project ID: " +p.getprojectID());
	System.out.println("Part Time Developer Client Name: " +p.getclientName());
	System.out.println("Part Time Developer Cost: " +p.getcost());
	//System.out.println("Part Time Developer Project Start Date: " +p.getstartDate());
}

public void setDeveloperName(String DeveloperName){
	this.DeveloperName=DeveloperName;
	
}//close set method
public void setgender(String gender){
	this.gender=gender;
	
}//close set method
public void setDeveloperId(String DeveloperId){
	this.DeveloperId=DeveloperId;	
}//close set method

public void setHourlyRate(double HourlyRate){
	this.HourlyRate=HourlyRate;
}//close set method

public void setMaxNumOfHour(double MaxNumOfHour){
	this.MaxNumOfHour=MaxNumOfHour;
}//close set method

}//close class
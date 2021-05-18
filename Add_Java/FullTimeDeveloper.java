/**AUTHOR NAME: LOH EU-GNE 
   STUDENT ID: 0125919
   SUBJECT CODE: XDCS 1094
   PAGE: FT DEVELOPER*/

import java.io.Serializable;
public class FullTimeDeveloper extends Developer implements Serializable{

	double AnnualSalary;
	
FullTimeDeveloper(String DeveloperName, String DeveloperID, String gender, double AnnualSalary, Address add, project p){
	super(DeveloperName, gender, DeveloperID, add, p);
	this.AnnualSalary=AnnualSalary;
	
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

public double getAnnualSalary(){
	return this.AnnualSalary=AnnualSalary;
}

public void DisplayAddressDetails(){
	System.out.println("Full Time Developer Unit No: " +add.getUnitNo());
	System.out.println("Full Time Developer StreetName: " +add.getStreetName());
	System.out.println("Full Time Developer City: " +add.getcity());
	System.out.println("Full Time Developer Post Code: " +add.getpostCode());
}
public void DisplayProjectDetails(){
	System.out.println("Full Time Developer Project ID: " +p.getprojectID());
	System.out.println("Full Time Developer Client Name: " +p.getclientName());
	System.out.println("Full Time Developer Cost: " +p.getcost());
	//System.out.println("Full Time Developer Project Start Date: " +p.getstartDate());
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

public void setAnnualSalary(double AnnualSalary){
	this.AnnualSalary=AnnualSalary;	
}//close set method



}//close class
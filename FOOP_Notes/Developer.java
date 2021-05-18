/**AUTHOR NAME: LOH EU-GNE 
   STUDENT ID: 0125919
   SUBJECT CODE: XDCS 1094
   PAGE: DEVELOPER DEVELOPER*/

import java.io.Serializable;

public class Developer implements Serializable{
	String DeveloperName, gender;
	String DeveloperId;
	Address add;
	project p;
//constuctors	
Developer(String DeveloperName, String gender, String DeveloperId, Address add, project p){
	this.DeveloperName=DeveloperName;
	this.gender=gender;
	this.DeveloperId=DeveloperId; 	
	this.add=add;
	this.p=p;
	
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
public void setDeveloperName(String DeveloperName){
	this.DeveloperName=DeveloperName;
	
}//close set method

public void setgender(String gender){
	this.gender=gender;
}//close set method

public void setDeveloperId(String DeveloperId){
	this.DeveloperId=DeveloperId;
	
}//close set method

public void editclientName(String clientName){
	this.p.setclientName(clientName);
}
public void editUnitNo(String UnitNo){
	this.add.setUnitNo(UnitNo);
}
public void editStreetName(String StreetName){
	this.add.setStreetName(StreetName);
}
public void editcity(String city){
	this.add.setcity(city);
}
public void editpostCode(String postCode){
	this.add.setpostCode(postCode);
}
public void editcost(String cost){
	this.p.setcost(cost);
}

}//close class
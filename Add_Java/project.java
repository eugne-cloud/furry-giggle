/**AUTHOR NAME: LOH EU-GNE 
   STUDENT ID: 0125919
   SUBJECT CODE: XDCS 1094
   PAGE: PROJECT*/

import java.util.*;
import java.io.Serializable;
import java.time.LocalDate;

public class project implements Serializable{
	String projectID;
	String clientName;
	String cost;
	LocalDate startDate;
	Date PrdEndDate;
	Date ActualEndDate;
	String projectTxt;
	
project(String projectID, String clientName, String cost, LocalDate startDate, String projectTxt){
	this.projectID=projectID;
	this.clientName=clientName;
	this.cost=cost;
	this.startDate=startDate;
	//this.PrdEndDate=PrdEndDate;
	//this.ActualEndDate=ActualEndDate;
	this.projectTxt=projectTxt;
}//close developer constructor

public String getprojectID(){
	return this.projectID=projectID;
}//close get method

public String getclientName(){
	return this.clientName=clientName;
}

public String getcost(){
	return this.cost=cost;
}

public LocalDate getstartDate(){
	return this.startDate=startDate;
}
public Date getPrdEndDate(){
	return this.PrdEndDate=PrdEndDate;
}
public Date getActualEndDate(){
	return this.ActualEndDate=ActualEndDate;
}
public String getprojectTxt(){
	return this.projectTxt=projectTxt;
}
public void setprojectID(String projectID){
	this.projectID=projectID;
}//close set method

public void setclientName(String clientName){
	this.clientName=clientName;	
}//close set method

public void setcost(String cost){
	this.cost=cost;
}//close set method

public void setstartDate(LocalDate startDate){
	this.startDate=startDate;
}//close set method
public void setPrdEnddate(Date PrdEndDate){
	this.PrdEndDate=PrdEndDate;
}//close set method
public void setActualEndDate(Date ActualEndDate){
	this.ActualEndDate=ActualEndDate;
}//close set method
public void projectTxt(String projectTxt){
	this.projectTxt=projectTxt;
}//close set method




}//close class
//Main Menu Function 
//Declaring Function
import java.util.Scanner;
import java.time.LocalDate;
import java.io.Serializable;
import java.io.*;
import java.time.temporal.ChronoUnit;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.DayOfWeek;
import java.time.Month;
import java.time.Year;
import java.util.TimeZone;
import java.util.Date;
import java.text.SimpleDateFormat;

//Menu Class
//Variables Declaration 
public class EmployeeMenu{ //class
	public static int choice=0, num=0, choice1=0, choiceM=0, editFTC=0, editPTC=0, choiceM2=0; 
	public static double AnnualSalary, MaxNumOfHour, HourlyRate, newAnnualSalary,newHourlyRate;
	public static String DeveloperID, reply, reply2, next="y",UnitNo, StreetName, city, postCode, projectID, clientName, cost, PrdEndDate, ActualEndDate, projectTxt, newDeveloperName,newclientName, newgender, newUnitNo, newStreetName, newpostCode,newcost,DeveloperName, gender, newcity;
	public static LocalDate startDate;
	static Scanner myObj = new Scanner(System.in);
	public static FullTimeDeveloper ft[]=new FullTimeDeveloper[50];
	public static PartTimeDeveloper pt[]=new PartTimeDeveloper[50];
	public static int idx=0, Pidx=0;



	public static void EnterFullTimeDet()throws Exception{
		do{
			next="Y";
			System.out.println("----------------------------------------\n");
			System.out.println("Enter Developer Name: ");
			System.out.println("----------------------------------------\n");
			DeveloperName= myObj.next();
			
			System.out.println("----------------------------------------\n");
			System.out.println("Enter Gender: ");
			System.out.println("----------------------------------------\n");
			gender=myObj.next();
			
			System.out.println("----------------------------------------\n");
			System.out.println("Enter ID: ");
			System.out.println("----------------------------------------\n");
			DeveloperID=myObj.next();
			
			System.out.println("----------------------------------------\n");
			System.out.println("Enter Annual Salary: ");
			System.out.println("----------------------------------------\n");
			AnnualSalary=myObj.nextDouble();
			
			System.out.println("----------------------------------------\n");
			System.out.println("Enter Unit No: ");
			System.out.println("----------------------------------------\n");
			UnitNo=myObj.next();
			
			System.out.println("----------------------------------------\n");
			System.out.println("Enter Street Name: ");
			System.out.println("----------------------------------------\n");
			StreetName=myObj.next();
			
			System.out.println("----------------------------------------\n");
			System.out.println("Enter City: ");
			System.out.println("----------------------------------------\n");
			city=myObj.next();
			
			System.out.println("----------------------------------------\n");
			System.out.println("Enter Postcode: ");
			System.out.println("----------------------------------------\n");
			postCode=myObj.next();
			
			System.out.println("----------------------------------------\n");
			System.out.println("Enter Project ID: ");
			System.out.println("----------------------------------------\n");
			projectID=myObj.next();
			
			System.out.println("----------------------------------------\n");
			System.out.println("Enter Client Name: ");
			System.out.println("----------------------------------------\n");
			clientName=myObj.next();
			
			System.out.println("----------------------------------------\n");
			System.out.println("Enter Cost: ");
			System.out.println("----------------------------------------\n");
			cost=myObj.next();
			
			System.out.println("----------------------------------------\n");
			System.out.println("Project Starting Date: ");
			System.out.println("----------------------------------------\n");
			LocalDate today=LocalDate.now();
			
			System.out.println("----------------------------------------\n");
			System.out.println("Enter Project Details: ");
			System.out.println("----------------------------------------\n");
			projectTxt=myObj.next();
			
			System.out.println("----------------------------------------\n");
			System.out.println("Project End Date: ");
			System.out.println("----------------------------------------\n");
			LocalDate tomorrow=today.plus(15, ChronoUnit.DAYS);
			
			System.out.println("----------------------------------------\n");
			System.out.println("Project Actual End Date: ");
			System.out.println("----------------------------------------\n");
			LocalDate tomorrowActual=today.plus(30, ChronoUnit.DAYS);
			
			System.out.println("----------------------------------------\n");
			System.out.println("Do you want to save the details: [Y/N] ");
			System.out.println("----------------------------------------\n");
			reply=myObj.next();
			
		if (reply.equals("Y") || reply.equals("y")) {//if statement
			SaveFullTimeRec();
			System.out.println("Details Have Been Saved :)");
			
			System.out.println("Do you want to enter another Full-Time details: [Y/N] ");
			next=myObj.next();
			
		}//if statement
		
		}while(next.equals("Y")||next.equals("y"));
	}//Enter full time details
	
	//SAVE FULLTIME REC
	public static void SaveFullTimeRec() throws Exception{
	Address add=new Address(UnitNo, StreetName, city, postCode);
	project p=new project(projectID, clientName, cost, startDate, projectTxt);
	ft[idx]=new FullTimeDeveloper(DeveloperName, DeveloperID, gender, AnnualSalary, add, p);
	idx++;
		
	}//Save full time 
	
		public static void ViewFullTimeLog() throws Exception{
			int i=0;
			for (i=0; i<idx; i++){
			System.out.println("Full Time Developer Name: " +ft[i].getDeveloperName());
			System.out.println("Full Time Developer Gender: " +ft[i].getgender());
			System.out.println("Full Time Developer ID: " +ft[i].getDeveloperId());
			System.out.println("Full Time Developer Annual Salary: " +ft[i].getAnnualSalary());
			ft[i].DisplayAddressDetails();
			ft[i].DisplayProjectDetails();	
			}//for loop
			
			
		}//end ViewFullTimeLog
		
		public static void EnterPartTimeDet()throws Exception{
			System.out.println("----------------------------------------\n");
			System.out.println("Enter Developer Name: ");
			System.out.println("----------------------------------------\n");
			DeveloperName= myObj.next();
			
			System.out.println("----------------------------------------\n");
			System.out.println("Enter Gender: ");
			System.out.println("----------------------------------------\n");
			gender=myObj.next();
			
			System.out.println("----------------------------------------\n");
			System.out.println("Enter ID: ");
			System.out.println("----------------------------------------\n");
			DeveloperID=myObj.next();
			
			System.out.println("----------------------------------------\n");
			System.out.println("Enter Hourly Rate: ");
			System.out.println("----------------------------------------\n");
			HourlyRate=myObj.nextDouble();
			
			System.out.println("----------------------------------------\n");
			System.out.println("Enter Maximum Number Of Hours: ");
			System.out.println("----------------------------------------\n");
			MaxNumOfHour=myObj.nextDouble();
			
			System.out.println("----------------------------------------\n");
			System.out.println("Enter Street Name: ");
			System.out.println("----------------------------------------\n");
			StreetName=myObj.next();
			
			System.out.println("----------------------------------------\n");
			System.out.println("Enter City: ");
			System.out.println("----------------------------------------\n");
			city=myObj.next();
			
			System.out.println("----------------------------------------\n");
			System.out.println("Enter Postcode: ");
			System.out.println("----------------------------------------\n");
			postCode=myObj.next();
			
			System.out.println("----------------------------------------\n");
			System.out.println("Enter Project ID: ");
			System.out.println("----------------------------------------\n");
			projectID=myObj.next();
			
			System.out.println("----------------------------------------\n");
			System.out.println("Enter Client Name: ");
			System.out.println("----------------------------------------\n");
			clientName=myObj.next();
			
			System.out.println("----------------------------------------\n");
			System.out.println("Enter Cost: ");
			System.out.println("----------------------------------------\n");
			cost=myObj.next();
			
			System.out.println("****************************************\n");
			System.out.println("Starting Date: ");
			System.out.println("****************************************\n");
			LocalDate date = LocalDate.now();
			
			System.out.println("Project Actual End Date: ");
			System.currentTimeMillis();
			
			System.out.println("Enter Project Details: ");
			projectTxt=myObj.next();
			
			System.out.println("Do you want to save the details: [Y/N] ");
			reply2=myObj.next();
			
		if (reply2.equals("Y") || reply2.equals("y")) {
			SavePartTimeRec();
			System.out.println("Details Have Been Saved :)");
		}	
	}//Enter full time details
	
	//SAVE PARTTIME REC
	public static void SavePartTimeRec() throws Exception{//save pt
		FileOutputStream pFile=new FileOutputStream(new File("PartTimers.txt"));
		ObjectOutputStream op=new ObjectOutputStream(pFile);
		Address add=new Address(UnitNo, StreetName, city, postCode);
		System.out.println("pt1=");
		project p=new project(projectID, clientName, cost, startDate, projectTxt);
		System.out.println("pt2=");
		pt[Pidx]=new PartTimeDeveloper(DeveloperName, DeveloperID, gender, MaxNumOfHour,HourlyRate, add, p);
		System.out.println("pt3=");
		System.out.println("Pidx=" +Pidx);
		Pidx++;
		
		//Write Objects to file
		op.writeObject(pt);
		op.close();
		pFile.close();
		//PartTimeDeveloper ft=new PartTimeDeveloper()
		
	}//save pt
	
	
			
		
		public static void ViewPartTimeLog() throws Exception{
			int i=0;
			System.out.println("Pidx=" +Pidx);
			for (i=0; i<Pidx; i++){
			System.out.println("Part Time Developer Name: " +pt[i].getDeveloperName());
			System.out.println("Part Time Developer Gender: " +pt[i].getgender());
			System.out.println("Part Time Developer ID: " +pt[i].getDeveloperId());
			System.out.println("Part Time Developer Max Num Of Hour : " +pt[i].getMaxNumOfHour());
			pt[i].DisplayAddressDetails();
			pt[i].DisplayProjectDetails();	
			}//for loop
			
		}//end ViewFullTimeLog
			
	
		public static void ViewEmployeeLog() throws Exception{
		do{
		System.out.println("\t========================\n");
		System.out.println("\tView Employees Log\n");
		System.out.println("\t========================\n");
		System.out.println("\t [1]View Full Time Employee Log\n");
		System.out.println("\t [2]View Part Time Employee Log\n");
		System.out.println("\t [3]Return To Main Menu\n");
		
		//Enable user input
		Scanner myObj = new Scanner(System.in); 
		System.out.println("Enter Your Choice:");
		choice1 = myObj.nextInt();
		
		//Use Switch Case 
		switch(choice1){
			case 1:
			ViewFullTimeLog();
			break;
			
			case 2:
			ViewPartTimeLog();
			break;
			
			case 3:
			MainMenu();
			break;
			
			case 0:
			System.out.println("Bye Bye!");
			break;
			
			default:
			System.out.println("Invalid Choice!\n");
			
		} //switch
		
		} while (choice1 != 0);
		
	}//view employee log
		
//Registring New Employee	   
	public static void RegisterNewEmployee() throws Exception{
		do{
		System.out.println("\t==============================\n");
		System.out.println("\tRegister New Employee \n");
		System.out.println("\t==============================\n");
		System.out.println("\t [1]New Full-Time Employee\n");
		System.out.println("\t [2]New PartTime Employee\n");
		System.out.println("\t [0]Return to Main Menu\n");
			
		//Enable user input
		Scanner myObj = new Scanner(System.in); 
		System.out.println("Enter Your Choice:");
		num = myObj.nextInt();
		
		//Use Switch Case 
		switch(num){
			case 1:
			EnterFullTimeDet();
			break;
			
			case 2:
			EnterPartTimeDet();
			break;
			
			case 0:
			System.out.println("Bye Bye!");
			break;
			
			default:
			System.out.println("Invalid Choice!\n");
			
		} //switch
		
		} while (num != 0);
}//end registration method	

	public static void ModifyEmployeeDetails() throws Exception{
		do{
		System.out.println("\t==============================\n");
		System.out.println("\tMODIFY DEVELOPER DETAILS\n");
		System.out.println("\t==============================\n");
		System.out.println("\t [1]Edit Full-Time Employee\n");
		System.out.println("\t [2]Edit Part-Time Employee\n");
		System.out.println("\t [3]Return To Main Menu\n");
		
		Scanner myObj = new Scanner(System.in); 
		System.out.println("Enter Your Choice:");
		choiceM = myObj.nextInt();
		
		switch(choiceM){
			case 1:
			EditFullTimeEmployee();
			break;
			
			case 2:
			EditPartTimeEmployee();
			break;
		
			default:
			System.out.println("Invalid Choice!\n");
			
		} //switch

	}while (choiceM != 3);
	}//menu
	public static void EditFullTimeEmployee() throws Exception{
		int x=0, found=0;
		
		System.out.println("\t=============================\n");
		System.out.println("\tEdit Full-Time Employee\n");
		System.out.println("\t=============================\n");
		
		System.out.println("Enter ID To Search: ");
		DeveloperID=myObj.next();
		for(x=0; x<idx; x++){
			if(DeveloperID.equals(ft[x].DeveloperId)){ //loop
				found=1;
				break;
			}//loop
		}//SEARCHING 
		if(found==1){
			System.out.println("Full Time Developer ID: " +ft[x].getDeveloperId());
			System.out.println("Full Time Developer Name: " +ft[x].getDeveloperName());
			System.out.println("Full Time Developer Gender: " +ft[x].getgender());
			System.out.println("Full Time Developer Annual Salary: " +ft[x].getAnnualSalary());
			ft[x].DisplayAddressDetails();
			ft[x].DisplayProjectDetails();	
		}//SEARCHING
		
		System.out.println("\t===========================\n");
		System.out.println("\tSELECT AN ITEM TO EDIT\n");
		System.out.println("\t===========================\n");
		
		System.out.println("Full Time Developer Project ID: ");
		System.out.println("[1]Full Time Developer Name");
		System.out.println("[2]Full Time Developer Gender ");
		System.out.println("[3]Full Time Developer Annual Salary");
		System.out.println("[4]Full Time Developer Unit No: ");
		System.out.println("[5]Full Time Developer StreetName: ");
		System.out.println("[6]Full Time Developer City: ");
		System.out.println("[7]Full Time Developer Post Code: ");
		System.out.println("[8]Full Time Developer Client Name: ");
		System.out.println("[9]Full Time Developer Cost: ");
		System.out.println("[0]Return To Modify Menu");
		
		
		System.out.println("\tSELECT AN ITEM TO EDIT\n");
		Scanner myObj = new Scanner(System.in); 
		System.out.println("Enter Your Choice:");
		editFTC = myObj.nextInt();
		
		//Use Switch Case 
		switch(editFTC){
			case 1:
			System.out.print("Enter New Full-Time Developer Name: ");
			newDeveloperName=myObj.next();
			ft[x].setDeveloperName(newDeveloperName);
			break;
			
			case 2:
			System.out.print("Enter New Full-Time Developer Gender: ");
			newgender=myObj.next();
			ft[x].setgender(newgender);
			break;
			
			case 3:
			System.out.print("Enter New Full-Time Developer Annual Salary: ");
			newAnnualSalary=myObj.nextDouble();
			ft[x].setAnnualSalary(newAnnualSalary);
			break;
			
			case 4:
			System.out.print("Enter New Full-Time Unit No: ");
			newUnitNo=myObj.next();
			ft[x].editUnitNo(newUnitNo);
			break;
			
			case 5:
			System.out.print("Enter New Full-Time Street Name: ");
			newStreetName=myObj.next();
			ft[x].editStreetName(newStreetName);
			break;
			
			case 6:
			System.out.print("Enter New Full-Time City: ");
			newcity=myObj.next();
			ft[x].editcity(newcity);
			break;
			
			case 7:
			System.out.print("Enter New Full-Time Postcode: ");
			newpostCode=myObj.next();
			ft[x].editpostCode(newpostCode);
			break;
			
			case 8:
			System.out.print("Enter New Client Name:");
			newclientName=myObj.next();
			ft[x].editclientName(newclientName);
			break;
			
			case 9:
			System.out.print("Enter New Full-Time Project Cost: ");
			newcost=myObj.next();
			ft[x].editcost(newcost);
			break;
			
			case 0:
			break;
		}//edit FTC		
	}//edit
	
	public static void EditPartTimeEmployee() throws Exception{ //open edit
		int y=0, Pfound=0;
		
		System.out.println("\t=============================\n");
		System.out.println("\tEdit Part-Time Employee\n");
		System.out.println("\t=============================\n");

		System.out.println("Enter ID To Search: ");
		DeveloperID=myObj.next();
		System.out.println("Pidx=" +Pidx);
		for(y=0; y<Pidx; y++){
			if(DeveloperID.equals(pt[y].DeveloperId)){
			Pfound=1;
			break;
			}
		}//SEARCHING 
		if(Pfound==1){
			System.out.println("Part Time Developer ID: " +pt[y].getDeveloperId());
			System.out.println("Part Time Developer Name: " +pt[y].getDeveloperName());
			System.out.println("Part Time Developer Gender: " +pt[y].getgender());
			System.out.println("Part Time Developer Hourly Rate: " +pt[y].getHourlyRate());
			pt[y].DisplayAddressDetails();
			pt[y].DisplayProjectDetails();	
		}//SEARCHING
		
		System.out.println("\t===========================\n");
		System.out.println("\tSELECT AN ITEM TO EDIT\n");
		System.out.println("\t===========================\n");
		
		System.out.println("Full Time Developer Project ID: ");
		System.out.println("[1]Part Time Developer Name");
		System.out.println("[2]Part Time Developer Gender ");
		System.out.println("[3]Part Time Developer Hourly Rate");
		System.out.println("[4]Part Time Developer Unit No ");
		System.out.println("[5]Part Time Developer StreetName ");
		System.out.println("[6]Part Time Developer City ");
		System.out.println("[7]Part Time Developer Post Code ");
		System.out.println("[8]Part Time Developer Client Name ");
		System.out.println("[9]Part Time Developer Cost ");
		System.out.println("[0]Return To Modify Menu");
		
		
		System.out.println("\tSELECT AN ITEM TO EDIT\n");
		Scanner myObj = new Scanner(System.in); 
		System.out.println("Enter Your Choice:");
		editPTC = myObj.nextInt();
		
		//Use Switch Case 
		switch(editPTC){
			case 1:
			System.out.print("Enter New Part-Time Developer Name: ");
			newDeveloperName=myObj.next();
			pt[y].setDeveloperName(newDeveloperName);
			break;
			
			case 2:
			System.out.print("Enter New Part-Time Developer Gender: ");
			newgender=myObj.next();
			pt[y].setgender(newgender);
			break;
			
			case 3:
			System.out.print("Enter New Part-Time Developer Hourly Rate: ");
			newHourlyRate=myObj.nextDouble();
			pt[y].setHourlyRate(newHourlyRate);
			break;
			
			case 4:
			System.out.print("Enter New Part-Time Unit No: ");
			newUnitNo=myObj.next();
			pt[y].editUnitNo(newUnitNo);
			break;
			
			case 5:
			System.out.print("Enter New Part-Time Street Name: ");
			newStreetName=myObj.next();
			pt[y].editStreetName(newStreetName);
			break;
			
			case 6:
			System.out.print("Enter New Part-Time City: ");
			newcity=myObj.next();
			pt[y].editcity(newcity);
			break;
			
			case 7:
			System.out.print("Enter New Part-Time Postcode: ");
			newpostCode=myObj.next();
			pt[y].editpostCode(newpostCode);
			break;
			
			case 8:
			System.out.print("Enter New Client Name:");
			newclientName=myObj.next();
			pt[y].editclientName(newclientName);
			break;
			
			case 9:
			System.out.print("Enter New Part-Time Project Cost: ");
			newcost=myObj.next();
			pt[y].editcost(newcost);
			break;
			
			case 0:
			break;
		}//switch edit PTC		
	}//edit method
		


	
	public static void MainMenu() throws Exception{
		
		//loadFullTimeDeveloper();
		do{
		System.out.println("\t==================================\n");
		System.out.println("\tWelcome To KDU Developers Firm \n");
		System.out.println("\t==================================\n");
		System.out.println("\t [1]Register New Employee\n");
		System.out.println("\t [2]View Employee's Log\n");
		System.out.println("\t [3]Modify Employee Details\n");
		System.out.println("\t [0]Log Out\n");
		
		//Enable user input
		Scanner myObj = new Scanner(System.in); 
		System.out.println("Enter Your Choice:");
		choice = myObj.nextInt();
		
		//Use Switch Case 
		switch(choice){ //switch
			case 1:
			RegisterNewEmployee();
			break;
			
			case 2:
			ViewEmployeeLog();
			break;
			
			case 3:
			ModifyEmployeeDetails();
			break;
			
			case 0:
			System.out.println("Bye Bye!");
			break;
			
			default:
			System.out.println("Invalid Choice!\n");
			
		}//switch
		
		}while (choice != 0);
		
		SaveFullTimeDeveloper();
			
		
		
	}//end main menu
	public static void loadFullTimeDeveloper() throws Exception{ //open load ft
		idx=0;
			FileInputStream fi=new FileInputStream(new File("FullTimers.txt"));
			ObjectInputStream oi=new ObjectInputStream(fi);
			for (idx= 0; idx < oi.available();)
			    ft[idx]=(FullTimeDeveloper)oi.readObject();
			oi.close();
			fi.close();
	}//load full time developer
	
	public static void SaveFullTimeDeveloper() throws Exception{
	FileOutputStream f=new FileOutputStream(new File("FullTimers.txt"));
	ObjectOutputStream o=new ObjectOutputStream(f);
	
	for (int z=0; z<idx; z++){ //open for loop
	//Write Objects to file
	o.writeObject(ft[z]);
	
	}//close for loop
	}//save ft
	
	public static void loadPartTimeDeveloper() throws Exception{
		Pidx=0;
			FileInputStream pi=new FileInputStream(new File("PartTimers.txt"));
			ObjectInputStream Poi=new ObjectInputStream(pi);
			for (Pidx= 0; Pidx < Poi.available();)
			    pt[Pidx]=(PartTimeDeveloper)Poi.readObject();
			Poi.close();
			pi.close();
	}//load full time developer
	
	public static void SavePartTimeDeveloper() throws Exception{ //open save pt
	FileOutputStream f=new FileOutputStream(new File("PartTimers.txt"));
	ObjectOutputStream o=new ObjectOutputStream(f);
	
	for (int z=0; z<Pidx; z++){//open for loop
	//Write Objects to file
	o.writeObject(pt[z]);
	}//close for loop
	
	o.close();
	f.close();
	}//close save pt
	
	
	public static void main(String args[])throws Exception{
		//Print Menu
		//Login Function 

		String Username;
		String Password;

		Password = "kdu";
		Username = "kdu";

		Scanner input1 = new Scanner(System.in);
		System.out.println("Enter Username : ");
		String username = input1.next();
	
		Scanner input2 = new Scanner(System.in);
		System.out.println("Enter Password : ");
		String password = input2.next();

		if (username.equals(Username) && password.equals(Password)){
		System.out.println("Access Granted! Welcome!");
		MainMenu();
		
		}

		else if (username.equals(Username)) {//else if
        System.out.println("Invalid Password!");
		} else if (password.equals(Password)) {//else if
        System.out.println("Invalid Username!");
		}else {//else
        System.out.println("Invalid Username & Password!");
		}//else 

	}//login main	
}//class
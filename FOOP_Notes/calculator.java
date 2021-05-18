import java.util.Scanner;
public class calculator{
private String type, color, brand;

calculator(){
	
	 String type;
	 String color;
	 String brand;
}

calculator(String type){
	this.type=type;
	this.color="black";
	this.brand="Casio";
}

calculator(String type, String color, String brand){
	this.type=type;
	this.color=color;
	this.brand=brand;
}
public String getType(){
	return this.type;
	
}
public String getColor(){
	return this.color;
}

public String getBrand(){
	return this.brand;
	
}

public void setType(String type){
	this.type=type;
	
}

public void setColor(String color){
	this.color=color;
}

public void setBrand(String brand){
	this.brand=brand;
}
}
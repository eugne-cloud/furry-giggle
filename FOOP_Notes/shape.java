import java.util.Scanner;
public class shape{
private String ShapeName;
private double width, height, length;

shape(){
	this.width=0.00;
	this.height=0.00;
	this.length=0.00;

	
}

shape(double length, double width){
	this.width=width;
	this.height=0.00;
	this.length=length;

}

shape(double length, double width, double height){
	this.length=length;
	this.height=height;
	this.width=width;
}

public double getWidth(){
	return this.width;
}
public double getHeight(){
	return this.height;
}
public double getLength(){
	return this.length;
}

public void setShapeName(String ShapeName){
	this.ShapeName=ShapeName;
	
}
public void setWidth(double width){
	this.width=width;
}
public double Area(){
	return this.length*this.length;
	
}
public double Volume(){
	return this.length*this.width*this.height;
}

}// end class



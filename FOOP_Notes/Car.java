public class Car extends Vehicles{
private String PlateNo;
private Engine engine;
Car(String name, double price, String PlateNo, String Color, Engine engine){
	super(name, price); //calling parent constructor
	this.Name=Name;
	this.price=price;
}
 public String getName(String Name){
	 return this.Name;
 }  
 public double getprice(String price){
	 return this.price;
 }
 public String getPlateNo(String PlateNo){
	 return this.PlateNo;
 }
 public String Color(String color){
	 return this.Color;
 }
 public Engine engine(Engine engine){
	 return this.engine;
 }
 public void setName(String Name){
	 this.Name=Name;
 }
  public void setprice(double price){
	 this.price=price;
 }
  public void setPlateNo(String PlateNo){
	 this.PlateNo=PlateNo;
	 
 }
  public void setColor(String Color){
	 this.Color=Color;
 }
  public void setengine(Engine engine){
	 this.engine=engine;
 }
}
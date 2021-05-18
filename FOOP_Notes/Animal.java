import java.util.Scanner;
public class Animal{
	private String AnimalName;
	private int AnimalAge;
	private int NoLegs;
	
	Animal(String AnimalName, int AnimalAge, int NoLegs){
		this.AnimalName=AnimalName;
		this.AnimalAge=AnimalAge;
		this.NoLegs=NoLegs;
		
	}
	
	
	public String getAnimalName(){
		return this.AnimalName;
	}
	public int getAnimalAge(){
		return this.AnimalAge;
	}
	public int getNoLegs(){
		return this.NoLegs;
	}
	public void setAnimalName(String AnimalName){
	this.AnimalName=AnimalName;
	}
	public void setAnimalAge(int AnimalAge){
	this.AnimalAge=AnimalAge;
	}
	public void setNoLegs (int NoLegs){
	this.NoLegs=NoLegs;

	}
	

	public void eat(){
		System.out.println("Eating");
		
	}
}


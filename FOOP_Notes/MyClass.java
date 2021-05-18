import java.util.Scanner;
class MyClass{

public static void main(String[] args){
	String userName;
	int age;
	Scanner myObj=new Scanner(System.in);
	System.out.println("Enter Username");
	userName=myObj.nextLine();
	System.out.println("Enter age: ");
	age=myObj.nextInt();
	System.out.println("Username is:" +userName);
	System.out.println("Age is:" +age);

}

}
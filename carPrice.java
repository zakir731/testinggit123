package package1;

import java.util.Scanner;

public class carPrice {

	public static void main(String[] args) {
		//build a system that car calculate car price 
     
	
	int carprice;
	int adminfee;
	int interest;
	int tax;
	Scanner sc=new Scanner(System.in);
	System.out.println("entr car price");
	carprice=sc.nextInt();
	System.out.println("enter adminfee");
	
	adminfee=sc.nextInt();
	System.out.println("enter interest");
	interest=sc.nextInt();
	System.out.println("enter tax");
	tax=sc.nextInt();
	
	System.out.println("enter interest rate");
	int totalprice;
	
	totalprice=carprice+adminfee+interest+tax;
	System.out.println("Total price of the car");
	System.out.println(totalprice);
	
	double monthlypayment;
	
	monthlypayment=totalprice/72;
	System.out.println("your monthly payment is");
	System.out.println(monthlypayment);
	
	
	
	}

}

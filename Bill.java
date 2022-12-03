import java.util.Scanner;
class Bill
{ 
public static void main(String args[]) 
{   
double units,b;
Scanner sc=new Scanner(System.in);
units=sc.nextDouble();
b= calculateElectricityBill(units);
System.out.println(b); 
     }
	static double calculateElectricityBill(double units)
	{
	double billpay=0;
	if(units<100)
	{
	    billpay=units*1.20;
	}
	else if(units<=300)
	{
	    billpay=100*1.20+(units-100)*2;
	}
	else if(units>300)
	{
	    billpay=100*1.20+200 *2+(units-300)*3;
	}
	return billpay;
	
	
	
	
	
 	} }

import java.util.Scanner;  
public class Powerofanumber 
{  

static double power(int base, int exponent)  
{  
    double sta = Math.pow(base,exponent);
    return sta;
}  

public static void main(String args[])  
{  
int base, exponent;  
Scanner sc=new Scanner(System.in);  
base=sc.nextInt();  
exponent=sc.nextInt();  
double pow=power(base, exponent);  
System.out.printf("%.0f",pow);  
}  
}  

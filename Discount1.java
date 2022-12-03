import java.util.Scanner;
public class Discount1
{
	public static void main(String[] args) {
    double  dis,amount,markedprice,s;
    Scanner sc= new Scanner(System.in);
    markedprice= sc.nextDouble();    
    dis= sc.nextDouble();
    s=100-dis;
	amount= calcuateDiscount(markedprice,s);
    System.out.println(amount); 
	}

static double calcuateDiscount(double markedprice,double s)
    {
        double amount= (markedprice*s)/100;
        return amount;
    }                   

}

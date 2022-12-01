import java.util.*;
public class Profit2
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Loss l = new Loss();
        System.out.println("Enter the price of a dozen mangoes");
        float x = sc.nextFloat();
        System.out.println("Enter the price at which 1 mango is being sold");
        float y = sc.nextFloat();
    
        float total= 12 * y;
        l.varun(total,x);
       
    }
}
class Loss
{
    void varun(float total,float x)
    {
        if(total > x)
        {
            System.out.printf("Profit : Rs.%.2f",(total-x));
        }
        
        else if(total < x)
        {
            System.out.printf("Loss : Rs.%.2f",(total-x));
        }
        else
         {
            System.out.println("No profit nor loss");
        }
    }
}

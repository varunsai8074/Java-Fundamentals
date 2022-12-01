import java.util.*;
public class Hotel
{
    public static void main(String args[])
    {
        float Tarrif;
        Scanner sc = new Scanner(System.in);
        int mon = sc.nextInt();
        float RR = sc.nextInt();
        int DS = sc.nextInt();
        
        Tarrif = DS * RR ;
         if(mon == 4 || mon == 5 || mon == 11 || mon == 12 )
        {
            float sum = (RR/100)* 20;
            float Tar = (sum*2)+ Tarrif;
            System.out.printf("Hotel Tariff: Rs.%.2f",Tar);
        }
        else if(mon < 12)
        {
            System.out.printf("Hotel Tariff: Rs.%.2f",Tarrif);
        }
       
        else if(mon > 12)
        {
         System.out.println("Invalid Input");   
        }
        
    }
}

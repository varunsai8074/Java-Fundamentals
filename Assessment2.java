import java.io.*;
import java.util.*;
public class Assessment2
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int i = sc.nextInt();
        int y = sc.nextInt();
        float interest = (b*i*y)/100;
        float amount = interest+b;
        float discount =(interest*2)/100; 
        float fin = (interest - discount) + b;
        
        
        System.out.printf("%.2f\n",interest);
        System.out.printf("%.2f\n",amount);
        System.out.printf("%.2f\n",discount);
        System.out.printf("%.2f\n",fin);
        
    }
}

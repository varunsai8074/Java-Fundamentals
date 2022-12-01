import java.util.*;
public class Fee
{
    public static void main(String args[])
    {
        Float TF,HF,BF,tot;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the student type");
        String ST = sc.nextLine();
        switch(ST)
        {
            case "MSDS":
                System.out.println("Enter tuition fee");
                TF = sc.nextFloat();
                System.out.println("Enter Bus fee");
                BF = sc.nextFloat();
                tot = TF + BF;
                System.out.printf("The fees to be paid by the student is Rs.%.2f",tot);
                break;
            case "MSH":
                System.out.println("Enter tuition fee");
                TF = sc.nextFloat();
                System.out.println("Enter Hostel fee");
                HF = sc.nextFloat();
                tot = TF + HF;
                System.out.printf("The fees to be paid by the student is Rs.%.2f",tot);
                break;
            case "MGSDS":
                System.out.println("Enter tuition fee");
                TF = sc.nextFloat();
                System.out.println("Enter Bus fee");
                BF = sc.nextFloat();
                tot = (TF/2+TF)+BF;
                System.out.printf("The fees to be paid by the student is Rs.%.2f",tot);
                break;
            case "MGSH":
                System.out.println("Enter tuition fee");
                TF = sc.nextFloat();
                System.out.println("Enter Hostel fee");
                HF = sc.nextFloat();
                tot = (TF/2+TF)+HF;
                System.out.printf("The fees to be paid by the student is Rs.%.2f",tot);
                break;
        }
    }
}

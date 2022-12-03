import java.util.Scanner;
public class Grade
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
       
        in.hasNextInt();
        int score1 = in.nextInt();

        in.hasNextInt();
        int maxMark = in.nextInt();

        in.hasNextInt();
        double weighting = in.nextDouble();       
        System.out.printf("%.1f",scoreCalc(score1,maxMark,weighting));
        
       
    }

    public static double scoreCalc (int score1, int maxMark, double weighting)
    {
        double tot = maxMark/score1;
        tot = tot*weighting;
        return tot;
        
    }
}

import java.util.Scanner;
public class String1
{
    public static void main (String[] args)
{
    Scanner sc=new Scanner(System.in);
	String s = sc.next();
	System.out.println(Str(s));
}
	public static int Str(String s)
{
	int n = s.length();
	if(n < 2) {
		return 0;
	}

	int l = 0;
	int i = (n + 1)/2;
	while(i < n)
	{
		if(s.charAt(i) == s.charAt(l))
		{
		++l;
		++i;
		}
		else
		{
		i = i - l + 1;
		l = 0;
		}
	}

	return l;

}

}

import java.util.Scanner;
class Prg4
{
	public static void main(String args[])
	{
		int a,edigit=0,odigit=0;
		System.out.println("enter numbers ");
		Scanner in=new Scanner(System.in);
		a=in.nextInt();
		while(a!=0)
		{
			if(a%2==0)
			{
				++edigit;
			}
			else
			{
				++odigit;
			}
			a=a/10;
		}
		System.out.println("odd digit="+odigit);
		System.out.println("even digit="+edigit);
	}
}
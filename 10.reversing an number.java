import java.util.Scanner;
class Prg10
{
	public static void main(String args[])
	{
		int a,sum=0,rev=0;
		System.out.println("enter numbers ");
		Scanner in=new Scanner(System.in);
		a=in.nextInt();
		
		while(a!=0)
		{
			rev=rev*10+(a%10);
			a=a/10;
		}
		System.out.println("reverse= "+rev);
	}
}
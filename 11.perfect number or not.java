import java.util.Scanner;
class Prg11
{
	public static void main(String args[])
	{
		int a,sum=0;
		boolean flag=true;
		System.out.println("enter numbers ");
		Scanner in=new Scanner(System.in);
		a=in.nextInt();
		for(int i=1;i<=a/2;i++)
		{
			if(a%i==0)
			{	
				sum+=i;
			}
		}
		if(a==sum)
		System.out.println("perfect number");
		else
		System.out.println("not");
	}
}
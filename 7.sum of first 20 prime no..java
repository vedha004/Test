import java.util.Scanner;
class Prg7
{
	public static void main(String args[])
	{
		int sum=0,count=1;
		boolean prime=true;
		
		for(int i=2;i<=1000;i++)
		{
		 	prime=true;
			for(int j=2;j<=i/2;j++)
			{	
				if(i%j==0)
				{
					prime=false;
					break;
				}
			}
			if(prime&&count<=20)
			{
				sum+=i;
				count++;
			}
		}
		System.out.println("sum= "+sum);
	}
}
import java.util.Scanner;
class Prg15
{
	public static void main(String args[])
	{
		long a,sum=0,temp=0,fact=1,digit=0;
		for(a=1;a<=100000000000L;a++)
		{
		temp=a;
			while(temp!=0)
			{	
				digit=temp%10;
				while(digit>0)
				{
					fact*=digit;
					digit--;	
				}
				sum+=fact;
				fact=1;
				temp/=10;
			}
			if(a==sum)
			System.out.println("perfect number= "+a);
			sum=0;	
		}
	}
}
import java.util.Scanner;
class Prg13
{
	public static void main(String args[])
	{
		int a,sum=0,total=0,count=1;
		for(a=1;a<=1000000;a++)
		{
			for(int i=1;i<=a/2;i++)
			{
				if(a%i==0)
				{	
					sum+=i;
				}
			}
		if(a==sum && count<=10)
		{
		total+=sum;
		count++;
		}
		sum=0;
		}
		System.out.println("sum= "+total+"count= "+count);
	}
}
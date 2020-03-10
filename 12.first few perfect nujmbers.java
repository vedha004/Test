import java.util.Scanner;
class Prg12
{
	public static void main(String args[])
	{
		int a,sum=0;
		for(a=1;a<=100000000;a++)
		{
		for(int i=1;i<=a/2;i++)
		{
			if(a%i==0)
			{	
				sum+=i;
			}
		}
		if(a==sum)
		System.out.println(sum);
		sum=0;
		}
	}
}
import java.util.Scanner;
class Prg14
{
	public static void main(String args[])
	{
		int a,sum=0,temp=0,fact=1,digit=0;
		System.out.println("enter numbers ");
		Scanner in=new Scanner(System.in);
		a=in.nextInt();
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
		System.out.println("perfect number= "+a+" "+sum);
		else
		System.out.println("not a perfect number= "+a+" "+sum);
	}
}
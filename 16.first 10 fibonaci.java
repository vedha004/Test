import java.util.Scanner;
class Prg16
{
	public static void main(String args[])
	{
		int a=0,b=1,sum=1,n=1,total=1;
		System.out.print(a+" "+b+" ");
		while(n<=8)
		{
			sum=a+b;
			a=b;
			b=sum;
			System.out.print(sum+" ");
			n++;
			total+=sum;	
		}
		System.out.println("    total= "+total);
	}
}
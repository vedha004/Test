import java.util.Scanner;
class Prg8
{
	public static void main(String args[])
	{
		int a,temp,sum=0,count=0,numsize=0,armsmul=1,digit,i=0;
		System.out.println("enter numbers ");
		Scanner in=new Scanner(System.in);
		a=in.nextInt();
		count=a;
		while(count!=0)
		{
			numsize++;
			count=count/10;
		}
		temp=a;
		while(temp!=0)
		{
			digit=temp%10;
			while(i<numsize)
			{
				armsmul*=digit;
				i++;
			}
			sum+=armsmul;
			temp=temp/10;
			armsmul=1;
			i=0;
		}
		if(a==sum)
		System.out.println("armstrong");
		else
		System.out.println("no");
	}
}
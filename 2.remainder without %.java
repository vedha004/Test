import java.util.Scanner;
class Prg2
{
	public static void main(String args[])
	{
		int a,b;
		System.out.println("enter numbers to be swaped");
		Scanner in=new Scanner(System.in);
		a=in.nextInt();
		b=in.nextInt();
		int count=0;
		if(a>b)
		{
			while(a>=b)
			{
			a-=b;
			count++;
			}
			System.out.println("reaminder "+a);
		}
		else
		{
			System.out.println("remainderer= "+a);
		}
	}
} 
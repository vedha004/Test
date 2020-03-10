import java.util.Scanner;
class Prg3
{
	public static void main(String args[])
	{
		int a,b;
		System.out.println("enter numbers to be swaped");
		Scanner in=new Scanner(System.in);
		a=in.nextInt();
		int count=0;
		//b=in.nextInt();
		while(a!=0)
		{
			a=a/10;
			count++;
		}
		System.out.println("no of digits in the number is= "+count);
	}
}
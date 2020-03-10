import java.util.Scanner;
class Prgtest2
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int i;
		System.out.println("enter the value of char");
		char ch=in.next().charAt(0);
		if(ch>=97 && ch<=122)
		{
			int ch1=ch-32;
			System.out.println("upper case is= "+(char)ch1);
		}
		else
		{
			System.out.println("enter a lower case character");
		}
		
		
	}
}
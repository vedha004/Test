import java.util.Scanner;
class Prgtest1
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int i;
		System.out.println("enter the value of string");
		String str=in.nextLine();
		for(i=0;i<str.length();i++)
		System.out.println(str.charAt(i));
		
	}
}
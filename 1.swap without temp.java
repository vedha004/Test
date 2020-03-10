import java.util.Scanner;
class Prg1
{
	public static void main(String args[])
	{
		int a,b;
		System.out.println("enter numbers to be swaped");
		Scanner in=new Scanner(System.in);
		a=in.nextInt();
		b=in.nextInt();
		System.out.println("before swap a= "+a+"b= "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("after swap a= "+a+"b= "+b);
	}
}
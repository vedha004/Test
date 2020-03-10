import java.util.Scanner;
class PrgTest9
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int count=1,N,num;
		System.out.println("enter the value");
		N=in.nextInt();
		int temp=N;
		if(temp>=10)
		while(temp>10)
		{
			count*=10;
			temp/=10;
		}
		temp=N;
		boolean flag=true;
		int c=count;
		switch(count)
		{
			case 100000000 :
				if(temp/c==1)
				{
				System.out.print(number(temp/c,temp,count)+" crore ");
				num=temp/c;
				temp=temp-(num*c);
				c=c/10;
				num=temp/c;
				temp=temp-(num*c);
				c=c/10;
				flag=false;
				}
				else
				{
				System.out.print(number(temp/c,temp,count)+" ");
				num=temp/c;
				temp=temp-(num*c);
				c=c/10;
				}
			case 10000000 :
				if(flag!=false)
				{
				System.out.print(number1(temp/c)+" crore ");
				num=temp/c;
				temp=temp-(num*c);
				c=c/10;
				}
				flag=true;
			case 1000000 :
				if(temp/c==1)
				{
				System.out.print(number(temp/c,temp,count)+" lac ");
				num=temp/c;
				temp=temp-(num*c);
				c=c/10;
				num=temp/c;
				c=c/10;
				flag=false;
				}
				else
				{
				System.out.print(number(temp/c,temp,count)+" ");
				num=temp/c;
				temp=temp-(num*c);
				c=c/10;
				}
			case 100000 :
				if(flag!=false)
				{
				System.out.print(number1(temp/c)+" Lac ");
				num=temp/c;
				temp=temp-(num*c);
				c=c/10;
				}
				flag=true;
			case 10000 :
				if(temp/c==1)
				{
				System.out.print(number(temp/c,temp,count)+" thousand ");
				num=temp/c;
				temp=temp-(num*c);
				c=c/10;
				num=temp/c;
				c=c/10;
				flag=false;
				}
				else
				{
				System.out.print(number(temp/c,temp,count)+" ");
				num=temp/c;
				temp=temp-(num*c);
				c=c/10;
				}
			case 1000 :
				if(flag!=false)
				{
				System.out.print(number1(temp/c)+" Thousand ");
				num=temp/c;
				temp=temp-(num*c);
				c=c/10;
				}
				flag=true;
			case 100 :
				if(temp/c!=0)
				System.out.print(number1(temp/c)+" hundred ");
				num=temp/c;
				temp=temp-(num*c);
				c=c/10;
			case 10 :
				System.out.print(number(temp/c,temp,count)+" ");
				num=temp/c;
				temp=temp-(num*c);
				c=c/10;
			case 1 :
				System.out.print(number1(temp/c));
				
			}
			
	}
	static String number1(int num)
	{
		switch(num)
		{
			case 1:
				return "one";
			case 2:
				return "Two";
			case 3:
				return "three";
			case 4:
				return "four";
			case 5:
				return "five";
			case 6:
				return "six";
			case 7:
				return "seven";
			case 8:
				return "eight";
			case 9:
				return "nine";
			default:
				return "";
		}
	}
	static String number(int num,int temp,int count)
	{
		switch(num)
		{
			case 1:
				return number2(temp,count);
			case 2:
				return "Twenty";
			case 3:
				return "thirty";
			case 4:
				return "fourty";
			case 5:
				return "fifty";
			case 6:
				return "sixty";
			case 7:
				return "seventy";
			case 8:
				return "eighty";
			case 9:
				return "ninety";
			default:
				return "";
		}
	}
	static String number2(int num,int count)
	{
		int num2=num/count;
		num=num-(num2*count);
		count=count/10;
		num2=num/count;
		int num1=10+num2;
		switch(num1)
		{
			case 10:
				return "ten";
			case 11:
				return "eleven";
			case 12:
				return "twevle";
			case 13:
				return "thirteen";
			case 14:
				return "forteen";
			case 15:
				return "fifteen";
			case 16:
				return "sixteen";
			case 17:
				return "seventeen";
			case 18:
				return "eighteen";
			case 19:
				return "nineteen";
			default:
				return "";
		}
	}
}
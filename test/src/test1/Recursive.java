package test1;

public class Recursive {
	public static int fn1(int n)
	{
		if(n==0)
		{
			return 1;
		}
		else if(n==1)
		{
			return 4;
		}
		else
		{
			return 2*fn1(n-1)+fn1(n-2);
		}
	}
	
	public static int fn2(int n)//用递归实现n个2相加
	{
		if(n==1)
		{
			return 2;
		}
		else
		{
			return 2+fn2(n-1);
		}
	}
	public static void main(String[] args)
	{
		{
		int a=9;
		System.out.println(a);
		
		}
		System.out.println(fn1(10));
		System.out.println(fn2(8));
		
	}
	

}

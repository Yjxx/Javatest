package test1;
class DataSwap
{
int c;
int d;
}
public class  Mytest1
{
	public int a;
	public int b;
	public String name;
	public int age;
	public Mytest1()
	{
		a=0;
		b=0;
		
	}
	
	public Mytest1(int a,int b)
	{
		this.a=a;
		this.b=b;
		
	}
	public static void swap(int x,int y)//普通值传递
	{
		int temp;
		temp=x;
		x=y;
		y=temp;
		System.out.println("swap方法里x和y的值是:"+x+","+y);
	}
	public static void swap(DataSwap t)//引用值传递
	{
		int temp;
		temp=t.c;
		t.c=t.d;
		t.d=temp;
		System.out.println("swap方法里c和d的值是:"+t.c+","+t.d);
	}
	public static void say(String ... contents)//不定参数个数的使用
	{
		for(String c:contents)
		{
		System.out.println(c);
		}
	}
	public Mytest1 grow()
	{
		age++;
		return this;
	}

	public static void main(String[] args)
	{
		int a = 100;
		int b = 220;
		
		a = a^b;//用3次移位实现值交换
		b = a^b;
		a = a^b;

		
		int x=8;
		int y=9;
		DataSwap t=new DataSwap();
		t.c=1;
		t.d=6;
		Mytest1 p;
		p=new Mytest1();
		p.name="李刚";
		p.age=23;
		System.out.println(p.name);
		System.out.println(p.age);
		p.grow()
		 .grow()
		 .grow();//返回this的方法可以被多次调用
		System.out.println(p.age);
		Mytest1.say("I'm happy!","Hello word!");
		swap(x,y);
		System.out.println("交换结束后x和y的值是:"+x+","+y);
		swap(t);
		System.out.println("交换结束后c和d的值是:"+t.c+","+t.d);
		
		
		
	}
}

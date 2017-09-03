package test2;
class Mytest{
	public static int a=5;
}

public class Mytest1 extends Mytest{
	public static int a=7;
	private String testname;
	private int score;
	public Mytest1(String testname)
	{
		this.testname=testname;
	}
	public Mytest1(String testname,int score)
	{
		this(testname);
		this.score=score;

	}
	public void gettest()
	{
		System.out.println(testname+","+score);
	}
	
	public static void main(String[] args)
	{
		Object t="hello!";
		System.out.println(t instanceof String);
		System.out.println(t instanceof Comparable);
		Integer t3=new Integer(5);
		Integer t4=new Integer(5);
		String a="133";
		int n=Integer.parseInt("3");
		int n2=Integer.parseInt("3");
		System.out.println(n==n2);
		System.out.println(n);
		String str=String.valueOf(n);
		System.out.println(str+"*");
		if(t3!=t4)
		{
			System.out.println("yes");
		} 
		
		
		System.out.println(t3 instanceof Object);
		Mytest1 t1=new Mytest1("数学");
		Mytest1 t2=new Mytest1("数学",95);
		System.out.println((t1.getClass()==t2.getClass())+"!");
		t1.gettest();
		t2.gettest();
		System.out.println(Mytest1.a);
		System.out.println(Mytest.a);
		
		
	}
	

}

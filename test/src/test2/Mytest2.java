package test2;

public class Mytest2 {
	private String name;
	private int score;
	public long testId;
	public Mytest2(String name,int score,long testId)
	{
		this.name=name;
		this.score=score;
		this.testId=testId;
	}
	public long gettestId()
	{
		return testId;
	}
	public boolean equals(Object obj)
	{
		if(this==obj)
			return true;
		if(obj!=null&&obj.getClass()==Mytest2.class)
		{
			Mytest2 t1=(Mytest2)obj;
			if(this.gettestId()==t1.gettestId())
			{
				return true;
			}
			
			
		}
		return false;
	}
	public String toString()
	{
		return ("Mytest2:"+name+","+"score:"+score+","+"ID:"+testId);
	}
	public static void main(String[] args)
	{
		Mytest2 t=new Mytest2("English",90,12343);
		Mytest2 t3=new Mytest2("Chinese",80,12343);
		Mytest2 t4=new Mytest2("Chinese",80,12345);
		String str1="hello";
		String str2=" world!";
		String str3="hello world!";
		String str4="hello"+" world!";
		System.out.println(str3==str4);
		System.out.println(str3==str1+str2);
		
		System.out.println(t.equals(t3));
		System.out.println(t.equals(t4));
		System.out.println(t.equals(t));
		
		
		System.out.println(t);
	}

}

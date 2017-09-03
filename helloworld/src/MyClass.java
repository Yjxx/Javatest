
//import java.util.Arrays;
public class MyClass {

	public static void main(String[] args) {
		for(int i=1;i<=9;i++)
	{
		for(int j=1;j<=i;j++)
		{
			int sum;
			sum=i*j;
			System.out.print(i+"x"+j+"="+sum);
			if(j!=i)
			{
			System.out.print(",");
			}
			
		}
		System.out.println();
		
	}
}
}

package Package1;

public class Calculation {
	
	public int sum(int a, int b)
	{
		int c;
		c=a+b;
		System.out.println("Summation is "+c);
		return c;
	}
	
	public int sub(int a, int b)
	{
		int c;
		c=a-b;
		System.out.println("Subtraction is "+c);
		return c;
	}
	
	public void multi(int a, int b)
	{
		int c;
		c=a*b;
		System.out.println("Multiplication is "+c);
	}

	public static void main(String[] args) {
		
		Calculation c1= new Calculation();
		int sumResult= c1.sum(12, 10);
		int subResult= c1.sub(18, 6);
		c1.multi(sumResult, subResult);
		
		
	}
}

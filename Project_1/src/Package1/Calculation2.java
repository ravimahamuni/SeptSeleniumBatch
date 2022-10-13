package Package1;
public class Calculation2 {
	public int sum(int a, int b){
		int c;
		c=a+b;
		System.out.println("Summation is "+c);
		return c;}
	public int sub(int a, int b){
		int c=a-b;
		System.out.println("Subtraction is "+c);
		return c;}
	public int multi(int a, int b){
		int c= a*b;
		System.out.println("Multiplication is "+c);
		return c;}
	public void div(int a, int b){
		int c=a/b;
		System.out.println("Division is "+c);}
	public static void main(String[] args) {
		Calculation2 cal2= new Calculation2();
		int multiResult=cal2.multi(10, 2);
		int subResult=cal2.sub(multiResult, 2);
		int sumResult=cal2.sum(subResult, 2);
		int subResult1=cal2.sub(sumResult, 2);
		cal2.div(subResult1, 2);}
}

//(((((10*2)-2)+2)-2)/2)

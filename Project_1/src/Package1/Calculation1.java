package Package1;
public class Calculation1 {
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
		Calculation1 cal1= new Calculation1();
		int sumResult=cal1.sum(10, 2);
		int subResult= cal1.sub(sumResult, 2);
		int subResult1=cal1.sum(subResult, 2);
		int multiResult=cal1.multi(subResult1, 2);
		cal1.div(multiResult, 2);}
}

//(((((10+2)-2)+2)*2)/2)











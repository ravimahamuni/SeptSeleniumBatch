package Package1;

public class Class2 {
	public void method2() {
		System.out.println("method of Class2");
	}
	public static void main(String[] args) {
		Class1 c1= new Class1();
		c1.m1();
		Class2 c2= new Class2();
		c2.method2();
	}
}

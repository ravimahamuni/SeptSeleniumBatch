package Package1;
public class thisDemo {
	public void method() {
		System.out.println("Default Method");
		this.method1();
	}
	public void method1() {
		System.out.println("one parameterized Method");
		this.method2();
	}
	public void method2() {
		System.out.println("two parameterized Method");
		this.method4();
	}
	public void method3(int a, int b, int c) {
		System.out.println("three parameterized Method");
		this.method();
	}
	public void method4() {
		System.out.println("four parameterized Method");
	}
public static void main(String[] args) {
	thisDemo t1= new thisDemo();
	t1.method3(12,45,67);
}
}

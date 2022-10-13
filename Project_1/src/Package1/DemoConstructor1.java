package Package1;

public class DemoConstructor1 {
	public DemoConstructor1() {
		this(10, 20,30);
		System.out.println("default Constructor");
	}
	public DemoConstructor1(int a) {
		this(23,78);
		System.out.println("one parameterized Constructor");
	}
	public DemoConstructor1(int a, int b) {
		this();
		System.out.println("two parameterized Constructor");
	}
	public DemoConstructor1(int a, int b, int c) {
		
		System.out.println("three parameterized Constructor");
	}
	public static void main(String[] args) {
		//new DemoConstructor1();
		new DemoConstructor1(34);
	}
}

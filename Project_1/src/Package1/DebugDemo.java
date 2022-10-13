package Package1;

public class DebugDemo {
	public void method2() {
		System.out.println("first line of method2");
		System.out.println("second line of method2");
	}
	public void method1() {
		System.out.println("first line of method1");
		System.out.println("second line of method1");
	}
	public static void main(String[] args) {
		System.out.println("first line of main method");
		DebugDemo d1= new DebugDemo();
		d1.method1();
		System.out.println("Seond line of main method");
		d1.method2();
		System.out.println("end of program");
}
}

package Package1;

public class DemoConstructor {
	
	public DemoConstructor() {
		System.out.println("This is a default Constructor");
	}
	public DemoConstructor(int a) {
		this(10,20); //this keyword
		System.out.println("This is one parameterized Constructor");
	}
	public DemoConstructor(int a, int b) {
		System.out.println("This is two parameterized Constructor");
	}

	public static void main(String[] args) {
		DemoConstructor d1= new DemoConstructor();
		 new DemoConstructor(10);
		 
		
	}
}

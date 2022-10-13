package Package1;

public class ABC {
	int gvar=234; //global variable
	public void method1(int a)
	{
		gvar=a; //assigning local variable value to global variable
		//System.out.println(gvar);
	}
	
    public static void main(String[] args) {
    	ABC obj1 = new ABC();
    	obj1.method1(567);
    	System.out.println("value of gvar is "+obj1.gvar);
	
}
}

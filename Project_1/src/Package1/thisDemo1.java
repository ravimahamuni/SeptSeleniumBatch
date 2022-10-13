package Package1;

public class thisDemo1 {
	int gvar=234; //global variable
	public void method1(int gvar)
	{
		this.gvar=gvar; //assigning local variable value to global variable
		
	}
	
    public static void main(String[] args) {
    	ABC obj1 = new ABC();
    	obj1.method1(567);
    	System.out.println("value of gvar is "+obj1.gvar);
	
}

}

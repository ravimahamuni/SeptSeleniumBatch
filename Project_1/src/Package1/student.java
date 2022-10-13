package Package1;

public class student 
{ //boundary (body) of the class
	
	int a;
	public void display()
	{//boundary of method
		System.out.println("Welcome all");
	}
	public static void main (String args[])
	{
		student s1 = new student();// Third Piller
		s1.display(); // calling the method
		s1.a=10; // calling the variable
		System.out.println(s1.a);
		s1.a=345;
		System.out.println(s1.a);
	}
}

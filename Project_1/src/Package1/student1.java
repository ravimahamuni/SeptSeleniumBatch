package Package1;

public class student1 
{
	int roll_no;
	int age;
	
	public void display1() 
	{
		System.out.println("Welcome to all of you");
	}
	
	public void display2()
	{
		System.out.println("Automation is very easy");
	}
	
	public static void main(String[] args)
	{
		student1 s1 = new student1();
		s1.display1();
		s1.display2();
		s1.age=33;
		s1.roll_no=52;
		System.out.println("student's Age is " + s1.age);
		System.out.println("student's roll number is " + s1.roll_no);
		
	}
}

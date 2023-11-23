package p1;

public class A {
	A()
	{
		System.out.println("THis is Con");
	}
	
	{
		System.out.println("This is Instance Block");
	}
	
	void m1()
	{
		System.out.println("This is instance method");
	}
	
	static
	{
		System.out.println("This is static block");
	}
	
	public static void main(String[] args) {
		new A().m1();
	}
}

package generalization;
class Pclass
{
	void m1()
	{
		System.out.println("This is old m1 methods");
	}
}
public class Child extends Pclass{
	void m1()
	{
		System.out.println("new M1 MEthods");
	}
	void m2()
	{
		System.out.println("This is m2 method");
	}
	public static void main(String[] args) {
		Pclass on = new Child();
		on.m1();
	}
}

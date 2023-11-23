package casestudy;
class Parent{
	Parent(int x)
	{
		System.out.println("THis is parent CLass Cons");
	}
}
public class Child extends Parent{
	Child(int x)
	{
		super(x);
		System.out.println("This is Child Class Cons");
	}
	
	public static void main(String[] args) {
		new Child(456);
	}
}

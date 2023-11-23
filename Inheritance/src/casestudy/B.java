package casestudy;
class A{
	int x = 2;
	void m1() {
		System.out.println("This is instance method");
	}
}
public class B extends A{
	public static void main(String[] args) {
		new B().m1();
	}
}

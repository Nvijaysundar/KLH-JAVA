package member_innerclass;
public class Outer {
	int a = 10;
	static int b = 20;	
	static class Inner{
		int c = 30;
		static int d = 40;
		static void m1()
		{
			System.out.println(d+"\t"+b);
		}	
		void m2()
		{
			System.out.println(d+"\t"+c+"\t"+b);
		}
	}
	public static void main(String[] args) {
		Outer.Inner ob = new Outer.Inner();
		ob.m2();	
		Outer.Inner.m1();
	}
}

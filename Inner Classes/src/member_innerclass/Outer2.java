package member_innerclass;
public class Outer2 {
	int a = 10;
	static int b = 20;	
	 class Inner{
		int c = 30;
		static int d = 40;
		static void m1()
		{
			System.out.println(d+"\t"+b);
		}	
		void m2()
		{
			System.out.println(d+"\t"+c+"\t"+b+"\t"+a);
		}
	}
	public static void main(String[] args) {
		Outer2.Inner ob = new Outer2().new Inner();
		ob.m2();	
		Outer2.Inner.m1();
	}
}

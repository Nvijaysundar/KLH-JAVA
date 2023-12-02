package local_member;
public class Outer {
	int a = 10;
	static int b = 20;
	static void m1()
	{
		class Inner1{
			void m11()
			{
				System.out.println(b);
			}
		}
		new Inner1().m11();
		
	}
	void m2()
	{
		class Inner1{
			void m22()
			{
				System.out.println(b+"\t"+a);
			}
		}
		new Inner1().m22();
	}
	public static void main(String[] args) {
		Outer.m1();
		new Outer().m2();
	}
	
}

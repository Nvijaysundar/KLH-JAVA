package casestudy;
class D{
	static {
		System.out.println("This is Static block-d");
	}
	
	{
		System.out.println("THis is Instance Blocks-d");
	}
}
public class C extends D{
	static {
		System.out.println("This is Static block-c");
	}
	
	{
		System.out.println("THis is Instance Blocks-C");
	}
	public static void main(String[] args) {
		new C();
	}
}

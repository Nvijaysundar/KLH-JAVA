package Anonymous;
class Pclass
{
	void m1()
	{
		System.out.println("This is old m1 methods");
	}
	public static void main(String[] args) {
		Pclass ob = new Pclass()
				{
					void m1()
					{
						System.out.println("m1 method");
					}
				}
			;
		ob.m1();
	}
}

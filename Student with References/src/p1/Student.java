package p1;

public class Student {
	String name,Roll;
	Address ad;
	Contact c;
	Marks m;
	public Student(Address ad, Contact c, Marks m) {
		this.ad = ad;
		this.c = c;
		this.m = m;
	}
	public String getRoll()
	{
		return Roll;
	}
	
}

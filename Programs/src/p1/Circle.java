package p1;
public class Circle {
	float radius;
	Circle()
	{
		 this.radius = 4.5f;
	}
	Circle(float rad)
	{
		this.radius = rad;
	}
	
	public String toString()
	{
		return String.valueOf(radius);
	}
	/*
	 * String str = "Hello",str2 = "Wprld"
	 * str.equals(str2)
	 */
	public boolean equals(Object ob)
	{
		Circle cr = (Circle)ob;
		if(this.radius == cr.radius)
			return true;
		else
			return false;
	}
	
	public float area()
	{
		return (float)Math.PI * this.radius * this.radius;
	}
	public float area(Circle cr)
	{
		return (float)Math.PI*cr.radius*cr.radius;
	}
}

package p1;

public class Point {
	double x,y;
	Point()
	{
		this.x = 4.5f;
		this.y = 3.0f;
	}
	
	Point(double x, double y)
	{
		this.x = x;
		this.y = y;
	}
	
	void quardrant(Point p)
	{
		if (p.x ==0 && p.y ==0)
			System.out.println("Origin");
		else if (p.x==0)
			System.out.println("y -axis");
		else if (p.y == 0)
			System.out.println("x - axis");
	}
	Point center(Point p1,Point p2)
	{
		return new Point((p1.x+p2.x)/2.0f ,(p1.y+p2.y)/2.0f);
	}
	
	double distance(Point p1,Point p2)
	{
		return Math.sqrt( Math.pow(p2.x-p1.x,2) + Math.pow(p2.y-p1.y,2));
	}
	
	int colliean(Point p1,Point p2, Point p3)
	{
		if ((p2.y-p1.y)/(p2.x-p1.x) == (p3.y-p1.y)/(p3.x-p1.x))
			return 1;
		return 0;
	}
	public String toString() {
		
		return "( "+this.x+" , "+this.y+" )";
	}
	public static void main(String[] args) {
		System.out.println(new Point().colliean(new Point(4,5),
				new Point(10,12),new Point(8,9)));
	}
}


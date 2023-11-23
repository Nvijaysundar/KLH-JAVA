package p1;
public class Product {
	String pid,pname;
	float price;
	static int count;
	static {
		count =0;
	}
	
	{
		count++;
	}
	
	static int counter()
	{
		return count;
	}
	public static void main(String[] args) {
		new Product();
		new Product();
		new Product();
		System.out.println(Product.counter());
	}
}

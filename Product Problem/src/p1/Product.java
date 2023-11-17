package p1;

public class Product {
	String name, id;
	float price;
	int qty;
	
	public static void main(String[] args) {
		Product p1 = new Product();
		p1.name = "Mouse";
		Product p2 = new Product();
		p2.name = "Keyboard";
		Product p3 = new Product();
		p3.name = "CDDR";
		
		System.out.println("p1: name :: "+ p1.name);
		
	}

}

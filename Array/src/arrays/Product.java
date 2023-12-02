package arrays;
import java.util.Scanner;
public class Product {
	String name,id;
	int qty;
	float price;
	public Product(String name, String id, int qty, float price) {
		this.name = name;
		this.id = id;
		this.qty = qty;
		this.price = price;
	}
	@Override
	public String toString() {
		return this.name+"\t"+this.id+"\t"+this.price+"\t"+this.qty;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Product[] arr = new Product[Integer.parseInt(sc.nextLine())];
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter Name: ");
			String name = sc.nextLine();
			System.out.println("ENter id: ");
			String id = sc.nextLine();
			System.out.println("Enter PRice:: ");
			float price = Float.parseFloat(sc.nextLine());
			System.out.println("Enter Qty: ");
			int qty = Integer.parseInt(sc.nextLine());
			//p1  = new Pro(
			arr[i] = new Product(name, id, qty, price);
		}
		
		for(Product temp : arr)
			System.out.println(temp.toString());
		
		sc.close();
	}
}

package p1;

import java.util.Scanner;

public class InventoryManagement {
	private String[] dishes;
	private double[] prices;
	private int menuSize;
	public InventoryManagement(int capacity) {
		this.dishes = new String[capacity];
		this.prices = new double[capacity];
		this.menuSize =0;
	}
	
	public void addDish(Scanner sc) {
		System.out.println("Enter Dish Name: ");
		String dish = sc.nextLine();
		System.out.println("Enter "+dish+" Price: ");
		double price = Double.parseDouble(sc.nextLine());
		
		dishes[menuSize] = dish.toUpperCase();
		prices[menuSize] = price;
		menuSize++;
	}
	
	public void showMenu(){
		System.out.println("---------------------");
		System.out.println("|Item\t\tPrice|");
		System.out.println("---------------------");
		for(int i=0;i<menuSize;i++)
		{
			System.out.printf("|%s\t\t%.2f|\n",dishes[i],prices[i]);
		}
		System.out.println("---------------------");
	}
	
	public double calculateBill(Scanner sc)
	{
		this.showMenu();
		double total = 0;
		while(true)
		{
			System.out.println("Enter the Dish name or Exit");
			String dish = sc.nextLine().toUpperCase();
			if(dish.equalsIgnoreCase("exit"))
			{
				break;
			}
			else if (containsDish(dish))
			{
				total += getPrice(dish);
			}
			else
				System.out.println("Selected Dish is NOt available");
				
		}
		return total;
	}

	double getPrice(String dish) {
		for(int i=0;i<menuSize;i++)
		{
			if(dish.equalsIgnoreCase(dishes[i]))
				return prices[i];
		}
		return 0;
	}

	 boolean containsDish(String dish) {
		for(int i=0;i<menuSize;i++)
		{
			if(dish.equalsIgnoreCase(dishes[i]))
				return true;
		}
		return false;
	}
	
	
	
}

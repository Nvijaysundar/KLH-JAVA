package p1;

import java.util.Scanner;

public class CustomerManagement {
	private String[] orderMenu;
	private double totalbill;
	private int orderSize;
	
	public CustomerManagement(int cap) {
		orderMenu = new String[cap];
		totalbill = 0;
		orderSize = 0;
	}
	
	public void takeOrder(InventoryManagement invertory,Scanner sc)
	{
		invertory.showMenu();
		
		while(true)
		{
			System.out.println("Select Dish or Stop: ");
			String dish = sc.nextLine();
			if(dish.equalsIgnoreCase("Stop"))
				break;
			else if(invertory.containsDish(dish))
			{
				orderMenu[orderSize] = dish;
				totalbill += invertory.getPrice(dish);
				orderSize++;
			}
			else
			{
				System.out.println("Selected Item is not available");
			}
		}
		
	}
	
	public void generateBill(InventoryManagement inventory)
	{
		System.out.println("---------------------");
		System.out.println("|Item\t\tprice|");
		System.out.println("---------------------");
		for(int i=0;i<orderSize;i++)
		{
			System.out.printf("|%s\t\t%.2f|\n",orderMenu[i],inventory.getPrice(orderMenu[i]));
		}
		System.out.println("---------------------");
		System.out.printf("Total Bil: %.2f",totalbill);
		System.exit(0);
	}
}

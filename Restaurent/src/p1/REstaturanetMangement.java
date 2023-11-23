package p1;

import java.util.Scanner;

public class REstaturanetMangement {
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		InventoryManagement invert = new InventoryManagement(100);
		CustomerManagement cust = new CustomerManagement(100);
		while(true)
		{
			System.out.println("1.Inventory Management\n2.Customer Management\n3.Exit");
			switch(Integer.parseInt(sc.nextLine()))
			{
			case 1:
				boolean fllag = true;
				while(fllag)
				{
					System.out.println("1.Addnew Dish\n2.sho menu\n3.Estimate bill4.Exit5.back");
					switch(Integer.parseInt(sc.nextLine()))
					{
					case 1:
						invert.addDish(sc);
						break;
					case 2: 
						invert.showMenu();
						break;
					case 3:
						System.out.println("Estimated Cost"+invert.calculateBill(sc));
						System.out.println("---------------------	");
						break;
					case 4:
						sc.close();
						System.exit(0);
					case 5:
						fllag = false;
					}
				}
				break;
			case 2:
				boolean flag = true;
				while(flag)
				{
					System.out.println("1.OrderItem\n2.Genereate Bill\n3.back");
					switch(Integer.parseInt(sc.nextLine()))
					{
					case 1: 
						cust.takeOrder(invert, sc);
						break;
					case 2:
						sc.close();
						cust.generateBill(invert);
					case 3:
						flag = false;
					}
					
				}
			}
		}
	}
}

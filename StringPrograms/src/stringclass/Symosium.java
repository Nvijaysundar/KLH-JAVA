package stringclass;

import java.util.Scanner;

public class Symosium {
	private static String Branch(Scanner sc)
	{
		String branch = sc.nextLine();
		if(branch.equals("CSE"))
			return "01"; 
	}
	private static void events(String dept,Scanner sc) {
		switch(dept)
		{
		case "01":
			csEvents(sc);
			break;
		}
	}
	private static void csEvents(Scanner sc) {
		System.out.println("1.Networking\n2.DBMS");
		switch(Integer.parseInt(sc.nextLine()))
		{
		case 1:
			System.out.println("Venue -111");
			break;
		case 2:
			System.out.println("Venue - 112");
			break;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String roll = sc.nextLine();
		events(roll.substring(2,4),sc);
		
	}
}

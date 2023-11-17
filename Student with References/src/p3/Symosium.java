package p3;

import java.util.Scanner;

import p1.Student;
import p1.Option;
public class Symosium {
	public void select(Scanner sc,Student s)
	{
		System.out.println("1.By Branch\n2.By Roll\n3.Back");
		switch(Integer.parseInt(sc.nextLine()))
		{
		case 1:
			bybranch(sc,s);
			break;
		case 2:
			byroll(s,sc);
			break;
		case 3:
			new Option().switchOptions(sc, s);
			break;
		default:
			System.out.println("Invalid Selection");
			select(sc, s);
		}
	}

	private void bybranch(Scanner sc,Student s) {
		System.out.println("Select Branch:: 1.Cse\n2.Ece");
		switch(Integer.parseInt(sc.nextLine()))
		{
			case 1:
				Cse(sc,s);
				break;
			case 2:
				ece(sc,s);
				break;
			default:
				System.out.println("Invalid Branch");
				bybranch(sc, s);
		}
		select(sc, s);
	}

	private void byroll(Student s,Scanner sc) {
		switch(s.getRoll().substring(2, 4))
		{
		case "01":
			Cse(sc,s);
			break;
		case "02":
			ece(sc,s);
			break;
		}
	}

	private void ece(Scanner sc,Student s) {
		
	}

	private void Cse(Scanner sc,Student s) {
		System.out.println("1.DBMS\n2.Networking");
		switch(Integer.parseInt(sc.nextLine()))
		{
		case 1:
			System.out.println("G11");
			break;
		case 2:
			System.out.println("G12");
			break;
		default:
			System.out.println("No Such Event");
			Cse(sc,s);
		}
		select(sc,s);
	}
}

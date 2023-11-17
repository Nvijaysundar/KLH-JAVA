package p1;

import java.util.Scanner;

import p3.Symosium;

public class Option {
	public void switchOptions(Scanner sc,Student s)
	{
		System.out.println("1.Symosium\n2.Show Details\n3.Exit");
		switch(Integer.parseInt(sc.nextLine()))
		{
		case 1:
			new Symosium().select(sc, s);
			break;
		case 2:
			getdetails(s);
			break;
		case 3:
			System.exit(0);
		}
	}

	private void getdetails(Student s) {
		System.out.print(s.name+"\t"+s.Roll+"\t"+s.c.Emaild+"\t"+s.c.mobile);
		System.out.print(s.m.avg+"\t"+s.m.grade+"\t");
		System.out.println(s.ad.hno+"\t"+s.ad.stname+"\t"+s.ad.city+"\t"+s.ad.pincode);
	}
}

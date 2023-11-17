package p1;

import java.util.Scanner;

public class Read {
	public void setDetails(Student s,Scanner sc)
	{
		System.out.println("Name : ");
		s.name = sc.nextLine();
		System.out.println("Roll: ");
		s.Roll = sc.nextLine();
		System.out.println("Emailid: ");
		s.c.Emaild = sc.nextLine();
		System.out.println("Mobile: ");
		s.c.mobile = Long.parseLong(sc.nextLine());
		System.out.println("hno: ");
		s.ad.hno = sc.nextLine();
		System.out.println("Stname: ");
		s.ad.stname = sc.nextLine();
		System.out.println("City: ");
		s.ad.stname = sc.nextLine();
		System.out.println("pincode: ");
		s.ad.pincode = Integer.parseInt(sc.nextLine());
		System.out.println("Enter S1: ");
		s.m.s1 = Integer.parseInt(sc.nextLine());
		System.out.println("Enter S2: ");
		s.m.s2 = Integer.parseInt(sc.nextLine());
		System.out.println("S3: ");
		s.m.s3 = Integer.parseInt(sc.nextLine());
		s.m.avg = (s.m.s1 + s.m.s2 + s.m.s3 )/3.0f;
		if(s.m.avg>90)
			s.m.grade = "A";
		else if(s.m.avg>80)
			s.m.grade = "B";
		else if(s.m.avg>50)
			s.m.grade = "c";
		else if(s.m.avg>40)
			s.m.grade = "D";
		else
			s.m.grade = "F";
	}
}

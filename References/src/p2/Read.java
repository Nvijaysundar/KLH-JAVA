package p2;
import java.util.Scanner;
import p1.Candidate;
public class Read {
	void setDetails(Candidate c,Scanner sc)
	{
		System.out.println("Enter Nme: ");
		c.name  = sc.nextLine();
		System.out.println("Enter id: ");
		c.id = sc.nextLine();
		System.out.println("Enter hbo: ");
		c.ad.Hno = sc.nextLine();
		System.out.println("Enter Stname: ");
		c.ad.stname = sc.nextLine();
		System.out.println("Enter City");
		c.ad.city = sc.nextLine();
		System.out.println("Enter Pin: ");
		c.ad.pincode = Integer.parseInt(sc.nextLine());
	}
}

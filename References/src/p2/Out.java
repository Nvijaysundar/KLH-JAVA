package p2;
import p1.Candidate;

public class Out {
	void getDetails(Candidate c)
	{
		System.out.print(c.name+"\t"+c.id+"\t"+c.ad.Hno+"\t"+c.ad.stname+"\t");
		System.out.println(c.ad.city+"\t"+c.ad.pincode);
	}
}

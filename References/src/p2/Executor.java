package p2;
import java.util.Scanner;
import p1.Address;
import p1.Candidate;
public class Executor {

	public static void main(String[] args) {
		Candidate c1 = new Candidate(new Address());
		new Read().setDetails(c1, new Scanner(System.in));
		new Out().getDetails(c1);
	}

}

package p1;
import java.util.Scanner;
public class Executor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("1.Withdraw\n2.Deposit\n3.Balance");
			switch(sc.nextInt())
			{
			case 1: 
				new Withdraw().process(sc.nextInt());
				break;
			case 2:
				new Deposit().process(sc.nextInt());
				break;
			case 3:
				Transaction.b.getBalance();
				break;
			case 4:
				sc.close();
				System.exit(0);
			}
		}
		
	}
}

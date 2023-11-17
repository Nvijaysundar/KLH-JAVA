package p1;
import java.util.Scanner;
public class BankTransaction {
	static int bal = 15000,pinchances = 3;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true)
		{
			System.out.println("Enter Pin:: ");
			boolean flag = pinverify(sc.nextInt());
			
			if(flag)
			{
				options(sc);
			}
			else
			{
				System.out.println("Invalid Pin. leftover Chances : "+ --pinchances);
				if(pinchances == 0)
				{
					System.out.println("Reach nearest Branch");
					sc.close();
					System.exit(0);
				}
			}
		}
	}

	private static void options(Scanner sc) {
		System.out.println("1.Balance\n2.Deposit\n3.Withdraw\n4.Exit\n::");
		switch(sc.nextInt())
		{
		case 1:
			System.out.println("Available Bal: "+bal+"/-");
			break;
		case 2:
			System.out.println("Enter Amount :: ");
			deposit(sc.nextInt());
			break;
		case 3:
			System.out.println("Enter Amount:: ");
			withdraw(sc.nextInt());
			break;
		case 4:
			System.out.println("Thankyou");
			sc.close();
			System.exit(0);
		default:
			System.out.println("Invalid Seclection");
			options(sc);
		}
		
		System.out.println("Do you wish to continue: Y/N");
		switch(sc.next().charAt(0))
		{
		case 'y':
		case 'Y':
			options(sc);
		case 'N':
		case 'n':
			sc.close();
			System.exit(0);
		default:
			System.out.println("Invalid Options");
			options(sc);
		}
	}

	private static void withdraw(int amt) {
		if(amt%100 ==0)
		{
			if(amt>bal)
			{
				System.out.println("Insufficient funds");
			}
			else
				bal -= amt;
		}
		else 
			System.out.println("Invalid format");
	}

	private static void deposit(int amt) {
		if(amt%100 ==0)
		{
			bal+=amt;
		}
		else 
			System.out.println("Invalid format");
	}

	private static boolean pinverify(int pin) {
		switch(pin)
		{
		case 1111:
		case 2222:
		case 3333:
			return true;
		}
		
		return false;
	}

}

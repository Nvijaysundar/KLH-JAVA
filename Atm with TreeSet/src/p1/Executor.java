package p1;

import java.util.Scanner;
import java.util.TreeSet;

public class Executor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TreeSet<Account> ob = new TreeSet<Account>();
		
		while(true)
		{
			System.out.println("1.AddNew 2.Delete Acc  3.Deposit  "
					+ "4.Withdraw  5.Balance  6.Exit :: ");
			long acc;
			switch(Integer.parseInt(sc.nextLine()))
			{
			case 1:
				System.out.println("Enter Accou NO: ");
				 acc = Long.parseLong(sc.nextLine());
				System.out.println("Enter Pin : ");
				int pin = Integer.parseInt(sc.nextLine());
				System.out.println("Enter Balance: ");
				float bal = Float.parseFloat(sc.nextLine());
				if(ob.add(new Account(acc, pin, bal)))
					System.out.println("Account Created");
				else 
					System.out.println("Account Creation Failed");
				break;
			case 2:
				System.out.println("Enter Account No: ");
				acc = Long.parseLong(sc.nextLine());
				Account temp = getMember(ob, acc);
				if(temp!=null)
				{
					if(ob.remove(temp))
						System.out.println("Account Removed");
					else
						System.out.println("Failed");
				}
				else
					System.out.println("ACcount Not available");
				break;
			case 3:
				System.out.println("Enter Accout No: ");
				acc = Long.parseLong(sc.nextLine());
				Account temp1 = getMember(ob, acc);
				if(temp1!=null)
				{
					System.out.println("Enter Pin");
					int pin1 = Integer.parseInt(sc.nextLine());
					if (temp1.pin == pin1)
					{
						System.out.println("Enter Amount : ");
						temp1.balance += Float.parseFloat(sc.nextLine());
					}
					else
						System.out.println("Incorrect Pin");
				}
				else
					System.out.println("ACcount Not available");
				break;
			case 4:
				System.out.println("Enter Accout No: ");
				acc = Long.parseLong(sc.nextLine());
				Account temp2 = getMember(ob, acc);
				if(temp2!=null)
				{
					System.out.println("Enter Pin");
					int pin1 = Integer.parseInt(sc.nextLine());
					if (temp2.pin == pin1)
					{
						System.out.println("Enter Amount : ");
						temp2.balance -= Float.parseFloat(sc.nextLine());
					}
					else
						System.out.println("Incorrect Pin");
				}
				else
					System.out.println("ACcount Not available");
				break;
			case 5:
				System.out.println("Enter Accout No: ");
				acc = Long.parseLong(sc.nextLine());
				Account temp3 = getMember(ob, acc);
				if(temp3!=null)
				{
					System.out.println("Enter Pin");
					int pin1 = Integer.parseInt(sc.nextLine());
					if (temp3.pin == pin1)
					{
						System.out.println(temp3.toString());
					}
					else
						System.out.println("Incorrect Pin");
				}
				else
					System.out.println("ACcount Not available");
				break;
			case 6:
				sc.close();
				System.exit(0);
			case 7:
				for(Account temp5:ob)
				{
					System.out.println(temp5.toString());
				}
				break;
			}
		}
		
	}

	private static Account getMember(TreeSet<Account> ob, long acc) {
		for(Account temp : ob)
		{
			if (temp.accno == acc)
				return temp;
		}
		return null;
	}
}

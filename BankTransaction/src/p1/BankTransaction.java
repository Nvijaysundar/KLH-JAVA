package p1;

import java.util.Scanner;
	
public class BankTransaction {
	static float balance = 50000f;
	static String dep ="deposit,put,invest,transfer",
			with = "withdraw,pull,takeout",
			bal = "balance,see,show,check",
			exit = "terminate,stop,quit,exit";
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			String str = sc.nextLine().toLowerCase();
			String[] arr = str.split(" ");
			float amount = getAmount(arr);
			for(String temp : arr)
			{
				if(dep.contains(temp))
				{
					deposit(amount);
				}
				else if(with.contains(temp))
				{
					withdraw(amount);
				}
				else if(bal.contains(temp))
				{
					getbal();
				}
				else if(exit.contains(temp))
				{
					sc.close();
					System.exit(0);
				}
			}
		}
	}

	private static void getbal() {
		System.out.println("Available Bal : "+balance);
	}

	private static void withdraw(float amount) {
		balance -= amount;
	}

	private static void deposit(float amount) {
		balance += amount;
	}

	private static float getAmount(String[] arr) {
		for(String temp :arr) {
			try {
				if(Integer.parseInt(temp)>0)
				{
					return (float)Integer.parseInt(temp);
				}
			}
			catch(Exception ob)
			{
				
			}		
		}
		return 0;
	}
}

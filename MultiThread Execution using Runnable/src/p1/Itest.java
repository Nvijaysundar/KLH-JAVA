package p1;

import java.util.Scanner;

public class Itest implements Runnable {

	@Override
	public void run() {
		Scanner sc = new Scanner(System.in);
		for(int i=100;i<=120;i++)
		{
			System.out.println("i :"+i );
			System.out.println("ENter Str: ");
			String str = sc.nextLine();
		}
	}

}

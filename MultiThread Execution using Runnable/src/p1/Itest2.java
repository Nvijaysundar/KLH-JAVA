package p1;

import java.util.Scanner;

public class Itest2 implements Runnable {

	@Override
	public void run() {
		Scanner sc = new Scanner(System.in);
		for(int i=220;i<=240;i++)
		{
			System.out.println("--j :"+i );
			System.out.println("ENter Name: ");
			String name = sc.nextLine();
		}
	}
}

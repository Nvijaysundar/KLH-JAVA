package p1;
import java.util.Scanner;
public class Executor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		switch(sc.nextInt())
		{
		case 1:
			Iarithematic ob = (int a, int b)-> {
					return a+b;
			};
			System.out.println(ob.resolver(sc.nextInt(), sc.nextInt()));
			break;
		case 2:
			Iarithematic ob1 = (int a, int b)-> {
					return a/b;
			};
			System.out.println(ob1.resolver(sc.nextInt(), sc.nextInt()));
			break;
		}
		sc.close();
	}
}

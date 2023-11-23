package p2;
import java.util.Scanner;
class Greater implements Icomprable{
	public int compare(int x, int y) {
		return Integer.max(x, y);
	}	
}
class Smaller implements Icomprable{
	public int compare(int x, int y) {
		return Integer.min(x, y);
	}	
}
public class Executor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		switch(sc.nextInt())
		{
		case 1:
			System.out.println(new Greater().compare(sc.nextInt(),sc.nextInt()));
			break;
		case 2:
			System.out.println(new Smaller().compare(sc.nextInt(), sc.nextInt()));
			break;
		}
		sc.close();
	}
}

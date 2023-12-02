package setinterface;
import java.util.*;
public class Example2 {
	public static void main(String[] args) {
		Set<String> ob = null;
		Scanner sc = new Scanner(System.in);
		switch(Integer.parseInt(sc.nextLine()))
		{
		case 1: 
			ob = new HashSet<>();
			break;
		case 2:
			ob = new LinkedHashSet<String>();
			break;
		case 3:
			ob = new TreeSet<String>();
			break;
		}
		ob.add("Hello");
		ob.add("World");
		ob.add("Java");
		ob.add("Python");
		System.out.println(ob.toString());
		sc.close();
	}
}

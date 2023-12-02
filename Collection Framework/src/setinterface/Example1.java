package setinterface;
import java.util.*;
public class Example1 {
	public static void main(String[] args) {
		HashSet<Integer> ob = new HashSet<Integer>();
		
		for(int i=10;i<20;i++)
		{
			ob.add(i);
		}
		System.out.println(ob.toString());
	}
}

//Auto Boxing Process
/*-> It Automaticallu Coverts the PDTV into object
 * 
 * 
 * */

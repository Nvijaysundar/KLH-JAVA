package arraylistexp;
import java.util.*;
public class PrimewithArrayList {
	public static void main(String[] args) {
		ArrayList<Integer> ob = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		int high = sc.nextInt(),low = sc.nextInt();
		for(int i = low ;i<=high;i++)
		{
			boolean flag = true;
			for(int j=2;j<=low/2;j++)
			{
				if(i%j==0)
				{
					flag = false;
					break;
				}
			}
			if(flag)
				ob.add(i);
		}
		System.out.println(ob.toString());
		Collections.sort(ob);
		sc.close();
		
	}
}

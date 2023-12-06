package linkedlist;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.StringTokenizer;
public class Example1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringTokenizer st = new StringTokenizer(sc.nextLine()," ");
		LinkedList<String> li = new LinkedList<>();
		while(st.hasMoreTokens())
		{
			String temp = st.nextElement().toString();
			if(temp.equalsIgnoreCase(new StringBuffer(temp).reverse().toString()))
				li.add(temp);
		}
		System.out.println(li.toString());
		sc.close();
	}
}

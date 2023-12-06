package linkedlist;

import java.util.*;

public class Book {
	String name, id;
	float price;
	public Book(String name, String id, float price) {
		this.name = name;
		this.id = id;
		this.price = price;
	}
	public String toString()
	{
		return this.name+"\t"+this.id+"\t"+this.price;
	}
	public static void main(String[] args) {
		Comparator<Book> c1 = new Comparator<Book>() {
			
			@Override
			public int compare(Book o1, Book o2) {
				
				return Float.compare(o1.price, o2.price);
			}
		};
		LinkedList<Book> ob = new LinkedList<Book>();
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			System.out.println("1.Insert New Book\n2.Sort\n3.Exit");
			switch(Integer.parseInt(sc.nextLine()))
			{
			case 1:
				ob.add(new Book(sc.nextLine(),sc.nextLine(),Float.parseFloat(sc.nextLine())));
				break;
			case 2:
				Collections.sort(ob,c1);
				break;
			case 3: 
				sc.close();
				System.exit(0);
			case 4:
				Spliterator<Book> sl = ob.spliterator();
				sl.forEachRemaining((k)->{
					System.out.println(k.toString());
				});
				
				for(Book temp : ob)
					System.out.println(temp.toString());
				
				for(int i=0;i<ob.size();i++)
					System.out.println(ob.get(i));
			}
		}
	}
}

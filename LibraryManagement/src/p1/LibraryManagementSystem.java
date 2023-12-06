package p1;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class LibraryManagementSystem {
	public static void main(String[] args) {
		Map<Integer,LibrarySystem> StudentLibMap = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("1.Add New Student\n2.Access Lib\n3.Exit");
			switch(Integer.parseInt(sc.nextLine()))
			{
			case 1:
				addStudent(StudentLibMap,sc);
				break;
			case 2:
				accesslib(StudentLibMap,sc);
				break;
			case 3:
				sc.close();
				System.exit(0);
			default: 
				System.out.println("Invalid Choice");
			}
		}while(true);
	}

	private static void accesslib(Map<Integer, LibrarySystem> studentLibMap, Scanner sc) {
		System.out.println("Enter Roll: ");
		Integer rollnum = Integer.parseInt(sc.nextLine());
		LibrarySystem library  = studentLibMap.get(rollnum);
		if(library !=null)
		{
			operateLibSystem(library,sc);
		}
		else
			System.out.println("No Data Base Exit with Current Roll");
	}

	private static void operateLibSystem(LibrarySystem library, Scanner sc) {
		do {
			System.out.println("1.Add Book");
			System.out.println("2.Take A New book");
			System.out.println("3.Give Back A Book");
			System.out.println("4.Display All Books\n5.Taken Books\n6.Genre List\n7.Back");
			switch(Integer.parseInt(sc.nextLine()))
			{
				case 1:
					addbook(library,sc);
					break;
				case 2:
					enqueueTransaction(library,sc);
					break;
				case 3:
					library.deququeTransaction();
					break;
				case 4:
					library.DisplayAllBooks();
					break;
				case 5:
					library.takenBooks();
					break;
				case 6:
					library.getGenreList();
					break;
				case 7:
					return;	
			}
		}while(true);
	}

	private static void enqueueTransaction(LibrarySystem library, Scanner sc) {
		System.out.println("Enter Book ID");
		String id = sc.nextLine();
		Book book = findbyId(library,id);
		if(book!=null) {
			library.enqueueTransaction(book);
			library.getTransactionQueue();
		}
		else
			System.out.println("Book Not Found");
	}
	

	private static Book findbyId(LibrarySystem library, String id) {
		for(Book book : library.getBookList())
			if(book.getId().equals(id))
				return book;
		return null;
	}

	private static void addbook(LibrarySystem library, Scanner sc) {
		System.out.println("Enter book Id");
		String id = sc.nextLine();
		System.out.println("Enter Book Name: ");
		String name = sc.nextLine().toUpperCase();
		System.out.println("Enter AUthor: ");
		String Auth = sc.nextLine().toUpperCase();
		System.out.println("Enter Genre");
		String Genre = sc.nextLine().toUpperCase();
		Book book = new Book(id, name, Auth, Genre);
		library.addBook(book);
	}

	private static void addStudent(Map<Integer, LibrarySystem> studentLibMap, Scanner sc) {
		System.out.println("Enter Roll:: ");
		Integer rollnum = Integer.parseInt(sc.nextLine());
		if (!studentLibMap.containsKey(rollnum))
		{
			LibrarySystem lib = new LibrarySystem(new LinkedList<Book>(),new LinkedList<Book>() ,new LinkedList<List<Book>>());
			studentLibMap.put(rollnum, lib);
		}
		else
		{
			System.out.println("Already Exits in data base");
		}
	}
}

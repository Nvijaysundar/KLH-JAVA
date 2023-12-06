package p1;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LibrarySystem {
	private LinkedList<Book> bookList;
	private Queue<Book> transactionQueue;
	private List<List<Book>> genreLists;
	
	
	public LibrarySystem(LinkedList<Book> bookList, Queue<Book> transactionQueue, List<List<Book>> genreLists) {
		this.bookList = bookList;
		this.transactionQueue = transactionQueue;
		this.genreLists = genreLists;
	}
	public LinkedList<Book> getBookList() {
		return bookList;
	}
	public Queue<Book> getTransactionQueue() {
		return transactionQueue;
	}
	public List<List<Book>> getGenreList() {
		return genreLists;
	}
	
	public void addBook(Book book)
	{
		bookList.add(book);
		int genreIndex = getGenreIndex(book.getGenre());
		if (genreIndex == -1) {
			List<Book> genreList = new LinkedList<Book>();
			genreList.add(book);
			genreLists.add(genreList);
		}
		else
			genreLists.get(genreIndex).add(book);
	}
	private int getGenreIndex(String genre) {
		for (int i=0;i<genreLists.size();i++)
		{
			if(genreLists.get(i).get(0).getGenre().equalsIgnoreCase(genre))
				return i;
		}
		return -1;
	}
	public void removeBook(Book book) {
		bookList.remove(book);
		int genreIndex = getGenreIndex(book.getGenre());
		if(genreIndex !=-1)
			genreLists.get(genreIndex).remove(book);
	}
	
	public void enqueueTransaction(Book book)
	{
		transactionQueue.add(book);
	}
	
	public void deququeTransaction()
	{
		if(!transactionQueue.isEmpty())
		{
			Book book = transactionQueue.poll();
			if(book != null)
			{
				System.out.println("Checkout Book: "+book.getTitle());
			}
		}
		else
			System.out.println("No Book were Taken....!");
	}
	
	public void DisplayAllBooks()
	{
		for(Book temp : bookList)
			System.out.println(temp.toString());
	}
	public void takenBooks()
	{
		for(Book temp : transactionQueue)
			System.out.println(temp.toString());
	}
	public void bookbygenre()
	{
		for(List<Book> temp : genreLists) {
			System.out.println(temp.get(0).getGenre()+" :: ");
			for(Book temp2 : temp)
				System.out.println(temp2.toString());
			System.out.println();
		}
		
	}
	
}

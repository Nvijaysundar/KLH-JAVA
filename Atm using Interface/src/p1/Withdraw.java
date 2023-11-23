package p1;

public class Withdraw implements Transaction{
	public void process(int amt)
	{
		if(amt%100 ==0)
			Transaction.b.bal -= amt;
		else
			System.out.println("Invalid Amount Format");
	}
}

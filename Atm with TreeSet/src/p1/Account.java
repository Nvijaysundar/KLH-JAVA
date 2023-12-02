package p1;

public class Account implements Comparable<Account>{
	long accno;
	int pin;
	float balance;
	public Account(long accno, int pin, float balance) {
		this.accno = accno;
		this.pin = pin;
		this.balance = balance;
	}
	public String toString() {
		return this.accno +"\t"+this.balance;
	}
	@Override
	public int compareTo(Account o) {
		return Float.compare(this.balance, o.balance);
	}
	
	
}

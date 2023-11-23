package p1;

public class Executor {
	public static void main(String[] args) {
		
		Thread t1 = new Thread(new Itest());
		Thread t2 = new Thread(new Itest2());
		
		t1.start();
		t2.start();
	}
}

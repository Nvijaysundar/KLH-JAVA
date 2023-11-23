package p1;

public class Iclass implements Itest{
	public static void main(String[] args) {
		new Iclass().execute();
	}

	@Override
	public void execute() {
		System.out.println("This is Execute method");
	}
}

package p1;

public class Exector {
	public static void main(String[] args) {
		Thread ob = new Thread(
				()->
				{
					for(int i=0;i<20;i++)
					{
						System.out.println("I: "+i);
						try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}
			);
		ob.start();
		
		new Thread(
				()->
				{
					for(int j=100;j<120;j++)
					{
						System.out.println("--j: "+j);
						try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}
		).start();
	}
}

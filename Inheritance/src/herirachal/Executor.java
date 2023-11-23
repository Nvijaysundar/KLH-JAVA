package herirachal;
class Animal{
	Animal()
	{
		System.out.println("Can See,Walk");
	}
}
class Cheetah extends Animal{
	public Cheetah() {
		System.out.println("Run, Hunt");
		}
}

class Human extends Animal{
	Human(){
		System.out.println("Construct,Develop");
	}
}
public class Executor {
	public static void main(String[] args) {
		new Human();
		
	}
}

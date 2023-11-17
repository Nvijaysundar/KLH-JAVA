class Typesofvar{
	static int num = 100;
	int num2 = 200;
	public static void main(String [] args){
	int num3 = 300;

	System.out.println("num: " + Typesofvar.num);

	Typesofvar ob = new Typesofvar();
	System.out.println("ob-num2: "+ob.num2);
	System.out.println("num3: " +num3);

	Typesofvar.num += 50;
	ob.num2 += 80;
	System.out.println("num: " + Typesofvar.num);
	System.out.println("ob-num2: "+ob.num2);
	Typesofvar ob2 = new Typesofvar();
	System.out.println("ob2-num2: "+ob2.num2);

	}

}
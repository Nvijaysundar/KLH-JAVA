package p1;

import java.util.Scanner;

public class Employee {
	String name,id;
	float bsal;
	String company;
	
	
	public Employee(String name, String id, float bsal, String company) {
		this.name = name;
		this.id = id;
		this.bsal = bsal;
		this.company = company;
	}
	
	void getDetails()
	{
		System.out.println("Name: "+this.name);
		System.out.println("id: "+this.id);
		System.out.println("Company : "+this.company);
		System.out.printf("Total Sal: %.2f",this.calsal(this.bsal));
	}
	
	float calsal(float bsal)
	{
		return (float) (bsal + 0.18f*bsal + 0.11*bsal);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//datatype[] array_name = new datatype[size];
		Employee[] emp = new Employee[Integer.parseInt(sc.nextLine())];
		for(int i=0;i<emp.length;i++)
		{
			System.out.println("Enter Name: ");
			String tname = sc.nextLine();
			System.out.println("ENter Id: ");
			String id = sc.nextLine();
			System.out.println("ENter Bsal: ");
			float bsal = Float.parseFloat(sc.nextLine());
			System.out.println("Enter Company Name: ");
			String cmp = sc.nextLine();
		
			emp[i] =  new Employee(tname,id,bsal,cmp);
		}
		
		for(int i=0;i<emp.length;i++)
		{
			emp[i].getDetails();
		}
		sc.close();
	}
}

package setinterfacewithstudent;
import java.util.*;
public class Student implements Comparable<Student>{
	String name,roll;
	float marks;
	public Student(String name, String roll, float marks) {
		this.name = name;
		this.roll = roll;
		this.marks = marks;
	}
	public String toString()
	{
		return this.name+"\t" + this.roll+"\t" + String.valueOf(this.marks);
	}
	public static void main(String[] args) {
		Set<Student> ob = null;
		Scanner sc = new Scanner(System.in);
		switch(Integer.parseInt(sc.nextLine()))
		{
		case 1: 
			ob = new HashSet<>();
			break;
		case 2:
			ob = new LinkedHashSet<Student>();
			break;
		case 3:
			ob = new TreeSet<Student>();
			break;
		}
		int no_of_Student = Integer.parseInt(sc.nextLine());
		for (int i=0;i<no_of_Student;i++)
		{
			String name = sc.nextLine();
			String roll = sc.nextLine();
			float marks = Float.parseFloat(sc.nextLine());
			ob.add(new Student(name, roll, marks));
		}
		
		for(Student temp : ob)
		{
			System.out.println(temp.toString());
		}
		sc.close();
	}
	@Override
	public int compareTo(Student o) {
		return this.roll.compareToIgnoreCase(o.roll);
	}
}

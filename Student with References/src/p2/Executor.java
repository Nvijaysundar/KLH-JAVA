package p2;

import java.util.Scanner;

import p1.Address;
import p1.Contact;
import p1.Marks;
import p1.Option;
import p1.Read;
import p1.Student;

public class Executor {
	public static void main(String[] args) {
		Student s = new Student(new Address(), new Contact(), new Marks());
		new Read().setDetails(s, new Scanner(System.in));
		new Option().switchOptions(new Scanner(System.in), s);
	}
}

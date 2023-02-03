package java_basic;
import java.util.Scanner;
public class Form {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name");
		String name = sc.nextLine();
		System.out.println("Enter your age");
		int age = sc.nextInt();
		System.out.println("Enter your mobile number");
		long num = sc.nextLong();
		System.out.println("Enter your email id");
		String email = sc.next();
		System.out.println("Enter your date of birth");
		String dob = sc.next();
		System.out.println("enter your mark 1");
		int m1 = sc.nextInt();
		System.out.println("enter your mark 2");
		int m2 = sc.nextInt();
		System.out.println("enter your mark 3");
		int m3 = sc.nextInt();
		int avg = (m1+m2+m3)/3;
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Mobile number: "+num);
		System.out.println("email: "+email);
		System.out.println("D.O.B: "+dob);
		System.out.println("Mark 1: "+m1);
		System.out.println("Mark 2: "+m2);
		System.out.println("Mark 3: "+m3);
		System.out.println("Average: "+avg);

	}

}

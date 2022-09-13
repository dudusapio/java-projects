package application;

import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;

import model.entities.Student;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Set<Student> students = new HashSet<>();
		
		System.out.print("How many students for course A ? ");
		int n = sc.nextInt();
		
		for(int i = 0; i < n ; i++) {
			int id = sc.nextInt();
			students.add(new Student(id));
		}
		
		System.out.print("how many students for course B? ");
		int m = sc.nextInt();
		
		for(int i = 0; i < m ; i++) {
			int id = sc.nextInt();
			students.add(new Student(id));
		}
		
		System.out.print("how many students for course C? ");
		int c = sc.nextInt();
		
		for(int i = 0; i < c ; i++) {
			int id = sc.nextInt();
			students.add(new Student(id));
		}		
		
		System.out.println(students.size());
		
		sc.close();
	}

}

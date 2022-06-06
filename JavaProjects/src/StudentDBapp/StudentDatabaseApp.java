package StudentDBapp;
import java.util.Scanner;

public class StudentDatabaseApp {

	public static void main(String[] args) {
		
		
		
		
		//Ask how many users and Create n students
		System.out.print("Enter the number of new students you wish to enroll: ");
		Scanner ip = new Scanner(System.in);
		int n = ip.nextInt();
		Student[] students = new Student[n];
		
		for (int i = 0; i<n; i++) 
		{
			
			students[i] = new Student();
			students[i].enroll();
			students[i].payTuition();
			//System.out.println(students[i].toString());
		}
		System.out.println(students[0].toString());
		System.out.println(students[1].toString());
	}

}

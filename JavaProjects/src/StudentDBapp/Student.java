package StudentDBapp;

import java.util.Scanner;

public class Student {
	
	private String firstname;
	private String lastname;
	private int gradeYr;
	private String ID;
	private String courses;
	private int TuitionBal;
	private static int costOfcourse = 600;
	private static int id = 1000;
	
	
	//constructor prompts students name and year
	public Student() {
		Scanner ip = new Scanner(System.in);
		System.out.print("Enter Student's First name: ");
		this.firstname = ip.nextLine();
		System.out.print("Last name: ");
		this.lastname = ip.nextLine();
		System.out.print("\nClass Levels: \n1 for Freshmen\n2 for Sophmore\n3 for Junior\n4 for Senior\nEnter Student's class level: ");
		this.gradeYr = ip.nextInt();
		System.out.println("");
		
		setID();
		
	}
	
	//generate ID
	private void setID() {
		this.ID = gradeYr+""+id;
		id++;
		
	}
	
	//enroll in courses
	public void enroll() {
		
		//get inside a loop, user hits 0
		do {
			System.out.print("Enter course to enroll (Q to quit): ");
			Scanner ip = new Scanner(System.in);
			String course = ip.nextLine();
			
			if (!course.equals("Q")) {
				courses = courses + ", " + course;
				TuitionBal += costOfcourse;
			}
			else {
				break;
			}
			
		}while (1 != 0);
		
		System.out.println("\nEnrolled in: " + courses);
	}
	
	//view balance 
	public void viewBal () {
		System.out.println("Tuiton Bal: "+ TuitionBal);
	}
	
	//pay tuition
	public void payTuition () {
		System.out.println("");
		viewBal();
		System.out.print("Enter your payment: ");
		Scanner ip = new Scanner(System.in);
		int payment = ip.nextInt();
		TuitionBal -= payment;
		System.out.println("Thank you for your payment of $" + payment+"\nBalance: "+TuitionBal);
		
	}
	
	//show status
	public String toString() {
		return "\nStudent Details: \nName: "+firstname+" "+lastname+
				"\nID: "+ID+
			"\nCourses Enrolled: "+courses+
			"\nBalance: "+TuitionBal;
	}
	

}

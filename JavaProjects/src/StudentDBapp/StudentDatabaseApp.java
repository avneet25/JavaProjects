package StudentDBapp;

public class StudentDatabaseApp {

	public static void main(String[] args) {
		
		//Ask how many users
		Student std1 = new Student();
		std1.enroll();
		std1.payTuition();
		System.out.println(std1.toString());
		//Create n students

	}

}

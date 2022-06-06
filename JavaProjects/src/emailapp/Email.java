package emailapp;
import java.util.Scanner;

public class Email {

	private String firstName;
	private String lastName;
	private String passWord;
	private int defaultPWlength = 10;
	private String department;
	private int mailboxCapacity = 500;
	private String companySuffix = "anycompany.com";
	private String Email;
	private String altEmail;
	
	//Constructor to receive fn and ln
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.println("New Worker: "+this.firstName + " " + this.lastName);
		
		//Call a method asking for dept - return dept
		this.department = setDept();
		
		//Call a method that returns a random Password
		this.passWord = passWord(defaultPWlength);
		System.out.println("\nYour random password: " + passWord);
		
		//Combine elements to generate email
		Email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department +"."+ companySuffix;
	
	}

	//Ask for dept
	private String setDept() {
		System.out.println("\nDEPARTMENT CODES:\n1 for Sales\n2 for Development\n3 for Accountng\n0 for none\n\nEnter department code: ");
		Scanner in = new Scanner(System.in);
		int deptChoice = in.nextInt();
		if (deptChoice == 1) { return "sales";}
		else if (deptChoice == 2) { return "dev";}
		else if (deptChoice == 3) { return "acct";}
		else { return ""; }
	}
	
	//Generate a random password
	private String passWord(int length) {
		String passwordSt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%*";
		char[] password = new char[length];
		for (int i = 0 ; i<length; i++) {
		int rand = (int)(Math.random() * passwordSt.length());
		password[i] = passwordSt.charAt(rand);
		
		}
		return new String(password);
	}
	
	//Encapsulation: Set the mailbox cap
	public void setMailCap(int cap) {
		this.mailboxCapacity = cap;
	}
	
	//Set the alt email
	public void setAltEmail(String alt) {
		this.altEmail = alt;
	}
	
	//Change the password
	public void changePassWord(String pw) {
		this.passWord = pw;
	}
	
	public int getMailCap() {return mailboxCapacity;}
	public String getAltMail() {return altEmail;}
	public String getPW() {return passWord;}
	
	public String showInfo() {
		return "DISPLAY NAME: "+ firstName + " " + lastName 
				+ "\nCOMPANY EMAIL: " + Email
				+ "\nMAILBOX CAPACITY: " + mailboxCapacity + " mb";
	}
}




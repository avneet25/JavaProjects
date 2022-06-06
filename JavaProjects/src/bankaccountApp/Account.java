package bankaccountApp;

public abstract class Account implements IBaseRate {

	//list common properties for savings and checking accounts
	private String name;
	private String ssn;
	protected String accNo;
	private double bal;
	protected double rate;
	static int index = 10000;
	
	
	//Constructor to set base properties and initialize the account
	public Account(String name,String ssn, double depo) 
	{
		this.name = name;
		this.ssn = ssn;
		this.bal = depo;

		index++;
		
		this.accNo = setAccNo();
		setRate();
	}
	
	public abstract void setRate();
	
	private String setAccNo() {
		
		String lastTwoSSN = ssn.substring(ssn.length()-2, ssn.length());
		int uniqueID = index;
		int randomNo  =(int) (Math.random() * Math.pow(10,3));
		return lastTwoSSN + uniqueID + randomNo;
		
	}
	
	
	public void compound() {
		double accruedInterest = bal * (rate/100);
		System.out.println("Accrued Interest: $"+accruedInterest);
		bal += accruedInterest;
		printBal();
	}
	//list common methods
	
	public void deposit(double amt) {
		bal += amt;
		System.out.println("Depositing $"+amt);
		printBal();
	}
	public void withdraw(double amt) {
		bal -= amt;
		System.out.println("Withdrawing $"+amt);
		printBal();
	}
	public void transfer(String toWhere, double amt) {
		bal -= amt;
		System.out.println("Transfered $"+amt+" to "+toWhere);
		printBal();
	}
	public void printBal() {
		System.out.println("Your Balance is now: $"+bal);
	}
	
	
	
	public void showInfo() {
		
		System.out.println(
				"\nName: "+name+
				"\nAccount No: " + accNo+
				"\nBalance: " +bal+
				"\nRate: "+rate+ "%"
				);
		
	}
	
	
	
	
	
}





































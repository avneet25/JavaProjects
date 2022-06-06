package bankaccountApp;

public class Savings extends Account{

	//list specific properties related to a Savings account
	private int depositboxID; //3 digit
	private int depositboxKey; //4 digit
	
	
	//constructor to initialize Savings account properties
	public Savings (String name,String ssn, double depo) {
		
		super(name,ssn,depo);
		accNo = "1"+accNo;
		setSafetyDeopistBox();
		
		
	}
	
	@Override
	public void setRate() {
		this.rate = getBaseRate() - .25;
	}
	
	private void setSafetyDeopistBox() {
		
		depositboxID = (int)(Math.random() * Math.pow(10, 3));
		depositboxKey = (int)(Math.random() * Math.pow(10, 4));
		
	}
	
	//list any methods specific to the Savings account
	public void showInfo() {
		
		super.showInfo();
		System.out.println(" Your Savings Account Features: "
		+ "\n Safety Deposit Box ID: " + depositboxID+
		"\n Safety Deposit Box Key: "+depositboxKey);
	}
	
}

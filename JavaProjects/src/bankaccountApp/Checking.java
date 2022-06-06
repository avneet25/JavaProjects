package bankaccountApp;

public class Checking extends Account {

	//list specific properties related to a checking account
	private long debitNo;
	private int debitPin;
	
	
	//constructor to initialize checking account properties
	public Checking (String name, String ssn, double depo) {
		
		super(name,ssn,depo);
		accNo = "2"+accNo;
		setDebitCard();
		
	}
	
	@Override
	public void setRate() {
		this.rate = getBaseRate() * .15;
	}
	
	private void setDebitCard() {
		
		debitNo = (long) (Math.random() * Math.pow(10, 12));
		debitPin = (int) (Math.random() * Math.pow(10, 4));
		
	}
	
	//list any methods specific to the checking account
	public void showInfo() {
		super.showInfo();
		System.out.println(" Your Checking Account Features: "
				
				+ "\n Debit Card No: " + debitNo
				+ "\n Debit Card Pin: " + debitPin
				);
	}
	
	
}























package bankaccountApp;
import java.util.LinkedList;
import java.util.List;

public class BankAccApp {

	public static void main(String[] args) 
	{
		List<Account> accounts = new LinkedList<Account>();
		
		//Read a CSV file and create new accounts based on that data
		String file = "/Users/avneetkaur/Downloads/NewBankAccounts.csv";
		List<String[]> newCustomers = utilities.CSV.read(file);	
		for(String[] accHolder : newCustomers) {
			String name = accHolder[0];
			String ssn = accHolder[1];
			String accType = accHolder[2];
			double initDepo = Double.parseDouble(accHolder[3]);
			
			if (accType.equals("Savings")) {
				
				accounts.add(new Savings(name,ssn,initDepo));
			}
			else if (accType.equals("Checking")) {
				
				accounts.add(new Checking(name,ssn,initDepo));
			}
			else {
				System.out.println("Error reading Account type");
			}
			
		}
		
		//accounts.get(5).showInfo();
		
		for (Account acc : accounts) {
			System.out.println("\n*********************");
			acc.showInfo();
		}
		

	}

}

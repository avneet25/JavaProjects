package bankaccountApp;

public interface IBaseRate {

	//Write a method that returns a base rate
	default double getBaseRate() {
		return 2.5;
	}
	
	
	
}

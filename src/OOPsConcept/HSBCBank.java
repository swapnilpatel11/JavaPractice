package OOPsConcept;

public class HSBCBank implements USBank,BrazilBank{ //Multiple inheritance
	//Is a relationship
	
	//if a class is implementing any interface, then its mandatory to define/override all methods of interface
	@Override
	public void credit() {
	 System.out.println("HSBC --> Credit");
		
	}
	@Override
	public void debit() {
		System.out.println("HSBC --> Debit");
		
	}

	@Override
	public void transferMoney() {
		System.out.println("HSBC --> TransferMoney");
		
	}
	
	public void educationLoan() {
		System.out.println("HSBC --> Edu Loan");
	}
	
	public void carLoan() {
		System.out.println("HSBC --> Car Loan");
	}
	@Override
	public void mutualFund() {
		System.out.println("HSBC --> MutualFund");
		
	}
	
}

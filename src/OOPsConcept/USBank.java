package OOPsConcept;

public interface USBank {
	
	int min_bal = 100; //final in nature
	
	public void credit();
	
	public void debit();
	
	public void transferMoney();

	//Only Method declaration 
	//No method body - only method prototype
	//we can declare the variables, vars are by default static in nature
	//vars value will not be changed
	//no static method in interface
	//no main meethod in Interface
	//we cannot create object of interface
	//Interface is abstract in nature
	
	
}

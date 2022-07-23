package OOPsConcept;

public class TestCar { 

	public static void main(String[] args) {
		BMW b1 = new BMW();
		b1.start(); //same method in both class as Car2 and BMW but its execute BMW method which called method overriding
		b1.stop();
		b1.theftSafety();
		b1.engine();
		
		System.out.println("------------------------");
		
		//Top casting
		Car2 c1 = new BMW(); //Child class object can be referred by parent class reference variables  -- dynamic polymmorphism -- runtime polymorphism
		c1.start(); //child class method execute
		c1.stop();
		//only common methods and parent class methods can be executable
		
		//Down Casting is not allowed we need to cast but at runtime we get class cast exception --Interview Question
		BMW b2 = (BMW) new Car2(); //we have to cast it to down cast
	}

}

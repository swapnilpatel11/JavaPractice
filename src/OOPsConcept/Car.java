package OOPsConcept;

public class Car {

	//class cars:
	int mod;
	int wheel;
	public static void main(String[] args) {
		//Class where we define variables,methods,parameters
		//new Car() : is a object
		//Car a is reference variable
		
		Car a = new Car();
		Car b = new Car();
		Car c = new Car();
		
		a.mod = 2015;
		a.wheel = 4;
		
		b.mod = 2014;
		b.wheel = 4;
		
		c.mod = 2019;
		c.wheel = 4;
		
		System.out.println(a.mod);
	}

}

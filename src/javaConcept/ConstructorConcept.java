package javaConcept;

public class ConstructorConcept {
	
	//Constructor is always same as class name
	public ConstructorConcept() {
		System.out.println("Default Constructor");
	}
	
	public ConstructorConcept(int i) {
		System.out.println("Single Param constructor");
		System.out.println("the value of i " +i);
	}
	//Constructor can be overloaded
	//when we create object of constructor that time it will be called
	public ConstructorConcept(int i, int j) {
		System.out.println("Two param constructor");
		System.out.println("value of i " +i);
		System.out.println("value of j " + j);
	}

	public static void main(String[] args) {
		ConstructorConcept obj = new ConstructorConcept();
		ConstructorConcept obj1 = new ConstructorConcept(10);
		ConstructorConcept obj2 = new ConstructorConcept(10,20);
		

	}

}

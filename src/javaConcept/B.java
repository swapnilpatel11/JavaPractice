package javaConcept;

public class B extends A{
	//A class constructor will be call by default as its parent class for B
	//default constructor will be called by default if we don't write super keyword
	public B() {
		//super keyword is used to call parent class constructor
		//Super keyword must be first statement not second or last statement in any particular constructor
		super(10); //one param constructor will be called as we apply super keyword
		System.out.println("child class constructor");
	}
	
	public B(int i,int j) {
		super(i,j);
	}
	
	public static void main(String args[]) {
		B obj = new B();
		B obj1 = new B(11,20);
	}

}

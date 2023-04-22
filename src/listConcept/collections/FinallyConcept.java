package listConcept.collections;

public class FinallyConcept {

	public static void main(String[] args) {
		//test1();
		//test2();
		division2();

	}
	
	public static void test1() {
		try {
			System.out.println("inside test1 method");
			throw new RuntimeException("test");
		}catch(Exception e) {
			System.out.println("inside catch block");
		}
		//finally always used with try catch block no matter what rules this code will executed always
		finally {
			System.out.println("inside finally block");
		}
	}
	
	public static void test2() {
		try {
			System.out.println("inside test2 method");
			
		}
		//finally always used with try catch block no matter what rules this code will executed always
		finally {
			System.out.println("inside finally inside test2 block");
		}
		
	}
	public static void division() {
		int i=10;
		try {
			System.out.println("inside try block");
			int k = i/0;
		}
		catch(ArithmeticException e) {
			System.out.println("Inside catch block");
			System.out.println("divide by zero error");
		}
		finally {
			System.out.println("execute this code even after exception");
		}
	}
	public static void division2() {
		int i=10;
		try {
			System.out.println("inside try division2 block");
			int k = i/0;
		}
		catch(NullPointerException e) {  //expecting arithmetic exception but we are handling NullPointerException so it will throw exception after finally code executed
			System.out.println("Inside catch block");
			System.out.println("divide by zero error");
		}
		finally {
			System.out.println("execute this code division2 even after exception");
		}
	}


}

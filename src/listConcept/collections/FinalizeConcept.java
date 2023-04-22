package listConcept.collections;

public class FinalizeConcept {
	//Finalize is method
	//Finally is block
	//Final is keyword 
	public void finalize() {
		System.out.println("Finalize Method");
	}

	public static void main(String[] args) {
		// Finalize is like garbage collector
		//Just before the garbage collector finalize method will be called for clean up processes
		
		FinalizeConcept f1 = new FinalizeConcept();
		FinalizeConcept f2 = new FinalizeConcept();
		
		f1 = null;
		f2 = null;
		
		System.gc();

	}

}

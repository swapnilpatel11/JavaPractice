package listConcept.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {

	public static void main(String[] args) {
		// ArrayList is dynamic array
		
		int a[]= new int[3]; //static array
		
		ArrayList ar = new ArrayList();
		ar.add(10); //0
		ar.add(20); //1
		ar.add(30); //2
		//Any type of value can be added
		//this is non generic arraylist
		ar.add("Test");
		ar.add(10.5); 
		
		System.out.println(ar.size());  //length of ArrayList
		
		ar.add(40); //3
		ar.add(50); //4
		
		System.out.println(ar.size());
		
		System.out.println(ar.get(3)); //fetch the value by index
		
		//print all values from arraylist we use "for" loop
		
		for(int i=0; i<ar.size(); i++)
		{
			System.out.println(ar.get(i));
		}
		
		//Non Generic vs. Generic
		//This is called generic arraylist as it mentioned type of arraylist
		//This concepts is called generics in Java
		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		ar1.add(80);
		
		
		ArrayList<String> ar2 = new ArrayList<String>();
		ar2.add("hi");
		
		//ArrayList<E> ar3 = new ArrayList<E>();  when datatype is unsure
		
		System.out.println("=>How to store user define class in ArrayList? Here is usecase of it");
		
		//use case of ArrayList : How to store user define class in ArrayList
		//Employee Class Object creation
		Employee e1 = new Employee("Swap",27,"QA");
		Employee e2 = new Employee("Tom",28,"Dev");
		Employee e3 = new Employee("Peter",29,"Admin");
		
		//Create ArrayList
		ArrayList<Employee> ar4 = new ArrayList<Employee>();
		ar4.add(e1);
		ar4.add(e2);
		ar4.add(e3);
		
		//iterator to traverse the values
		Iterator<Employee> it = ar4.iterator();
		while(it.hasNext()) //hasNext() will check value is available or not
		{
			Employee emp = it.next();
			System.out.println(emp.name);
			System.out.println(emp.age);
			System.out.println(emp.dept);
			//System.out.println(emp); //shows location point to Employee 
		}
		
		System.out.println("=>addAll() method use case to merge two lists");
		//Adding first list into second list with addAll method
		ArrayList<String> ar5 = new ArrayList<String>();
		ar5.add("Selenium");
		ar5.add("QTP");
		ar5.add("Manual");
		
		ArrayList<String> ar6 = new ArrayList<String>();
		ar6.add("Jira");
		ar6.add("QTest");
		ar6.add("Appium");
		
		ar5.addAll(ar6);
		
		for(int i=0;i<ar5.size();i++) {
			System.out.println(ar5.get(i));
		}
		
		System.out.println("=> Remove All ar6 values from ar5");
		//removeAll():
		ar5.removeAll(ar6);
		for(int i=0;i<ar5.size();i++) {
			System.out.println(ar5.get(i));
		}
		
		System.out.println("=> retainAll() method for getting common values from lists");
		//retainAll(): retain only common value from both lists
		ArrayList<String> ar7 = new ArrayList<String>();
		ar7.add("Selenium");
		ar7.add("QTP");
		ar7.add("Manual");
		
		ArrayList<String> ar8 = new ArrayList<String>();
		ar8.add("Jira");
		ar8.add("QTP");
		ar8.add("Appium");
		
		ar7.retainAll(ar8); // QTP is common so only qtp will be printed 
		
		for(int i=0; i < ar7.size(); i++) {
			System.out.println(ar7.get(i));
		}
	}

}

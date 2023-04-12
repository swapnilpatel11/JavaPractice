package listConcept.collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {

	public static void main(String[] args) {
		
		LinkedList<String> l1 = new LinkedList<String>();
		
		//Add:
		l1.add("Test");
		l1.add("QTP");
		l1.add("Selenium");
		l1.add("RPA");
		l1.add("RFT");
		
		//Print:
		
		System.out.println("Content of linkedlist: " + l1);
		
		//addFirst(): add value at first place
		l1.addFirst("Naveen");
		//addLast(): add value at last place
		l1.addLast("Automation");
		
		System.out.println("Content of LinkedList: "+l1);
		
		//get: get value
		System.out.println(l1.get(0));
		System.out.println(l1.get(2));
		
		//Set: set value at index
		l1.set(0, "Swap");
		System.out.println(l1.get(0));

		//remove first and last element
		l1.removeFirst(); //remove first element
		l1.removeLast(); //remove last element
		
		System.out.println("Content of LinkedList: "+l1);
		
		//remove from specific position
		l1.remove(2);
		System.out.println("Content of LinkedList: "+l1);
		
		//How to iterate all values of LinkedList
		//for Loop
		System.out.println("**using for loop**");
		for(int i =0;i<l1.size();i++)
		{
			System.out.println(l1.get(i));
		}
		//advance for loop
		System.out.println("**Using Advance for loop**");
		for(String str:l1) {
			System.out.println(str);
		}
		
		//iterator
		System.out.println("**Using iterator**");
		
		Iterator<String> it = l1.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//while loop
		System.out.println("**while loop**");
		int num=0;
		while(l1.size()>num) {
			System.out.println(l1.get(num));
			num++;
		}
	}

}

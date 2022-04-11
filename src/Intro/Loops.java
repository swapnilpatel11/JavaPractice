package Intro;

public class Loops {

	public static void main(String[] args) {
		//Loops in java
		//1.While loop
		int i =1;
		while(i<=10)
		{
			System.out.println(i);
			i++;
		}
		
		//2.for loop
		for(int j=0; j<=10;j++)
		{
			System.out.println(j);
		}
		
		//++
		// --
		int a = 1;
		int b = a++; //post increment
		System.out.println(a);
		System.out.println(b);
		
		int c = 1;
		int d = ++c; //pre increment
		System.out.println(c);
		System.out.println(d);
		
		int m = 2;
		int n = m--; //post decrement
		System.out.println(m);
		System.out.println(n);
		
		int e = 2;
		int f = --e; //pre decrement
		System.out.println(e);
		System.out.println(f);
		
	}

}

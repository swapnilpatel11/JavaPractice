package Intro;

public class Arrays {

	public static void main(String[] args) {
		//Array concept in Java
		//to store similar data types values in a array variable
		//1.Static size is fixed. To overcome this problem we use collections--ArrayList,Hashtable.--dynammic array
		//2.store only similar data types. to overcome of this problem we use Object array.
		
		//1.int array
		int i[] = new int[4];
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;
		System.out.println(i[2]);
		System.out.println(i.length); //size of array
		//print all values of array
		for(int j=0;j<i.length;j++)
		{
			System.out.println(i[j]);
		}
		
		//2.double array
		double d[] = new double[3];
		d[0]= 12.13;
		d[1] = 10.30;
		d[2] = 45.35;
		
		System.out.println(d[2]);
		
		//3.char array
		char c[] = new char[3];
		c[0] = 'q';
		c[1] = '2';
		c[2] = '$';
		
		//4. boolean array
		boolean b[] = new boolean[2];
		b[0] = true;
		b[1] = false;
		
		//5. String array
		String s[] = new String[3];
		s[0] = "test";
		s[1] = "Hello";
		s[2] = "World";
		
		System.out.println(s.length);
		
		//6.Object Array (Object is class) is used to store different datatypes values
		Object ob[] = new Object[6];
		ob[0] = "Tom";
		ob[1] = 25;
		ob[2] = 12.33;
		ob[3] = "1/1/1990";
		ob[4] = 'M';
		ob[5] = "London";
		System.out.println(ob[5]);
		
				
		
	}

}

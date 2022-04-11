package Intro;

public class IfElse {

	public static void main(String[] args) {
		//String Concatination
		//if...else 
		int a =100;
		int b =200;
		
		String x ="Hello";
		String y ="World";
		
		double c =12.33;
		double d = 10.33;
		
		System.out.println(a+b);
		System.out.println(x+y);
		System.out.println(a+b+x+y);
		
		System.out.println(x+y+a+b);
		System.out.println(x+y+(a+b));
		System.out.println(a+b+x+y+a+x+b+y);
		
		System.out.println(c+d);
		System.out.println(x+y+c+d);
		
		int e =10;
		int f =20;
		if(e>f)
		{
			System.out.println("e is greater");
		}
		else
		{
			System.out.println("f is greater");
		}
		
		if(a==b)
		{
			System.out.println("both are equal");
		}
		else
		{
			System.out.println("not equal");
		}
	}

}

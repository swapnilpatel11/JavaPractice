package Intro;

public class WrapperClass {

	public static void main(String[] args) {
		// Wrapper class concept: Data Conversion
		String x = "100";
		System.out.println(x+20);
		
		//To convert x into integer we used wrapper class called Interger.ParseInt
		//Data Conversion String to Int
		int y = Integer.parseInt(x);
		
		//we have various wrapper classes double,char,integer,boolean
		System.out.println(y + 20);
		
		//String to double
		String s = "12.33";
		double d = Double.parseDouble(s);
		System.out.println(d+10);
		
		//String to boolean
		String c = "true";
		boolean b = Boolean.parseBoolean(c);
		System.out.println(b);
		
		//integer to string
		int j = 20;
		System.out.println(100+20);
		
		String t = String.valueOf(j);
		System.out.println(t+20);
		
		String u = "100A";
		int a = Integer.parseInt(u);
		System.out.println(u);
		
		
		
	}

}

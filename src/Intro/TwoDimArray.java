package Intro;

public class TwoDimArray {

	public static void main(String[] args) {
		//two dimension array
		// 3* 5 = 3 rows and 5 columns
		String x[][] = new String[3][5];
		System.out.println(x.length); //3 total no. of rows
		System.out.println(x[0].length); //total no. of columns
		x[0][1] = "A";
		x[0][1] = "B";
		
		//how to execute all values in 2d array: use 2 for loop
		for(int row=0;row<x.length;row++)
		{
			for(int col=0;col<x[0].length;col++)
			{
			System.out.println(x[row][col]);
			}
		}

	}

}

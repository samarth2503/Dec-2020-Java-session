package StaticArray;

public class TwoDArray {
	
	public static void main(String[] args)
	{
		// Different ways to initalize 2D Array
		int[][] a = {
				
				{12,13,14},
				{34,3,53,6,37},
				{45,46,47,48,49}
			};
		
		int[][] d = new int[2][4];
		
		d[0] = new int[] {34,65,98,23};
		d[1] = new int[] {98,21,30,45};
		
		int[][] x = new int[][] {{2,5,6,7},{4,89,67,21},{90,21,54,76}};
		
		int[][] e = new int[2][3];
		
		e[0][0] = 12;
		e[0][1] = 13;
		e[0][2] = 14;
		
		e[1][0] = 15;
		e[1][1] = 16;
		e[1][2] = 17;
		
		// Printing 2-D array element using for loop
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.println("I is "+i);
				System.out.println("J is "+j);
				System.out.println("Value is "+a[i][j]);
			}
			
			System.out.println();
		}
		
		// Printing 2-D array element using for each loop
		
		for(int[] b :a)
		{
			for(int c : b)
			{
				System.out.println(c);
			}
		}
		
		System.out.println("------------- New Data ----------------");
		
		int[][] b = new int[][] {{2,5,6,7},{4,89,67,21},{90,21,54,76}};
		
		for(int i=0;i<b.length;i++)
		{
			for(int j=0;j<b[i].length;j++)
			{
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}

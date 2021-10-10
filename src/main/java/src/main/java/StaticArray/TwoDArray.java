package StaticArray;

public class TwoDArray {
	
	public static void main(String[] args)
	{
		int[][] a = {
				
				{12,13,14},
				{34,3,53,6,37},
				{45,46,47,48,49}
			};
		
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
		
		// Priniting 2-D array element using for each loop
		
		for(int[] b :a)
		{
			for(int c : b)
			{
				System.out.println(c);
			}
		}
		
		
		
	}

}

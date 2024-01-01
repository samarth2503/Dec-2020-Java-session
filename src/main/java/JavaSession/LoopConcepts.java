package JavaSession;

public class LoopConcepts {

	public static void main(String[] args) {

		// Example of infinte loops
//		int i = 0;
//		while(i<=100)
//		{
//			System.out.println(i);
//			if(i%5==0)
//			{
//				System.out.println("Hi...");
//				continue;
//			}
//			i++;
//		}
//		
//		for(;;)
//		{
//			System.out.println("Welcome to Taj Hotel.Open 24 X 7");
//		}
		
//		for(int m=0;m<=10;)
//		{
//			System.out.println(m);
//		}
		
		// Print only even number with using any conditional statement
		
		for (int even=0;even<=10;even=even+2)
		{
			System.out.println(even);
		}
		System.out.println("----------------------------");
		int k=0;
		for(;k<=10;k++)
		{
			System.out.println(k);
		}
		System.out.println("----------------------------");
		//for loop for character
		// Print Ascii/Unicode code for for a-z
		for(char c='a';c<='z';c++)
		{
			System.out.print((c+0) +" ");
		}
		System.out.println("----------------------------");
		//do While loop
		int i=1;
		do
		{
			System.out.println(i);
			i++;
		}
		while(i<=10);
		
	
	}

}

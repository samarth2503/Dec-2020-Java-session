package ClassesandObject;

public class MethodsInJava {
	
	// No Method inside a method
	// Methods are independent or parallel to each other
	
	// 1. No input and no return
	
	public void test()
	{
		System.out.println("Inside Test Method....");
		//main(new String[] {"a"});
	}
	
	public void addMarks()
	{
		int a = 10;
		int b = 20;
		int c = 30;
		int d = a+b+c;
		System.out.println(d);
	}
	
	//2. No input but some return type
	public int getScoreMethods()
	{
		System.out.println("Inside Score Method...");
		int score = 100;
		int bal = 20;
		int final_score = score+bal;
		return final_score;
	}
	
	// 3. Some input some return
	public int addMethod(int a, int b)
	{
		System.out.println("Inside Add Methods...");
		int sum = a+b;
		return sum;
	}
	
	public static void main(String[] args)
	{
		MethodsInJava meth = new MethodsInJava();					// Static method dosen't allow method to be called directly, we need to call with obj
		meth.test();
		meth.addMarks();
		
		int score=meth.getScoreMethods();
		System.out.println("Score is .."+ (score-10));
		
		int s1 = meth.addMethod(10, 15);
		System.out.println(s1);
	}

}

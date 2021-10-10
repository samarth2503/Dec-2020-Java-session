package StringConept;

public class SCPPractice2 {

	public static void main(String[] args) {

		String s1 = "durga";
		String s2 = s1.toString();
		String s3 = s1.toLowerCase();
		String s4 = s1.toUpperCase();
		String s5 = new String("durga");
		
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s1==s4);
		//System.out.println(s1==s5);
		
		m1();
		
	}
	
	public static void m1()
	{
		String s1 = "durga";
		String s2 = s1.toUpperCase();
		String s3 = s1.toLowerCase();
		
		System.out.println(s1==s2);
		System.out.println(s1==s3);
	}

}

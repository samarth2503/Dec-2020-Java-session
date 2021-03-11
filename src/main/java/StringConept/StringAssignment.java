package StringConept;

public class StringAssignment {

	public static void main(String[] args) {
		
		// Two diff String equitity
		String s1 = "xyz";
		String s2 = "abc";
		
		if(s1.equals(s2))
		{
			System.out.println("Strings are equal");
		}
		else
		{
			System.out.println("Strings are not equal");
		}
		
		// Remove spaces from string
		
		String str = "     Hello Everyone     ";
		
		System.out.println(str.trim().replaceAll(" ", ""));
		
		// Print last and first character of a word
		
		String word = "Samarth";
		
		System.out.println("First character is "+word.charAt(0));
		System.out.println("First character is "+word.charAt(word.length()-1));
		
		// Reverse your name
		
		String name = "Samarth";
		String output = "";
		for(int i=name.length()-1;i>=0;i--)
		{
			output+=name.charAt(i);
		}
		
		System.out.println("Name in Reverse is "+output);
		
		// Printing middle word
		
		String sentence = "Selenium with Java";
		String words[] = sentence.split(" ");
		System.out.println("Middle word is = "+words[1]);
		System.out.println("First word is = "+words[0]);
		System.out.println("Last word is = "+words[2]);
		
		// Fetch Numeric part of String
		
		String s = "your transaction id is: 12345 and reference id is 34567";
		
		String first = s.substring(s.indexOf("is")+4, s.indexOf("and")-1);
		System.out.println(first);
		
		String second = s.substring(s.indexOf(s.substring(s.indexOf("is")+3)));
		//s.indexOf(str, fromIndex)
		System.out.println(second);
		
		
		// To fetch index of 3rd 'i'
		
		String exp = "Welcome to Naveen Automation labs";
		
			exp.indexOf('e',exp.indexOf('e',exp.substring(exp.indexOf('e')+1)));
	}

}

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
		
		
		// To fetch index of 3rd 'e'
		
		String exp = "Welcome to Naveen Automation labs";
		
		int i1 = exp.indexOf('e');
		int i2 = exp.indexOf('e', i1+1);
		int i3 = exp.indexOf('e', i2+1);
		
		System.out.println("Third index os e is :"+ i3);
		
		String str1 = "Samarth123";
		System.out.println("Contains is "+str1.contains("mar"));
		
		// Converting boolean,char,int double,float to String
		
		System.out.println("Boolean to String " +String.valueOf(true));
		
		System.out.println("Char to String "+String.valueOf('c'));
		
		char[] c = new char[] {'j','a','v','a'};
		System.out.println("Char array to String "+String.valueOf(c));
		
		System.out.println("Double to String "+String.valueOf(45.678));
		
		System.out.println("Integer to String "+String.valueOf(34));
		
		char[] cb = new char[] {'j','a','v','a','b','c','d','e','g'};
		System.out.println("SubArray using Char "+String.valueOf(cb,2,6));
		
		System.out.println("After Replacing character in String  "+str1.replace('a', 'x'));
		
		System.out.println("Using String replaceAll "+str1.replaceAll("\\d", "x"));
		
		System.out.println("Using substring "+str1.substring(3));
		
		System.out.println("Using SubString 2 "+str1.substring(3,6));
		
		System.out.println("Using endswith method "+str1.endsWith("th"));
		
		System.out.println("Using startswith method "+str1.startsWith("Sa"));
		
		System.out.println("Index is "+str1.indexOf('a', 2));
		
		byte[] b = str1.getBytes();
		
		System.out.println(str1.compareTo("Durga"));
		
		System.out.println(str1.compareTo("Durgawertyhjk"));
		
	}

}

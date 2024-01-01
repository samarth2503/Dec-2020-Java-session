package StringConept;

public class StringManupilaction {

	public static void main(String[] args) {
		
		String str = "This is my java code and I am so happy This is my first java code";
		
		
		//Length of String
		int len = str.length();
		System.out.println("Length of String is "+len);						// Length of String
		
		// Character at specific position
		System.out.println("Character at 0th Position : "+str.charAt(0));
		System.out.println("Character at 0th Position : "+str.charAt(15));
		//System.out.println("Character at 68th position : "+str.charAt(68));				// Index Out of Bound Exception
		
		// Index of character in String
		System.out.println("Postion at p "+str.indexOf('p'));
		
		//1st Occurenece of i
		System.out.println("Positsion of 1st i "+ str.indexOf('i'));
		
		//2nd Occurence of i 
		System.out.println("Position of 2nd i in String "+ str.indexOf('i',str.indexOf('i')+1));
		
		//3rd Occurence of i in String
		System.out.println("Position of 3rd i in String "+str.indexOf('i',str.indexOf('i',str.indexOf('i',str.indexOf('i')+1)+1)));
		
		//4th Occureence of i in String
		System.out.println("Position of 4th i in String "+str.indexOf('i',str.indexOf('i', str.indexOf('i',str.indexOf('i')+1)+1)+1));
		
		//Index of word in String
		System.out.println("Position of java " +str.indexOf("java"));
		
		System.out.println("Index of Naveen "+str.indexOf("Naveen"));					// -1
		
		String s1 = "welcome to TESTING";
		System.out.println("Uppercase is "+s1.toUpperCase());
		System.out.println("Lowercase is "+s1.toLowerCase());
		
		String s2 = "  hello world    ";
		System.out.println("after trimming data is "+s2.trim());
		
		String name = "your app name is amazon";
		if(name.contains("amazon"))
		{
			System.out.println("Amazon is present in name String...");
		}
		
		String s11 = "Selenium Traning";
		String s12 = "Selenium Traning";
		
		if(s11.equals(s12))
		{
			System.out.println("String value is equal...");
		}
		
		String st = "this is my java code";
		System.out.println(st.substring(3, 11));
		System.out.println(st.substring(5));
		
		String stt = "your transaction id is 12345";
		System.out.println("subString is "+(stt.substring(stt.indexOf("is")+2,stt.length())).trim());
		
		String stt1 = "this is your transaction id is 12345";
		int in = stt1.indexOf("is",stt1.indexOf("is", stt1.indexOf("is")+2)+2);
		in = in+2;
		System.out.println("Transaction id is "+stt1.substring(in, stt1.length()).trim());
		
		//replace
		String dob = "12-12-1990";
		dob=dob.replaceAll("-", "/");
		System.out.println("Date of Birth is "+dob);
		
//		System.out.println(str.length());
//		
//		System.out.println(str.charAt(0));
//		System.out.println(str.charAt(16));
//		System.out.println(str.charAt(37));
//		//System.out.println(str.charAt(38));						// String Index Out of bound Exception
//		//System.out.println(str.charAt(-1));						// String Index Out of Bound Exception
//		
//		System.out.println(str.indexOf('T'));
//		//System.out.println(str.indexOf(''))
//		
//		// First Occurrence of character
//		System.out.println(str.indexOf('i'));						// to find index of character in string
//		
//		// to Print second occurence of character
//		System.out.println(str.indexOf('i', str.indexOf('i')+1));
//		
//		// third Occurenece
//		System.out.println(str.indexOf('i', str.indexOf('i', str.indexOf('i', str.indexOf('i')+1)+1)));
//		
//		// Fourth Occurence
//		System.out.println(str.indexOf('i', str.indexOf('i', str.indexOf('i', str.indexOf('i',str.indexOf('i', str.indexOf('i')+1)))+1)+1));
//		
//		// to get the word from String
//		System.out.println(str.indexOf("happy"));					// 33
//		
//		System.out.println(str.indexOf("java"));					// 11
//		
//		System.out.println(str.indexOf("Naveen"));					// Naveen is not available to so it will give -1 as output
//		
//		String msg = "Welcome admin";
//		
//		if(msg.indexOf("Admin")>0)
//		{
//			System.out.println("username is there in msg");
//		}
//		else
//		{
//			System.out.println("username is missing.....");
//		}
//		
//		if(msg.indexOf("admin") == -1)
//		{
//			System.out.println("username is missing...");
//		}
//		else
//		{
//			System.out.println("username is found");
//		}
//		
//		System.out.println(msg.toUpperCase());							// to print String in Uppercase
//		System.out.println(msg.toLowerCase());							// To print String in Lowercase
//		
//		//trim (remove space from corner)
//		
//		String s2 = "    Hello World     ";
//		System.out.println(s2.trim());
//		
//		// file --- browser = chrome
//		String browser = " chrome ";
//		
//		if(browser.trim().equals("chrome"))
//		{
//			System.out.println("Launching Chrome...");
//		}
//		
//		String url = "https://www.abc.com/loginpage.jsp";
//		
//		if(url.contains("login"))
//		{
//			System.out.println("Login Page url is correct");
//		}
//		else
//		{
//			System.out.println("username is there in msg");
//		}
//		
//		String name = "your app name is amazon";
//		
//		//Equlas
//		
//		String s11 = "Testing Selenium";
//		String s12 = "Testing selenium";
//		
//		System.out.println(s11.equals(s12));
//		System.out.println(s11.equalsIgnoreCase(s12));
//		
//		// subString
//		
//		String st = "this is my java code";
//		
//		System.out.println(st.substring(5));							// It will start from 5th position to last position
//		System.out.println(st.substring(8,16));							// java code
//		
//		String stt = "your transction id is 12345";								// to get numeric value
//		
//		System.out.println(stt.substring(stt.indexOf("is")+3,stt.length()));					// 12345
//		
//		System.out.println(stt.substring(stt.indexOf("is")+1,stt.length()));					// s 12345
//		
//		String str1="this is your transction id is 12345";
//		
//		System.out.println(str1.substring(str1.indexOf("is", (str1.indexOf("is",str1.indexOf("is")+2))+2)+3));
//		
//		System.out.println(str1.substring(str1.indexOf("is",str1.indexOf("is")+3)));
//		
//		//replace
//		
//		String dob = "12-12-1990";
//		System.out.println(dob.replace("-", "/"));
//		
//		// split
//		
		String lang = "JAVA:Paython:Javascript:Ruby";
		String[] langArr = lang.split(":");

		System.out.println("Length of arrays is "+langArr.length);
		for(String s: langArr)
		{
			System.out.println(s);
		}
		
		String testdata = "moit:bishit:mohit@gmail.com:test@123";
		
		String test = "xXIndiaxXUSXxXUKXxXXRussia";
		String testing[] = test.split("xX");
		System.out.println(testing[0]);												// 0 index will hold nothing
		System.out.println(testing[1]);
		System.out.println(testing[2]);
		System.out.println(testing[3]);	
		System.out.println(testing[4]);	
		System.out.println(testing.length);	
//		
//		String[] test1 = " xXIndiaxXUSXxXUKXxXXRussia".split("xX");
//		System.out.println(test1[0]);												// 0 index will hold nothing
//		System.out.println(test1[1]);
	}

}

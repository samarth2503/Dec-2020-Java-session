package StringConept;

public class StringPractice {

	public static void main(String[] args) {
		
		// String is Mutable
		// StringBuffer is Immutable
		
		String s = new String("Durga");
		s.concat("Software");					
		System.out.println(s);				// op:- durga, because String is immutable it won't concat Software
		
		StringBuffer sb = new StringBuffer("Durga");
		sb.append("Software");
		System.out.println(sb);				// op:- Durga Software, because StringBuffer is mutable.
		
		StringBuffer sb1 = new StringBuffer("Durga");
		StringBuffer sb2 = new StringBuffer("Durga");
		
		System.out.println(sb1==sb2); 			// False  == operator is always meant for reference comparision and sb1 and sb2 pointing to different memory address
		System.out.println(sb1.equals(sb2));	// False   because in String buffer equals() method is not override from Object class.
		
		String s1 = new String("Durga");
		String s2 = new String("Durga");
		
		System.out.println(s1==s2);				// False :- == operator is always meant for reference comparision and s1 and s2 pointing to different memory address
		System.out.println(s1.equals(s2));		// True because equals method is overriden from Object class
		
	}

}

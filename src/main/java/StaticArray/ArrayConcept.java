/* 
 * Arrays are fixed in Size
 * Similar type of data are allowed
 * Negative indexing not possible in array
 * Lowest index is always 0 in array
 * 
 *  Array should be used when the dat is fixed. Eg:- No.of days in week,month.
 *  
 *  Default value for int,byte,short,long is 0
 *  Defaut value is Double,float 0.0
 *  Default value is String,Object it is null
 *  Default value is Charcter is space
 *  Default value or boolean is false
 *  
 *  
 */

package StaticArray;

public class ArrayConcept {
	
	public static void main(String[] args)
	{
		int a[] = new int[4];										// declaration,instantiation is done in this line
		
		a[0]=23;													// initalization
		a[1]=89;
		a[2]=56;
		a[3]=32;
		
		int[] b = {12,13,14};										// declaration,initization and instantation in one line
		int[] c = new int[] {34,35,36};
		
		
		
		System.out.println("Lowest Index "+0);
		System.out.println("Highest Index is "+(a.length-1));
		System.out.println("Length of array is "+a.length);
		
		System.out.println("Lowest Index "+a[0]);					// 23
		
		//System.out.println(a[5]);									// java.lang.ArrayIndexOutOfBoundsException
		
		System.out.println(a[3]);							
		
		// To print all values of array
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println("Index "+i+" has value "+a[i]);
		}
		
		int k[] = new int[3];
		
		k[0]=55;
		k[1]=66;
		
		System.out.println(k[2]);									// if we have space remaining inside arry it will stored with defualt value. 
		
		//Double array
		
		double[] d = new double[5];
		d[0]=23.56;
		d[1]='a';
		d[2]=46.78;
		
		System.out.println(d);
		
		for(int j=0;j<d.length;j++)
		{
			System.out.println("Index "+j+" has value "+d[j]);
		}
		
		//char Array
		
		char[] c1 = new char[5];
		
		c1[0]='a';
		c1[1]='b';
		c1[2]='c';
		
		System.out.println("Character is "+c1[4]);
		
		for(int x=0;x<c1.length;x++)
		{
			System.out.println("Index "+x+" has value "+c1[x]);
		}
		
		for(char ch : c1)
		{
			System.out.println(ch);
		}
		
		
		// Object Array :- It is used to store the data where datatype are not fixed. Eg:- employee details
		
		Object[] obj = new Object[4];
		
		obj[0]="Samarth";						// name
		obj[1]=24;								// age
		obj[2]=50000.0;							// salary
		obj[3]=true;							// is active or not
		
		for(Object s : obj)
		{
			System.out.println(s);
		}
	}

}

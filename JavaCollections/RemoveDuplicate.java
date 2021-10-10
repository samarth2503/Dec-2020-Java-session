package JavaCollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicate {
	
	public static void main(String[] args)
	{
		//How To remove duplicate from ArrayList
		
		// Method 1 :- Using set Interfcae
	
		List<Integer> al = new ArrayList<Integer>(Arrays.asList(23,45,67,34,23,89,90,45));
	
		Set<Integer> uniquelist = new LinkedHashSet<Integer>(al);
	
		System.out.println("Unique Elements are "+uniquelist.toString());
	
		// Method2 :- Using another List
	
		List<Integer> d = new ArrayList<Integer>();
	
		for(Integer ele : al)
		{
			if(!d.contains(ele))
			{
				d.add(ele);
			}
		}

		System.out.println("Unique elements are "+d.toString().trim());
		
		/*int[] a = {4,5,6,7};
		int[] b = {5,90,31,44,20,32};
		
		//int[] c = new int[a.length+b.length];
		
		int[] c = Arrays.copyOf((a),(a.length+b.length));
		c= Arrays.copyOf((b),(a.length+b.length));
		
		for(int k=0;k<c.length;k++)
		{
			System.out.println(c[k]);
		} */
	}

}

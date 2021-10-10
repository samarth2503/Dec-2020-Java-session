/*
 *  Whenever we write ArrayList a = new ArrayList, default Virtual Capactity of size 10 will be created.
 *  Once we add the values the size of Virtual Capacity will be decreased.
 *  Physical capacity will be identified by (a.size())
 *  
 *  After exceeding the VC the new Cpacity will be 
 *  
 *  NewCapacity = (NewCapacity * 1/2) + New Capacity    --- .New Capacity = 10
 * 
 */

package JavaCollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class DynamicArray {
	
	public static void main(String[] args)
	{
		ArrayList<Integer> a = new ArrayList<Integer>();
		
		System.out.println(a.size());							// PC=0, VC=10;
		
		a.add(10);
		a.add(23);
		
		System.out.println(a);									// PC=2, VC=8;
		
		a.add(45);
		System.out.println(a);									// PC=3 , VC=7
		
		a.add(100);
		a.add(37);
		a.add(45);
		a.add(56);
		a.add(209);
		a.add(78);
		a.add(47);
		
		System.out.println(a);
		
		a.add(67);
		a.add(304);
		a.add(406);
		
		// to update lement in arryList
		a.set(2, 400);
		System.out.println(a.toString());
		
		// to add element at specific position
		
		a.add(6,900);
		System.out.println(a.toString());
		
		// toadd arrayList or Collections
		
		List<Integer> b = new ArrayList<Integer>();
		a.addAll(b);

	}

}

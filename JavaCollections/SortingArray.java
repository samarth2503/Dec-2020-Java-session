package JavaCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class SortingArray {

	public static void main(String[] args) {
		
		List<Integer> al = new ArrayList<Integer>();
		List<Integer> bl = new ArrayList<Integer>();
		
		al.add(234);
		al.add(20);
		al.add(10);
		al.add(900);
		al.add(405);
		al.add(89);
		al.add(150);
		
		// Reverse ArrayList :- Method:-1
		Collections.reverse(al);										// It will reverse existing List
		System.out.println(al.toString());
		
		// Method 2:- Without Collections.reverse()						// We nned to take another list to hold reversed List
		
		ListIterator<Integer> itr = al.listIterator(al.size());
		
		while(itr.hasPrevious())
		{
			bl.add(itr.previous());
		}
		
		System.out.println(bl.toString());
		
		// Ascending Sorting
		
		Collections.sort(al);
		System.out.println("Ascending Order List "+al.toString());
		
		// Descending Sorting
		
		Collections.sort(al, Collections.reverseOrder());
		System.out.println("Descending Order List "+al.toString());
		
		
		
	
	}

}

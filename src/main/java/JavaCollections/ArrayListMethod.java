package JavaCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class ArrayListMethod {
	
	public static void main(String[] args)
	{
		
		// Array list works on Physical Capacity not on virtual capacity
		// Default Virtual capacity for Array list is 10
		ArrayList<String> al = new ArrayList<String>();
		
		al.add("Java");
		al.add("C#");
		al.add("Python");
		al.add("Ruby");
		
		
		System.out.println("Language are "+al);
		
		al.set(2, "JavaScript");												// Update the specific location
		
		System.out.println("Updated Lanuages are "+al);
		
		al.add(null);
		al.add(null);
		al.add("Ruby");
		
		System.out.println(al);													// We can add null and duplicate values also
		
		
		// To print values from ArrayList using ListIterator
		
		System.out.println("------------------");
		
		ListIterator<String> li = al.listIterator();
		
		while(li.hasNext())
		{
			System.out.println(li.next());
		}
		
		// To print values from ArrayList using ListIterator in backward diraction
		
		ListIterator<String> bkwdal = al.listIterator(al.size()-1);
		
		System.out.println("------------------");
		
		while(bkwdal.hasPrevious())
		{
			System.out.println(bkwdal.previous());
		}
		
		// To print List of element using for loop
		
		System.out.println("------------------");
		for(int k=0;k<al.size();k++)
		{
			System.out.println(al.get(k));
		}
		
		// To remove specfic element from array
		
		System.out.println(al.remove(2));
		
		// To extract portion of arrylist
		
		System.out.println("To extract sub portion "+al.subList(1, 4));
		

		
		// Search element in ArrayList
		
		String ele ="Ruby";
		
		for(String e : al)
		{
			if(ele.equals(e))
			{
				System.out.println("Serach Ruby "+al.indexOf("Ruby"));
			}
		}
		
		// Empty the ArrayList
		
		al.clear();
		System.out.println("Clear Array list : "+al);
		
		
		// How to make ArrayList read only
		
		List<String> fruitList1 = new ArrayList<String>();
		
		fruitList1.add("Apple");
		fruitList1.add("Mango");
		fruitList1.add("Chickoo");
		fruitList1.add("Banana");
		
		List<String> unmodiyfable = Collections.unmodifiableList(fruitList1);					// we can't add,remove or update element in List
		
		try {
			unmodiyfable.add("Papaya");
		}
		catch(Exception e)
		{
			System.out.println(fruitList1);
		}
		
		
		// Comparing two array
		
		// 1> comparing element using equals method
		
		ArrayList<String> al1 = new ArrayList<String>();
		
		al1.add("Apple");
		al1.add("Pears");
		al1.add("Guava");
		al1.add("Mango");
		
		ArrayList<String> al2 = new ArrayList<String>();
		
		al2.add("Apple");
		al2.add("Pears");
		al2.add("Guava");
		al2.add("Mango");
		
		boolean b1 = al1.equals(al2);
		
		System.out.println("Comparing two ArrayList "+b1);
		
		al2.add("Papaya");
		
		boolean b2 = al1.equals(al2);
		
		System.out.println("Comparaing after adding element "+b2);
		
		// 2> removeAll() 
		
		ArrayList<String> firstlist = new ArrayList<String>();
		
		firstlist.add("Apple");
		firstlist.add("Pears");
		firstlist.add("Guava");
		firstlist.add("Peach");
		
		ArrayList<String> secondlist = new ArrayList<String>();
		
		secondlist.add("Apple");
		secondlist.add("Pears");
		secondlist.add("Papaya");
		secondlist.add("Peach");
		
		firstlist.removeAll(secondlist);							// Removes all the element from first list which matches in second list and print the element of first list which does not match element in second list
		
		System.out.println(firstlist);
		System.out.println(secondlist);
		
		// 3> retainAll method
		
		ArrayList<String> firstlist1 = new ArrayList<String>();
		
		firstlist1.add("Apple");
		firstlist1.add("Pears");
		firstlist1.add("Guava");
		firstlist1.add("Peach");
		
		ArrayList<String> secondlist1 = new ArrayList<String>();
		
		secondlist1.add("Apple");
		secondlist1.add("Pears");
		secondlist1.add("Papaya");
		secondlist1.add("Peach");
		
		firstlist1.retainAll(secondlist1);							// It retains the element of firstlist1 which are common in secondlist1
		
		System.out.println(firstlist1);
		
		
		
	}

}

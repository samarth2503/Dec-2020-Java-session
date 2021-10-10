import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class ListHashMap {
	
	public static void main(String[] args)
	{
		List<Integer> l1 = new ArrayList<Integer>(Arrays.asList(2,3,4,2,6,4));
		
		List<Integer> l2 = new ArrayList<Integer>(Arrays.asList(2,33,44,2,6,44));
		
		System.out.println(l1.addAll(l2));
		System.out.println(l1);
		HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
		
		int count=0;
		for(int i=0;i<l1.size();i++)
		{
			Integer a = l1.get(i);
			System.out.println("List value is "+l1.get(i));
			if(!hm.containsValue(l1.get(i)))
			{
				hm.put(count, l1.get(i));
				count++;
			}
			else
			{
				l1.remove(l1.get(i));
			}
			
			//hm.containsValue(value)
		}
		
		System.out.println("HashMap is "+hm);
		System.out.println("List is "+l1);
	}

}

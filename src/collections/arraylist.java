package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class arraylist 
{
	public static void main(String[] args)
	{
		ArrayList<Integer> list = new ArrayList<>();
		list.add(90);
		list.add(88);
		list.set(1, 89);
		Collections.sort(list);
		Iterator itr=list.iterator();  
		while(itr.hasNext())
		{  
		   System.out.println(itr.next());  
		}  
		
		
		HashSet<String> set1 = new HashSet<>();
		HashSet<String> set2 = new HashSet<>();
		set1.add("Harsh");
		set1.add("chirag");
		Iterator<String> i = set1.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		set1.addAll(set2);
		set1.removeAll(set2);
		System.out.println("updatelist" + set1);
		
		HashMap<Character, Integer> map1 = new HashMap<>();
		String str = "hiihjkl";
		int counter = 1;
		char[] s = str.toCharArray();
		for(int j=0; j<str.length(); j++)
		{
			if(map1.containsKey(s[j]))
			{
				counter++;
				map1.put(s[j], counter);
			}
			else
			{
				map1.put(s[j], counter);
			}
		}
		System.out.println(map1);
		
	}
}

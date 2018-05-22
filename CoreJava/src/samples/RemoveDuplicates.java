package samples;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class RemoveDuplicates {

	public static <E> Set removeBySetImpl(List<E> list) {
		
		Set<E> set=new HashSet<E>();
		set.addAll(list);
		return set;
	}
	
	public static <E>void removeduplicate(List<E> list) {
		//ArrayList<E> repeated=new ArrayList<E>();
		//ArrayList<E> newarray =new ArrayList<E>();
		Map <Integer,Integer> map=new HashMap<Integer,Integer>();
		for(E e:list) {		
			if(map.containsKey(e)) {
				Integer repeated=map.get(e);
				repeated++;
				map.put((Integer) e, repeated);
			}else {
				map.put((Integer) e,1);
			}
			
			
		}
		
		System.out.println("repeated   is   "+map.keySet());
		System.out.println("no. of times =  "+map.entrySet());
	//	System.out.println("new  is   "+newarray);
	}
	
	public static void main(String[] args) {
		ArrayList<Integer> a1=new ArrayList<Integer>();
		a1.add(1);
		a1.add(2);
		a1.add(3);
		a1.add(4);
		a1.add(1);
		a1.add(1);
		a1.add(5);
		a1.add(6);
		a1.add(2);
	 removeduplicate(a1);
		
	}
}

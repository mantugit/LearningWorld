package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class SetExample {

	public static void main(String[] args) {
		HashMap<Integer, Integer> h=new HashMap<Integer, Integer>();
		h.put(1, 9);
		ArrayList l=new ArrayList();
		l.addAll(h.entrySet());
		
		System.out.println(l.get(0));
		
	}
}

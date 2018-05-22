package concepts;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Test2  extends Test{
String a;
	public Test2(String a,String s) {
		this.a=a;
		super.s=s;
	}
	
	public static void main(String[] args) {
		HashSet<String> h=new HashSet<String>();
		h.add("");
		h.add("a");
		h.add(null);
		h.add(null);
		
		HashMap<String,String> m=new HashMap<String,String>();
		m.put(null,"a");
		m.put(null,"a");
		ArrayList<String> s=new ArrayList<String>();
		h.addAll(s);
		System.out.println(s);
		
	}
}

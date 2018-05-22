package generics;

import java.util.ArrayList;
import java.util.List;

public class WildCard<T> {
	
	public static void display(List<?> a) {
		
	}
	public static void main(String[] args) {

		ArrayList<Integer> a=new ArrayList<>();
		ArrayList<String> a1=new ArrayList<>();
		ArrayList<Double> a2=new ArrayList<>();
		display(a2);
		display(a1);
		display(a);
		
	}
}

package java8;

import java.util.Arrays;
import java.util.List;
@AnotationsTest(show = 1)
public class ForEachEx {

	public static void main(String[] args) {
		List<Integer> l=Arrays.asList(1,2,3,4,10);
		
		l.forEach((n)->{
			System.out.println(n);
		});
	}
}

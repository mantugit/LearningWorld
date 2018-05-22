package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.ListIterator;
import java.util.Map;

public class test {
	int a=5;
	
	public static void main(String[] args) throws ClassNotFoundException{
		
		test t=new test();
		test t2=new test();
		t2=t;
		t2.a=4;
		System.out.println(t.a);
		System.out.println(t2.a);
		
			Class.forName(" ");
		
		
		
	}
	
}
class Employee{
	public int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
}
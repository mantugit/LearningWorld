package generics;

public class TypeSafe {
	public static void main(String[] args) {

		/*Gen<Integer> g=new Gen<Integer>(5);
		g.display();
		Gen<String> g2=new Gen<String>("Example");
		g2.display();*/
	}
}

class Gen<T, P> {
	T t;
	
	public Gen(T t) {
		// TODO Auto-generated constructor stub
		this.t = t;
	}

	public T display() {
		System.out.println("This  type  is   "+t.getClass().getName());
		return this.t;
	}

	public void add(T a) {
		System.out.println("Addition is    " + a + 2);
	}

}
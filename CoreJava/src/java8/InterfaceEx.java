package java8;


 interface Test{
	void display();
	
	default void definationInt() {
		System.out.println("Class need not to implement this method Test");
	}
}

 
  interface second{	
		default void definationInt() {
			System.out.println("Class need not to implement this method second");
		}
		
		
	}
 
public class InterfaceEx implements Test, second{

	public void display() {
		
	}
	
	@Override
	public void definationInt() {
		// TODO Auto-generated method stub
		second.super.definationInt();
	}

	public static void main(String[] args) {
	Test t=new InterfaceEx();
	t.definationInt();
	}

}

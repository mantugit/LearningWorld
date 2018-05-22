package samples;

public class CompareTwoObjects {
String name;
int id;
public static void main(String[] args) {
	
	CompareTwoObjects c1=new CompareTwoObjects();
	CompareTwoObjects c2=new CompareTwoObjects();
	System.out.println(c1);
	System.out.println(c2);
	c1.name="aaaaa";
	c1.id=123;
	c2.name="qwqw";
	c2.id=123;
	c2=c1;
	System.out.println(c1.equals(c2));

}
}

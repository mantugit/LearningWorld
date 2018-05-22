package samples;

public class SingleTonClass {

	private static SingleTonClass s;
	private SingleTonClass() {
		
	}
	
	/**
	 * Start early instantiation of singleTon Class
	 */
	static {
		s=new SingleTonClass();
	}
	public SingleTonClass getObj() {
		return s;
	}
	
	
	/**
	 * Start lazy instantiation of singleTon Class
	 */
	
	
	/**
	 * Lazy loading the singleTonClass
	 */
	
	public SingleTonClass getLazyInstance() {
		
		if (s==null) {
			synchronized (SingleTonClass.class) {
				s=new SingleTonClass();
			}
		}
		return s;
	}
	
	
	
	
}

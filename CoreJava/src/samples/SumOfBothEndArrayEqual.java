package samples;

public class SumOfBothEndArrayEqual {
	
	
	public void checkArray(Integer[] a) {
		
		int sumArray=0;
		int eachSideTotal=0;
		int leftsideTotal= 0;
		for(int i=0;i<a.length;i++) {
			sumArray=sumArray+a[i];
		}
		if(a.length>=3) {
			for(int i=1;i<a.length;i++) {
				int tempsum=sumArray-a[i];
				eachSideTotal=tempsum/2;
				for(int j=0;j<i;j++) {
					leftsideTotal=leftsideTotal+a[j];
					if(leftsideTotal==eachSideTotal) {
						System.out.println("index number  "+i);
					}
				}
				leftsideTotal=0;
			}
		}
		
	}

	public static void main(String[] args) {
		SumOfBothEndArrayEqual s=new SumOfBothEndArrayEqual();
		Integer[] i= {1,2,1,3,5,1,12};
		s.checkArray(i);
	}
	
}

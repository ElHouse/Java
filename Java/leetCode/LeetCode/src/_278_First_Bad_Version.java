
public class _278_First_Bad_Version {

	int n = 1702766719;
	
	boolean isBadVersion(int version) {
		
		
		if(n>=version) return false;
		
		return true;
	}
	
	public int firstBadVersion(int n) throws InterruptedException {

		if(n<=0) return 0;
				
		long i = 0;
		long j = n;

	
		
		while (i != (j - 1)) {

			long t = (j + i) / 2;

			if (isBadVersion((int)t)) {
				j = t;
			} else {
				i = t;
			}	
			
		}
		
		
		return (int)j;
	}

	
	public static void main(String[] args) throws InterruptedException {
		
		
		_278_First_Bad_Version a = new _278_First_Bad_Version();
		
		System.out.println("R-->"+a.firstBadVersion(2126753390));
		
		
	}
	
}

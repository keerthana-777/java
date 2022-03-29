
public class demoprime {
	public static void main(String args[])
	{
		int count=0;
		for(int i=10;i<=40;i++) {
			if(isPrime(i)) {
				count
			}
		}
	
		
	}
	public static boolean isPrime(int n) {
		if(n==1) {
			return false;
	}
		for(int i=2;i<=n/2; i++) {
			if(n%i==0)
				return false;
		}
		return true;
		count++;
	}
	System.out.println(count);
}

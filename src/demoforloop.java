
public class demoforloop {
	public static void main(String args[]) {
		System.out.println("10,000 at 2% interest =" +calculateInterest(10000.0 , 2.0));
	}
	private static double calculateInterest(double amount, double interestRate) {
		return (amount *(interestRate / 100));
	}

}

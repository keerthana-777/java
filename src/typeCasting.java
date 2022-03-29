
public class typeCasting {
	public static void main(String args[])
	{
		//implicit conversion
		System.out.println("Implicit conversion");
		char a='A';
		System.out.println("Value of a:"+a);
		
		int b=a;
		System.out.println("Value of b:"+b);
		
		float c=a;
		System.out.println("Value of c:"+c);
		
		long d=a;
		System.out.println("Value of d:"+d);
		
		double e=a;
		System.out.println("Value of e:"+e);
		
		System.out.println("\n");
		
		System.out.println("Explicit type casting");
		//explicit conversion
		
		double x=45.5;
		int y=(int) x;
		System.out.println("Value of x:"+x);
		System.out.println("Value of y:"+y);
		
		int age=25;
		boolean isCarAvailable = false;
		String message = (age >20) ? (isCarAvailable) ? "can rent a car" : "wait for a while" : "wait for a while";
		System.out.println(message);
		
		
	}

}

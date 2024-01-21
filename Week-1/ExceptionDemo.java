package exceptions;

public class ExceptionDemo {

	public static void main(String[] args) {
		
		System.out.println("Open file");
		System.out.println("Read data from file");
		
		int result = div(10,0);
		System.out.println(result);
		System.out.println("Close file");
	}
	public static int div(int a,int b) throws ArithmeticException
	{
		return a/b;
	}
}

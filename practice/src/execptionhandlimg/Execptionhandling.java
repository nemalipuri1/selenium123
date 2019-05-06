package execptionhandlimg;

public class Execptionhandling {
	public static void main(String[] args) {
		try
		{
			int v = 10/0;
			System.out.println("output is "+v);
		}
		catch (ArithmeticException e)
		{
			System.out.println("please give error message"+e.getMessage());
		}
	}

}

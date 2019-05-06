package execptionhandlimg;



public class Execptionusingfinal {

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
	  finally
	  {
		System.out.println("final");
	}
		 finally
		  {
			System.out.println("final");
		}
	}	
}

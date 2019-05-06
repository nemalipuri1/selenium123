package execptionhandlimg;

public class multicatchnull {
	public static void main(String[] args) 
	{
		try
		{
			String v = null;
			System.out.println(v.length());
		}
		/*catch(NullPointerException i)
		{
			System.out.println("nullpointer");
		}*/
		catch(ArithmeticException o)
		{
			System.out.println("arithmatic");
		}
		catch (Exception e)
		{
			System.out.println("execption");
		}
	}
	
   
}

/* if we dont declare nullpointerexecption here is takes execption method by default*/
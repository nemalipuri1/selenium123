package execptionhandlimg;

public class execptionusingthrows {

	public static void main(String[] args) 
	{
		try{
		String s = null;

		}
		catch(NullPointerException e)
		{
			System.out.println("error is"+e.getClass());
		}
	}

}

package execptionhandlimg;

public class nullpointexe {

	public static void main(String[] args) 
	{
		try{
			String s= null;
			if("p".equals(s))
			{
				System.out.println("same");
			}
			else
			{
				System.out.println("not same");
			}
		}
		catch (NullPointerException n)
		{
			System.out.println("this is the error"+n.getCause());
		}

	}

}

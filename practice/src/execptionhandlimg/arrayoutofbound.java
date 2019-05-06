package execptionhandlimg;

public class arrayoutofbound {

	public static void main(String[] args) throws Exception
	{
		
		int id[] = new int[5];
		id[0]=1;
		id[1]=2;
		id[2]=5;
		id[3]=88;
		id[4]=87;
		System.out.println("is"+id[5]);
		
		
		

	}

}

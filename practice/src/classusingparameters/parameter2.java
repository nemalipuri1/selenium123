package classusingparameters;

public class parameter2 {

	public static void main(String[] args) {
		parameter1 p = new parameter1();
		p.sum(12, 14);
		p.mul(12.6,13.45);
		//System.out.println("My name is"+name);
		String Name = parameter2.getMyName("nemalipuri", "keerthi");
		System.out.println("hey hi "+Name);

	}
//public static void getMyName(String First, String Last)
//{
//	String Name = First+Last;
//	System.out.println("name is"+Name);
//}

	public static String getMyName(String First, String Last)
	{
		String Name = First+" "+Last;
		return Name;
	}	

public int sum(int a,int b)
{
	int c = a+b;
	//System.out.println("ans is "+c);
	return c;
}
public double mul(double a,double b)
{
	double c = a*b;
	//System.out.println("ans is "+c);
	return c;
}
}



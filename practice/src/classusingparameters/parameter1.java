package classusingparameters;

public class parameter1 {

	public static void main(String[] args) {
	
		parameter1 p = new parameter1();
		p.sum(12, 14);
		p.mul(12.6,13.45);

	}

public void sum(int a,int b)
{
	int c = a+b;
	System.out.println("ans is "+c);
}
public void mul(double a,double b)
{
	double c = a*b;
	System.out.println("ans is "+c);
}
}
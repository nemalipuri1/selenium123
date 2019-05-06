package practice;

public class overloading {
	public static void main(String[] args) {
		//Maths m = new Maths();
		//double no = m.add(1, 2.0);
		//System.out.println("double is"+no);
		System.out.println(add(11,11));
		System.out.println(add(11,11));
	}



public static int add(int x,int y)
{
//System.out.println("value is int");
return(x+y);
}
public static double add(double x,double y)
{
//System.out.println("value is double");
return(x+y);
}
}


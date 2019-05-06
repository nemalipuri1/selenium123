package interface2;

public class classone implements interfaceprogram{
	public static void main(String[] args) {
		interfaceprogram cl = new classone();
 
		cl.add();
		cl.sub();
		cl.calc();
	}
	
	public void calc()
	{
		System.out.println("helllo calc");
	}

	@Override
	public void add() {
		System.out.println("addition");
		
	}

	@Override
	public void sub() {
		System.out.println("subtraction");
		
	}

}

/*if we try to accesss baseclass by using child class object then 
it will print only base calss methods
interfaceprogram cl = new classone();*/

/* interfaceprogram cl = new interfaceprogram();
you cannot create reference to base class of an interface*/



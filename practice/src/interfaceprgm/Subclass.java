package interfaceprgm;

public class Subclass extends Childclass {
	/*public static void main(String[] args) 
	{
		Subclass obj=new interfacedemo();
		obj.filter();
		obj.tea();
		obj.coffee();
		obj.colddrink();		
			System.out.println( "above one are my fav drinks");
	}*/

	public String colddrink()
	{
		String c = "i love sprite";
		System.out.println(c);
		return c;
	}
}
// inherting property from sub class
// interfacedemo (class a)
//          |
// Childclass  (class b)
//          /\
//		     |
//Sub class (class c)
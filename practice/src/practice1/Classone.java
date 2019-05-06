package practice1;

public class Classone {
int a = 100;
String area= "jungle";
	public static void main(String[] args) {
		System.out.println("my first program");
		Classone c = new Classone();
		c.animal();
		System.out.println("a vaule is"+c.a);
		System.out.println("a vaule is"+c.area);
		
		
	}


public void animal()
{
	int no = 1;
	String name = "dog";
	System.out.println("no is"+no+"name is "+name);
}
}
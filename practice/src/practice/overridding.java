package practice;

public class overridding {
public static void main(String[] args)
{
	Bimotor c= new Bimotor();
	Motor motor = new Motor();
	motor.printinfo();
}
}

class Bimotor
{
	int weight = 100;
	public void printinfo()
	{
		System.out.println(weight);
	}
}
class Motor extends Bimotor
{
	String brand ="honda";
	public void printinfo()
	{
		System.out.println("brand is"+brand);
	}
	
}
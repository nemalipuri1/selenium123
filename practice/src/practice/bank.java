package practice;

public interface bank {
	public static void main(String[] args) {
		Banks b = new Bankxyz();
		System.out.println("interest is"+b.getInterestRate());
		Banks e = new Bankyui();
		System.out.println("interest is"+e.getInterestRate());
	}
	



public interface Banks
{
	int getInterestRate();
}
public class Bankxyz implements Banks
{
	public int getInterestRate()
	{
		return 5;
	}
}
public class Bankyui implements Banks
{
	public int getInterestRate()
	{
		return 10;
	}
}
}
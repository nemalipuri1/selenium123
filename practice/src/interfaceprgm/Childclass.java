package interfaceprgm;

public class Childclass extends interfacedemo{

	
	/*public static void main(String[] args) 
	{
		Childclass obj=new Childclass();
		obj.filter();
		obj.tea();
		obj.coffee();
		
			System.out.println( "above one are my fav drinks");
	}*/

	public void filter()
	{
		System.out.println("here is  ur filter coffee");
	}
	
}
//senario 1//
//from childclass we can call the base class methods
//Childclass obj=new Childclass();
/*senario 2*/
//we can create an object for baseclass but can call the methods which are in base class, 
//but we cannot call the methods which are in childclass
//i.e. interfacedemo obj=new interfacedemo();
/*senario 3*/
//Allows only base case methods
//i.e interfacedemo obj=new Childclass();//
/*senario 4*/
//Childclass obj=new interfacedemo();
//this will be invalid , bcz child class cant hold the properties of parent class
//we cannot create child class  reference in base class object


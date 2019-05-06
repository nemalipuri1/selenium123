package stringdemo;

public class spiltprogram {
 public static void main(String[] args) 
 {
	String fullname = "abc-kjh-rtyui-poikjhg";
	String[]name=fullname.split("-");
	
	int i;
	for(i=0;i<name.length;i++)
	{
		System.out.println("outpout is "+i+" is "+name[i]);
	
	 if (name[i].contains("poikjhg"))
	 {
		 System.out.println("hey");
		 break;
	 }
   }
}
}

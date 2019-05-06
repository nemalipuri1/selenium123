package practice;

public class Static {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.display();
		Student s2 = new Student(1,"abc");
		s2.display();
	}

}

class Student
{
	int no;
	String name;
	static String college = "CMR";
	//constructor
	Student(int i,String s)
	{
		no = i;
		name = s;
	}
	public Student() {
		// TODO Auto-generated constructor stub
	}
	//to display output
	void display()
	{
		System.out.println("no is"+no+"name "+name+"college is"+college);
	}
}

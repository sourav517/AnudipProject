package labtest3_Students;

public class Student_Details {
	//data members declaration
	String name;
	String mob;
	int age;
	 
	//Default Constructor
		public Student_Details(){
			System.out.println("Default Constructor.....");	
		}
	//parameterized constructor	
		Student_Details(String name,int age,String mob){
		this.name = name;
		this.age = age;
		this.mob = mob;
		
	}
}

package labtest3_Students;

public class Student_Main {

	public static void main(String[] args) {
        //Declaring and initializing the array....
		String[] subjects= {"Java","OS","OOPS"};
		
        //Instantiation of students
		Student s1=new Student("Raju",20,"9065xxxx","26",subjects);
		Student s2=new Student("Shyam",22,"9368xxxx","49",subjects);

//Printing the students details
		System.out.println(s1);
		System.out.println(s2);
		

	
	}

}

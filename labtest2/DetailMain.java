package labtest2;
public class DetailMain {
	//details of Employees
    private static Employee[] employees = {
            new Employee("employee1", 30, "9656659895", "Delhi", 38000, "Java developer"),
            new Employee("employee2", 20, "6487648095", "Mumbai", 40000, "C++ developer"),
            new Employee("employee4", 50, "8911122223", "Hydrabad", 35000, "Web Developer"),
            new Employee("employee5", 60, "7656922295", "Chennai", 70000, "Python developer"),
            new Employee("employee6", 70, "9656016795", "Dheradun", 55000, "Java developer")
    };
    //Details of Managers
    private static Manager[] managers = {
            new Manager("manager1", 30, "7656065995", "Delhi", 73800, "Java developer"),
            new Manager("manager2", 20, "8648764895", "Kanpur", 84000, "C++ developer"),
            new Manager("manager3", 40, "9656159695", "Banglore", 671000, "Manager"),
            new Manager("manager4", 60, "9656022295", "Kerala", 87100, "Python developer"),
            new Manager("manager5", 70, "8656816795", "Indore", 75500, "Java developer")
    };

    
// To Print the details of Employees and Managers
    public static void main(String[] args) {
        System.out.println("EMPLOYEES::::");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
        System.out.println("MANAGERS::::");
        for (Manager manager : managers) {
            System.out.println(manager);
        }
        

    }

}

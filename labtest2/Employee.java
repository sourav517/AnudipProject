package labtest2;
public class Employee extends Member {
    private String specialization;
//to show the specialization of the employees
    public Employee(String name, int age, String phoneNumber, String city, int salary, String specialization) {
        super(name, age, phoneNumber, city, salary);
        this.specialization = specialization;
    }
//Details of the Employee with specialization
    public String toString() {
        return "Employee: \n" +
                " name = " + this.getName() + '\n'  +
                " age = " + this.getAge() +
                " phoneNumber = " + this.getPhoneNumber() + '\n' +
                " city = " + this.getCity() + '\n' +
                " salary = " + this.getSalary()+ "\n"+
                " specialization = " + specialization ;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
}
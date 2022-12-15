package labtest2;

public class Manager extends Member {

    private String department;

    public Manager(String name, int age, String phoneNumber, String city, int salary, String department) {
        super(name, age, phoneNumber, city, salary);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String toString() {
        return "Manager: \n" +
                " name = " + this.getName() + '\n'  +
                " age = " + this.getAge() +
                " phoneNumber = " + this.getPhoneNumber() + '\n' +
                " city = " + this.getCity() + '\n' +
                " salary = " + this.getSalary()+ "\n"+
                " department = " + department;

    }
}
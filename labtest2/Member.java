package labtest2;
public class Member {
    private String name;
    private int age;
    private String phoneNumber;
    private String city;
    private int salary;
    
    public Member(String name, int age, String phoneNumber, String city, int salary) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.city = city;
        this.salary = salary;
    }
//assign name, age, phone number, address and salary through parameterized constructor.
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Member: \n" +
                " name = " + name + '\n'  +
                ", age = " + age +
                ", phoneNumber = " + phoneNumber + '\n' +
                ", city = " + city + '\n' +
                ", salary = " + salary;
    }
}
package firstAndReserveTeam;

public class Person {

    private String firstName;
    private String lastName;
    private int age;
    private double salary;


    public Person(String firstName, String lastName, int age, double salary) {
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setAge(age);
        this.setSalary(salary);
    }

    @Override
    public String toString() {
        return String.format("%s %s gets %s leva", getFirstName(), getLastName(), getSalary());
    }

    public void increaseSalary(double percentage) {
        if (this.age < 30) {
            this.setSalary(this.getSalary() + this.getSalary() * percentage / 200);
        } else {
            this.setSalary(this.getSalary() + this.getSalary() * percentage / 100);
        }
    }

    public void setFirstName(String firstName) {
        if(firstName!=null&&firstName.trim().length()<3){
            throw new IllegalArgumentException("First name cannot be less than 3 symbols");
        }
        this.firstName = firstName;
    }

    public int getAge() {
        return age;
    }

    public void setLastName(String lastName) {
        if(lastName!=null&&lastName.trim().length()<3){
            throw new IllegalArgumentException("First name cannot be less than 3 symbols");
        }
        this.lastName = lastName;
    }

    public void setAge(int age) {
        if(age<=0){
            throw new IllegalArgumentException("Age cannot be zero or negative integer");
        }
        this.age = age;
    }

    private void setSalary(double salary) {
        if(salary<460){
            throw new IllegalArgumentException("Salary cannot be less than 460 leva");
        }
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getSalary() {
        return salary;
    }
}

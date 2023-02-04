package L05_Encapsulation.P02_salaryIncrease;

public class Person {
    private int age;
    private String firstName;
    private String lastName;

    private double salary;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Person(String firstName, String lastName, int age, double salary){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;

    }

    public int getAge() {
        return age;
    }

    public String getFirstName() {
        return firstName;
    }

    @Override
    public String toString() {
        return String.format("%s %s gets %f leva", firstName, lastName, salary);
    }

    public void increaseSalary(double percentage) {
        if(this.age > 30) {
            this.salary = this.salary + this.salary* percentage/100;
        } else {
            this.salary = this.salary + this.salary* percentage/200;
        }
    }
}

package L05_Encapsulation.P02_salaryIncrease;

import java.io.IOException;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner reader = new Scanner(System.in);
        int numberOfPeople = Integer.parseInt(reader.nextLine());

        List<Person> people = new ArrayList<>();

        for (int i = 0; i < numberOfPeople; i++) {
            String[] input = reader.nextLine().split(" ");
            String firstName = input[0];
            String lastName = input[1];
            int age = Integer.parseInt(input[2]);
            double salary = Double.parseDouble(input[3]);


            Person personToAdd = new Person(firstName, lastName , age, salary);
            people.add(personToAdd);
        }

        /*  if (comparisonResult != 0) {
                return comparisonResult;
            } else {
                return Integer.compare(firstPerson.getAge(), secondPerson.getAge());
            }   */

        double bonus = Double.parseDouble(reader.nextLine());

        for(Person person : people) {
            person.increaseSalary(bonus);
            System.out.println(person.toString());
        }
    }
}

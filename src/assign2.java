import java.util.ArrayList;
import java.util.Collections;
interface Payable {
    double getPaymentAmount();
}
class Person implements Payable, Comparable<Person> {
    private static int counter = 1;

    private int id;
    private String name;
    private String surname;

    // Constructors
    public Person() {
        this.id = counter++;
    }

    public Person(String name, String surname) {
        this();
        this.name = name;
        this.surname = surname;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
    @Override
    public String toString() {
        return getClass().getSimpleName() + ": " + id + ". " + name + " " + surname;
    }
    public String getPosition() {
        return "Student";
    }
    @Override
    public double getPaymentAmount() {
        return 0.00;
    }
    @Override
    public int compareTo(Person person) {
        return Double.compare(this.getPaymentAmount(), person.getPaymentAmount());
    }
}
class Employee extends Person {
    private String position;
    private double salary;
    public Employee() {
        super();
    }

    public Employee(String name, String surname, String position, double salary) {
        super(name, surname);
        this.position = position;
        this.salary = salary;
    }
    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    @Override
    public String toString() {
        return "Employee: " + super.toString();
    }
    @Override
    public double getPaymentAmount() {
        return salary;
    }
}
class Student extends Person {
    private double gpa;
    private static final double STIPEND_AMOUNT = 36660.00;
    public Student() {
        super();
    }

    public Student(String name, String surname, double gpa) {
        super(name, surname);
        this.gpa = gpa;
    }
    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    @Override
    public String toString() {
        return "Student: " + super.toString();
    }
    @Override
    public double getPaymentAmount() {
        return (gpa > 2.67) ? STIPEND_AMOUNT : 0.00;
    }
}
public class Main {
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();
        Employee john = new Employee("Marko", "Polo", "Manager", 65000.78);
        Employee george = new Employee("Abai", "Qunanbaev", "Developer", 90000.00);
        Student ringo = new Student("Arman", "Qasymbek", 2.8);
        Student paul = new Student("Gulnaz", "Amantai", 3.1);
        people.add(john);
        people.add(george);
        people.add(ringo);
        people.add(paul);
        Collections.sort(people);
        printData(people);
    }
    public static void printData(Iterable<Person> iterable) {
        for (Person person : iterable) {
            System.out.println(person + " gets " + person.getPaymentAmount() + " tenge every month");
        }
    }
}
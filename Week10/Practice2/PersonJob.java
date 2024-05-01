public class PersonJob {
    public static void main(String[] args) {
        Person person = new Person("Peter");
        Student student = new Student("Susan");
        Employee employee = new Employee("Eva");
        Faculty faculty = new Faculty("Frank");
        Staff staff = new Staff("Shane");

        System.out.println(person);
        System.out.println(student);
        System.out.println(employee);
        System.out.println(faculty);
        System.out.println(staff);
    }
}

class Person {
    protected String name;
    protected String address;
    protected String phoneNumber;
    protected String email;

    Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Person: " + name;
    }
}

// 상속을 위한 코드 필요
class Student extends Person {
    protected final String status = "freshman";

    Student(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Student: " + getName();
    }
}

// 상속을 위한 코드 필요
class Employee extends Person {
    protected String office;
    protected int salary;
    protected String date_hired;
    
    Employee(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Employee: " + getName();
    }
}

// 상속을 위한 코드 필요
class Faculty extends Employee {
    protected String office_hours;
    protected String rank;

    Faculty(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Faculty: " + getName();
    }
}

// 상속을 위한 코드 필요
class Staff extends Employee {
    protected String title;

    Staff(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Staff: " + getName();
    }
}
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
class Student {

    /*
        문제를 보고 필요한 변수 정의
     */

    Student(String name) {
        /*
            생성자 코드
         */
    }

    @Override
    public String toString() {
        return "Student: " + getName();
    }
}

// 상속을 위한 코드 필요
class Employee {

    /*
        문제를 보고 필요한 변수 정의
     */

    Employee(String name) {
        /*
            생성자 코드
         */
    }

    @Override
    public String toString() {
        return "Employee: " + getName();
    }
}

// 상속을 위한 코드 필요
class Faculty {

    /*
        문제를 보고 필요한 변수 정의
     */

    Faculty(String name) {
        /*
            생성자 코드
         */
    }

    @Override
    public String toString() {
        return "Faculty: " + name;
    }
}

// 상속을 위한 코드 필요
class Staff  {

    /*
        문제를 보고 필요한 변수 정의
     */

    Staff(String name) {
        /*
            생성자 코드
         */
    }

    @Override
    public String toString() {
        return "Staff: " + getName();
    }
}

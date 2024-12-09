package InterviewPrograms;

class Person {
    protected static String name;
    protected static int age;

    public Person(String name, int age) {
        Person.name = name;
        Person.age = age;
    }
}

class pl extends Person {
    private static String studentId;

    public pl(String name, int age, String studentId) {
        super(name, age); // Accessing protected members from the superclass
        pl.studentId = studentId;
    }

    public static void main() {
        System.out.println("Name: " + name); // Accessing protected member 'name'
        System.out.println("Age: " + age);   // Accessing protected member 'age'
        System.out.println("Student ID: " + studentId);
    }
}

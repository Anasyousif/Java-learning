public class InnerPerson1 {
    private String name;
    private int age;

    public InnerPerson1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }
}

public class Person1 {
    public static void main(String[] args) {
        // Create an instance of InnerPerson1
        InnerPerson1 person = new InnerPerson1("John", 30);

        // Access and print the name and age using the getter methods
        System.out.println(person.getName());
        System.out.println(person.getAge());
    }
}
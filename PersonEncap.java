public class PersonEncap {
    // Private instance variables (data)
    private String name;
    private int age;

    // Constructor
    public PersonEncap(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Public getter methods to access private data
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Public setter methods to modify private data (with potential validation)
    public void setName(String newName) {
        // You can add validation logic here if needed
        if (newName != null && !newName.trim().isEmpty()) {
            this.name = newName;
        } else {
            System.out.println("Name cannot be empty.");
        }
    }

    public void setAge(int newAge) {
        // Add validation logic to ensure age is valid
        if (newAge > 0 && newAge < 120) {
            this.age = newAge;
        } else {
            System.out.println("Invalid age.");
        }
    }

    public static void main(String[] args) {
        PersonEncap person1 = new PersonEncap("Alice", 30);

        // Accessing data using getter methods
        System.out.println("Person's name: " + person1.getName());
        System.out.println("Person's age: " + person1.getAge());

        // Modifying data using setter methods
        person1.setName("Bob");
        person1.setAge(25);

        System.out.println("Updated name: " + person1.getName());
        System.out.println("Updated age: " + person1.getAge());

        // Attempting to set an invalid age
        person1.setAge(-5); 
    }
}
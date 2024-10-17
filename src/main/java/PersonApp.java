import java.util.Scanner;

public class PersonApp {
    public static void main(String[] args) {
        // Create a Scanner object to collect input from the user
        Scanner sc = new Scanner(System.in);

        // Call createPersonFromInput() to collect data for the first person and store it in person1
        Person person1 = createPersonFromInput(sc);

        // Call createPersonFromInput() to collect data for the second person and store it in person2
        Person person2 = createPersonFromInput(sc);

        // Call createPersonFromInput() to collect data for the third person and store it in person3
        Person person3 = createPersonFromInput(sc);

        // Print out the details of all created Person objects
        System.out.println("Person 1: " + person1);
        System.out.println("Person 2: " + person2);
        System.out.println("Person 3: " + person3);

        // Close the scanner
        sc.close();
    }

    // Method to collect user input and create a Person object
    private static Person createPersonFromInput(Scanner sc) {
        // Prompt the user to enter the name
        System.out.print("Enter in a Name: ");
        String name = sc.nextLine(); // Store the entered name in the variable 'name'

        // Prompt the user to enter the email
        System.out.print("Please enter your email: ");
        String email = sc.nextLine(); // Store the entered email in the variable 'email'

        // Prompt the user to enter the course
        System.out.print("Please enter your Course: ");
        String course = sc.nextLine(); // Store the entered course in the variable 'course'

        // Create a new Person object using the default constructor
        Person person = new Person();

        // Set the name, email, and course of the Person object using setter methods
        person.setName(name);
        person.setEmail(email);
        person.setCourse(course);

        // Return the newly created Person object
        return person;
    }
}

public class Person {
    // Private fields to store name, email, and course for each person
    private String name;
    private String email;
    private String course;

    // Default constructor: used when we want to create a Person object without initial values
    public Person() {
    }

    // Parameterized constructor: allows us to create a Person object and set name, email, and course at the same time
    public Person(String name, String email, String course) {
        this.name = name;
        this.email = email;
        this.course = course;
    }

    // Getter for 'name': returns the name of the person
    public String getName() {
        return name;
    }

    // Setter for 'name': allows us to set or change the name of the person
    public void setName(String name) {
        this.name = name;
    }

    // Getter for 'email': returns the email of the person
    public String getEmail() {
        return email;
    }

    // Setter for 'email': allows us to set or change the email of the person
    public void setEmail(String email) {
        this.email = email;
    }

    // Getter for 'course': returns the course of the person
    public String getCourse() {
        return course;
    }

    // Setter for 'course': allows us to set or change the course of the person
    public void setCourse(String course) {
        this.course = course;
    }

    // Overriding the toString() method: this method is automatically called when we print a Person object.
    // It returns a string that represents the details of the person in a readable format.
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", course='" + course + '\'' +
                '}';
    }
}

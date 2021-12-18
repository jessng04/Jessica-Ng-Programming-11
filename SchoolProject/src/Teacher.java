import java.util.ArrayList;

public class Teacher {
    //fields
    public String firstName;
    public String lastName;
    public String subject;

    //constructor for teacher
    Teacher(String firstName, String lastName, String subject){
        this.firstName = firstName;
        this.lastName = lastName;
        this.subject = subject;
    }

    //getters and setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    //prints first name, last name, and subject of the teacher
    @Override
    public String toString() {
        return "Name: " + firstName +" " + lastName+ "\t\tSubject: " + subject;
    }






}

public class Student {
    //fields
    private String firstName;
    private String lastName;
    private String grade;
    //creates uniques student number for each student
    static int studentNumber;
    private int studentID =1;

    //constructor
    Student (String firstName, String lastName, String grade){
        this.firstName =firstName;
        this.lastName = lastName;
        this.grade = grade;
        studentNumber = studentID;
        studentID++;
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

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public static int getStudentNumber() {
        return studentNumber;
    }

    public static void setStudentNumber(int studentNumber) {
        Student.studentNumber = studentNumber;
    }

    //prints first name, last name, and grade of the student
    public String toString(){
        return "Name: " + firstName + " " + lastName + "\t\tGrade:" + grade;
    }

}

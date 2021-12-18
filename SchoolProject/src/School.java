import java.util.ArrayList;

public class School {
    //holds arraylist of teachers
    ArrayList<Teacher> teachers = new ArrayList<>();
    //holds arraylist of students
    ArrayList<Student> students = new ArrayList<>();
    //holds arraylist of courses
    ArrayList<School> courses = new ArrayList<>();

    //fields
    public String name;
    private String population;
    private String location;

    //method for adding a teacher
    public void addTeacher (Teacher teacher){
        teachers.add(teacher);
    }
    //method for adding a student
    public void addStudent (Student student){
        students.add(student);
    }
    //method for deleting a teacher by looping through list to find matching last name
    public void deleteTeacher(String lastName){
        for (int i = 0; i < teachers.size(); i++){
            if(teachers.get(i).getLastName()==lastName){
                teachers.remove(teachers.get(i));
            }
        }
    }
    //method for deleting a student by looping through list to find matching first name
    public void deleteStudent(String firstName){
        for (int i = 0; i < students.size(); i++){
            if(students.get(i).getFirstName()==firstName){
                students.remove(students.get(i));
            }
        }
    }
    //shows complete list of teachers
    public void allTeachers(){
        for (int i = 0; i< teachers.size(); i++){
            System.out.println(teachers.get(i).toString());
        }
    }
    //shows complete list of students
    public void allStudents(){
        for (int i = 0; i< students.size(); i++){
            System.out.println(students.get(i).toString());
        }
    }

    //constructor for the school
    School (String name, String population, String location){
        this.name = name;
        this.population = population;
        this.location = location;
    }

    //getters and setters for fields
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getPopulation() {
        return population;
    }

    public void setPopulation(String population) {
        this.population = population;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }





}






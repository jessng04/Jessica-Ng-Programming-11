public class Main {
    public static void main(String[] args) {
        //create new school
        School highSchool = new School("Eric Hamber", "1200", "Vancouver");

        //add 10 students to the student list
        highSchool.addStudent(new Student("Jessica", "Ng", "12"));
        highSchool.addStudent(new Student("Kennedy", "Pavao", "12"));
        highSchool.addStudent(new Student("Madison", "Chai", "12"));
        highSchool.addStudent(new Student("Tamara", "Jang", "12"));
        highSchool.addStudent(new Student("Ben", "Walker", "8"));
        highSchool.addStudent(new Student("Hazel","Casey", "11"));
        highSchool.addStudent(new Student("Jimmie", "Massey", "10"));
        highSchool.addStudent(new Student("Todd", "Morrison", "9"));
        highSchool.addStudent(new Student("Sally", "Webb", "9"));
        highSchool.addStudent(new Student("Wilma", "Todd", "8"));

        //add 3 teachers to the teacher list
        highSchool.addTeacher(new Teacher("Edward", "Chang", "Math"));
        highSchool.addTeacher(new Teacher("Caroline", "Shum", "English"));
        highSchool.addTeacher(new Teacher("Erma", "Munoz", "Science"));

        //print complete lists
        System.out.println("Student List: ");
        highSchool.allStudents();
        System.out.println("\nTeacher List: ");
        highSchool.allTeachers();

        //delete 2 students, first name: Jessica and Kennedy
        highSchool.deleteStudent("Jessica");
        highSchool.deleteStudent("Kennedy");

        //delete 1 teacher, last name: Chang
        highSchool.deleteTeacher("Chang");

        //print new lists with removed students and teacher
        System.out.println("\nNew Student List: ");
        highSchool.allStudents();
        System.out.println("\nNew Teacher List: ");
        highSchool.allTeachers();






















    }
}

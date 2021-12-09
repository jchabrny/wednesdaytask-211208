import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        Student student1 = new Student("Annika", 2.1, false, "history");
        Student student2 = new Student("Paul", 2.8, false, "history");
        Student student3 = new Student("John", 2.8, true, "business");

        University university = new University("Coding Institute");

        HashMap<String, Student> studentGroup = new HashMap<String, Student>();
        studentGroup.put("student1", student1); //key on the left, value on the right
        studentGroup.put("student2", student2);
        studentGroup.put("student3", student3);

        System.out.println(studentGroup.values());

        String[] universityStudents = new String[3]; // with an array you have to know the exact size
        universityStudents[0] = "Maths student";
        universityStudents[1] = "English student";
        universityStudents[2] = "Arts student";
        System.out.println(universityStudents[1]);

        ArrayList listOfStudents = new ArrayList();//more flexible, because we can print it out, but it is a little more work
        listOfStudents.add("Maths student");
        listOfStudents.add("English student");
        listOfStudents.add("Arts student");
        listOfStudents.add("Psychology student");

        listOfStudents.remove("English student");
        System.out.println(listOfStudents.contains("Business student"));

        System.out.println(listOfStudents);
    }
}

import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        HashMap<String, String> fun = new HashMap<String, String>();
        fun.put("bobby", "FluffyPonies!");
        fun.put("helloKitty", "AloeVery_");
        fun.put("coolGuy", "password123");
        System.out.println(fun.containsValue("AloeVery_"));
        System.out.println(fun.containsKey("coolGuy"));
        System.out.println(fun.replace("bobby", "FluffyParrot!"));
        System.out.println(fun.keySet());
        System.out.println(fun.values());
        System.out.println(fun); // HashMaps don't have a specific order

        HashMap<String, Student> studentGroup = new HashMap<String, Student>();
        studentGroup.put("student1", new Student()); //key on the left, value on the right
        studentGroup.put("student2", new Student());
        studentGroup.put("student3", new Student());
        studentGroup.put("student4", new Student());

        System.out.println(studentGroup.get("student3"));


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

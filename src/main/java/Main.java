import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) {

        HashSet<String> cars = new HashSet<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("BMW");
        cars.add("Mazda");
        System.out.println(cars);
        System.out.println(cars.size());

        HashSet<Integer> numbers = new HashSet<Integer>();
        numbers.add(4);
        numbers.add(7);
        numbers.add(8);

        for (int i = 1; i <= 10; i++) {
            if (numbers.contains(i)) {
                System.out.println(i + " was found in the set.");
            } else {
                System.out.println(i + " was not found in the set.");
            }
        }

        HashMap<String, Integer> people = new HashMap<>();
        people.put("John", 32);
        people.put("Steve", 30);
        people.put("Angie", 33);

        for (String i : people.keySet()) {
            System.out.println("key: " + i + " value: " + people.get(i));


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

            ArrayList listOfStudents = new ArrayList();//more flexible, because wit can be printed out, but it is a little more work
            listOfStudents.add("Maths student");
            listOfStudents.add("English student");
            listOfStudents.add("Arts student");
            listOfStudents.add("Psychology student");

            listOfStudents.remove("English student");
            System.out.println(listOfStudents.contains("Business student"));

            System.out.println(listOfStudents);
        }
    }
}

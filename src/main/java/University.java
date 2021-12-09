import java.util.HashMap;

public class University {
    private String universityName = "";
    private HashMap<Integer, Student> mapOfStudents = new HashMap<>();
    private int key = 1;

    public University(String universityName) {
        this.universityName = universityName;
    }

    public HashMap<Integer, Student> getAllStudents() {
        return mapOfStudents;
    }

    public int getStudentCount() {
        return mapOfStudents.size();
    }

    public void addOneStudent(Student student) {
        mapOfStudents.put(key, student);
        key += 1;
    }


    public void removeOneStudent(Integer key) {
        mapOfStudents.remove(key);
    }
}

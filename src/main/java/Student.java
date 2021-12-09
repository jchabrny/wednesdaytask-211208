public class Student {
    private String name;
    private int id;
    private double grade;
    private boolean isRepresentative = false;
    private String subject;

    public Student(String name, double grade, boolean isRepresentative, String subject) {
        this.name = name;
        this.subject = subject;
        this.grade = grade;
        this.isRepresentative = isRepresentative;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public boolean isRepresentative() {
        return isRepresentative;
    }

    public void setRepresentative(boolean representative) {
        isRepresentative = representative;
    }
}

public class University {
    private String universityName = "";
    private Student[] studentList = new Student[0];

    public Student[] getStudentList() {
        return studentList;
    }

    public int getStudentCount() {
        return studentList.length;
    }

    public void addOneStudent(Student student) {
        Student[] newStudentList = new Student[studentList.length + 1];
        for (int i = 0; i < studentList.length; i++) {
            newStudentList[i] = studentList[i];
        }
        newStudentList[newStudentList.length - 1] = student;
        this.studentList = newStudentList;
    }

    public void removeOneStudent(Student student) {
        Student[] newStudentList = new Student[studentList.length - 1];
        boolean movingUpStudents = false;
        for (int i = 0; i < studentList.length - 1; i++) {
            if (!studentList[i].equals(student)) {
                if (movingUpStudents == true) {
                    newStudentList[i - 1] = studentList[i];
                } else {
                    newStudentList[i] = studentList[i];
                }
            } else {
                movingUpStudents = true;
                ;
            }
        }
        this.studentList = newStudentList;
    }
}

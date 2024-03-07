package model;

public class Student extends User implements Comparable<Student> {
    private Integer studentId;

    public Student(Integer studentId, String firstName, String secondName, String lastName) {
        super(firstName, secondName, lastName);
        this.studentId = studentId;
    }

    public int getStudentId() {
        return studentId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId + " " +
                super.toString() + // все поля сразу можно передать из User в Student
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return studentId.compareTo(o.studentId);
    }
}

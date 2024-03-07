package model;

public class Teacher extends User implements Comparable<Teacher> {
    private Integer teacherId;

    public Teacher(Integer teacherId, String firstName, String secondName, String lastName) {
        super(firstName, secondName, lastName);
        this.teacherId = teacherId;
    }

    public int getTeacherId() {
        return teacherId;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherId=" + teacherId + " " +
                super.toString() +
                '}';
    }

    @Override
    public int compareTo(Teacher o) {
        return teacherId.compareTo(o.teacherId);
    }
}

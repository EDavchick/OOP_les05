package model;

import java.util.ArrayList;
import java.util.List;

public class TeacherGroup {
    public List<Teacher> teachersList = new ArrayList<>();

    public TeacherGroup(List<Teacher> teachersList) {
        this.teachersList = teachersList;
    }
    public void addTeacher(Teacher teacher){
        teachersList.add(teacher);
    }

    @Override
    public String toString() {
        return "TeacherGroup{" +
                "teacherList=" + teachersList +
                '}';
    }
}

package service;

import model.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TeacherGroupService {
    TeacherGroup teacherGroup;

    public TeacherGroupService(TeacherGroup teacherGroup) {
        this.teacherGroup = teacherGroup;
    }

    public List<Teacher> getSortedTeacherGroup(){
        // создаем копию списка без ссылки на него для того, чтобы при сортировке наш основной список никак не поменялся
        List<Teacher> teacherList = new ArrayList<>(teacherGroup.teachersList);
        Collections.sort(teacherList);
        return teacherList;
    }
    public List<Teacher> getSortedTeacherGroupByFIO(){
        // создаем копию списка без ссылки на него для того, чтобы при сортировке наш основной список никак не поменялся
        List<Teacher> teacherList = new ArrayList<>(teacherGroup.teachersList);
        teacherList.sort(new UserComparator<Teacher>());
        return teacherList;
    }
}

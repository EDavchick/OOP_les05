import controller.Controller;
import model.*;
import service.StudentGroupService;
import service.TeacherGroupService;
import view.IUsersView;
import view.StudentView;
import view.TeacherView;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();

        controller.createStudent("FFA", "GHY", "TYU");
        controller.createStudent("JKD", "YTR", "CVB");
        controller.createStudent("IUY", "POI", "XDS");
        controller.createStudent("LKJ", "VCX", "CQW");
        controller.createStudent("MNB", "SAW", "TYU");

        controller.createTeacher("HHH", "KKK", "OOO");
        controller.createTeacher("JJJ", "OOO", "PPP");
        controller.createTeacher("LLL", "RRR", "WWW");

        controller.getAllStudent();
        controller.getAllTeacher();


//        Student student01 = new Student(4, "bbb", "bca", "aaa");
//        Student student02 = new Student(2, "Aaa", "Bbb", "Ccc");
//        Student student03 = new Student(3, "CCC", "cab", "abc");
//        Student student04 = new Student(1, "ccc", "abc", "cba");
//        Student student05 = new Student(6, "sdf", "bca", "aaa");
//        List<Student> studentList01 = new ArrayList<>();
//        StudentGroup studentGroup01 = new StudentGroup(studentList01);
//        studentGroup01.addStudent(student01);
//        studentGroup01.addStudent(student02);
//        studentGroup01.addStudent(student03);
//        studentGroup01.addStudent(student04);
//        studentGroup01.addStudent(student05);
//
//        StudentGroupService studentService = new StudentGroupService(studentGroup01);
//        IUsersView<Student> studentView = new StudentView();
//        studentView.printOnConsole(studentService.getSortedStudentGroupByFIO());
//        System.out.println();
//        studentView.printOnConsoleArr(studentService.getSortedStudentGroup());
//
//        Teacher teacher01 = new Teacher(1, "kjhs", "ldjd", "yrhf");
//        Teacher teacher02 = new Teacher(3, "jhhfkd", "nmfk", "ldkdhgf");
//        Teacher teacher03 = new Teacher(2, "vsddf", "faget", "mnkhiu");
//        List<Teacher> teacherList = new ArrayList<>();
//        TeacherGroup teacherGroup = new TeacherGroup(teacherList);
//        teacherGroup.addTeacher(teacher01);
//        teacherGroup.addTeacher(teacher02);
//        teacherGroup.addTeacher(teacher03);
//
//        // не выводится ничего, почему???
//        TeacherGroupService teacherService = new TeacherGroupService(teacherGroup);
//        IUsersView<Teacher> teacherView = new TeacherView();
//        teacherView.printOnConsoleArr(teacherService.getSortedTeacherGroup());
//        System.out.println();
//        teacherView.printOnConsole(teacherService.getSortedTeacherGroupByFIO());

//        Classroom classroom = new Classroom(teacher01, studentList01);
//



    }
}
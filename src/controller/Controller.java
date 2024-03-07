package controller;

import model.Student;
import model.Teacher;
import model.TypeUser;
import service.DataService;
import service.StudentGroupService;
import view.StudentView;
import view.TeacherView;

import java.util.List;

public class Controller {
    DataService dataService = new DataService();
    StudentView studentView = new StudentView();
    TeacherView teacherView = new TeacherView();
    public void createStudent(String firstName, String secondName, String lastName){
        dataService.createUsers(firstName, secondName, lastName, TypeUser.STUDENT);
    }
    public void createTeacher(String firstName, String secondName, String lastName){
        dataService.createUsers(firstName, secondName, lastName, TypeUser.TEACHER);
    }
    public void getAllStudent(){
        studentView.printOnConsoleArr(dataService.getAllStudent());
    }
    public void getAllTeacher(){
        teacherView.printOnConsoleArr(dataService.getAllTeacher());
    }
//    public void getAllStudentsAndTeacher(Teacher teacher, List<Student> students){
//        studentGroupService.createListStudentsAndTeacher(teacher, students);
//        studentView.sendOnConsoleUserGroup(studentGroupService.getStudentsAndTeacher());
//    }

//    public void createStudentGroup(Teacher teacher, List<Student> students){
//        studentGroupService.createStudentGroup(teacher, students);
//        studentView.sendOnConsoleUserGroup(studentGroupService.getStudentGroup());
//    }
}

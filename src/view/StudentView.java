package view;

import model.Student;
import model.StudentGroup;
import model.Teacher;

import java.util.List;
import java.util.logging.Logger;

public class StudentView implements IUsersView<Student> {
//    Logger logger = Logger.getLogger(StudentView.class.getName());
    @Override
    public void printOnConsole(List<Student> user) {
        for(Student student : user)
        System.out.println(student);
    }
    @Override
    public void printOnConsoleArr(List<Student> users) {
        for(Student student : users)
            System.out.println(student);
    }
    public void printOnConnsoleTeacher(Teacher user){
        System.out.println(user);
    }
//    public void sendOnConsoleUserGroup(StudentGroup studentGroup){
//        logger.info(studentGroup.toString());
//    }
}

package service;

import model.Student;
import model.Teacher;
import model.TypeUser;
import model.User;

import java.util.ArrayList;
import java.util.List;

public class DataService {
    List<User> users = new ArrayList<>();

    public void createUsers(String firstName, String secondName, String lastName, TypeUser typeUser) {
        int id = getFreeId(typeUser);
        if(typeUser == TypeUser.STUDENT)
            users.add(new Student(id, firstName, secondName, lastName));
        else if (typeUser == TypeUser.TEACHER) {
            users.add(new Teacher(id, firstName, secondName, lastName));
        }
    }
    private int getFreeId(TypeUser typeUser){
        // 1 2 3 1 2 4 - id student and teacher always go to left in right
        for (int i = users.size() - 1; i >= 0; i--) {
            User user = users.get(i);
            if(user instanceof Student && typeUser == TypeUser.STUDENT)
                return ((Student) user).getStudentId() + 1;
            if(user instanceof Teacher && typeUser == TypeUser.TEACHER)
                return ((Teacher) user).getTeacherId() + 1;
        }
        return 1;
    }
    public List<Student> getAllStudent() {
        List<Student> students = new ArrayList<>();
        for (User user : users) {
            if (user instanceof Student)
                students.add((Student) user);
        }
        return  students;
    }

    public List<Teacher> getAllTeacher() {
        List<Teacher> teachers = new ArrayList<>();
        for (User user : users) {
            if (user instanceof Teacher)
                teachers.add((Teacher) user);
        }
        return  teachers;
    }

}

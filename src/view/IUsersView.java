package view;

import model.User;

import java.util.List;

public interface IUsersView<T extends User> {
    public void printOnConsole(List<T> user); // print 1 user
    public void printOnConsoleArr(List<T> users); // print all users
}

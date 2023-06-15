package App.service;

import App.models.User;

import java.util.List;

public interface UserService {
    void add(User user);

    void removeUser(User user);

//    void updateUser(String username);

    List<User> getAllUsers();

    User getUserById(int id);
}

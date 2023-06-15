package App.dao;

import App.models.User;

import java.util.List;

public interface UserDao {

    void createUser(User user);

    void removeUser(User user);

    List<User> getAllUsers();

    User getUserById(int id);
}

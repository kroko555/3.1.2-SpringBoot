package ru.katacourses.SpringBoot.dao;


import ru.katacourses.SpringBoot.model.User;

import java.util.List;

public interface UserDao {

    List<User> getUsers();

    void add(User user);

    void update(User user);

    void delete(Long id);

    User getUserById(Long id);
}

package ru.katacourses.SpringBoot.service;


import ru.katacourses.SpringBoot.model.User;

import java.util.List;

public interface UserService {
    List<User> getUsers();

    void add(User user);

    void update(User user);

    void delete(Long id);

    User getUserById(Long id);
}

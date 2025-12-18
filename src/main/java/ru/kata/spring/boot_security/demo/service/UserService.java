package ru.kata.spring.boot_security.demo.service;

import ru.kata.spring.boot_security.demo.model.Role;
import ru.kata.spring.boot_security.demo.model.User;

import java.util.List;
import java.util.Set;

public interface UserService {
    List<User> getAllUsers();
    User getUser(Long id);
    User findByUsername(String username);
    void saveUser(User user);
    void deleteUser(Long id);
    void updateUser(User user);
    void saveUserWithRoles(User user, Set<Role> roles);
    Set<Role> mapRoleNames(String[] roleNames);
}

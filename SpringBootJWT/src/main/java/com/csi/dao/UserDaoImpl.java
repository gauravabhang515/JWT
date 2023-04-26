package com.csi.dao;

import com.csi.model.User;
import com.csi.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class UserDaoImpl {
    @Autowired
    UserRepository userRepositoryImpl;

    public User saveData(User user) {
        return userRepositoryImpl.save(user);

    }

    public Optional<User> getDataById(int userId) {
        return userRepositoryImpl.findById(userId);
    }

    public User getDataByUserName(String userName) {
        return userRepositoryImpl.findByUserName(userName);
    }

    public List<User> getAllData() {
        return userRepositoryImpl.findAll();
    }

    public User updateData(User user) {
        return userRepositoryImpl.save(user);
    }

    public void deleteDataById(int userId) {
        userRepositoryImpl.deleteById(userId);
    }
}

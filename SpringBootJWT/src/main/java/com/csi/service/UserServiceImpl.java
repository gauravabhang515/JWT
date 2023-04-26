package com.csi.service;

import com.csi.dao.UserDaoImpl;
import com.csi.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserDetailsService {
    @Autowired
    UserDaoImpl userDaoImpl;

    public User saveData(User user) {
        return userDaoImpl.saveData(user);
    }

    public Optional<User> getDataById(int userId) {
        return userDaoImpl.getDataById(userId);
    }



    public List<User> getAllData() {
        return userDaoImpl.getAllData();
    }

    public User updateData(User user) {
        return userDaoImpl.updateData(user);
    }

    public void deleteDataById(int userId) {
        userDaoImpl.deleteDataById(userId);
    }
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userDaoImpl.getDataByUserName(username);
        return new org.springframework.security.core.userdetails.User(user.getUserName(), user.getUserPassword(), new ArrayList<>());
    }
}

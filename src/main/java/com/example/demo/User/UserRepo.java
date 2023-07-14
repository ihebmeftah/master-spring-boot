package com.example.demo.User;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Component
public class UserRepo {
    private static List<User> users = new ArrayList<>();
    private static int countId;
    static {
        users.add(new User(++countId,"iheb", LocalDate.now().minusYears(2)));
        users.add(new User(++countId,"sajed", LocalDate.now().minusYears(2)));
        users.add(new User(++countId,"taheni", LocalDate.now().minusYears(2)));
    }

    public List<User> findAll(){
        return users;
    }
    public User findById(Integer id){
        return users.stream().filter(user ->user.getId().equals(id)).findFirst().orElse(null);
    }
    public User save(User user){
        user.setId(++countId);
        users.add(user);
        return user;
    }
    public String deleteById(Integer id){
         users.remove(users.stream().filter(user ->user.getId().equals(id)).findFirst().get());
        return "User deleted";
    }
}

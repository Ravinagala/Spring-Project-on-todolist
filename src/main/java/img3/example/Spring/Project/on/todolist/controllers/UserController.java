package img3.example.Spring.Project.on.todolist.controllers;

import img3.example.Spring.Project.on.todolist.entities.User;
import img3.example.Spring.Project.on.todolist.repos.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserRepo userRepo;
    @GetMapping("/getUsers")
    public List<User> getUser(){
        return userRepo.findAll();
    }
}

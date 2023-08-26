package img3.example.Spring.Project.on.todolist.controllers;

import img3.example.Spring.Project.on.todolist.entities.UserOrganization;
import img3.example.Spring.Project.on.todolist.repos.UserOrganizationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserOrganizationController {
    @Autowired
    UserOrganizationRepo userOrganizationRepo;
    @GetMapping("/getUserOrganizations")
    public List<UserOrganization> getUserOrganizations(){
        return userOrganizationRepo.findAll();
    }
}

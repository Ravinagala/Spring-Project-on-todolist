package img3.example.Spring.Project.on.todolist.controllers;

import img3.example.Spring.Project.on.todolist.entities.UserProject;
import img3.example.Spring.Project.on.todolist.repos.UserProjectRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserProjectController {
    @Autowired
    UserProjectRepo userProjectRepo;
    @GetMapping("/getUserProjects")
    public List<UserProject> getUserProjects(){
        return userProjectRepo.findAll();
    }

}

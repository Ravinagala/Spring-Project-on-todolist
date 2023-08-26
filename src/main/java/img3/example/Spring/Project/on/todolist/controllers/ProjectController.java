package img3.example.Spring.Project.on.todolist.controllers;

import img3.example.Spring.Project.on.todolist.entities.Project;
import img3.example.Spring.Project.on.todolist.repos.ProjectRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProjectController {
    @Autowired
    ProjectRepo projectRepo;
    @GetMapping("/getProjects")
    public List<Project> getProjects(){
        return projectRepo.findAll();
    }
}

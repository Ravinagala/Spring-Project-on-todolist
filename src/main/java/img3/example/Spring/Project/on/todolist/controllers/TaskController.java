package img3.example.Spring.Project.on.todolist.controllers;

import img3.example.Spring.Project.on.todolist.entities.Task;
import img3.example.Spring.Project.on.todolist.repos.TaskRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TaskController {
    @Autowired
    TaskRepo taskRepo;
    @GetMapping("/getTasks")
    public List<Task> getTasks(){
        return taskRepo.findAll();
    }
}

package img3.example.Spring.Project.on.todolist.controllers;

import img3.example.Spring.Project.on.todolist.entities.SubTask;
import img3.example.Spring.Project.on.todolist.repos.SubTaskRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SubTaskController {
    @Autowired
    SubTaskRepo subTaskRepo;
    @GetMapping("/getSubTasks")
    public List<SubTask> getSubTasks(){
        return subTaskRepo.findAll();
    }
}

package img3.example.Spring.Project.on.todolist.controllers;


import img3.example.Spring.Project.on.todolist.entities.Organization;
import img3.example.Spring.Project.on.todolist.repos.OrganizationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrganizationController {
    @Autowired
    OrganizationRepo organizationRepo;
    @GetMapping("/getOrganizations")
    public List<Organization> getOrganizations(){
        return organizationRepo.findAll();
    }
}

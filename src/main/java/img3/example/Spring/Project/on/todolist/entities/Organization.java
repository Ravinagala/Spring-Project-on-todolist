package img3.example.Spring.Project.on.todolist.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="organization")
public class Organization {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "founded_by")
    private String foundedby;

    @OneToMany(mappedBy = "organization")
    @JsonIgnore
    private List<UserOrganization> userorganization;

    @OneToMany(mappedBy = "organization")
    @JsonIgnore
    private List<Project> project;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFoundedby() {
        return foundedby;
    }

    public void setFoundedby(String foundedby) {
        this.foundedby = foundedby;
    }

    public List<UserOrganization> getUserorganization() {
        return userorganization;
    }

    public void setUserorganization(List<UserOrganization> userorganization) {
        this.userorganization = userorganization;
    }

    public List<Project> getProject() {
        return project;
    }

    public void setProject(List<Project> project) {
        this.project = project;
    }
}
